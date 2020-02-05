package syspi.abd;

import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Jorge Carneiro
 * @param <T>
 */
public interface InterfaceDAO<T> {

    Session sessao = syspi.abd.Fabrica.getSession();

    public void salvar(T t);

    public T buscarPorId(int id);

    public T buscarPorString(String consulta);

    public List<T> listarTudo();

    public void atualizar(T t);

    public void remover(T t);

    public void removerPorId(int id);

}
