package syspi.cadastros.controle;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import syspi.modelo.Ubs;

public class UbsCadastroDAO {

    Session sessao;

    public UbsCadastroDAO() {
        sessao = syspi.abd.Fabrica.getSession();
    }

    //RECEBE UMA UBS (OBJETO) E SALVA NO BANCO DE DADOS
    public void salvar(Ubs ubs) {
        try {
            sessao.beginTransaction();
            sessao.saveOrUpdate(ubs);
            sessao.getTransaction().commit();
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Os Dados não foram Salvos");
        }
    }

    //BUSCA UMA UBS PELO ID NO BANCO DE DAODS E RETORNA UM OBJETO UBS
    public Ubs buscarPorId(int id) {
        try {
            return (Ubs) sessao.get(Ubs.class, id);
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel localizar");
            return null;
        }
    }

    //LISTA TODOS OS DADOS PRESENTE NA TABELA UBS, EM FORMA DE LISTA/OBJETO
    public List<Ubs> listarTudo() {
        Query q = sessao.createQuery("FROM" + Ubs.class.getName());
        return q.list();
    }

    //METODO PARA ATUALIZAR OS DADOS DOS CAMPOS
    public void atualizar(Ubs ubs) {
        try {
            sessao.getTransaction().begin();
            sessao.merge(ubs);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel atualizar os dados.");
            sessao.getTransaction().rollback();

        }
    }

    /*METODO PARA REMOVER UM REGISTRO/OBJETO DA TABELA UBS, RECECE UM OBJETO
     E VER SE ELE ESTA NA TABELA, SE SIM, ELE REMOVE O IGUAL A ELE    
     */
    public void remover(Ubs ubs) {
        try {
            sessao.getTransaction().begin();
            sessao.delete(ubs);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Os Dados não foram removidos");
            sessao.getTransaction().rollback();
        }
    }

    /*METODO PARA REMOVER O UM OBJETI/REGISTRO PELO ID(CHAVE PRIMÁRIA)*/
    public void removerPorId(int id) {
        Ubs ubs = buscarPorId(id);
        remover(ubs);

    }

    //METODO PARA LISTAR SOMENTE O PRIMEIRO REGISTRO DA TABELA UBS
    public Ubs carregarDadosIdUm() {
        try {
            Query q = sessao.createQuery("from Ubs where id = :idUbs");
            q.setString("idUbs", "1");
            Ubs ubs = new Ubs();
            ubs = (Ubs) q.uniqueResult();
            return ubs;
        } catch (Exception e) {
            return null;
        }
    }
}
