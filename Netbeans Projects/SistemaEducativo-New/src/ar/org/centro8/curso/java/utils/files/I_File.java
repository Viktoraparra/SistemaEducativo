package ar.org.centro8.curso.java.utils.files;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
public interface I_File {
    void print();
    String getText();
    void setText(String text);
    void appendText(String text);
    void addLine(String text);
    void clear();
    List<String>getLines();
    List<String>getLines(String criteria);
    List<String>getReversedLines();
    List<String>getOrderLines();
    List<String>getReversedOrderLines();
    LinkedHashSet<String>getLinkedHashSetLines();
    TreeSet<String>getTreeSetLines();
    void addLines(Collection<String>lines);
    void removeLine(String line);
}