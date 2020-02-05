package syspi.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.hbm2ddl.SchemaUpdate;

public class Utilitaria {

    private static SessionFactory sessionFactory;
    private static Configuration cfg = new Configuration();
    // private static Session secao;

    public static void configurar() {

        cfg.addAnnotatedClass(syspi.modelo.Acs.class);
        cfg.addAnnotatedClass(syspi.modelo.Ano.class);
        cfg.addAnnotatedClass(syspi.modelo.Consulta.class);
        cfg.addAnnotatedClass(syspi.modelo.ConsultaHistorico.class);
        cfg.addAnnotatedClass(syspi.modelo.Crianca.class);
        cfg.addAnnotatedClass(syspi.modelo.Imunizacao.class);
        cfg.addAnnotatedClass(syspi.modelo.ImunizacaoHistorico.class);
        cfg.addAnnotatedClass(syspi.modelo.Responsavel.class);
        cfg.addAnnotatedClass(syspi.modelo.TempoVidaConsulta.class);
        cfg.addAnnotatedClass(syspi.modelo.TempoVidaImunizacao.class);
        cfg.addAnnotatedClass(syspi.modelo.TipoProfissional.class);
        cfg.addAnnotatedClass(syspi.modelo.Ubs.class);

        //SchemaUpdate sch = new SchemaUpdate(cfg);
        //sch.execute(true, true);
        SchemaExport sch = new SchemaExport(cfg);
        sch.execute(true, false, false, false);
        ServiceRegistry srv = new StandardServiceRegistryBuilder().build();
        sessionFactory = cfg.buildSessionFactory(srv);

    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }

    public static void close() {
        sessionFactory.close();
    }

}