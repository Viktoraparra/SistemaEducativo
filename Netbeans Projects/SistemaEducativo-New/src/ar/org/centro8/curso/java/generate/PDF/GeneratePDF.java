 package ar.org.centro8.curso.java.generate.PDF;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;




public class GeneratePDF {
    public static void main(String[] args) {
        try {
                    String fileName="\\generate\\PDF\\file.pdf";
    
        Document document = new Document();
           
        PdfWriter.getInstance(document, new FileOutputStream(fileName));
       
        document.open();
Paragraph para = new Paragraph("        ");
            para.add(para);
        document.close();
            System.out.println("finish");
        } catch (Exception e) { e.printStackTrace(); }
        
    }
    
}
