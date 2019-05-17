package ar.org.centro8.curso.java.utils.swing;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class TxtValidator {
    private JTextField txt;
    public TxtValidator(JTextField txt) { this.txt = txt; }
    private boolean returnFalse(String msg){
        txt.selectAll();
        JOptionPane.showMessageDialog(txt, msg, "Error!", JOptionPane.ERROR_MESSAGE);
        txt.requestFocus();
        return false;
    }
    public boolean length(int size){
        if(txt.getText().length()==size) return true;
        return returnFalse("Debe tener "+size+" caracteres.");
    }
    public boolean length(int min,int max){
        if(txt.getText().length()>=min & txt.getText().length()<=max) return true;
        return returnFalse("Debe tener entre "+min+" y "+max+" caracteres.");
    }
    public boolean isInteger(){
        try {
            Integer.parseInt(txt.getText());
            return true;
        } catch (NumberFormatException e) {
            return returnFalse("Debe ser un número entero.");
        }
    }
    public boolean isInteger(int min,int max){
        if(!isInteger()) return false;
        int nro=Integer.parseInt(txt.getText());
        if(nro>=min & nro<=max) return true;
        return returnFalse("Debe ser un número entero entre "+min+" y "+max);
    }
}