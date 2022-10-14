//Desenvolvido por: Maiara Cristina de Freitas

package view;

import entidades.Media;
import entidades.Tag;
import javax.swing.JOptionPane;
import persistencia.MediaDAO;
import persistencia.TagDAO;

public class TelacadastroMedia extends javax.swing.JFrame {

    private Media media;
    private TelaListarMedia telaListarMedia;
    
    public TelacadastroMedia(TelaListarMedia telaListarMedia) {
        initComponents();
        this.media = new Media();
        this.telaListarMedia = telaListarMedia; //usado para atualizar lista quando cadastrado nova midia
    }
    
    public void setMedia(Media media){
        this.media = media;
        txtName.setText(media.getName());
        txtFile.setText(media.getFile());
        txtSize.setText(String.valueOf( media.getSize()));
        txtDuration.setText(String.valueOf(media.getDuration()));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtFile = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        txtSize = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel7.setText("Outubro de 2022");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Nome:");

        txtFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFileActionPerformed(evt);
            }
        });

        jLabel2.setText("Arquivo:");

        jLabel3.setText("Tamanho do arquivo: ");

        jLabel4.setText("Duração:");

        btnCadastrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCadastrar.setText("Gravar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Cadastro de Mídias");

        jLabel6.setText("Desenvolvido por: Maiara Cristina de Freitas");

        jLabel8.setText("Outubro de 2022");

        jLabel9.setText("Outubro de 2022");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                            .addComponent(txtFile)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(btnCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(128, 128, 128)
                    .addComponent(jLabel8)
                    .addContainerGap(128, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(jLabel8)
                    .addContainerGap(150, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFileActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        media.setName(txtName.getText());
        media.setFile(txtFile.getText());
        media.setSize(Integer.parseInt(txtSize.getText()));
        media.setDuration(Integer.parseInt(txtDuration.getText()));
        //media.setTag_id(Integer.parseInt(txtTag.getText()));
        
        if(media.getId() == 0 ){
            inserir();
        }else{
            alterar();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void inserir(){
        if(MediaDAO.inserir(media)){
            JOptionPane.showMessageDialog(this,"Mídia cadastrada com sucesso...");
            telaListarMedia.listarMedias(); //atualizar a lista
            dispose();
        }else{
            JOptionPane.showMessageDialog(this,"Erro ao cadastrar Mídia!");
        }
    }
    
    private void alterar(){
        if(MediaDAO.alterar(media)){
            JOptionPane.showMessageDialog(this,"Mídia alterada com sucesso...");
            telaListarMedia.listarMedias(); //atualizar a lista
            dispose();
        }else{
            JOptionPane.showMessageDialog(this,"Erro ao alterar Mídia!");
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtFile;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSize;
    // End of variables declaration//GEN-END:variables
}
