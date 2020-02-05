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
import syspi.modelo.Ano;
import syspi.modelo.Crianca;

/**
 *
 * @author pI5
 */
public class CriancaCadastroDAO implements InterfaceDAO<Crianca> {

    Session sessao = syspi.abd.Fabrica.getSession();

    public CriancaCadastroDAO() {

    }

    @Override
    public void salvar(Crianca crianca) {
        try {
            sessao.beginTransaction();
            sessao.saveOrUpdate(crianca);
            sessao.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "O ano foi salvo!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O ano nao foi salvo.");
        }
    }

    @Override
    public Crianca buscarPorId(int id) {
        try {
            return (Crianca) sessao.get(Crianca.class, id);
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel localizar");
            return null;
        }
    }

    @Override
    public Crianca buscarPorString(String consulta) {
        try {
            Query q = sessao.createQuery("from Crianca where nome = :nome");
            q.setString("nome", consulta);
            Crianca crianca = new Crianca();
            crianca = (Crianca) q.list();
            return crianca;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Crianca> listarTudo() {
        try {
            Query q = sessao.createQuery("FROM Crianca order by nome");
            List<Crianca> lista = new ArrayList<>();
            lista = q.list();
            return lista;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os dados.");
            return null;
        }
    }

    @Override
    public void atualizar(Crianca crianca) {
        try {
            sessao.getTransaction().begin();
            sessao.merge(crianca);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel atualizar os dados.");
            sessao.getTransaction().rollback();
        }
    }

    @Override
    public void remover(Crianca crianca) {
        try {
            sessao.getTransaction().begin();
            sessao.delete(crianca);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Os Dados não foram removidos");
            sessao.getTransaction().rollback();
        }
    }

    @Override
    public void removerPorId(int id) {
        Crianca crianca = buscarPorId(id);
        remover(crianca);
    }
}
