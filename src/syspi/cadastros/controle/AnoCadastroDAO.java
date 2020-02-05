package syspi.cadastros.controle;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
//import org.hibernate.Session;
import syspi.modelo.Ano;
import syspi.abd.InterfaceDAO;

public class AnoCadastroDAO implements InterfaceDAO<Ano> {

    /*Nao tem mais necessidade desta linha, pois ele esta implementado na classe InterfaceDAO*/
    // Session sessao = syspi.abd.Fabrica.getSession();
    public AnoCadastroDAO() {

    }

    @Override
    public void salvar(Ano ano) {
        try {
            sessao.beginTransaction();
            sessao.saveOrUpdate(ano);
            sessao.getTransaction().commit();
            if (sessao.isOpen()) {
                sessao.close();
            }
            JOptionPane.showMessageDialog(null, "O ano " + String.valueOf(ano.getAno()) + " foi salvo!");
        } catch (Exception e) {
            if (sessao.isOpen()) {
                sessao.close();
            }
            JOptionPane.showMessageDialog(null, "O ano " + String.valueOf(ano.getAno()) + " nao foi salvo.");
        }
    }

    @Override
    public Ano buscarPorId(int id) {
        try {
            return (Ano) sessao.get(Ano.class, id);
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel localizar");
            return null;
        }
    }

    @Override
    public Ano buscarPorString(String consulta) {
        try {
            Query q = sessao.createQuery("from Ano where ano = :ano");
            q.setString("ano", consulta);
            Ano ano = new Ano();
            ano = (Ano) q.list();
            return ano;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Ano> listarTudo() {
        try {
            Query q = sessao.createQuery("FROM Ano order by ano");
            List<Ano> lista = new ArrayList<>();
            lista = q.list();
            return lista;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os dados.");
            return null;
        }
    }

    @Override
    public void atualizar(Ano ano) {
        try {
            sessao.getTransaction().begin();
            sessao.merge(ano);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel atualizar os dados.");
            sessao.getTransaction().rollback();
        }
    }

    @Override
    public void remover(Ano ano) {
        try {
            sessao.getTransaction().begin();
            sessao.delete(ano);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Os Dados não foram removidos");
            sessao.getTransaction().rollback();
        }
    }

    @Override
    public void removerPorId(int id) {
        Ano ano = buscarPorId(id);
        remover(ano);
    }
}
