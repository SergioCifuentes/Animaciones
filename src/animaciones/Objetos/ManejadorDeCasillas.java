/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaciones.Objetos;

import animaciones.ui.Casilla;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author sergio
 */
public class ManejadorDeCasillas {

    public void generarPanels(ArrayList<Lienzo> lienzos) {
        for (int i = 0; i < lienzos.size(); i++) {
            generarCasillas(lienzos.get(i));
        }
    }

    public void generarCasillas(Lienzo lienzo) {
        for (int k = 0; k < lienzo.getTiempo().getImagenes().size(); k++) {
            JPanel jPanel = new JPanel();
            
            jPanel.setSize((lienzo.getTamaño()+7) * lienzo.getDimension().width, (lienzo.getTamaño()+7) * lienzo.getDimension().height);
            jPanel.setPreferredSize(jPanel.getSize());
            System.out.println(jPanel.getSize());
            jPanel.setVisible(true);
            System.out.println(lienzo.getDimension()+"cim");
            jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 254)));
            for (int i = 0; i < lienzo.getDimension().height; i++) {
                for (int j = 0; j < lienzo.getDimension().width; j++) {
                    
                    Casilla casilla = new Casilla(lienzo.getFondo(), lienzo.getTamaño());
                    casilla.setPreferredSize(new Dimension(lienzo.getTamaño(),lienzo.getTamaño()));
                    casilla.setCoordenadas(j * lienzo.getTamaño(), i * lienzo.getTamaño());
                    
                    casilla.setVisible(true);
                    casilla.setBounds(j * lienzo.getTamaño(), i * lienzo.getTamaño(), lienzo.getTamaño(), lienzo.getTamaño());
                    
                    lienzo.getTiempo().getImagenes().get(k).getCasillas().add(casilla);
                    jPanel.add(casilla);
                     jPanel.validate();
                }
            }
           lienzo.getTiempo().getImagenes().get(k).setImagen(jPanel);
            jPanel.validate();
            jPanel.repaint();
        }

    }
}
