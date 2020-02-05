/*Esta classe he um DAO Tipo Generico,
ou seja,  ele dever servir para todos as operacoes com o banco de Dados 
basta ajustar os paramentos para seguir esta logica.
*/
package syspi.abd;

import java.util.List;
import org.hibernate.Session;
import syspi.abd.InterfaceDAO;

/**
 *
 * @author Jorge Carneiro
 */
public class DAO <Objeto> implements InterfaceDAO {
    
    /* Este atributo servirar para receber a classe/objeto modelo e este atributo
    sera preenchido pelo parametro do metodo contrutor da classe  */
    private Objeto objeto;

    /*     Este atributo pega a sessao da fabrica, para conexao ao BD    */
    //Tirar este objeto desta classe ele ja esta implementado na classe InterfaceDAO
    Session sessao = syspi.abd.Fabrica.getSession();

    public DAO(Objeto objeto) {
        this.objeto = objeto;
    }
    
    public void salvar(){
        sessao.beginTransaction();
        sessao.saveOrUpdate(this.objeto);
        sessao.getTransaction().commit();
   }

    @Override
    public void salvar(Object objeto) {
               
    }

    @Override
    public Objeto buscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Objeto buscarPorString(String consulta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listarTudo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
