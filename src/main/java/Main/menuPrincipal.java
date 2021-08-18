package Main;


import Admistrativo.AltasAdministrativo;
import DatosPersonales.AltaDocente;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saulcorona
 */
public class menuPrincipal extends javax.swing.JFrame {
    
    public static final String URL = "jdbc:mysql://localhost:3306/platziblog";
    public static final String usuario ="root";
    public static final String contraseña = "usuario";

    /**
     * Creates new form menuPrincipal
     */
    public menuPrincipal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        conectarBase = new javax.swing.JButton();
        menuPrincipal = new javax.swing.JMenuBar();
        menuAdministrativo = new javax.swing.JMenu();
        admiAltas = new javax.swing.JMenuItem();
        admiBajas = new javax.swing.JMenuItem();
        admiConsultas = new javax.swing.JMenuItem();
        menuAlumnos = new javax.swing.JMenu();
        alumnoAltas = new javax.swing.JMenuItem();
        alumnoBajas = new javax.swing.JMenuItem();
        alumnoConsulta = new javax.swing.JMenuItem();
        menuEstudios = new javax.swing.JMenu();
        estudioPlan = new javax.swing.JMenuItem();
        menuDatosPersonales = new javax.swing.JMenu();
        datosAltaDocente = new javax.swing.JMenuItem();
        datosProfesionales = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        consultaConsulta = new javax.swing.JMenuItem();
        consultaPerfil = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Escuela de especialidades clinicas");

        conectarBase.setText("Conectar base de datos");
        conectarBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarBaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(conectarBase)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addComponent(conectarBase)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        menuAdministrativo.setText("Administrativo");
        menuAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdministrativoActionPerformed(evt);
            }
        });

        admiAltas.setText("Altas");
        admiAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admiAltasActionPerformed(evt);
            }
        });
        menuAdministrativo.add(admiAltas);

        admiBajas.setText("Bajas");
        menuAdministrativo.add(admiBajas);

        admiConsultas.setText("Consultas");
        menuAdministrativo.add(admiConsultas);

        menuPrincipal.add(menuAdministrativo);

        menuAlumnos.setText("Alumnos");

        alumnoAltas.setText("Altas");
        menuAlumnos.add(alumnoAltas);

        alumnoBajas.setText("Bajas");
        menuAlumnos.add(alumnoBajas);

        alumnoConsulta.setText("Colsultas");
        menuAlumnos.add(alumnoConsulta);

        menuPrincipal.add(menuAlumnos);

        menuEstudios.setText("Estudios");

        estudioPlan.setText("Plan de estudios");
        menuEstudios.add(estudioPlan);

        menuPrincipal.add(menuEstudios);

        menuDatosPersonales.setText("Datos personales");

        datosAltaDocente.setText("Alta docente");
        datosAltaDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosAltaDocenteActionPerformed(evt);
            }
        });
        menuDatosPersonales.add(datosAltaDocente);

        datosProfesionales.setText("Alta datos profesionales");
        menuDatosPersonales.add(datosProfesionales);

        menuPrincipal.add(menuDatosPersonales);

        menuConsultas.setText("Consultas");

        consultaConsulta.setText("Consulta");
        consultaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaConsultaActionPerformed(evt);
            }
        });
        menuConsultas.add(consultaConsulta);

        consultaPerfil.setText("Perfil");
        menuConsultas.add(consultaPerfil);

        menuPrincipal.add(menuConsultas);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultaConsultaActionPerformed

    private void menuAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdministrativoActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_menuAdministrativoActionPerformed

    private void admiAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admiAltasActionPerformed
       AltasAdministrativo altas = new AltasAdministrativo();
       
       altas.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_admiAltasActionPerformed

    private void conectarBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarBaseActionPerformed
        Connection conexion =  getConnection();
    }//GEN-LAST:event_conectarBaseActionPerformed

    private void datosAltaDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosAltaDocenteActionPerformed
        // TODO add your handling code here:
        AltaDocente alta = new AltaDocente();
        alta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_datosAltaDocenteActionPerformed

    public Connection getConnection(){
        Connection conexion=null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, usuario, contraseña );
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
                    
        }catch(Exception ex){
            System.err.println("Error, " + ex);
        }
        
        return conexion;
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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem admiAltas;
    private javax.swing.JMenuItem admiBajas;
    private javax.swing.JMenuItem admiConsultas;
    private javax.swing.JMenuItem alumnoAltas;
    private javax.swing.JMenuItem alumnoBajas;
    private javax.swing.JMenuItem alumnoConsulta;
    private javax.swing.JButton conectarBase;
    private javax.swing.JMenuItem consultaConsulta;
    private javax.swing.JMenuItem consultaPerfil;
    private javax.swing.JMenuItem datosAltaDocente;
    private javax.swing.JMenuItem datosProfesionales;
    private javax.swing.JMenuItem estudioPlan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuAdministrativo;
    private javax.swing.JMenu menuAlumnos;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenu menuDatosPersonales;
    private javax.swing.JMenu menuEstudios;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables
}
