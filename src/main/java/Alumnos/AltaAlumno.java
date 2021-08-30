/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Alumnos;
import static Admistrativo.AltasAdministrativo.URL;
import static Admistrativo.AltasAdministrativo.contraseña;
import static Admistrativo.AltasAdministrativo.usuario;
import Consultas.Perfil;
import Main.menuPrincipal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author saulcorona
 */
public class AltaAlumno extends javax.swing.JFrame {
     //Variables para conexion con base de datos
    public static final String URL = "jdbc:mysql://localhost:3306/proyectoSaul?zeroDateTimeBehavior=CONVERT_TO_NULL"; // Se accede al local host y se pone la base  a la que se quiere acceder
    public static final String usuario ="root"; // El usuario que por convención se usa root
    public static final String contraseña = ""; // Aqui se coloca la contraseña de MySQL server
    PreparedStatement ps;
    ResultSet rs;
    
    // Conexion a la base de datos
    public Connection getConnection(){
        Connection conexion=null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, usuario, contraseña );
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
                    
        }catch(Exception ex){
            System.err.println("Error, " + ex);
            JOptionPane.showMessageDialog(null, "Error, " + ex);
        }
        
        return conexion;
    }
    
    /**
     * Metodo para limpiar el formualario
     */
    
    public void limpiarCajar(){
        nombreAltaAlumno.setText(null);
        DireccionAltaAlumno.setText(null);
        CorreoAltaAlumno.setText(null);
        TelefonoAltaAlumno.setText(null);
        CurpAltaAlumno.setText(null);
        SubirDocumentoAltaAlumno.setText(null);
    }
    /**
     * Creates new form AltaAlumno
     */
    public AltaAlumno() {
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

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreAltaAlumno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DireccionAltaAlumno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TelefonoAltaAlumno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CorreoAltaAlumno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CurpAltaAlumno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        SubirDocumentoAltaAlumno = new javax.swing.JTextField();
        AltasAlumnos = new javax.swing.JButton();
        SalirAltaAlumnos = new javax.swing.JButton();
        LimpiarAltaAlumnos1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
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
        datosDocente = new javax.swing.JMenuItem();
        datosProfesionales = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        consultaConsulta = new javax.swing.JMenuItem();
        menuPerfilProfesional = new javax.swing.JMenu();
        altaPerfilProfesional = new javax.swing.JMenuItem();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Alumnos > Altas");

        jLabel2.setText("Nombre");

        nombreAltaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreAltaAlumnoActionPerformed(evt);
            }
        });

        jLabel3.setText("Dirección");

        DireccionAltaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionAltaAlumnoActionPerformed(evt);
            }
        });

        jLabel4.setText("Correo");

        TelefonoAltaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoAltaAlumnoActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefono");

        CorreoAltaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoAltaAlumnoActionPerformed(evt);
            }
        });

        jLabel6.setText("CURP");

        CurpAltaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurpAltaAlumnoActionPerformed(evt);
            }
        });

        jLabel7.setText("Subir Documentos");

        SubirDocumentoAltaAlumno.setText("Subir");

        AltasAlumnos.setText("Altas");
        AltasAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltasAlumnosActionPerformed(evt);
            }
        });

        SalirAltaAlumnos.setText("Salir");
        SalirAltaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirAltaAlumnosActionPerformed(evt);
            }
        });

        LimpiarAltaAlumnos1.setText("Limpiar");
        LimpiarAltaAlumnos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarAltaAlumnos1ActionPerformed(evt);
            }
        });

        jLabel8.setText("(Funcion no disponible)");

        menuAdministrativo.setText("Administrativo");
        menuAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdministrativoActionPerformed(evt);
            }
        });

        admiAltas.setText("Altas");
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

        datosDocente.setText("Alta docente");
        menuDatosPersonales.add(datosDocente);

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

        menuPrincipal.add(menuConsultas);

        menuPerfilProfesional.setText("Perfil Profesional");

        altaPerfilProfesional.setText("Altas");
        altaPerfilProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaPerfilProfesionalActionPerformed(evt);
            }
        });
        menuPerfilProfesional.add(altaPerfilProfesional);

        menuPrincipal.add(menuPerfilProfesional);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AltasAlumnos)
                                .addGap(34, 34, 34)
                                .addComponent(LimpiarAltaAlumnos1))
                            .addComponent(nombreAltaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DireccionAltaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CorreoAltaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CurpAltaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TelefonoAltaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(SubirDocumentoAltaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(SalirAltaAlumnos)))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreAltaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TelefonoAltaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(DireccionAltaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CurpAltaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CorreoAltaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(SubirDocumentoAltaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AltasAlumnos)
                    .addComponent(SalirAltaAlumnos)
                    .addComponent(LimpiarAltaAlumnos1))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdministrativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAdministrativoActionPerformed

    private void consultaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultaConsultaActionPerformed

    private void nombreAltaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreAltaAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreAltaAlumnoActionPerformed

    private void DireccionAltaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionAltaAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionAltaAlumnoActionPerformed

    private void TelefonoAltaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoAltaAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoAltaAlumnoActionPerformed

    private void CorreoAltaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoAltaAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoAltaAlumnoActionPerformed

    private void CurpAltaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurpAltaAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CurpAltaAlumnoActionPerformed

    private void SalirAltaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirAltaAlumnosActionPerformed
        menuPrincipal menu = new menuPrincipal();
        
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SalirAltaAlumnosActionPerformed

    private void altaPerfilProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaPerfilProfesionalActionPerformed
        // TODO add your handling code here:
        Perfil consulta = new Perfil();
        consulta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_altaPerfilProfesionalActionPerformed

    private void AltasAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltasAlumnosActionPerformed

        //Enviar información a la base de datos
        Connection conexion = null;
        
        try{
            conexion = getConnection();
            ps = conexion.prepareStatement("insert into proyectoSaul.alumnos (nombre,direccion,correo,telefono, curp, documento) values(?,?,?,?,?,?)");
            ps.setString(1, nombreAltaAlumno.getText());
            ps.setString(2, DireccionAltaAlumno.getText());
            ps.setString(3, CorreoAltaAlumno.getText());
            ps.setString(4, TelefonoAltaAlumno.getText());
            ps.setString(5, CurpAltaAlumno.getText());
            ps.setString(6, SubirDocumentoAltaAlumno.getText());
            
            int resultado = ps.executeUpdate(); //Ejecutamos la inserción en la base de datos
            
            if(resultado > 0) {
                JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
                limpiarCajar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al insertar el registro");
                limpiarCajar();
            }
            conexion.close();
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
    }//GEN-LAST:event_AltasAlumnosActionPerformed

    private void LimpiarAltaAlumnos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarAltaAlumnos1ActionPerformed
        // Limpiar caja
        limpiarCajar();
    }//GEN-LAST:event_LimpiarAltaAlumnos1ActionPerformed

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
            java.util.logging.Logger.getLogger(AltaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AltasAlumnos;
    private javax.swing.JTextField CorreoAltaAlumno;
    private javax.swing.JTextField CurpAltaAlumno;
    private javax.swing.JTextField DireccionAltaAlumno;
    private javax.swing.JButton LimpiarAltaAlumnos1;
    private javax.swing.JButton SalirAltaAlumnos;
    private javax.swing.JTextField SubirDocumentoAltaAlumno;
    private javax.swing.JTextField TelefonoAltaAlumno;
    private javax.swing.JMenuItem admiAltas;
    private javax.swing.JMenuItem admiBajas;
    private javax.swing.JMenuItem admiConsultas;
    private javax.swing.JMenuItem altaPerfilProfesional;
    private javax.swing.JMenuItem alumnoAltas;
    private javax.swing.JMenuItem alumnoBajas;
    private javax.swing.JMenuItem alumnoConsulta;
    private javax.swing.JMenuItem consultaConsulta;
    private javax.swing.JMenuItem datosDocente;
    private javax.swing.JMenuItem datosProfesionales;
    private javax.swing.JMenuItem estudioPlan;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu menuAdministrativo;
    private javax.swing.JMenu menuAlumnos;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenu menuDatosPersonales;
    private javax.swing.JMenu menuEstudios;
    private javax.swing.JMenu menuPerfilProfesional;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JTextField nombreAltaAlumno;
    // End of variables declaration//GEN-END:variables
}
