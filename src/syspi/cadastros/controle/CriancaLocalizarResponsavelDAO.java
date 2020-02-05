package syspi.cadastros.controle;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import syspi.abd.InterfaceDAO;
import syspi.modelo.Responsavel;

public class CriancaLocalizarResponsavelDAO implements InterfaceDAO<Responsavel> {

    Session sessao = syspi.abd.Fabrica.getSession();

    public CriancaLocalizarResponsavelDAO() {

    }

    @Override
    public void salvar(Responsavel t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Responsavel buscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public void atualizar(Responsavel t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Responsavel t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}