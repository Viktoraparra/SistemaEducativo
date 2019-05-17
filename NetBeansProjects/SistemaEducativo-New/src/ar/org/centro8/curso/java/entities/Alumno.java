package ar.org.centro8.curso.java.entities;
public class Alumno {
    private int codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private int codigoCurso;

    public static String getTable(){ return "alumnos";}
    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int edad, int codigoCurso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.codigoCurso = codigoCurso;
    }

    public Alumno(int codigo, String nombre, String apellido, int edad, int codigoCurso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.codigoCurso = codigoCurso;
    }

    @Override
    public String toString() {
       return "Alumno " + codigo + ", " + nombre + ", " + apellido + ", " + edad + ", " + codigoCurso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }
    
    
    
}
