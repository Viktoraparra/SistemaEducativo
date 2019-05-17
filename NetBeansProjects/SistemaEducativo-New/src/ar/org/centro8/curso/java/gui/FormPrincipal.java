package ar.org.centro8.curso.java.gui;
import ar.org.centro8.curso.java.repositories.jdbc.HoraR;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Image;
import java.io.FileOutputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FormPrincipal extends javax.swing.JFrame {

    public FormPrincipal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
         new Thread(new HoraR(txtHora)).start();
//        ImageIcon icTitulo = new ImageIcon(getClass().getResource("\\images\\Yeap.png"));
//        Icon iconTitulo = new ImageIcon(icTitulo.getImage().getScaledInstance(80,100, Image.SCALE_DEFAULT));
//        btnTitulo.setIcon(iconTitulo);
//        
//        ImageIcon icCursos = new ImageIcon(getClass().getResource("\\Images\\Tablet.png"));
//        Icon iconCurso = new ImageIcon(icCursos.getImage().getScaledInstance(80,100, Image.SCALE_DEFAULT));
//        btnCurso.setIcon(iconCurso);
//        
//        ImageIcon icAlumno = new ImageIcon(getClass().getResource("\\Images\\alumno.png"));
//        Icon iconAlumno = new ImageIcon(icAlumno.getImage().getScaledInstance(80,100, Image.SCALE_DEFAULT));
//        btnAlumno.setIcon(iconAlumno);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        panel = new javax.swing.JPanel();
        btnTitulo = new javax.swing.JButton();
        btnCurso = new javax.swing.JButton();
        btnAlumno = new javax.swing.JButton();
        txtHora = new javax.swing.JTextField();
        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnifile = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        mniEdicion = new javax.swing.JMenu();
        mniAlumnos = new javax.swing.JMenuItem();
        mniCursos = new javax.swing.JMenuItem();
        mniTitulos = new javax.swing.JMenuItem();
        mniNotas = new javax.swing.JMenuItem();
        mniOpciones = new javax.swing.JMenu();
        mniAcercaDe = new javax.swing.JMenuItem();
        mniSettings = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTitulo.setIcon(new javax.swing.ImageIcon("/home/viktor/Netbeans Projects/SistemaEducativo-New/src/ar/org/centro8/curso/java/images/check-01.png")); // NOI18N
        btnTitulo.setText("Titulo Curso");
        btnTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTituloActionPerformed(evt);
            }
        });

        btnCurso.setIcon(new javax.swing.ImageIcon("/home/viktor/Netbeans Projects/SistemaEducativo-New/src/ar/org/centro8/curso/java/images/Tablet.png")); // NOI18N
        btnCurso.setText("Curso");
        btnCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCursoActionPerformed(evt);
            }
        });

        btnAlumno.setIcon(new javax.swing.ImageIcon("/home/viktor/Netbeans Projects/SistemaEducativo-New/src/ar/org/centro8/curso/java/images/alumno.png")); // NOI18N
        btnAlumno.setText("Alumno");
        btnAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(btnAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mnifile.setText("File");

        jMenuItem3.setText("Nuevo");
        mnifile.add(jMenuItem3);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Imprimir");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        mnifile.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem10.setText("Exit");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        mnifile.add(jMenuItem10);

        jMenuBar1.add(mnifile);

        mniEdicion.setText("Edicion");

        mniAlumnos.setText("Alumnos");
        mniAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAlumnosActionPerformed(evt);
            }
        });
        mniEdicion.add(mniAlumnos);

        mniCursos.setText("Cursos");
        mniCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCursosActionPerformed(evt);
            }
        });
        mniEdicion.add(mniCursos);

        mniTitulos.setText("Titulo Curso");
        mniTitulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTitulosActionPerformed(evt);
            }
        });
        mniEdicion.add(mniTitulos);

        mniNotas.setText("Notas");
        mniEdicion.add(mniNotas);

        jMenuBar1.add(mniEdicion);

        mniOpciones.setText("Opciones");

        mniAcercaDe.setText("Acerca de");
        mniAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAcercaDeActionPerformed(evt);
            }
        });
        mniOpciones.add(mniAcercaDe);

        mniSettings.setText("Configuraciones");
        mniSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSettingsActionPerformed(evt);
            }
        });
        mniOpciones.add(mniSettings);

        jMenuItem7.setText("Actualizaciones");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        mniOpciones.add(jMenuItem7);

        jMenuBar1.add(mniOpciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desktop)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAcercaDeActionPerformed
        // Evento Acerca
        
        JOptionPane.showMessageDialog(this,
                "Sistema de colegio "
                + "\nCurso de Java - Centro Smata8"
                + "\nArquitecto $$$$ - Programadador: Victor Parra"
                + "\nAbril 2019 @CopyRigths TM");
    }//GEN-LAST:event_mniAcercaDeActionPerformed

    private void mniSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSettingsActionPerformed
        // Evento Configuracion
         FormConfig formConfig = new FormConfig();
        desktop.add(formConfig);
        formConfig.setVisible(true);
    }//GEN-LAST:event_mniSettingsActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // Evento Salir
        System.exit(0);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // Evento Imprimir
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void mniAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAlumnosActionPerformed
         // Evento Alumnos
        FormAlumno frmAlumnos=new FormAlumno();
        desktop.add(frmAlumnos);
        frmAlumnos.setVisible(true);
    }//GEN-LAST:event_mniAlumnosActionPerformed

    private void mniCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCursosActionPerformed
           // Evento Cursos
        FormCursos frmCursos=new FormCursos();
        desktop.add(frmCursos);
        frmCursos.setVisible(true);
    }//GEN-LAST:event_mniCursosActionPerformed

    private void mniTitulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTitulosActionPerformed
           // Evento Materias
           FormTituloCurso formTituloCurso = new FormTituloCurso();
           desktop.add(formTituloCurso);
        formTituloCurso.setVisible(true);
    }//GEN-LAST:event_mniTitulosActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
      
        JOptionPane.showMessageDialog(this,
                "En estos momentos no existe ninguna actualizacion, "
              + "\nGracias por Usar Sistema de Estudios");
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void btnTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTituloActionPerformed
        // Evento Titulo
          FormTituloCurso formTituloCurso = new FormTituloCurso();
           desktop.add(formTituloCurso);
        formTituloCurso.setVisible(true);
    }//GEN-LAST:event_btnTituloActionPerformed

    private void btnAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnoActionPerformed
        // Evento Alumno
        FormAlumno frmAlumnos=new FormAlumno();
        desktop.add(frmAlumnos);
        frmAlumnos.setVisible(true);
    }//GEN-LAST:event_btnAlumnoActionPerformed

    private void btnCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCursoActionPerformed
        // Evento Curso
         FormCursos frmCursos=new FormCursos();
        desktop.add(frmCursos);
        frmCursos.setVisible(true);
    }//GEN-LAST:event_btnCursoActionPerformed
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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlumno;
    private javax.swing.JButton btnCurso;
    private javax.swing.JButton btnTitulo;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem mniAcercaDe;
    private javax.swing.JMenuItem mniAlumnos;
    private javax.swing.JMenuItem mniCursos;
    private javax.swing.JMenu mniEdicion;
    private javax.swing.JMenuItem mniNotas;
    private javax.swing.JMenu mniOpciones;
    private javax.swing.JMenuItem mniSettings;
    private javax.swing.JMenuItem mniTitulos;
    private javax.swing.JMenu mnifile;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtHora;
    // End of variables declaration//GEN-END:variables
}
