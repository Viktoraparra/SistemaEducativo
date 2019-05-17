package ar.org.centro8.curso.java.gui;
import ar.org.centro8.curso.java.connectors.ConnectorMySQL;
import ar.org.centro8.curso.java.entities.Curso;
import ar.org.centro8.curso.java.entities.TituloCurso;
import ar.org.centro8.curso.java.enumerados.Dias;
import ar.org.centro8.curso.java.enumerados.Turnos;
import ar.org.centro8.curso.java.repositories.interfaces.I_CursoR;
import ar.org.centro8.curso.java.repositories.interfaces.I_TituloCursoR;
import ar.org.centro8.curso.java.repositories.jdbc.CursoR;
import ar.org.centro8.curso.java.repositories.jdbc.TituloCursoR;
import ar.org.centro8.curso.java.utils.swing.Table;
import ar.org.centro8.curso.java.utils.swing.TxtValidator;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FormCursos extends javax.swing.JInternalFrame {
    private I_CursoR curs;
    private I_TituloCursoR titu;
    public FormCursos() {
        super(
            "Formulario de Cursos",         //titulo 
            true,                           //resizable
            true,                           //closable 
            true,                           //maximizable 
            true                            //iconable
        );
        initComponents();
      curs=new CursoR(ConnectorMySQL.getConnection());
      titu=new TituloCursoR(ConnectorMySQL.getConnection());
        cargarCMBs();
        cargar();
    }
 private void cargarCMBs(){
        cmbTitulo.removeAllItems();
        titu.getAll().forEach(cmbTitulo::addItem);
        Arrays.asList(Dias.values()).forEach(cmbDia::addItem);
        Arrays.asList(Turnos.values()).forEach(cmbTurno::addItem);
    }
    private void cargar(){
        new Table<Curso>().cargar(tblCursos, curs.getAll());
    }
    private boolean validar(){
       if(!new TxtValidator(txtProfesor).length(3, 25))    return false;        
        return true;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        txtProfesor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Curso = new javax.swing.JLabel();
        cmbTurno = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        cmbDia = new javax.swing.JComboBox<>();
        cmbTitulo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Buscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCursos = new javax.swing.JTable();

        Titulo.setFont(new java.awt.Font("Calibri Light", 1, 10)); // NOI18N
        Titulo.setText("Titulo");

        txtProfesor.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 10)); // NOI18N
        jLabel2.setText("Profesor");

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 10)); // NOI18N
        jLabel3.setText("Dia");

        Curso.setFont(new java.awt.Font("Calibri Light", 1, 10)); // NOI18N
        Curso.setText("Turno");

        cmbTurno.setFont(new java.awt.Font("Calibri Light", 0, 8)); // NOI18N

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        cmbDia.setFont(new java.awt.Font("Calibri Light", 0, 8)); // NOI18N

        cmbTitulo.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N
        cmbTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTituloActionPerformed(evt);
            }
        });

        jButton1.setText("PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Curso)
                            .addComponent(jLabel3))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbDia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbTurno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(Titulo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbTitulo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtProfesor))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo)
                    .addComponent(cmbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Curso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Buscar.setFont(new java.awt.Font("Calibri Light", 1, 10)); // NOI18N
        Buscar.setText("Buscar:");

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

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblCursos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblCursos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(btnEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Evento Agregar
         if(validar()){
            Curso curso=new Curso(
                    cmbTitulo.getItemAt(cmbTitulo.getSelectedIndex()).getCodigo(), 
                    txtProfesor.getText(),
                    cmbDia.getItemAt(cmbDia.getSelectedIndex()), 
                    cmbTurno.getItemAt(cmbTurno.getSelectedIndex()));
            curs.save(curso);
            limpiar();
            lblInfo.setText("Se ingreso el curso codigo= "+curso.getCodigo());
        }else{
            lblInfo.setText("No se pudo ingresar un curso.");
         }
        cargar();
     
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // // Evento buscar Profesor
        new Table<Curso>()
                .cargar(tblCursos, 
                        curs.getLikeProfesor(
                                txtBuscar.getText()));
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // Evento Buscar
        new Table<Curso>()
                .cargar(tblCursos, 
                        curs.getLikeProfesor(
                                txtBuscar.getText()));
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         int fila=tblCursos.getSelectedRow();
        
        if (fila==-1) return;
        Curso curso = new Curso(
                Integer.parseInt(tblCursos.getValueAt(fila, 0)+""), 
                Integer.parseInt(tblCursos.getValueAt(fila, 1)+""), 
                tblCursos.getValueAt(fila, 1)+"", 
                Dias.valueOf(tblCursos.getValueAt(fila, 3)+""), 
                Turnos.valueOf(tblCursos.getValueAt(fila, 4)+"")
        );
        if (JOptionPane.showConfirmDialog(this,
                "Desea Borrar un curso "+curso.getCodigo())==0) {
            curs.remove(curso);
        }
        cargar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cmbTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTituloActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Evento PDF
        String path="";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x=j.showSaveDialog(this);
        if (x==JFileChooser.APPROVE_OPTION) {
            path=j.getSelectedFile().getPath();
        }
         try {
        Document document = new Document();
           
        PdfWriter.getInstance(document, new FileOutputStream(path+"Curso.pdf"));
       
        document.open();
        PdfPTable tb1= new PdfPTable(5);    
        tb1.addCell("Codigo");
        tb1.addCell("CodigoTitulo");
        tb1.addCell("Profesor");
        tb1.addCell("Dia");
        tb1.addCell("Turno");
             for (int a = 0; a < tblCursos.getRowCount(); a++) {
                 String codigo=tblCursos.getValueAt(a, 0).toString();
                 String codigoTitulo=tblCursos.getValueAt(a, 1).toString();
                 String profesor=tblCursos.getValueAt(a, 2).toString();
                 String dia=tblCursos.getValueAt(a, 3).toString();
                 String turno=tblCursos.getValueAt(a, 4).toString();
                 tb1.addCell(codigo);
                 tb1.addCell(codigoTitulo);
                 tb1.addCell(profesor);
                 tb1.addCell(dia);
                 tb1.addCell(turno);
             }
             document.add(tb1);
        document.close();
            System.out.println("finish");
        } catch (Exception e) { e.printStackTrace(); }
    }//GEN-LAST:event_jButton1ActionPerformed
  private void limpiar(){
        cmbTitulo.setSelectedIndex(0);
        txtProfesor.setText("");
        cmbDia.setSelectedIndex(0);
        cmbTurno.setSelectedIndex(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buscar;
    private javax.swing.JLabel Curso;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<Dias> cmbDia;
    private javax.swing.JComboBox<TituloCurso> cmbTitulo;
    private javax.swing.JComboBox<Turnos> cmbTurno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JTable tblCursos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtProfesor;
    // End of variables declaration//GEN-END:variables
}
