/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaciones.ui;

import animaciones.Objetos.Imagen;
import animaciones.Objetos.Lienzo;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author sergio
 */
public class PanelLienzo extends javax.swing.JPanel {
private Lienzo lienzo;
private boolean borrador;
private Color colorActual;
private ArrayList<Imagen> imagenes;
private String inicio;
private String fin;
    /**
     * Creates new form PanelLienzo
     */
    public PanelLienzo(Lienzo lienzo) {
        this.lienzo=lienzo;
        inicio=lienzo.getTiempo().getIdInicio();
       fin=lienzo.getTiempo().getIdFin();
        imagenes=lienzo.getTiempo().getImagenes();
        initComponents();
        mostrarColores();
        agregarImagenes();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comImagenes = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        comInicio = new javax.swing.JComboBox<>();
        comFin = new javax.swing.JComboBox<>();
        lblCantidad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        comColores = new javax.swing.JComboBox<>();
        lblColor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();

        jPanel1.setMaximumSize(new java.awt.Dimension(192, 215));

        jLabel3.setText("cantidad");

        jLabel4.setText("Inicio:");

        jLabel5.setText("Fin");

        jLabel6.setText("Imagen:");

        comImagenes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comImagenesItemStateChanged(evt);
            }
        });

        jLabel7.setText("Tiempo:");

        comInicio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comInicioItemStateChanged(evt);
            }
        });

        comFin.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comFinItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel6)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(comImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comFin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(comFin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel1.setText("Color Selecionado:");

        jCheckBox1.setText("Borrador");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Colores:");

        comColores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comColoresItemStateChanged(evt);
            }
        });

        lblColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblColor.setOpaque(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 856, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel2)
                    .addComponent(comColores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(comColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1)))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comColoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comColoresItemStateChanged
        try {
            colorActual=lienzo.getColores().get(comColores.getSelectedIndex()).getColor();
             lblColor.setBackground(colorActual);
        } catch (Exception e) {
        }
       
    }//GEN-LAST:event_comColoresItemStateChanged

    private void comImagenesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comImagenesItemStateChanged
        try {
           
            jPanel3.removeAll();
            jPanel3.setSize(imagenes.get(comImagenes.getSelectedIndex()).getImagen().getSize());
            jPanel3.setPreferredSize(jPanel3.getSize());
            jPanel3.add(imagenes.get(comImagenes.getSelectedIndex()).getImagen(),0);
            imagenes.get(comImagenes.getSelectedIndex()).getImagen().setVisible(true);

            jPanel3.setVisible(true);
                        jPanel3.validate();
            jPanel3.repaint();
            jScrollPane1.repaint();
            txtTiempo.setText(String.valueOf(imagenes.get(comImagenes.getSelectedIndex()).getDuracion()));
        } catch (Exception e) {
            System.out.println("error");
        }
    }//GEN-LAST:event_comImagenesItemStateChanged

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            borrador=true;
        }else{
            borrador=false;
        }
               
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void comInicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comInicioItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comInicioItemStateChanged

    private void comFinItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comFinItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comFinItemStateChanged
private void mostrarColores(){
    for (int i = 0; i < lienzo.getColores().size(); i++) {
        comColores.addItem(lienzo.getColores().get(i).getId());
    }
}

public void agregarImagenes(){
    
    for (int i = 0; i < imagenes.size(); i++) {
        for (int j = 0; j < imagenes.get(i).getCasillas().size(); j++) {
            imagenes.get(i).getCasillas().get(j).agregarPl(this);
        }
        comImagenes.addItem(imagenes.get(i).getId());
        comInicio.addItem(imagenes.get(i).getId());
        comFin.addItem(imagenes.get(i).getId());
        
    }
    comInicio.setSelectedItem(lienzo.getTiempo().getIdInicio());
    comFin.setSelectedItem(lienzo.getTiempo().getIdFin());
    lblCantidad.setText(String.valueOf(obtenerCantidad()));
}

public int obtenerCantidad(){
    int cantidad=0;
    for (int i = 0; i < imagenes.size(); i++) {
        
        if (i==imagenes.size()-1&&!imagenes.get(i).getId().equals(fin)) {
            cantidad=1;
            break;
        }else if (cantidad>0&&!imagenes.get(i).getId().equals(fin)) {
            cantidad++;
        }else if (imagenes.get(i).getId().equals(inicio)) {
            cantidad++;
        }else if(imagenes.get(i).getId().equals(fin)){
            cantidad++;
            break;
        }
        
    }
    return cantidad;
}

    public Lienzo getLienzo() {
        return lienzo;
    }

    public boolean isBorrador() {
        return borrador;
    }

    public Color getColorActual() {
        return colorActual;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comColores;
    private javax.swing.JComboBox<String> comFin;
    private javax.swing.JComboBox<String> comImagenes;
    private javax.swing.JComboBox<String> comInicio;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblColor;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
