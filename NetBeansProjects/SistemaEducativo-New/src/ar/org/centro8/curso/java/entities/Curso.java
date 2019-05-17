package ar.org.centro8.curso.java.entities;
import ar.org.centro8.curso.java.enumerados.Dias;
import ar.org.centro8.curso.java.enumerados.Turnos;
public class Curso {
    private int codigo;
    private Integer codigoTitulo;
    private String profesor;
    private Dias dia;
    private Turnos turno;
        
    public static String getTable(){ return "cursos"; }

    public Curso() {}

    public Curso(Integer codigoTitulo, String profesor, Dias dia, Turnos turno) {
        this.codigoTitulo = codigoTitulo;
        this.profesor = profesor;
        this.dia = dia;
        this.turno = turno;
    }

    public Curso(int codigo, Integer codigoTitulo, String profesor, Dias dia, Turnos turno) {
        this.codigo = codigo;
        this.codigoTitulo = codigoTitulo;
        this.profesor = profesor;
        this.dia = dia;
        this.turno = turno;
    }

    @Override
    public String toString() {
        return codigo + ", " + codigoTitulo + ", " + profesor + ", " + dia + ", " + turno;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigoTitulo() {
        return codigoTitulo;
    }

    public void setCodigoTitulo(Integer codigoTitulo) {
        this.codigoTitulo = codigoTitulo;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getDia() {
        return dia.toString();
    }

    public void setDia(Dias dia) {
        this.dia = dia;
    }
    public void setDia(String dia) {
        this.dia = Dias.valueOf(dia.toUpperCase());
    }

    public String getTurno() {
        return turno.toString();
    }

    public void setTurno(Turnos turno) {
        this.turno = turno;
    }
    public void setTurno(String turno) {
        this.turno = Turnos.valueOf(turno.toUpperCase());
    }

}
