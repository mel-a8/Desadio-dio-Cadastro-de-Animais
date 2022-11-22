package one.digitalinnovation.gof.controller;

import one.digitalinnovation.gof.model.*;

import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AnimalRestController extends javax.swing.JFrame {

    private static AnimalRestController unicoAnimalRestController;
    private Aquatico a1 = new Aquatico();
    private Gerenciamento ger = new Gerenciamento();

    public AnimalRestController() {
        initComponents();
    }

    public static AnimalRestController getCadAnimal() {

        if (unicoAnimalRestController == null) {
            unicoAnimalRestController = new AnimalRestController();
        }
        return unicoAnimalRestController;
    }
    
    public Gerenciamento getGerenciamento(){
        return ger;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAnAquatico = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblEspecie = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblTipodePele = new javax.swing.JLabel();
        lblTipodeBarbatana = new javax.swing.JLabel();
        lblQtddeBarbatana = new javax.swing.JLabel();
        ctCodigo = new javax.swing.JTextField();
        ctEspecie = new javax.swing.JTextField();
        ctIdade = new javax.swing.JTextField();
        ctSexo = new javax.swing.JTextField();
        ctPeso = new javax.swing.JTextField();
        ctTipodePele = new javax.swing.JTextField();
        ctTipodeBarbatana = new javax.swing.JTextField();
        ctQtddeBarbatana = new javax.swing.JTextField();
        btCad = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        lblAnTerrestre = new javax.swing.JLabel();
        lblCodigoT = new javax.swing.JLabel();
        lblEspecieT = new javax.swing.JLabel();
        lblIdadeT = new javax.swing.JLabel();
        lblSexoT = new javax.swing.JLabel();
        lblPesoT = new javax.swing.JLabel();
        lblTipodePelagemT = new javax.swing.JLabel();
        lblModoLocomocaoT = new javax.swing.JLabel();
        lblQtddePatasT = new javax.swing.JLabel();
        ctCodigoT = new javax.swing.JTextField();
        ctEspecieT = new javax.swing.JTextField();
        ctIdadeT = new javax.swing.JTextField();
        ctSexoT = new javax.swing.JTextField();
        ctPesoT = new javax.swing.JTextField();
        ctTipodePelagemT = new javax.swing.JTextField();
        ctModoLocomocaoT = new javax.swing.JTextField();
        ctQtddePataT = new javax.swing.JTextField();
        btCadT = new javax.swing.JButton();
        btAtualizarT = new javax.swing.JButton();
        btRemoverT = new javax.swing.JButton();
        btLimparT = new javax.swing.JButton();
        lblAnAereo = new javax.swing.JLabel();
        lblCodigoAe = new javax.swing.JLabel();
        lblEspecieAe = new javax.swing.JLabel();
        lblIdadeAe = new javax.swing.JLabel();
        lblSexoAe = new javax.swing.JLabel();
        lblPesoAe = new javax.swing.JLabel();
        lblTipoPlumagemAe = new javax.swing.JLabel();
        lblComprimentoAsaAe = new javax.swing.JLabel();
        lblTipoBicoAe = new javax.swing.JLabel();
        ctCodigoAe = new javax.swing.JTextField();
        ctEspecieAe = new javax.swing.JTextField();
        ctIdadeAe = new javax.swing.JTextField();
        ctSexoAe = new javax.swing.JTextField();
        ctPesoAe = new javax.swing.JTextField();
        ctTipoPlumagemAe = new javax.swing.JTextField();
        ctComprimentoAsaAe = new javax.swing.JTextField();
        ctTipoBicoAe = new javax.swing.JTextField();
        btCadAe = new javax.swing.JButton();
        btAtualizarAe = new javax.swing.JButton();
        btRemoverAe = new javax.swing.JButton();
        btLimparAe = new javax.swing.JButton();
        btConsultarAq = new javax.swing.JButton();
        btConsultarTr = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Animais Aquaticos");

        lblAnAquatico.setText("Animal Aquatico");

        lblCodigo.setText("Código do animal:");

        lblEspecie.setText("Espécie:");

        lblIdade.setText("Idade:");

        lblSexo.setText("Sexo:");

        lblPeso.setText("Peso:");

        lblTipodePele.setText("Tipo de pele:");

        lblTipodeBarbatana.setText("Tipo de Barbatana:");

        lblQtddeBarbatana.setText("Quantidade de barbatana:");

        ctIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctIdadeActionPerformed(evt);
            }
        });

        ctPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctPesoActionPerformed(evt);
            }
        });

        ctTipodeBarbatana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctTipodeBarbatanaActionPerformed(evt);
            }
        });

        ctQtddeBarbatana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctQtddeBarbatanaActionPerformed(evt);
            }
        });

        btCad.setText("Cadastrar");
        btCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        lblAnTerrestre.setText("Animal Terrestre");

        lblCodigoT.setText("Código do animal:");

        lblEspecieT.setText("Espécie:");

        lblIdadeT.setText("Idade:");

        lblSexoT.setText("Sexo:");

        lblPesoT.setText("Peso:");

        lblTipodePelagemT.setText("Tipo de Pelagem:");

        lblModoLocomocaoT.setText("Modo de Locomoção:");

        lblQtddePatasT.setText("Qauntidade de Patas:");

        ctEspecieT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctEspecieTActionPerformed(evt);
            }
        });

        ctIdadeT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctIdadeTActionPerformed(evt);
            }
        });

        ctPesoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctPesoTActionPerformed(evt);
            }
        });

        ctModoLocomocaoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctModoLocomocaoTActionPerformed(evt);
            }
        });

        ctQtddePataT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctQtddePataTActionPerformed(evt);
            }
        });

        btCadT.setText("Cadastrar");
        btCadT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadTActionPerformed(evt);
            }
        });

        btAtualizarT.setText("Atualizar");
        btAtualizarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarTActionPerformed(evt);
            }
        });

        btRemoverT.setText("Remover");
        btRemoverT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverTActionPerformed(evt);
            }
        });

        btLimparT.setText("Limpar");
        btLimparT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparTActionPerformed(evt);
            }
        });

        lblAnAereo.setText("Animal Aereo");

        lblCodigoAe.setText("Código do animal:");

        lblEspecieAe.setText("Espécie:");

        lblIdadeAe.setText("Idade:");

        lblSexoAe.setText("Sexo");

        lblPesoAe.setText("Peso:");

        lblTipoPlumagemAe.setText("Tipo de Plumagem:");

        lblComprimentoAsaAe.setText("Comprimento da Asa:");

        lblTipoBicoAe.setText("Tipo de Bico:");

        ctIdadeAe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctIdadeAeActionPerformed(evt);
            }
        });

        ctPesoAe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctPesoAeActionPerformed(evt);
            }
        });

        ctTipoPlumagemAe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctTipoPlumagemAeActionPerformed(evt);
            }
        });

        ctComprimentoAsaAe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctComprimentoAsaAeActionPerformed(evt);
            }
        });

        ctTipoBicoAe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctTipoBicoAeActionPerformed(evt);
            }
        });

        btCadAe.setText("Cadastrar");
        btCadAe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadAeActionPerformed(evt);
            }
        });

        btAtualizarAe.setText("Atualizar");
        btAtualizarAe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarAeActionPerformed(evt);
            }
        });

        btRemoverAe.setText("Remover");
        btRemoverAe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverAeActionPerformed(evt);
            }
        });

        btLimparAe.setText("Limpar");
        btLimparAe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparAeActionPerformed(evt);
            }
        });

        btConsultarAq.setText("Consultar Aquatico ");
        btConsultarAq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarAqActionPerformed(evt);
            }
        });

        btConsultarTr.setText("Consultar Terrestre");
        btConsultarTr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarTrActionPerformed(evt);
            }
        });

        jButton1.setText("Consultar Aereo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(lblAnAquatico)
                .addGap(306, 306, 306)
                .addComponent(lblAnTerrestre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAnAereo)
                .addGap(244, 244, 244))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btRemover)
                                    .addComponent(btLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQtddeBarbatana)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ctQtddeBarbatana, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btAtualizarT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btCadT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIdadeT)
                                    .addComponent(lblEspecieT)
                                    .addComponent(lblPesoT)
                                    .addComponent(lblSexoT)
                                    .addComponent(lblTipodePelagemT)
                                    .addComponent(lblModoLocomocaoT)
                                    .addComponent(lblQtddePatasT)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addGap(270, 270, 270)
                        .addComponent(lblCodigoT))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEspecie)
                            .addComponent(lblIdade)
                            .addComponent(lblSexo)
                            .addComponent(lblPeso)
                            .addComponent(lblTipodePele)
                            .addComponent(lblTipodeBarbatana))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ctCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ctEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ctIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ctSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ctPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ctTipodePele, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ctTipodeBarbatana, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ctCodigoT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctIdadeT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctEspecieT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctSexoT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctPesoT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctTipodePelagemT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctModoLocomocaoT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctQtddePataT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btLimparT, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btRemoverT)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodigoAe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ctCodigoAe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEspecieAe)
                            .addComponent(lblSexoAe)
                            .addComponent(lblTipoPlumagemAe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ctSexoAe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ctTipoPlumagemAe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIdadeAe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ctIdadeAe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ctEspecieAe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTipoBicoAe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ctTipoBicoAe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblComprimentoAsaAe)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btAtualizarAe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btCadAe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(ctComprimentoAsaAe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPesoAe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ctPesoAe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btRemoverAe)
                    .addComponent(btLimparAe, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(btConsultarAq)
                .addGap(288, 288, 288)
                .addComponent(btConsultarTr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(135, 135, 135)
                .addComponent(btSair)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnAquatico)
                    .addComponent(lblAnAereo)
                    .addComponent(lblAnTerrestre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(ctCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoT)
                    .addComponent(lblCodigoAe)
                    .addComponent(ctCodigoAe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctCodigoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEspecieAe)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEspecie)
                        .addComponent(ctEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEspecieT)
                        .addComponent(ctEspecieT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ctEspecieAe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIdade)
                        .addGap(18, 18, 18)
                        .addComponent(lblSexo)
                        .addGap(14, 14, 14)
                        .addComponent(lblPeso)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipodePele, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ctTipodePele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ctTipodeBarbatana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipodeBarbatana))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQtddeBarbatana)
                            .addComponent(ctQtddeBarbatana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ctIdadeT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblIdadeAe)
                                        .addComponent(ctIdadeAe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblIdadeT)
                                        .addComponent(ctIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ctSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(ctPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ctSexoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblSexoT))
                                    .addComponent(lblSexoAe)
                                    .addComponent(ctSexoAe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ctPesoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPesoT))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPesoAe)
                                        .addComponent(ctPesoAe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTipoPlumagemAe, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ctTipoPlumagemAe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ctTipodePelagemT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTipodePelagemT, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblComprimentoAsaAe)
                                    .addComponent(ctComprimentoAsaAe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ctModoLocomocaoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblQtddePatasT))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ctTipoBicoAe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btRemoverAe)
                                    .addComponent(btCadAe)
                                    .addComponent(btRemoverT)
                                    .addComponent(btCadT))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btLimparAe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ctQtddePataT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblTipoBicoAe)
                                                .addComponent(lblModoLocomocaoT)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btAtualizarAe)
                                            .addComponent(btLimparT)
                                            .addComponent(btAtualizarT)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btRemover)
                                            .addComponent(btCad))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btLimpar)
                                            .addComponent(btAtualizar))))
                                .addGap(41, 41, 41)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSair)
                            .addComponent(jButton1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btConsultarAq)
                            .addComponent(btConsultarTr))
                        .addGap(111, 111, 111))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctIdadeActionPerformed

    private void ctPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctPesoActionPerformed

    private void ctTipodeBarbatanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctTipodeBarbatanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctTipodeBarbatanaActionPerformed

    private void ctQtddeBarbatanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctQtddeBarbatanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctQtddeBarbatanaActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparAq();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadActionPerformed
        try {
            cadastrarAq();
        } catch (NumNegException nfe) {
            System.out.println("\nDeve ser um int");
        }
    }//GEN-LAST:event_btCadActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        excluirAq();
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        try {
            altualizAq();
        } catch (NumNegException ex) {
            System.out.println("\nDeve ser um int");
        }
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void ctEspecieTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctEspecieTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctEspecieTActionPerformed

    private void ctIdadeTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctIdadeTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctIdadeTActionPerformed

    private void ctPesoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctPesoTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctPesoTActionPerformed

    private void ctModoLocomocaoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctModoLocomocaoTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctModoLocomocaoTActionPerformed

    private void ctQtddePataTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctQtddePataTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctQtddePataTActionPerformed

    private void btCadTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadTActionPerformed
        try {
            cadastrarTr();
        } catch (NumNegException nfe) {
            System.out.println("\nDeve ser um int");
        }
    }//GEN-LAST:event_btCadTActionPerformed

    private void btAtualizarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarTActionPerformed
        try {
            altualizTr();
        } catch (NumNegException nfe) {
            System.out.println("\nDeve ser um int");
        }
    }//GEN-LAST:event_btAtualizarTActionPerformed

    private void btRemoverTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverTActionPerformed
        excluirTr();
    }//GEN-LAST:event_btRemoverTActionPerformed

    private void btLimparTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparTActionPerformed
        limparTr();
    }//GEN-LAST:event_btLimparTActionPerformed

    private void ctIdadeAeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctIdadeAeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctIdadeAeActionPerformed

    private void ctPesoAeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctPesoAeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctPesoAeActionPerformed

    private void ctComprimentoAsaAeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctComprimentoAsaAeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctComprimentoAsaAeActionPerformed

    private void ctTipoBicoAeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctTipoBicoAeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctTipoBicoAeActionPerformed

    private void btCadAeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadAeActionPerformed
        try {
            cadastrarAer();
        } catch (NumNegException nfe) {
            System.out.println("\nDeve ser um int");
        }
    }//GEN-LAST:event_btCadAeActionPerformed

    private void btAtualizarAeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarAeActionPerformed
        try {
            altualizAer();
        } catch (NumNegException nfe) {
            System.out.println("\nDeve ser um int");
        }
    }//GEN-LAST:event_btAtualizarAeActionPerformed

    private void btRemoverAeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverAeActionPerformed
        excluirAer();
    }//GEN-LAST:event_btRemoverAeActionPerformed

    private void btLimparAeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparAeActionPerformed
        limparAer();
    }//GEN-LAST:event_btLimparAeActionPerformed

    private void ctTipoPlumagemAeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctTipoPlumagemAeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctTipoPlumagemAeActionPerformed

    private void btConsultarAqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarAqActionPerformed
        try {
            consultaAn();
        } catch (NumNegException ex) {
            System.out.println("\nDeve ser um int");
        }
    }//GEN-LAST:event_btConsultarAqActionPerformed

    private void btConsultarTrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarTrActionPerformed
        try {
            consultaTr();
        } catch (NumNegException ex) {
            System.out.println("\nDeve ser um int");
        }
    }//GEN-LAST:event_btConsultarTrActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            consultaAer();
        } catch (NumNegException ex) {
            System.out.println("\nDeve ser um int");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void abreRelAn() {
        RelAn.getRelAn(ger).setVisible(true);
    }

    public void excluirAq() {
        a1 = new Aquatico();
        try {
            a1.setCodigo(Integer.parseInt(ctCodigo.getText()));
        } catch (NumNegException nne) {
            nne.impNumNeg();
        } catch (NumberFormatException nfe) {
            System.out.println("\nDeve ser um int");
        }
        a1 = ger.removeAq(a1);

        if (a1 == null) {
            JOptionPane.showMessageDialog(null, "Não existe um animal com esse código", "Erro de Remoção", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Remoção com sucesso", "Erro de Remoção", 1);
        }
        limparAq();
    }

    public void excluirTr() {
        Terrestre t1 = new Terrestre();
        try {
            t1.setCodigo(Integer.parseInt(ctCodigoT.getText()));
        } catch (NumNegException nne) {
            nne.impNumNeg();
        } catch (NumberFormatException nfe) {
            System.out.println("\nDeve ser um int");
        }
        t1 = ger.removeTr(t1);

        if (t1 == null) {
            JOptionPane.showMessageDialog(null, "Não existe um animal com esse código", "Erro de Remoção", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Remoção com sucesso", "Erro de Remoção", 1);
        }
        limparAq();
    }

    public void excluirAer() {
        Aereo v1 = new Aereo();
        try {
            v1.setCodigo(Integer.parseInt(ctCodigoAe.getText()));
        } catch (NumNegException nne) {
            nne.impNumNeg();
        } catch (NumberFormatException nfe) {
            System.out.println("\nDeve ser um int");
        }
        v1 = ger.removeAer(v1);

        if (v1 == null) {
            JOptionPane.showMessageDialog(null, "Não existe um animal com esse código", "Erro de Remoção", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Remoção com sucesso", "Erro de Remoção", 1);
        }
        limparAq();
    }

    public void altualizAq() throws NumNegException {
        a1 = new Aquatico();
        try {
            a1.setCodigo(Integer.parseInt(ctCodigo.getText()));
        } catch (NumNegException nne) {
            nne.impNumNeg();
        } catch (NumberFormatException nfe) {
            System.out.println("\nDeve ser um int");
        }

        a1 = ger.atualizaAq(a1);

        if (a1 != null) {
            ctEspecie.setText(a1.getEspecie());
            ctIdade.setText(Integer.toString(a1.getIdade()));
            ctSexo.setText(a1.getSexo());
            ctPeso.setText(Float.toString(a1.getPeso()));
            ctTipodePele.setText(a1.getTipoPele());
            ctTipodeBarbatana.setText(a1.getTipoBarbatana());
            ctQtddeBarbatana.setText(Integer.toString(a1.getQtdBarbatana()));
            JOptionPane.showMessageDialog(null, "Animal atualizado com sucesso!", "Atualização OK", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Não existe um animal com esse código", "Erro de Alteração", 0);
        }
        limparAq();
    }

    public void altualizTr() throws NumNegException {
        Terrestre t1 = new Terrestre();
        try {
            t1.setCodigo(Integer.parseInt(ctCodigoT.getText()));
        } catch (NumNegException nne) {
            nne.impNumNeg();
        } catch (NumberFormatException nfe) {
            System.out.println("\nDeve ser um int");
        }

        t1 = ger.atualizaT(t1);

        if (t1 != null) {
            ctEspecieT.setText(t1.getEspecie());
            ctIdadeT.setText(Integer.toString(t1.getIdade()));
            ctSexoT.setText(t1.getSexo());
            ctPesoT.setText(Float.toString(t1.getPeso()));
            ctTipodePelagemT.setText(t1.getTipoPelagem());
            ctModoLocomocaoT.setText(t1.getModolocomocao());
            ctQtddePataT.setText(Integer.toString(t1.getQtdPata()));
            JOptionPane.showMessageDialog(null, "Animal atualizado com sucesso!", "Atualização OK", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Não existe um animal com esse código", "Erro de Alteração", 0);
        }
        limparAq();
    }

    public void altualizAer() throws NumNegException {
        Aereo v1 = new Aereo();
        try {
            v1.setCodigo(Integer.parseInt(ctCodigoAe.getText()));
        } catch (NumNegException nne) {
            nne.impNumNeg();
        } catch (NumberFormatException nfe) {
            System.out.println("\nDeve ser um int");
        }

        v1 = ger.atualizaAr(v1);

        if (v1 != null) {
            ctEspecieAe.setText(v1.getEspecie());
            ctIdadeAe.setText(Integer.toString(v1.getIdade()));
            ctSexoAe.setText(v1.getSexo());
            ctPesoAe.setText(Float.toString(v1.getPeso()));
            ctTipoPlumagemAe.setText(v1.getTipoPlumagem());
            ctComprimentoAsaAe.setText(Float.toString(v1.getComprimentoAsa()));
            ctTipoBicoAe.setText(v1.getTipoBico());
            JOptionPane.showMessageDialog(null, "Animal atualizado com sucesso!", "Atualização OK", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Não existe um animal com esse código", "Erro de Alteração", 0);
        }
        limparAq();
    }

    public void consultaAn() throws NumNegException {
        a1 = new Aquatico();
        try {
            a1.setCodigo(Integer.parseInt(ctCodigo.getText()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Deve ser uma numero inteiro", "Erro", 0);
            limparAq();
        }

        a1 = (Aquatico) ger.consAnCod(a1);

        if (a1!= null) {
            ctEspecie.setText(a1.getEspecie());
            ctIdade.setText(Integer.toString(a1.getIdade()));
            ctSexo.setText(a1.getSexo());
            ctPeso.setText(Float.toString(a1.getPeso()));
            ctTipodePele.setText(a1.getTipoPele());
            ctTipodeBarbatana.setText(a1.getTipoBarbatana());
            ctQtddeBarbatana.setText(Integer.toString(a1.getQtdBarbatana()));
            ctCodigo.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Não existe um animal com esse cógido", "Erro de Consulta", 0);
            limparAq();
        }

    }

    public void consultaTr() throws NumNegException {
        Terrestre t1 = new Terrestre();

        try {
            t1.setCodigo(Integer.parseInt(ctCodigoT.getText()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Deve ser uma numero inteiro", "Erro", 0);
            limparAq();
        }

        t1 = (Terrestre) ger.consAnCod(t1);

        if (t1 != null) {
            ctEspecieT.setText(t1.getEspecie());
            ctIdadeT.setText(Integer.toString(t1.getIdade()));
            ctSexoT.setText(t1.getSexo());
            ctPesoT.setText(Float.toString(t1.getPeso()));
            ctTipodePelagemT.setText(t1.getTipoPelagem());
            ctModoLocomocaoT.setText(t1.getModolocomocao());
            ctQtddePataT.setText(Integer.toString(t1.getQtdPata()));
            ctCodigoT.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Não existe um animal com esse cógido", "Erro de Consulta", 0);
            limparAq();
        }

    }

    public void consultaAer() throws NumNegException {
        Aereo v1 = new Aereo();

        try {
            v1.setCodigo(Integer.parseInt(ctCodigoAe.getText()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Deve ser uma numero inteiro", "Erro", 0);
            limparAq();
        }

        v1 = (Aereo) ger.consAnCod(v1);

        if (v1 != null) {
            ctEspecieAe.setText(v1.getEspecie());
            ctIdadeAe.setText(Integer.toString(v1.getIdade()));
            ctSexoAe.setText(v1.getSexo());
            ctPesoAe.setText(Float.toString(v1.getPeso()));
            ctTipoPlumagemAe.setText(v1.getTipoPlumagem());
            ctComprimentoAsaAe.setText(Float.toString(v1.getComprimentoAsa()));
            ctTipoBicoAe.setText(v1.getTipoBico());
            ctCodigoAe.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Não existe um animal com esse cógido", "Erro de Consulta", 0);
            limparAq();
        }

    }

    public void cadastrarAq() throws NumNegException {
        a1 = new Aquatico();

        try {
            System.out.println(ctCodigo.getText());
            a1.setCodigo(Integer.parseInt(ctCodigo.getText()));
            a1.setEspecie(ctEspecie.getText());
            a1.setIdade(Integer.parseInt(ctIdade.getText()));
            a1.setSexo(ctSexo.getText());
            a1.setPeso(Integer.parseInt(ctPeso.getText()));
            a1.setTipoPele(ctTipodePele.getText());
            a1.setTipoBarbatana(ctTipodeBarbatana.getText());
            a1.setQtdBarbatana(Integer.parseInt(ctQtddeBarbatana.getText()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Deve ser uma numero inteiro", "Erro", 0);
            ctCodigo.setText("");
            ctCodigo.requestFocus();
        }
        a1 = ger.cadAq(a1);

        if (a1 != null) {
            JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso!", "Cadastro Ok", 1);
            limparAq();
        } else {
            JOptionPane.showMessageDialog(null, "Já existe um animal com esse codigo", "Erro de Cadastro", 0);
            limparAq();
        }
    }

    public void cadastrarTr() throws NumNegException {
        Terrestre t1 = new Terrestre();

        try {
            t1.setCodigo(Integer.parseInt(ctCodigoT.getText()));
            t1.setEspecie(ctEspecieT.getText());
            t1.setIdade(Integer.parseInt(ctIdadeT.getText()));
            t1.setSexo(ctSexoT.getText());
            t1.setPeso(Integer.parseInt(ctPesoT.getText()));
            t1.setTipoPelagem(ctTipodePelagemT.getText());
            t1.setModolocomocao(ctModoLocomocaoT.getText());
            t1.setQtdPata(Integer.parseInt(ctQtddePataT.getText()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Deve ser uma numero inteiro", "Erro", 0);
            ctCodigoT.setText("");
            ctCodigoT.requestFocus();
        }
        t1 = ger.cadTer(t1);
        if (t1 != null) {
            JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso!", "Cadastro Ok", 1);
            limparAq();
        } else {
            JOptionPane.showMessageDialog(null, "Já existe um animal com esse codigo", "Erro de Cadastro", 0);
            limparAq();
        }
    }

    public void cadastrarAer() throws NumNegException {
        Aereo v1 = new Aereo();

        try {
            v1.setCodigo(Integer.parseInt(ctCodigoAe.getText()));
            v1.setEspecie(ctEspecieAe.getText());
            v1.setIdade(Integer.parseInt(ctIdadeAe.getText()));
            v1.setSexo(ctSexoAe.getText());
            v1.setPeso(Integer.parseInt(ctPesoAe.getText()));
            v1.setTipoPlumagem(ctTipoPlumagemAe.getText());
            v1.setComprimentoAsa(Float.parseFloat(ctComprimentoAsaAe.getText()));
            v1.setTipoBico(ctTipoBicoAe.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Deve ser uma numero inteiro", "Erro", 0);
            ctCodigoAe.setText("");
            ctCodigoAe.requestFocus();
        }
        v1 = ger.cadAer(v1);

        if (v1 != null) {
            JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso!", "Cadastro Ok", 1);
            limparAq();
        } else {
            JOptionPane.showMessageDialog(null, "Já existe um animal com esse codigo", "Erro de Cadastro", 0);
            limparAq();
        }
    }

    public void limparAq() {
        ctCodigo.setText("");
        ctEspecie.setText("");
        ctIdade.setText("");
        ctSexo.setText("");
        ctPeso.setText("");
        ctTipodePele.setText("");
        ctTipodeBarbatana.setText("");
        ctQtddeBarbatana.setText("");
        ctCodigo.requestFocus();
    }

    public void limparTr() {
        ctCodigoT.setText("");
        ctEspecieT.setText("");
        ctIdadeT.setText("");
        ctSexoT.setText("");
        ctPesoT.setText("");
        ctTipodePelagemT.setText("");
        ctModoLocomocaoT.setText("");
        ctQtddePataT.setText("");
        ctCodigoT.requestFocus();
    }

    public void limparAer() {
        ctCodigoAe.setText("");
        ctEspecieAe.setText("");
        ctIdadeAe.setText("");
        ctSexoAe.setText("");
        ctPesoAe.setText("");
        ctTipoPlumagemAe.setText("");
        ctComprimentoAsaAe.setText("");
        ctTipoBicoAe.setText("");
        ctCodigoAe.requestFocus();
    }

    public void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Saida", JOptionPane.YES_NO_OPTION, 3);
        if (resp == 0) {
            dispose();
        } else {
            limparAq();
        }
    }

    /**
     * @param args the command line arguments
     */
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
            Logger.getLogger(AnimalRestController.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            Logger.getLogger(AnimalRestController.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            Logger.getLogger(AnimalRestController.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AnimalRestController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnimalRestController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btAtualizarAe;
    private javax.swing.JButton btAtualizarT;
    private javax.swing.JButton btCad;
    private javax.swing.JButton btCadAe;
    private javax.swing.JButton btCadT;
    private javax.swing.JButton btConsultarAq;
    private javax.swing.JButton btConsultarTr;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btLimparAe;
    private javax.swing.JButton btLimparT;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btRemoverAe;
    private javax.swing.JButton btRemoverT;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField ctCodigo;
    private javax.swing.JTextField ctCodigoAe;
    private javax.swing.JTextField ctCodigoT;
    private javax.swing.JTextField ctComprimentoAsaAe;
    private javax.swing.JTextField ctEspecie;
    private javax.swing.JTextField ctEspecieAe;
    private javax.swing.JTextField ctEspecieT;
    private javax.swing.JTextField ctIdade;
    private javax.swing.JTextField ctIdadeAe;
    private javax.swing.JTextField ctIdadeT;
    private javax.swing.JTextField ctModoLocomocaoT;
    private javax.swing.JTextField ctPeso;
    private javax.swing.JTextField ctPesoAe;
    private javax.swing.JTextField ctPesoT;
    private javax.swing.JTextField ctQtddeBarbatana;
    private javax.swing.JTextField ctQtddePataT;
    private javax.swing.JTextField ctSexo;
    private javax.swing.JTextField ctSexoAe;
    private javax.swing.JTextField ctSexoT;
    private javax.swing.JTextField ctTipoBicoAe;
    private javax.swing.JTextField ctTipoPlumagemAe;
    private javax.swing.JTextField ctTipodeBarbatana;
    private javax.swing.JTextField ctTipodePelagemT;
    private javax.swing.JTextField ctTipodePele;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAnAereo;
    private javax.swing.JLabel lblAnAquatico;
    private javax.swing.JLabel lblAnTerrestre;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigoAe;
    private javax.swing.JLabel lblCodigoT;
    private javax.swing.JLabel lblComprimentoAsaAe;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblEspecieAe;
    private javax.swing.JLabel lblEspecieT;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblIdadeAe;
    private javax.swing.JLabel lblIdadeT;
    private javax.swing.JLabel lblModoLocomocaoT;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPesoAe;
    private javax.swing.JLabel lblPesoT;
    private javax.swing.JLabel lblQtddeBarbatana;
    private javax.swing.JLabel lblQtddePatasT;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSexoAe;
    private javax.swing.JLabel lblSexoT;
    private javax.swing.JLabel lblTipoBicoAe;
    private javax.swing.JLabel lblTipoPlumagemAe;
    private javax.swing.JLabel lblTipodeBarbatana;
    private javax.swing.JLabel lblTipodePelagemT;
    private javax.swing.JLabel lblTipodePele;
    // End of variables declaration//GEN-END:variables
}
