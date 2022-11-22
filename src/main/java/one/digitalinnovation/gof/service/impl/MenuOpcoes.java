package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.controller.AnimalRestController;
import one.digitalinnovation.gof.model.RelAn;

import javax.swing.*;

public class MenuOpcoes extends javax.swing.JFrame {


    public MenuOpcoes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sair = new javax.swing.JButton();
        MenuInicial = new javax.swing.JMenuBar();
        Menu1 = new javax.swing.JMenu();
        Cadastro = new javax.swing.JCheckBoxMenuItem();
        Listagem = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        Menu1.setText("Menu Principal ");

        Cadastro.setSelected(true);
        Cadastro.setText("Cadastro");
        Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroActionPerformed(evt);
            }
        });
        Menu1.add(Cadastro);

        Listagem.setSelected(true);
        Listagem.setText("Lista dos Animais ");
        Listagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListagemActionPerformed(evt);
            }
        });
        Menu1.add(Listagem);

        MenuInicial.add(Menu1);

        setJMenuBar(MenuInicial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addComponent(Sair)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(Sair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        sair();
    }//GEN-LAST:event_SairActionPerformed

    private void CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroActionPerformed
        abreCad();
    }//GEN-LAST:event_CadastroActionPerformed

    private void ListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListagemActionPerformed
        abreTab();
    }//GEN-LAST:event_ListagemActionPerformed

    public void abreCad() {
        AnimalRestController.getCadAnimal().setVisible(true);
    }

    public void abreTab() {
        
        RelAn.getRelAn(AnimalRestController.getCadAnimal().getGerenciamento()).setVisible(true);
    }

    public void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Saida", JOptionPane.YES_NO_OPTION, 3);
        if (resp == 0) {
            dispose();
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuOpcoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem Cadastro;
    private javax.swing.JCheckBoxMenuItem Listagem;
    private javax.swing.JMenu Menu1;
    private javax.swing.JMenuBar MenuInicial;
    private javax.swing.JButton Sair;
    // End of variables declaration//GEN-END:variables
}
