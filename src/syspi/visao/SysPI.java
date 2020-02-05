package syspi.visao;//GEN-FIRST:event_jMenuItem21ActionPerformed
//GEN-LAST:event_jMenuItem21ActionPerformed
//IMPORTACOES
import syspi.relatorios.visao.RelatorioGeralPorMes;
import syspi.relatorios.visao.RelatorioImunizacaoGeralPorMes;
import syspi.imunizacao.visao.ImunizacaoAgendamentoCriancaPeriodo;
import syspi.imunizacao.visao.ImunizacaoTelaGerarRelatorioAcs;
import syspi.imunizacao.visao.ImunizacaoTelaAtualizarRelatorioPendentesAcs;
import syspi.imunizacao.visao.ImunizacaoTelaAtualizarRelatorioAcs;
import syspi.imunizacao.visao.ImunizacaoAgendamentoIndividualCrianca;
import syspi.consulta.visao.ConsultaTelaAtualizarRelatorioAcs;
import syspi.consulta.visao.ConsultaAgendamentoIndividualCrianca;
import syspi.consulta.visao.ConsultaTelaAtualizarRelatorioPendentesAcs;
import syspi.consulta.visao.ConsultaTelaGerarRelatorioAcs;
import syspi.consulta.visao.ConsultaAgendamentoCriancaPeriodo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import org.hibernate.Session;
import syspi.cadastros.visao.*;

public class SysPI extends javax.swing.JFrame {

    //METODO CONSTRUTOR
    public SysPI() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); // faz o frame iniciar maximizado
        setLocationRelativeTo(null); // faz o frame ficar centralizado.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLHora = new javax.swing.JLabel();
        jLData = new javax.swing.JLabel();
        jLPapelDeParede = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SYSPI - Unidade Básica de Saúde");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/Girl-01-48.png"))); // NOI18N
        jButton1.setText("Responsavel");
        jButton1.setToolTipText("Este botão permite cadastrar responsáveis pela criança");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/Baby-48.png"))); // NOI18N
        jButton2.setText("Criança");
        jButton2.setToolTipText("Este botão permite cadastrar/editar novas crianças no cadastro de um responável.");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator7);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/agendamentosAtalho.png"))); // NOI18N
        jButton5.setText("Agenda Consulta");
        jButton5.setToolTipText("Este botão permite cadastrar/editar novas crianças no cadastro de um responável.");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/agendamentosAtalho.png"))); // NOI18N
        jButton6.setText("Agenda Imunização");
        jButton6.setToolTipText("Este botão permite cadastrar/editar novas crianças no cadastro de um responável.");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);
        jToolBar1.add(jSeparator9);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/Consulta48.png"))); // NOI18N
        jButton3.setText("Consulta por ACS");
        jButton3.setToolTipText("Este botão permite cadastrar/editar novas crianças no cadastro de um responável.");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/consultaACS.png"))); // NOI18N
        jButton4.setText("Imunização por ACS");
        jButton4.setToolTipText("Este botão permite cadastrar/editar novas crianças no cadastro de um responável.");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator8);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/Consulta48.png"))); // NOI18N
        jButton7.setText("Atualizar Consulta");
        jButton7.setToolTipText("Este botão permite cadastrar/editar novas crianças no cadastro de um responável.");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/gotas..48.png"))); // NOI18N
        jButton8.setText("Atualizar Imunização");
        jButton8.setToolTipText("Este botão permite cadastrar/editar novas crianças no cadastro de um responável.");
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton8);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLHora.setFont(new java.awt.Font("Bitsumishi", 1, 12)); // NOI18N
        jLHora.setForeground(javax.swing.UIManager.getDefaults().getColor("ComboBox.selectionBackground"));
        jLHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLHora.setText("hora");

        jLData.setFont(new java.awt.Font("Bitsumishi", 1, 12)); // NOI18N
        jLData.setForeground(javax.swing.UIManager.getDefaults().getColor("ComboBox.selectionBackground"));
        jLData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLData.setText("data");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLData, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLHora, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLHora)
                        .addComponent(jLData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLPapelDeParede.setFont(jLPapelDeParede.getFont());
        jLPapelDeParede.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLPapelDeParede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/LOGO SYSPI.jpg"))); // NOI18N
        jLPapelDeParede.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLPapelDeParede.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jMenu4.setText("Principal");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/ubs.png"))); // NOI18N
        jMenuItem5.setText("Dados UBS");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/profissional.png"))); // NOI18N
        jMenuItem3.setText("Profissional");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/agenda.png"))); // NOI18N
        jMenu3.setText("Agendamentos");
        jMenu3.setBorderPainted(true);
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/agenda.png"))); // NOI18N
        jMenuItem6.setText("Consulta Periodos/Profissional");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/agenda.png"))); // NOI18N
        jMenuItem7.setText("Imunização Periodos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenu4.add(jMenu3);

        jMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/ano.png"))); // NOI18N
        jMenuItem20.setText("Ano");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem20);
        jMenu4.add(jSeparator2);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/sair.png"))); // NOI18N
        jMenuItem11.setText("Sair");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Cadastros");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/acs.png"))); // NOI18N
        jMenuItem4.setText("ACS");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);
        jMenu2.add(jSeparator1);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/responsavel.png"))); // NOI18N
        jMenuItem1.setText("Responsável");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/crianca.png"))); // NOI18N
        jMenuItem2.setText("Criança");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Acompanhamento");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/agenda.png"))); // NOI18N
        jMenuItem10.setText("Agendamento Consultas");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/agenda.png"))); // NOI18N
        jMenuItem12.setText("Agendamento Inumização");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);
        jMenu1.add(jSeparator3);

        jMenuItem15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/Consulta24.png"))); // NOI18N
        jMenuItem15.setText("Atualizar Consultas");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/gotas24.png"))); // NOI18N
        jMenuItem16.setText("Atualizar Imunização");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem16);
        jMenu1.add(jSeparator4);

        jMenuItem17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/agenda.png"))); // NOI18N
        jMenuItem17.setText("Consultas pendentes");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem17);

        jMenuItem18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/agenda.png"))); // NOI18N
        jMenuItem18.setText("Imunizações pendentes");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem18);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Relatórios");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/relatorio.png"))); // NOI18N
        jMenuItem13.setText("Consultas por ACS");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/relatorio.png"))); // NOI18N
        jMenuItem14.setText("Imunização por ACS");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);
        jMenu5.add(jSeparator5);

        jMenuItem19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/relatorio.png"))); // NOI18N
        jMenuItem19.setText("Relatório de ações gerais por mês");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem19);

        jMenuItem21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/relatorio.png"))); // NOI18N
        jMenuItem21.setText("Retatório de Imunizações gerais");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem21);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLPapelDeParede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLPapelDeParede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        

    //BOTÃO PARA ABRIR A JANELA DE CADASTRO DE RESPONSAVEL
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarTelaCadastroResponsavel();
    }

    //BOTAO DE MENU SAIR DO SISTEMA
    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    //BOTAO DE MENU CADASTRO DE UBS
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarJanelaCadastroDadosUbs();
    }

    //BOTAO DE MENU CADASTRO DE ACS
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarTelaCadastroAcs();
    }

    //BOTAO DE MENU CADASTRO DE AGENDAMENTO DE CONSULTAS
    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarTelaAgendamentoIndividual();
    }

    //BOTAO DE MENU CADASTRO DE AGENDAMENTO DE IMUNIZACAO
    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarTelarAgendamentoIndividualImunizacao();
    }

    //BOTAO DE MENU CADASTRO DE PERIODO IMUNIZACAO
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarTelaCadastroPeriodoImunizacao();
    }

    //BOTAO MENU PARA GERAR RELATOIO DE CONSULTAS PARA ACS
    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {
        motrarTelaRelatorioConsultaAcs();
    }

    //BOTAO DE MENU PARA ATUALIZAR A SITUACAO DE CONSULTAS ENTREGUES PARA ACS
    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarTelaAtualizarConsultas();
    }

    //BOTAO MENU PARA ATUALIZAR CONSULTAS PENDENTES
    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarTelaAtualizarConsultasPendentes();
    }

    //BOTAO DE MENU PARA ATUALIZAR A SITUACAO DE IMUNIZACOES ENTREGUES PARA ACS
    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarTelaAtualizarImunizacoes();
    }

    //BOTAO MENU PARA ATUALIZAR IMUNIZACOES PENDENTES
    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarTelaAtualizarImunizacoesPendentes();
    }

    //BOTAO MENU PARA GERAR RELATOIO DE IMUNIZACOES PARA ACS
    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {
        motrarTelaRelatorioImunizacoesAcs();
    }

    //BOTAO MENU PARA ABRIR A JANELA DE CADASTRO DE CRIANÇA
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarTelaCriacaCadastro();
    }

    //BOTAO MENU PARA ABRIR A JANELA DE CADASTRO DE TIPO DE PROFISSIONAL
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarTelaCadastroTipoProfissional();
    }

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    //BOTAO DE MENU CADASTRO DE PERIODO CONSULTA/RESPONSAVEL 
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarTelaCadastroConsultaProfissional();
    }

    //MOSTRAR DATA E HORA NA JANELA PRINCIAPL
    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        mostrarDataHora();
    }

    //BOTAO DE MENU PARA ABRIR A JANELA DE RELATORIO DE ACOES POR MES
    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarTelaRelatoriGeralPorMes();
    }

    //BOTAO DE MENU PARA ABRIR A JANELA DE RELATORIO DE ACOES POR MES
    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarJanelaCadastroAno();
    }

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarJanelaRelatoriosImunizacoesGerais();

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) { //Windows
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SysPI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SysPI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SysPI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SysPI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        
        //Utilitaria.configurar();//faz a configuração do hibernate

        Session sessao;

        /*O TRY aqui é para quando o sistema iniciar, e 
        não conseguir conectar ao banco de Dados .
        He aqui que ele pega a fabrica de sessao e outros
        responsaveis pela conexao e outros ao BD.
         */
        try {
            sessao = syspi.abd.Fabrica.getSession();
        } catch (ExceptionInInitializerError e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao Banco de Dados."
                    + "\n A aplicação será encerrada");
            //FAZER UM /SISTEMA/APP;MECANISMO DE AJUDA AO USUARIO PARA QUANDO ISSO OCORRER
            System.exit(1);
        }

        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new SysPI().setVisible(true);
                }

            });
        } catch (java.lang.ExceptionInInitializerError e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLHora;
    private javax.swing.JLabel jLPapelDeParede;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration                   

    /**
     * ***********************************************
     * TODOS OS ATRIBUTOS DA CALSSE
     * ***********************************************
     */
    //atributos para chamar as janelas de cadastros
    UbsCadastro ubsCadastro; //Este atributo permite que eu crie um objeto dele.
    AcsCadastro cadastroAcs;  // pra chamar a tela de Cadastro do ACS
    ResponsavelCadastro cadastroResponsavel; //
    CriancaCadastro criancaCadastro;
    ProfissionalTipoCadastro tipoProfissional; // para chamar a tela de cadastro tipo profissional.
    RelatorioGeralPorMes relatorioGeralMes;
    AnoCadastro cadastroAno;

    //atributos para chamar as janelas da imunizacao
    ImunizacaoAgendamentoIndividualCrianca inumizacaoAgendamento; // para chamar a tela de Agendamento Imunização
    ImunizacaoTelaGerarRelatorioAcs gerarRelatorioImunizacaoAcs; // para chamar a tela que gera os relatorios/imunizacoes por mes/acs
    RelatorioImunizacaoGeralPorMes gerarRelatorioImunizacaGeral; // para chamar a tela que gera os relatorios/imunizacoes gerais por mes
    ImunizacaoTelaAtualizarRelatorioAcs atualizarImunizacoes; // para chamar a tela que atualiza imunizacoes mes/acs
    ImunizacaoTelaAtualizarRelatorioPendentesAcs imunizacoesPendentes; // para chamar a tela que atualiza as imunizacoes pendentes
    ImunizacaoAgendamentoCriancaPeriodo cadastroPeriodoImunicazao;  //para chamar a tela de cadastro periodos imunizacao

    //atributos para chamar as janelas da consulta
    ConsultaAgendamentoIndividualCrianca consultasAgendamento; // para chamar a tela de Agendamento Consultas
    ConsultaTelaGerarRelatorioAcs gerarRelatorioConsultasAcs; // para chamar a tela que gera os relatorios/consultas por mes/acs
    ConsultaTelaAtualizarRelatorioAcs atualizarConsultas; // para chamar a tela que atualiza consultas mes/acs
    ConsultaTelaAtualizarRelatorioPendentesAcs consultasPendentes; // para chamar a tela que atualiza as consultas pendentes
    ConsultaAgendamentoCriancaPeriodo cadastroPeriodoConsulta; // para chamar a tela de cadastro periodo consultas

    /**
     * **********************************************
     * TODOS OS METODOS PARA CHAMAR AS JANELAS DE AÇÕES
     * ************************************************
     */
    //ESTE METODO PERMITE CRIAR E ABRIR A JANELA CADASTRO DE DADOS DA UBS
    private void mostrarJanelaCadastroDadosUbs() {
        if (ubsCadastro == null) {
            ubsCadastro = new UbsCadastro(this, true);
            ubsCadastro.setVisible(true);
        } else {
            ubsCadastro.setVisible(true);
        }
    }

    //mostrar tela de cadatro periodo profissional consulta
    private void mostrarTelaCadastroConsultaProfissional() {
        if (cadastroPeriodoConsulta == null) {
            cadastroPeriodoConsulta = new ConsultaAgendamentoCriancaPeriodo(this, true);
            cadastroPeriodoConsulta.setVisible(true);
        } else {
            cadastroPeriodoConsulta.setVisible(true);
        }

    }

    //MOSTRAR A JANELA DE CADASTRO DO ACS
    private void mostrarTelaCadastroAcs() {
        if (cadastroAcs == null) {
            cadastroAcs = new AcsCadastro(this, true);
            cadastroAcs.setVisible(true);
        } else {
            cadastroAcs.setVisible(true);
        }
    }

    //MOSTAR JANELA DE AGENDAMENTO CONSULTAS
    private void mostrarTelaAgendamentoIndividual() {
        if (consultasAgendamento == null) {
            consultasAgendamento = new ConsultaAgendamentoIndividualCrianca(this, true);
            consultasAgendamento.setVisible(true);
        } else {
            consultasAgendamento.setVisible(true);
        }
    }

    //MOSTAR JANELA DE AGENDAMENTO IMUNIZACAO
    private void mostrarTelarAgendamentoIndividualImunizacao() {
        if (inumizacaoAgendamento == null) {
            inumizacaoAgendamento = new ImunizacaoAgendamentoIndividualCrianca(this, true);
            inumizacaoAgendamento.setVisible(true);
        } else {
            inumizacaoAgendamento.setVisible(true);
        }
    }

    //mostrar tela de cadatro periodo imunizacao
    private void mostrarTelaCadastroPeriodoImunizacao() {
        if (cadastroPeriodoImunicazao == null) {
            cadastroPeriodoImunicazao = new ImunizacaoAgendamentoCriancaPeriodo(this, true);
            cadastroPeriodoImunicazao.setVisible(true);
        } else {
            cadastroPeriodoImunicazao.setVisible(true);
        }
    }

    //MOSTRAR JANELA DE ENTREGAR RELATORIO DE CONSUILTAS CRIANÇAS PARA ACS
    private void motrarTelaRelatorioConsultaAcs() {
        if (gerarRelatorioConsultasAcs == null) {
            gerarRelatorioConsultasAcs = new ConsultaTelaGerarRelatorioAcs(this, true);
            gerarRelatorioConsultasAcs.setVisible(true);
        } else {
            gerarRelatorioConsultasAcs.setVisible(true);
        }
    }

    //MOSTRAR JANELA DE AUTALIZACAO DE CONSULTAS POR MES/ACS
    private void mostrarTelaAtualizarConsultas() {

        if (atualizarConsultas == null) {
            atualizarConsultas = new ConsultaTelaAtualizarRelatorioAcs(this, true);
            atualizarConsultas.setVisible(true);
        } else {
            atualizarConsultas.setVisible(true);
        }
    }

    //MOSTRAR JANELA DE AUTALIZAR CONSULTAS NAO REALIZADAS
    private void mostrarTelaAtualizarConsultasPendentes() {
        if (consultasPendentes == null) {
            consultasPendentes = new ConsultaTelaAtualizarRelatorioPendentesAcs(this, true);
            consultasPendentes.setVisible(true);
        } else {
            consultasPendentes.setVisible(true);
        }
    }

    //MOSTRAR JANELA DE AUTALIZACAO DE IMUNIZACOES POR MES/ACS
    private void mostrarTelaAtualizarImunizacoes() {
        if (atualizarImunizacoes == null) {
            atualizarImunizacoes = new ImunizacaoTelaAtualizarRelatorioAcs(this, true);
            atualizarImunizacoes.setVisible(true);
        } else {
            atualizarImunizacoes.setVisible(true);
        }
    }

    //MOSTRAR JANELA DE AUTALIZAR IMUNIZACOES NAO REALIZADAS
    private void mostrarTelaAtualizarImunizacoesPendentes() {
        if (imunizacoesPendentes == null) {
            imunizacoesPendentes = new ImunizacaoTelaAtualizarRelatorioPendentesAcs(this, true);
            imunizacoesPendentes.setVisible(true);
        } else {
            imunizacoesPendentes.setVisible(true);
        }
    }

    //MOSTRAR JANELA DE ENTREGAR RELATORIO DE IMUNIZACOES CRIANÇAS PARA ACS
    private void motrarTelaRelatorioImunizacoesAcs() {
        if (gerarRelatorioImunizacaoAcs == null) {
            gerarRelatorioImunizacaoAcs = new ImunizacaoTelaGerarRelatorioAcs(this, true);
            gerarRelatorioImunizacaoAcs.setVisible(true);
        } else {
            gerarRelatorioImunizacaoAcs.setVisible(true);
        }
    }

    //MOSTRAR A JANELA DE CADASTRO RESPONSAVEL
    private void mostrarTelaCadastroResponsavel() {
        if (cadastroResponsavel == null) {
            cadastroResponsavel = new ResponsavelCadastro(this, true);
            cadastroResponsavel.setVisible(true);
        } else {
            cadastroResponsavel.setVisible(true);
        }
    }

    //MOSTRAR A JANELA DE CADASTRO CRIANÇA
    private void mostrarTelaCriacaCadastro() {

        if (criancaCadastro == null) {
            criancaCadastro = new CriancaCadastro(this, true);
            criancaCadastro.setVisible(true);
        } else {
            criancaCadastro.setVisible(true);
        }
    }

    //MOSTRAR A JANELA DE CADASTRO DE TIPO DE PROFISSIONAL
    private void mostrarTelaCadastroTipoProfissional() {
        if (tipoProfissional == null) {
            tipoProfissional = new ProfissionalTipoCadastro(this, true);
            tipoProfissional.setVisible(true);
        } else {
            tipoProfissional.setVisible(true);
        }
    }

    private void mostrarTelaRelatoriGeralPorMes() {
        if (relatorioGeralMes == null) {
            relatorioGeralMes = new RelatorioGeralPorMes(this, true);
            relatorioGeralMes.setVisible(true);
        } else {
            relatorioGeralMes.setVisible(true);

        }
    }

    private void mostrarJanelaCadastroAno() {
        if (cadastroAno == null) {
            cadastroAno = new AnoCadastro(this, true);
            cadastroAno.setVisible(true);
        } else {
            cadastroAno.setVisible(true);
        }
    }

    //ABRE A JANELA PARA SELECIONAR MÊS E ANOS PARA RELATORIOS DE IMUNIZAÇÕES GERIAS POR MES
    private void mostrarJanelaRelatoriosImunizacoesGerais() {
        if (gerarRelatorioImunizacaGeral == null) {
            gerarRelatorioImunizacaGeral = new RelatorioImunizacaoGeralPorMes(null, true);
            gerarRelatorioImunizacaGeral.setVisible(true);
        } else {
            gerarRelatorioImunizacaGeral.setVisible(true);
        }
    }

    /**
     * ***************************************
     * ACOES E OUTROS DESTA CLASSE
     * *************************************************
     */
    //CLASSE Q VAI PERMITIR A INSTANCIAÇÃO E FORMATAÇÃO DA HORA
    class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            jLHora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }
    }

    //MOSTRAR A DATA
    private void mostrarDataHora() {
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        jLData.setText(formato.format(dataSistema));

        //MOSTRAR A HORA
        Timer timer = new Timer(1000, new hora());
        timer.start();
    }

}//fim da classe principal
