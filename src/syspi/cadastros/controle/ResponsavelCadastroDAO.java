/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syspi.cadastros.controle;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import syspi.abd.InterfaceDAO;
import syspi.modelo.Responsavel;

/**
 *
 * @author pI5
 */
public class ResponsavelCadastroDAO implements InterfaceDAO<Responsavel> {

    Session sessao = syspi.abd.Fabrica.getSession();

    public ResponsavelCadastroDAO() {

    }

    @Override
    public void salvar(Responsavel responsavel) {
        try {
            sessao.beginTransaction();
            sessao.saveOrUpdate(responsavel);
            sessao.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "O responsável foi salvo!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O responsável nao foi salvo.");
        }
    }

    @Override
    public Responsavel buscarPorId(int id) {
        try {
            return (Responsavel) sessao.get(Responsavel.class, id);
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel localizar");
            return null;
        }
    }

    @Override
    public Responsavel buscarPorString(String consulta) {
        try {
            Query q = sessao.createQuery("from Responsavel where nome = :nome");
            q.setString("nome", consulta);
            Responsavel responsavel = new Responsavel();
            responsavel = (Responsavel) q.list();
            return responsavel;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Responsavel> listarTudo() {
        try {
            Query q = sessao.createQuery("FROM Responsavel order by nome");
            List<Responsavel> lista = new ArrayList<>();
            lista = q.list();
            return lista;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os dados.");
            return null;
        }
    }

    @Override
    public void atualizar(Responsavel responsavel) {
        try {
            sessao.getTransaction().begin();
            sessao.merge(responsavel);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel atualizar os dados.");
            sessao.getTransaction().rollback();
        }
    }

    @Override
    public void remover(Responsavel responsavel) {
        try {
            sessao.getTransaction().begin();
            sessao.delete(responsavel);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Os Dados não foram removidos");
            sessao.getTransaction().rollback();
        }
    }

    @Override
    public void removerPorId(int id) {
        Responsavel responsavel = buscarPorId(id);
        remover(responsavel);
    }
}
