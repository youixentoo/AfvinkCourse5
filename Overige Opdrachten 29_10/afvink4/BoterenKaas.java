/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maventest.afvink4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author thijs
 */
public class BoterenKaas extends javax.swing.JFrame {

    /**
     * Creates new form BoterenKaas
     */
    public BoterenKaas() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel00 = new javax.swing.JPanel();
        Panel10 = new javax.swing.JPanel();
        Panel20 = new javax.swing.JPanel();
        Panel01 = new javax.swing.JPanel();
        Panel11 = new javax.swing.JPanel();
        Panel21 = new javax.swing.JPanel();
        Panel02 = new javax.swing.JPanel();
        Panel12 = new javax.swing.JPanel();
        Panel22 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        XButton00 = new javax.swing.JButton();
        XButton02 = new javax.swing.JButton();
        XButton10 = new javax.swing.JButton();
        XButton01 = new javax.swing.JButton();
        XButton11 = new javax.swing.JButton();
        XButton12 = new javax.swing.JButton();
        XButton20 = new javax.swing.JButton();
        XButton21 = new javax.swing.JButton();
        XButton22 = new javax.swing.JButton();
        OButton22 = new javax.swing.JButton();
        OButton00 = new javax.swing.JButton();
        OButton02 = new javax.swing.JButton();
        OButton10 = new javax.swing.JButton();
        OButton01 = new javax.swing.JButton();
        OButton11 = new javax.swing.JButton();
        OButton12 = new javax.swing.JButton();
        OButton20 = new javax.swing.JButton();
        OButton21 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Boter en Kaas");
        setResizable(false);

        Panel00.setBackground(new java.awt.Color(255, 255, 255));
        Panel00.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Panel00Layout = new javax.swing.GroupLayout(Panel00);
        Panel00.setLayout(Panel00Layout);
        Panel00Layout.setHorizontalGroup(
            Panel00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel00Layout.setVerticalGroup(
            Panel00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Panel10.setBackground(new java.awt.Color(255, 255, 255));
        Panel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Panel10Layout = new javax.swing.GroupLayout(Panel10);
        Panel10.setLayout(Panel10Layout);
        Panel10Layout.setHorizontalGroup(
            Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel10Layout.setVerticalGroup(
            Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Panel20.setBackground(new java.awt.Color(255, 255, 255));
        Panel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Panel20Layout = new javax.swing.GroupLayout(Panel20);
        Panel20.setLayout(Panel20Layout);
        Panel20Layout.setHorizontalGroup(
            Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel20Layout.setVerticalGroup(
            Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Panel01.setBackground(new java.awt.Color(255, 255, 255));
        Panel01.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Panel01Layout = new javax.swing.GroupLayout(Panel01);
        Panel01.setLayout(Panel01Layout);
        Panel01Layout.setHorizontalGroup(
            Panel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel01Layout.setVerticalGroup(
            Panel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Panel11.setBackground(new java.awt.Color(255, 255, 255));
        Panel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Panel11Layout = new javax.swing.GroupLayout(Panel11);
        Panel11.setLayout(Panel11Layout);
        Panel11Layout.setHorizontalGroup(
            Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel11Layout.setVerticalGroup(
            Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Panel21.setBackground(new java.awt.Color(255, 255, 255));
        Panel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Panel21Layout = new javax.swing.GroupLayout(Panel21);
        Panel21.setLayout(Panel21Layout);
        Panel21Layout.setHorizontalGroup(
            Panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel21Layout.setVerticalGroup(
            Panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Panel02.setBackground(new java.awt.Color(255, 255, 255));
        Panel02.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Panel02Layout = new javax.swing.GroupLayout(Panel02);
        Panel02.setLayout(Panel02Layout);
        Panel02Layout.setHorizontalGroup(
            Panel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel02Layout.setVerticalGroup(
            Panel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Panel12.setBackground(new java.awt.Color(255, 255, 255));
        Panel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Panel12Layout = new javax.swing.GroupLayout(Panel12);
        Panel12.setLayout(Panel12Layout);
        Panel12Layout.setHorizontalGroup(
            Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel12Layout.setVerticalGroup(
            Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Panel22.setBackground(new java.awt.Color(255, 255, 255));
        Panel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Panel22Layout = new javax.swing.GroupLayout(Panel22);
        Panel22.setLayout(Panel22Layout);
        Panel22Layout.setHorizontalGroup(
            Panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel22Layout.setVerticalGroup(
            Panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("Player 1");

        jLabel2.setText("Player 2");

        XButton00.setText("X");
        XButton00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XButton00ActionPerformed(evt);
            }
        });

        XButton02.setText("X");
        XButton02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XButton02ActionPerformed(evt);
            }
        });

        XButton10.setText("X");
        XButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XButton10ActionPerformed(evt);
            }
        });

        XButton01.setText("X");
        XButton01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XButton01ActionPerformed(evt);
            }
        });

        XButton11.setText("X");
        XButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XButton11ActionPerformed(evt);
            }
        });

        XButton12.setText("X");
        XButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XButton12ActionPerformed(evt);
            }
        });

        XButton20.setText("X");
        XButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XButton20ActionPerformed(evt);
            }
        });

        XButton21.setText("X");
        XButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XButton21ActionPerformed(evt);
            }
        });

        XButton22.setText("X");
        XButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XButton22ActionPerformed(evt);
            }
        });

        OButton22.setText("O");
        OButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OButton22ActionPerformed(evt);
            }
        });

        OButton00.setText("O");
        OButton00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OButton00ActionPerformed(evt);
            }
        });

        OButton02.setText("O");
        OButton02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OButton02ActionPerformed(evt);
            }
        });

        OButton10.setText("O");
        OButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OButton10ActionPerformed(evt);
            }
        });

        OButton01.setText("O");
        OButton01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OButton01ActionPerformed(evt);
            }
        });

        OButton11.setText("O");
        OButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OButton11ActionPerformed(evt);
            }
        });

        OButton12.setText("O");
        OButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OButton12ActionPerformed(evt);
            }
        });

        OButton20.setText("O");
        OButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OButton20ActionPerformed(evt);
            }
        });

        OButton21.setText("O");
        OButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Panel02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Panel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Panel00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Panel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Panel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Panel01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Panel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Panel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(XButton00)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(XButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(XButton20))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(XButton01)
                                    .addComponent(XButton02))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(XButton11)
                                    .addComponent(XButton12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(XButton21)
                                    .addComponent(XButton22))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(OButton02)
                                    .addComponent(OButton01))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(OButton11)
                                    .addComponent(OButton12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(OButton22)
                                    .addComponent(OButton21)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(OButton00)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OButton20)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Panel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Panel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Panel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Panel00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Panel01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Panel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(XButton00)
                            .addComponent(XButton10)
                            .addComponent(XButton20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(XButton21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(XButton22))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(XButton11)
                                    .addComponent(XButton01))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(XButton12)
                                    .addComponent(XButton02)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OButton00)
                            .addComponent(OButton10)
                            .addComponent(OButton20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(OButton21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OButton22))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(OButton11)
                                    .addComponent(OButton01))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(OButton12)
                                    .addComponent(OButton02))))))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// <editor-fold defaultstate="collapsed" desc="Them buttons">
    private void XButton00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XButton00ActionPerformed
        Placing(1,'x');
        Place00 = false;
        OButton00.setEnabled(Place00);
        XButton00.setEnabled(Place00);
    }//GEN-LAST:event_XButton00ActionPerformed

    private void XButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XButton10ActionPerformed
        Placing(2,'x');
        Place10 = false;
        OButton10.setEnabled(Place10);
        XButton10.setEnabled(Place10);
        
    }//GEN-LAST:event_XButton10ActionPerformed

    private void XButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XButton20ActionPerformed
        Placing(3,'x');
        Place20 = false;
        OButton20.setEnabled(Place20);
        XButton20.setEnabled(Place20);
    }//GEN-LAST:event_XButton20ActionPerformed

    private void XButton01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XButton01ActionPerformed
        Placing(4,'x');
        Place01 = false;
        OButton01.setEnabled(Place01);
        XButton01.setEnabled(Place01);
    }//GEN-LAST:event_XButton01ActionPerformed

    private void XButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XButton11ActionPerformed
        Placing(5,'x');
        Place11 = false;
        OButton11.setEnabled(Place11);
        XButton11.setEnabled(Place11);
    }//GEN-LAST:event_XButton11ActionPerformed

    private void XButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XButton21ActionPerformed
        Placing(6,'x');
        Place21 = false;
        OButton21.setEnabled(Place21);
        XButton21.setEnabled(Place21);
    }//GEN-LAST:event_XButton21ActionPerformed

    private void XButton02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XButton02ActionPerformed
        Placing(7,'x');
        Place02 = false;
        OButton02.setEnabled(Place02);
        XButton02.setEnabled(Place02);
    }//GEN-LAST:event_XButton02ActionPerformed

    private void XButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XButton12ActionPerformed
        Placing(8,'x');
        Place12 = false;
        OButton12.setEnabled(Place12);
        XButton12.setEnabled(Place12);
    }//GEN-LAST:event_XButton12ActionPerformed

    private void XButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XButton22ActionPerformed
        Placing(9,'x');
        Place22 = false;
        OButton22.setEnabled(Place22);
        XButton22.setEnabled(Place22);
    }//GEN-LAST:event_XButton22ActionPerformed

    private void OButton00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OButton00ActionPerformed
        Placing(1,'o');
        Place00 = false;
        XButton00.setEnabled(Place00);
        OButton00.setEnabled(Place00);
    }//GEN-LAST:event_OButton00ActionPerformed

    private void OButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OButton10ActionPerformed
        Placing(2,'o');
        Place10 = false;
        XButton10.setEnabled(Place10);
        OButton10.setEnabled(Place10);
    }//GEN-LAST:event_OButton10ActionPerformed

    private void OButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OButton20ActionPerformed
        Placing(3,'o');
        Place20 = false;
        XButton20.setEnabled(Place20);
        OButton20.setEnabled(Place20);
    }//GEN-LAST:event_OButton20ActionPerformed

    private void OButton01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OButton01ActionPerformed
        Placing(4,'o');
        Place01 = false;
        XButton01.setEnabled(Place01);
        OButton01.setEnabled(Place01);
    }//GEN-LAST:event_OButton01ActionPerformed

    private void OButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OButton11ActionPerformed
        Placing(5,'o');
        Place11 = false;
        XButton11.setEnabled(Place11);
        OButton11.setEnabled(Place11);
    }//GEN-LAST:event_OButton11ActionPerformed

    private void OButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OButton21ActionPerformed
        Placing(6,'o');
        Place21 = false;
        XButton21.setEnabled(Place21);
        OButton21.setEnabled(Place21);
    }//GEN-LAST:event_OButton21ActionPerformed

    private void OButton02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OButton02ActionPerformed
        Placing(7,'o');
        Place02 = false;
        XButton02.setEnabled(Place02);
        OButton02.setEnabled(Place02);
    }//GEN-LAST:event_OButton02ActionPerformed

    private void OButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OButton12ActionPerformed
        Placing(8,'o');
        Place12 = false;
        XButton12.setEnabled(Place12);
        OButton12.setEnabled(Place12);
    }//GEN-LAST:event_OButton12ActionPerformed

    private void OButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OButton22ActionPerformed
        Placing(9,'o');
        Place22 = false;
        XButton22.setEnabled(Place22);
        OButton22.setEnabled(Place22);
    }//GEN-LAST:event_OButton22ActionPerformed
// </editor-fold>

    
    private void Order(int number){
        int turn = randomGenerator.nextInt(10);
        if(turn % 2 == 0){
            Turns++;
            
        }
        
        
        
    }
    
    private void Placing(int Screen, char letter){
        try{IMG_X = ImageIO.read(new File("D:\\School\\Java\\X.png"));} catch (IOException ex) {System.out.println("Image not found");;}
        try{IMG_O = ImageIO.read(new File("D:\\School\\Java\\O.png"));} catch (IOException ex) {System.out.println("Image not found");;}
        
        // <editor-fold defaultstate="collapsed" desc="Cant see">
        if(Screen == 1){
            Graphics g = Panel00.getGraphics();
            if(letter == 'x'){
                g.drawImage(IMG_X, 10, 10, 50, 50, this);
            }else{
                g.drawImage(IMG_O, 10, 10, 50, 50, this);
            }   
        }else if(Screen == 2){
            Graphics g = Panel10.getGraphics();
            if(letter == 'x'){
                g.drawImage(IMG_X, 10, 10, 50, 50, this);
            }else{
                g.drawImage(IMG_O, 10, 10, 50, 50, this);
            }
        }else if(Screen == 3){
            Graphics g = Panel20.getGraphics();
            if(letter == 'x'){
                g.drawImage(IMG_X, 10, 10, 50, 50, this);
            }else{
                g.drawImage(IMG_O, 10, 10, 50, 50, this);
            }
        }else if(Screen == 4){
            Graphics g = Panel01.getGraphics();
            if(letter == 'x'){
                g.drawImage(IMG_X, 10, 10, 50, 50, this);
            }else{
                g.drawImage(IMG_O, 10, 10, 50, 50, this);
            }
        }else if(Screen == 5){
            Graphics g = Panel11.getGraphics();
            if(letter == 'x'){
                g.drawImage(IMG_X, 10, 10, 50, 50, this);
            }else{
                g.drawImage(IMG_O, 10, 10, 50, 50, this);
            }
        }else if(Screen == 6){
            Graphics g = Panel21.getGraphics();
            if(letter == 'x'){
                g.drawImage(IMG_X, 10, 10, 50, 50, this);
            }else{
                g.drawImage(IMG_O, 10, 10, 50, 50, this);
            }
        }else if(Screen == 7){
            Graphics g = Panel02.getGraphics();
            if(letter == 'x'){
                g.drawImage(IMG_X, 10, 10, 50, 50, this);
            }else{
                g.drawImage(IMG_O, 10, 10, 50, 50, this);
            }
        }else if(Screen == 8){
            Graphics g = Panel12.getGraphics();
            if(letter == 'x'){
                g.drawImage(IMG_X, 10, 10, 50, 50, this);
            }else{
                g.drawImage(IMG_O, 10, 10, 50, 50, this);
            }
        }else if(Screen == 9){
            Graphics g = Panel22.getGraphics();
            if(letter == 'x'){
                g.drawImage(IMG_X, 10, 10, 50, 50, this);
            }else{
                g.drawImage(IMG_O, 10, 10, 50, 50, this);
            }
        }
        // </editor-fold>
        
        
        if(!Place00|!Place01|!Place02|!Place10|!Place11|!Place12|!Place20|!Place21|!Place22){
            JOptionPane.showMessageDialog(null,"Draw");
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
            java.util.logging.Logger.getLogger(BoterenKaas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoterenKaas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoterenKaas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoterenKaas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BoterenKaas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OButton00;
    private javax.swing.JButton OButton01;
    private javax.swing.JButton OButton02;
    private javax.swing.JButton OButton10;
    private javax.swing.JButton OButton11;
    private javax.swing.JButton OButton12;
    private javax.swing.JButton OButton20;
    private javax.swing.JButton OButton21;
    private javax.swing.JButton OButton22;
    private javax.swing.JPanel Panel00;
    private javax.swing.JPanel Panel01;
    private javax.swing.JPanel Panel02;
    private javax.swing.JPanel Panel10;
    private javax.swing.JPanel Panel11;
    private javax.swing.JPanel Panel12;
    private javax.swing.JPanel Panel20;
    private javax.swing.JPanel Panel21;
    private javax.swing.JPanel Panel22;
    private javax.swing.JButton XButton00;
    private javax.swing.JButton XButton01;
    private javax.swing.JButton XButton02;
    private javax.swing.JButton XButton10;
    private javax.swing.JButton XButton11;
    private javax.swing.JButton XButton12;
    private javax.swing.JButton XButton20;
    private javax.swing.JButton XButton21;
    private javax.swing.JButton XButton22;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
    private boolean Place00, Place01, Place02, Place10, Place11, Place12, Place20, Place21, Place22 = false;
    private BufferedImage IMG_X, IMG_O;
    private int Turns = 0;
    Random randomGenerator = new Random();












}
