package syspi.cadastros.controle;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import syspi.abd.InterfaceDAO;
import syspi.modelo.TipoProfissional;

/**
 *
 * @author Moisés
 */
public class ProfisisonalCadatroDAO implements InterfaceDAO<TipoProfissional> {

    Session sessao = syspi.abd.Fabrica.getSession();

    public ProfisisonalCadatroDAO() {

    }

    @Override
    public void salvar(TipoProfissional profissional) {
        try {
            sessao.beginTransaction();
            sessao.saveOrUpdate(profissional);
            sessao.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Cadastro Salvo!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cadastro não foi salvo!");
        }

    }

    @Override
    public TipoProfissional buscarPorId(int id) {
        try {
            return (TipoProfissional) sessao.get(TipoProfissional.class, id);
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível localizar " + id + " !");
            return null;
        }

    }

    @Override
    public TipoProfissional buscarPorString(String consulta) {
        try {
            Query q = sessao.createQuery("from TipoProfissional where tipoProfissional  =: tipoProfissional");
            return (TipoProfissional) q.setString("tipoProfissional", consulta);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível localizar " + consulta + " !");
            return null;
        }
    }

    @Override
    public List<TipoProfissional> listarTudo() {
        try {
            Query q = sessao.createQuery("FROM TipoProfissional order by tipoProfissional");
            List<TipoProfissional> lista = new ArrayList<>();
            lista = q.list();
            return lista;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os dados!");
            return null;
        }

        
    }

    @Override
    public void atualizar(TipoProfissional profissional) {
          try {
                sessao.getTransaction().begin();
                sessao.merge(profissional);
                sessao.getTransaction().commit();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível atualizar os dados");
                sessao.getTransaction().rollback();
            }
        
    }

    @Override
    public void remover(TipoProfissional profissional) {
       try {
           sessao.getTransaction().begin();
           sessao.delete(profissional);
           sessao.getTransaction().commit();
       } catch (Exception e){
           JOptionPane.showMessageDialog(null,"Funcionário: "+profissional.getTipoProfissional()+" não deletado!");
           sessao.getTransaction().rollback();
       }
    }

    @Override
    public void removerPorId(int id) {
        TipoProfissional profissional = buscarPorId(id);
        remover(profissional);
    }
}
