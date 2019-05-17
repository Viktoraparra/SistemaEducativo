package ar.org.centro8.curso.java.repositories.jdbc;
import java.time.LocalDateTime;
import javax.swing.JTextField;

public class HoraR implements Runnable {
    private JTextField txt;
    public HoraR(JTextField txt) { this.txt = txt; }
    @Override public void run(){
        while(true){
            LocalDateTime ldt=LocalDateTime.now();
            String hora=(ldt.getHour()<10)?"0"+ldt.getHour():""+ldt.getHour();
            String minuto=(ldt.getMinute()<10)?"0"+ldt.getMinute():""+ldt.getMinute();
            String segundo=(ldt.getSecond()<10)?"0"+ldt.getSecond():""+ldt.getSecond();
            txt.setText(hora+":"+minuto+":"+segundo);
            try{ Thread.sleep(1000); } catch(Exception e) {}
        }
    }
}
