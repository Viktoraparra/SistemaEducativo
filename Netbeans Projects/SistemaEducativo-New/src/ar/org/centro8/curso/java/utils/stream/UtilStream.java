package ar.org.centro8.curso.java.utils.stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class UtilStream<E> {
    /**
     * Método que devuelve un List<E> de un Stream<E>
     * @param stream
     * @return 
     */
    public List<E>getList(Stream<E> stream){
        List<E>lista=new ArrayList();
        stream.forEach(lista::add);
        return lista;
    }
}