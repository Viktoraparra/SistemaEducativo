package ar.org.centro8.curso.java.gui;
import ar.org.centro8.curso.java.connectors.ConnectorMySQL;
import ar.org.centro8.curso.java.entities.Alumno;
import ar.org.centro8.curso.java.repositories.jdbc.AlumnoR;
import ar.org.centro8.curso.java.entities.Curso;
import ar.org.centro8.curso.java.generate.PDF.GeneratePDF;
import ar.org.centro8.curso.java.repositories.interfaces.I_AlumnoR;
import ar.org.centro8.curso.java.repositories.interfaces.I_CursoR;
import ar.org.centro8.curso.java.repositories.jdbc.CursoR;
import ar.org.centro8.curso.java.utils.swing.Table;
import ar.org.centro8.curso.java.utils.swing.TxtValidator;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class FormAlumno extends javax.swing.JInternalFrame {
    private I_AlumnoR alum;
    private I_CursoR curs;
    public FormAlumno() {
         super(
                "Formulario de Alumnos",        //titulo 
                true,                           //resizable
                true,                           //closable 
                true,                           //maximizable 
                true                            //iconable
        );

        initComponents();
        alum=new AlumnoR(ConnectorMySQL.getConnection());
        curs=new CursoR (ConnectorMySQL.getConnection());
        cargar();
    }

    private void cargar(){
        cmbCurso.removeAllItems();
        curs.getAll().forEach(cmbCurso::addItem);
        new Table<Alumno>().cargar(tblAlumno, alum.getAll());
    }
     private void limpiar(){
        txtNombre.setText("");
        txtApellido.requestFocus();
        txtEdad.setText("");
        cmbCurso.setSelectedIndex(0);
    }
    
     private boolean validar(){
        //txtTitulo entre 2 y 25 caracteres
        if(!new TxtValidator(txtNombre).length(2, 25))      return false;
        //txtProfesor entre 2 y 25 caracteres
        if(!new TxtValidator(txtApellido).length(2, 25))    return false;    
        // txtEdad es un entero entre 18 y 80
        if(!new TxtValidator(txtEdad).isInteger(18, 80))    return false;        
        return true;
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        Curso = new javax.swing.JLabel();
        cmbCurso = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        btnPDF = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAlumno = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        txtBuscar = new javax.swing.JTextField();
        Buscar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 10)); // NOI18N
        jLabel1.setText("Nombre: ");

        txtNombre.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N

        txtApellido.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 10)); // NOI18N
        jLabel2.setText("Apellido:");

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 10)); // NOI18N
        jLabel3.setText("Edad;");

        txtEdad.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N

        Curso.setFont(new java.awt.Font("Calibri Light", 1, 10)); // NOI18N
        Curso.setText("Cursos:");

        cmbCurso.setFont(new java.awt.Font("Calibri Light", 0, 8)); // NOI18N

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnPDF.setText("PDF");
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombre))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Curso)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEdad)
                            .addComponent(cmbCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApellido))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(btnPDF)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Curso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPDF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tblAlumno.setFont(new java.awt.Font("Calibri Light", 0, 10)); // NOI18N
        tblAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblAlumno);

        txtBuscar.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        Buscar.setFont(new java.awt.Font("Calibri Light", 1, 10)); // NOI18N
        Buscar.setText("Buscar:");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // // Evento buscar Alumno
        new Table<Alumno>()
                .cargar(
                        tblAlumno, 
                        alum.getLikeApellidoNombre(
                                txtBuscar.getText(),
                                txtBuscar.getText())                                              
                );
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila=tblAlumno.getSelectedRow();
        
        if (fila==-1) return;
        Alumno alumno = new Alumno(
                Integer.parseInt(tblAlumno.getValueAt(fila, 0)+""),
                tblAlumno.getValueAt(fila, 1)+"", 
                tblAlumno.getValueAt(fila, 2)+"", 
                Integer.parseInt(tblAlumno.getValueAt(fila, 3)+""),
                Integer.parseInt(tblAlumno.getValueAt(fila, 4)+""));
        if (JOptionPane.showConfirmDialog(this,
                "Desea Borrar un curso "+alumno.getCodigo())==0) {
            alum.remove(alumno);
        }
        cargar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Evento Agregar
        if (validar()) {
            Alumno alumno = new Alumno(
                    txtNombre.getText(), 
                    txtApellido.getText(), 
                    Integer.parseInt(txtEdad.getText()), 
                    cmbCurso.getItemAt(
                            cmbCurso
                            .getSelectedIndex())
                            .getCodigo()
            );
            alum.save(alumno);
            limpiar();
            lblInfo.setText("Se ingreso el Alumno codigo= "+alumno.getCodigo());
        }else{  lblInfo.setText("No se ingreso ningun alumno.");  }
        cargar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        // Evento Pdf
        String path="";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x=j.showSaveDialog(this);
        if (x==JFileChooser.APPROVE_OPTION) {
            path=j.getSelectedFile().getPath();
        }
         try {
                 
    
        Document document = new Document();
           
        PdfWriter.getInstance(document, new FileOutputStream(path+"Alumno.pdf"));
       
        document.open();
             PdfPTable tb1a = new PdfPTable(5);
             tb1a.addCell("Codigo");
             tb1a.addCell("Nombre");
             tb1a.addCell("Apellido");
             tb1a.addCell("Edad");
             tb1a.addCell("Codigo Curso");
             for (int b = 0; b < tblAlumno.getRowCount(); b++) {
                 String codigo=tblAlumno.getValueAt(b, 0).toString();
                 String nombre=tblAlumno.getValueAt(b, 1).toString();
                 String apellido=tblAlumno.getValueAt(b, 2).toString();
                 String edad=tblAlumno.getValueAt(b, 3).toString();
                 String codigoCurso=tblAlumno.getValueAt(b, 4).toString();
                 tb1a.addCell(codigo);
                 tb1a.addCell(nombre);
                 tb1a.addCell(apellido);
                 tb1a.addCell(edad);
                 tb1a.addCell(codigoCurso);
             }
             document.add(tb1a);
        document.close();
            System.out.println("finish");
        } catch (Exception e) { e.printStackTrace(); }
    }//GEN-LAST:event_btnPDFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buscar;
    private javax.swing.JLabel Curso;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnPDF;
    private javax.swing.JComboBox<Curso> cmbCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JTable tblAlumno;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
