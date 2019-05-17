package ar.org.centro8.curso.java.repositories.interfaces;
import java.util.List;
public interface I_GenericR <E>{
    void save(E e);
    void remove(E e);
    void update(E e);
    List<E> getAll();
}
