package syspi.cadastros.visao;

import javax.swing.JOptionPane;
import syspi.cadastros.controle.UbsCadastroDAO;
import syspi.modelo.Ubs;

public class UbsCadastro extends javax.swing.JDialog {

    private static final long serialVersionUID = 1L;

    public UbsCadastro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        desativarEdicaoCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFRua = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFNumero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFBairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFCep = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTFTelefone = new javax.swing.JTextField();
        jTFCidade = new javax.swing.JTextField();
        jCBEstado = new javax.swing.JComboBox();
        jBAlterar = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jBFechar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dados Unidade Básica de Saúde");
        setIconImage(null);
        setName("FMUbsCadastro"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 74, 74));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nome:");

        jTFNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFNome.setText("jTFNome");
        jTFNome.setToolTipText("Nome da Unidade de Saúde");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Rua:");

        jTFRua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFRua.setText("jTFRua");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Numero:");

        jTFNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFNumero.setText("jTFNumero");
        jTFNumero.setToolTipText("");
        jTFNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFNumeroFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Bairro:");

        jTFBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFBairro.setText("jTFBairro");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("CEP:");

        jTFCep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFCep.setText("jTFCep");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Cidade:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Estado:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Telefone:");

        jTFTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFTelefone.setText("jTFTelefone");

        jTFCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFCidade.setText("jTFCidade");

        jCBEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCBEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "jCBEstado", "Ceará", "São Paulo" }));

        jBAlterar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/editar.png"))); // NOI18N
        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/salvar.png"))); // NOI18N
        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBFechar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syspi/imagens/fechar_janela.png"))); // NOI18N
        jBFechar.setText("Fechar");
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTFRua, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTFCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                .addComponent(jTFBairro, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCBEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTFCep, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBAlterar)
                        .addGap(84, 84, 84)
                        .addComponent(jBSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBFechar)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFRua, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFCep, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        ativarEdicaoCampos();
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        fecharJanela();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        botaoSalvar();
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        fecharJanelaPeloBotaoX();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        fecharJanela();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        carregarDados();
    }//GEN-LAST:event_formWindowOpened


    private void jTFNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNumeroFocusLost
        verificarCampoTipoNumero();
    }//GEN-LAST:event_jTFNumeroFocusLost

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UbsCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UbsCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UbsCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UbsCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UbsCadastro dialog = new UbsCadastro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JComboBox jCBEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFBairro;
    private javax.swing.JTextField jTFCep;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFNumero;
    private javax.swing.JTextField jTFRua;
    private javax.swing.JTextField jTFTelefone;
    // End of variables declaration//GEN-END:variables

    /*PARTE PROGRAMADA POR JORGE*/
    UbsCadastroDAO controle = new UbsCadastroDAO();

    //
    private void botaoSalvar() {

        if (jTFNome.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "O Campo Nome, é de preenchimento obrigatório.");
            jTFNome.requestFocus();
        } else if (jTFTelefone.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "O Campo Telefone, é de preenchimento obrigatório.");
            jTFTelefone.requestFocus();
        } else if (jTFRua.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "O Campo Rua, é de preenchimento obrigatório.");
            jTFRua.requestFocus();
        } else if (jTFNumero.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "O Campo Numero, é de preenchimento obrigatório.");
            jTFNumero.requestFocus();
        } else if (jTFBairro.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "O Campo Bairro, é de preenchimento obrigatório.");
            jTFBairro.requestFocus();
        } else if (jTFCep.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O Campo CEP, é de preenchimento obrigátorio.");
            jTFCep.requestFocus();
        } else if (jTFCidade.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "O Campo Cidade, é de preenchimento obrigátorio.");
            jTFCidade.requestFocus();
        } else if (jCBEstado.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "O Campo Estado, é de preenchimento obrigátorio.");
            jTFCidade.requestFocus();
        } else {
            desativarEdicaoCampos();
            try {
                Ubs ubs = controle.carregarDadosIdUm();

                ubs.setNome(jTFNome.getText().trim());
                ubs.setTelefone(jTFTelefone.getText().trim());
                ubs.setRua(jTFRua.getText().trim());
                ubs.setNumero(Integer.parseInt(jTFNumero.getText()));
                ubs.setBairro(jTFBairro.getText());
                ubs.setCep(jTFCep.getText().trim());
                ubs.setCidade(jTFCidade.getText().trim());
                ubs.setEstado(jCBEstado.getSelectedItem().toString().trim());

                controle.atualizar(ubs);

            } catch (Exception e) {
                Ubs ubs = new Ubs();

                ubs.setNome(jTFNome.getText().trim());
                ubs.setTelefone(jTFTelefone.getText().trim());
                ubs.setRua(jTFRua.getText().trim());
                ubs.setNumero(Integer.parseInt(jTFNumero.getText()));
                ubs.setBairro(jTFBairro.getText());
                ubs.setCep(jTFCep.getText().trim());
                ubs.setCidade(jTFCidade.getText().trim());
                ubs.setEstado(jCBEstado.getSelectedItem().toString().trim());

                controle.salvar(ubs);
            }

        }

    }

    private void ativarEdicaoCampos() {
        jTFNome.setEditable(true);
        jTFBairro.setEditable(true);
        jTFCep.setEditable(true);
        jTFCidade.setEditable(true);
        jTFNumero.setEditable(true);
        jTFRua.setEditable(true);
        jTFTelefone.setEditable(true);
        jCBEstado.setEditable(true);
        jCBEstado.setEnabled(true);
        jBAlterar.setEnabled(false);
        jBSalvar.setEnabled(true);
    }

    private void desativarEdicaoCampos() {
        jTFNome.setEditable(false);
        jTFBairro.setEditable(false);
        jTFCep.setEditable(false);
        jTFCidade.setEditable(false);
        jTFNumero.setEditable(false);
        jTFRua.setEditable(false);
        jTFTelefone.setEditable(false);
        jCBEstado.setEditable(false);
        jCBEstado.setEnabled(false);
        jBAlterar.setEnabled(true);
        jBSalvar.setEnabled(false);
    }

    private void fecharJanela() {

        if (jBSalvar.isEnabled()) {
            int op_escolhida = JOptionPane.showConfirmDialog(null, "Deseja sair sem salvar os dados?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (op_escolhida == JOptionPane.YES_NO_OPTION) {
                desativarEdicaoCampos();
                /*esta opcao esta aqui para quando o usuaruio clicar no botao JBFEchar, ele realmente fechar a janela
                se nao ele nao fecha a janela, caso contraio do botao fechar da barra de titulo que realmente.
                */
                this.dispose(); 
            }
        } else {
            this.dispose();
        }
    }

    /*
    Este metodo serve para quando o usuario clicar no botao fechar da barra de titulo,
    entao este metodo veririca se o botao salvar esta ativo, se sim ele abri a janela para o usurio
    */
    private void fecharJanelaPeloBotaoX() {
        if (jBSalvar.isEnabled()) {
            this.setVisible(true);
        }
    }

    private void limparCampops() {
        jTFBairro.setText("");
        jTFCep.setText("");
        jTFCidade.setText("");
        jCBEstado.setSelectedItem("");
        jTFNome.setText("");
        jTFRua.setText("");
        jTFTelefone.setText("");
        jTFNumero.setText("");
    }

    private void carregarDados() {
        try {
            jTFBairro.setText(controle.carregarDadosIdUm().getBairro());
            jTFCep.setText(controle.carregarDadosIdUm().getCep());
            jTFCidade.setText(controle.carregarDadosIdUm().getCidade());
            jCBEstado.setSelectedItem(controle.carregarDadosIdUm().getEstado().trim());
            jTFNome.setText(controle.carregarDadosIdUm().getNome());
            jTFRua.setText(controle.carregarDadosIdUm().getRua());
            jTFTelefone.setText(controle.carregarDadosIdUm().getTelefone());
            jTFNumero.setText(String.valueOf(controle.carregarDadosIdUm().getNumero()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ainda não há dados salvos.");
            ativarEdicaoCampos();
            limparCampops();
        }

    }

    private void verificarCampoTipoNumero() {
        try {
            int numero = Integer.parseInt(jTFNumero.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Este campo só aceita numeros.");
            jTFNumero.requestFocus();
        }
    }

}
