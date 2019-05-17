package ar.org.centro8.curso.java.entities;
public class TituloCurso {
    private int codigo;
    private String titulo;
    private int duracion;
    private String requerimientos;

    public static String getTable(){return "titulocurso";}
    public TituloCurso() {
    }

    public TituloCurso(String titulo) {
        this.titulo = titulo;
    }
    

    public TituloCurso(String titulo, int duracion, String requerimientos) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.requerimientos = requerimientos;
    }

    public TituloCurso(int codigo, String titulo, int duracion, String requerimientos) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracion = duracion;
        this.requerimientos = requerimientos;
    }

    @Override
    public String toString() {
        return codigo + ", " + titulo + ", " + duracion +"Horas"+ ", " + requerimientos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getRequerimientos() {
        return requerimientos;
    }

    public void setRequerimientos(String requerimientos) {
        this.requerimientos = requerimientos;
    }

    
}
