package ar.org.centro8.curso.java.repositories.interfaces;
import ar.org.centro8.curso.java.entities.TituloCurso;
import java.util.List;
public interface I_TituloCursoR {
    void save(TituloCurso tituloCurso);
    void remove(TituloCurso tituloCurso);
    void update(TituloCurso tituloCurso);
    List<TituloCurso>getAll();
    TituloCurso getByCodigu(int codigo);
    List<TituloCurso>getLikeTitulo(String titulo);

}
