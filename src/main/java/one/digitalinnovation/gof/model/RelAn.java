package one.digitalinnovation.gof.model;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class RelAn extends javax.swing.JFrame {

    private static RelAn unicoRA;
    private Aquatico a1 = new Aquatico();
    private Terrestre t1 = new Terrestre();
    private Aereo v1 = new Aereo();
    private static Gerenciamento ger;

    public RelAn() {
        initComponents();
    }

    public static RelAn getRelAn(Gerenciamento g1) {
        ger = g1;
        if (unicoRA == null) {
            unicoRA = new RelAn();
        }
        return unicoRA;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblListaAq = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabAn = new javax.swing.JTable();
        lblListaT = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabTr = new javax.swing.JTable();
        lblListaAe = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabAer = new javax.swing.JTable();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblListaAq.setText("Lista dos Animais Aquaticos");

        tabAn.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código ", "Especie", "Idade", "Sexo", "Peso", "Tipo de Pele", "Tipo de Barbatana", "Qtd de Barbatana"
            }
        ));
        tabAn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabAnMouseClicked(evt);
            }
        });
        tabAn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tabAnPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tabAn);

        lblListaT.setText("Lista dos Animais Terrestre");

        tabTr.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código ", "Especie", "Idade", "Sexo", "Peso", "Tipo de Pelagem", "Modo de Locomocao", "Qtd de Patas"
            }
        ));
        tabTr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabTrMouseClicked(evt);
            }
        });
        tabTr.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tabTrPropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(tabTr);

        lblListaAe.setText("Lista dos Animais Aereo");

        tabAer.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código ", "Especie", "Idade", "Sexo", "Peso", "Tipo de Plumagem", "Comprimento da Asa", "Tipo de Bico"
            }
        ));
        tabAer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabAerMouseClicked(evt);
            }
        });
        tabAer.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tabAerPropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(tabAer);

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(441, 441, 441)
                        .addComponent(lblListaT)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(443, 443, 443)
                        .addComponent(lblListaAq))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addComponent(lblListaAe)))
                .addContainerGap(754, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblListaAq)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(lblListaT)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(lblListaAe)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209)
                .addComponent(btSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabAnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAnMouseClicked
        selectTabAn();
    }//GEN-LAST:event_tabAnMouseClicked

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void tabAnPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tabAnPropertyChange
        listaTabAq();
    }//GEN-LAST:event_tabAnPropertyChange

    private void tabTrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabTrMouseClicked
        selectTabTr();
    }//GEN-LAST:event_tabTrMouseClicked

    private void tabTrPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tabTrPropertyChange
        listaTabTr();
    }//GEN-LAST:event_tabTrPropertyChange

    private void tabAerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAerMouseClicked
        selectTabAer();
    }//GEN-LAST:event_tabAerMouseClicked

    private void tabAerPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tabAerPropertyChange
        listaTabAer();
    }//GEN-LAST:event_tabAerPropertyChange
    public void selectTabAn() {
        String valLinTab = "";
        int posLin = tabAn.getSelectedRow();

        for (int coluna = 0; coluna < tabAn.getColumnCount(); coluna++) {
            valLinTab += tabAn.getModel().getValueAt(posLin, coluna).toString();

            if (coluna + 1 < tabAn.getRowCount()) {
                valLinTab += " - ";
            }

        }
        JOptionPane.showMessageDialog(null, "Valor escolhido: " + valLinTab, "Seleção na tabela", 1);
    }

    public void selectTabTr() {
        String valLinTab = "";
        int posLin = tabTr.getSelectedRow();

        for (int coluna = 0; coluna < tabTr.getColumnCount(); coluna++) {
            valLinTab += tabTr.getModel().getValueAt(posLin, coluna).toString();

            if (coluna + 1 < tabTr.getRowCount()) {
                valLinTab += " - ";
            }

        }
        JOptionPane.showMessageDialog(null, "Valor escolhido: " + valLinTab, "Seleção na tabela", 1);
    }

    public void selectTabAer() {
        String valLinTab = "";
        int posLin = tabAer.getSelectedRow();

        for (int coluna = 0; coluna < tabAer.getColumnCount(); coluna++) {
            valLinTab += tabAer.getModel().getValueAt(posLin, coluna).toString();

            if (coluna + 1 < tabAer.getRowCount()) {
                valLinTab += " - ";
            }

        }
        JOptionPane.showMessageDialog(null, "Valor escolhido: " + valLinTab, "Seleção na tabela", 1);
    }

    public void listaTabAq() {
        DefaultTableModel modelo = (DefaultTableModel) tabAn.getModel();

        int posLin = 0;
        modelo.setRowCount(posLin);

        for (Animal a1 : ger.getBdAn()) {
            if (a1.getClass() == (new Aquatico()).getClass()) {
                modelo.insertRow(posLin, new Object[]{a1.getCodigo(), a1.getEspecie(), a1.getIdade(), a1.getSexo(), ((Aquatico)a1).getTipoPele(), ((Aquatico)a1).getTipoBarbatana(), ((Aquatico)a1).getQtdBarbatana()});
                posLin++;
            }
        }
    }

    public void listaTabTr() {
        DefaultTableModel modelo = (DefaultTableModel) tabTr.getModel();

        int posLin = 0;
        modelo.setRowCount(posLin);

        for (Animal t1 : ger.getBdAn()) {
            if (t1.getClass() == (new Terrestre()).getClass()) {
                modelo.insertRow(posLin, new Object[]{t1.getCodigo(), t1.getEspecie(), t1.getIdade(), t1.getSexo(), ((Terrestre) t1).getTipoPelagem(), ((Terrestre) t1).getModolocomocao(), ((Terrestre) t1).getQtdPata()});
                posLin++;
            }
        }
    }

    public void listaTabAer() {
        DefaultTableModel modelo = (DefaultTableModel) tabAer.getModel();

        int posLin = 0;
        modelo.setRowCount(posLin);

        for (Animal v1 : ger.getBdAn()) {
            if (v1.getClass() == (new Aereo()).getClass()) {
                modelo.insertRow(posLin, new Object[]{v1.getCodigo(), v1.getEspecie(), v1.getIdade(), v1.getSexo(), ((Aereo) v1).getTipoPlumagem(), ((Aereo) v1).getComprimentoAsa(), ((Aereo) v1).getTipoBico()});
                posLin++;
            }
        }
    }

    public void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Saida", JOptionPane.YES_NO_OPTION, 3);
        if (resp == 0) {
            dispose();
        }
    }

    static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(RelAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelAn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblListaAe;
    private javax.swing.JLabel lblListaAq;
    private javax.swing.JLabel lblListaT;
    private javax.swing.JTable tabAer;
    private javax.swing.JTable tabAn;
    private javax.swing.JTable tabTr;
    // End of variables declaration//GEN-END:variables
}



