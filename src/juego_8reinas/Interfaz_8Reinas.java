
// **************************************************************************************************************************************************
// UNIVERSIDAD ESTATAL A DISTANCIA
// ESCUELA DE CIENCIAS EXACTAS Y NATURALES
// CARRERA INGENIERIA INFORMATICA
// CATETRAS TECNOLOGIA DE SISTEMAS

// ESTRUCTURA DE DATOS_00825
// PROYECTO FINAL
// ESTUDIANTE: SHMAITER JOSE MORALES RIZO
// CEDULA: 0207020436

// GRUPO: B
// PROFESOR: FABIAN SEQUEIRA
// SEGUNDO CUATRIMESTRE 2020
// **************************************************************************************************************************************************
package juego_8reinas;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Interfaz_8Reinas extends javax.swing.JFrame {
    
    private JButton[][] botones = new JButton[8][8];
    private int contador=1;
    Juego_8Reinas logicaTablero = new Juego_8Reinas();
    
    public Interfaz_8Reinas() {
        initComponents();
        logicaTablero.iniciarJuego();
        mostrarTableroVacio();
        
    }
    
    private void mostrarTableroVacio() {
        boolean color = true;
        
        for (int f = 0; f < botones.length; f++) {
            color = !color;
            for (int c = 0; c < botones.length; c++) {
                botones[f][c] = new JButton();
                botones[f][c].setBounds(f * 50, c * 50, 50, 50);

                if (color) {
                    botones[f][c].setBackground(Color.GRAY);
                    
                } else {
                    botones[f][c].setBackground(Color.WHITE);
                    
                }

                color = !color;
                jPanelTablero.add(botones[f][c]);
            }
        }
        JButtonSolucion.setText("Mostrar solución #" + contador);
    }
    
    private void limpiarTablero(){
        
        for (int f = 0; f < botones.length; f++) {
            for (int c = 0; c < botones.length; c++) {
                botones[f][c].setIcon(null);
            }
        }
    }
    
    private void cambioBoton(){
        
        if (contador == 5) {
            contador = 1;
            JButtonSolucion.setText("Mostrar solución #" + contador);
            
        }else{
            contador++;
            JButtonSolucion.setText("Mostrar solución #" + contador);
            
        }
        
        
    }
    
    public void mostrarSolucion (){
        
        
        ImageIcon reinaImagen = new ImageIcon(getClass().getResource("/juego_8reinas/reina.png"));

        switch (contador) {
            case 1: {
                for (int i = 0; i < botones.length; i++) {
                    botones[i][logicaTablero.vec1[i]].setIcon(new ImageIcon(reinaImagen.getImage().getScaledInstance(botones[i][logicaTablero.vec1[i]].getWidth(), botones[i][logicaTablero.vec1[i]].getHeight(), Image.SCALE_SMOOTH)));
                }
                break;
            }
            
            case 2: {
                for (int i = 0; i < botones.length; i++) {
                    botones[i][logicaTablero.vec2[i]].setIcon(new ImageIcon(reinaImagen.getImage().getScaledInstance(botones[i][logicaTablero.vec2[i]].getWidth(), botones[i][logicaTablero.vec2[i]].getHeight(), Image.SCALE_SMOOTH)));
                }
                break;
            }

            case 3: {
                for (int i = 0; i < botones.length; i++) {
                    botones[i][logicaTablero.vec3[i]].setIcon(new ImageIcon(reinaImagen.getImage().getScaledInstance(botones[i][logicaTablero.vec3[i]].getWidth(), botones[i][logicaTablero.vec3[i]].getHeight(), Image.SCALE_SMOOTH)));
                }
                break;
            }

            case 4: {
                for (int i = 0; i < botones.length; i++) {
                    botones[i][logicaTablero.vec4[i]].setIcon(new ImageIcon(reinaImagen.getImage().getScaledInstance(botones[i][logicaTablero.vec4[i]].getWidth(), botones[i][logicaTablero.vec4[i]].getHeight(), Image.SCALE_SMOOTH)));
                }
                break;
            }

            case 5: {
                for (int i = 0; i < botones.length; i++) {
                    botones[i][logicaTablero.vec5[i]].setIcon(new ImageIcon(reinaImagen.getImage().getScaledInstance(botones[i][logicaTablero.vec5[i]].getWidth(), botones[i][logicaTablero.vec5[i]].getHeight(), Image.SCALE_SMOOTH)));
                }
                break;
            }
        }   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JButtonSolucion = new javax.swing.JButton();
        jPanelTablero = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("8 Reinas");
        setPreferredSize(new java.awt.Dimension(500, 600));
        setSize(new java.awt.Dimension(1000, 1000));

        JButtonSolucion.setPreferredSize(new java.awt.Dimension(200, 50));
        JButtonSolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSolucionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTableroLayout = new javax.swing.GroupLayout(jPanelTablero);
        jPanelTablero.setLayout(jPanelTableroLayout);
        jPanelTableroLayout.setHorizontalGroup(
            jPanelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );
        jPanelTableroLayout.setVerticalGroup(
            jPanelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonSolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(JButtonSolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonSolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSolucionActionPerformed
        
        limpiarTablero();
        
        mostrarSolucion(); 
        cambioBoton();
        
    }//GEN-LAST:event_JButtonSolucionActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_8Reinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_8Reinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_8Reinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_8Reinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_8Reinas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonSolucion;
    private javax.swing.JPanel jPanelTablero;
    // End of variables declaration//GEN-END:variables
}
