package ar.org.centro8.curso.java.utils.files;
import ar.org.centro8.curso.java.utils.stream.UtilStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
public class FileText implements I_File{
    private File file;
    public FileText(File file)      { this.file = file;         }
    public FileText(String file)    { this.file=new File(file); }
    @Override public void print()   {
        int car;
        try (FileReader in=new FileReader(file)) {
            while((car=in.read())!=-1) System.out.print((char)car);
        } catch (Exception e) { e.printStackTrace(); }
        System.out.println();
    }
    @Override public String getText() {
        int car;
        StringBuilder sb=new StringBuilder();
        try (FileReader in=new FileReader(file)) {
            while((car=in.read())!=-1) sb.append((char)car);
        }catch(Exception e){ e.printStackTrace(); }
        return sb.toString();
    }
    @Override public void setText(String text) {
        try (FileWriter out=new FileWriter(file)) {
            out.write(text);
        } catch (Exception e) { e.printStackTrace(); }
    }
    @Override public void appendText(String text) {
        try (FileWriter out=new FileWriter(file,true)) {
            out.write(text);
        } catch (Exception e) { e.printStackTrace(); }
    }
    @Override public void addLine(String text)  { appendText(text+"\n");    }
    @Override public void clear()               { setText("");              }
    @Override public List<String> getLines() {
        List<String>lista=new ArrayList();
        try ( BufferedReader in=new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file)
                )
            ) 
        ) {
            in.lines().forEach(lista::add);
        } catch (Exception e) { e.printStackTrace(); }
        return lista;
    }
    @Override public List<String> getLines(String criteria) {
        return new UtilStream<String>()
                .getList(getLines()
                .stream()
                .filter(p->p
                        .toLowerCase()
                        .contains(criteria.toLowerCase())));
    }
    @Override public List<String> getReversedLines() {
        List<String>lista1=getLines();
        List<String>lista2=new ArrayList();
        for(int a=lista1.size()-1;a>=0;a--) lista2.add(lista1.get(a));
        return lista2;
    }
    @Override public List<String> getOrderLines() {
        return new UtilStream<String>()
                .getList(getLines()
                .stream()
                .sorted());
    }
    @Override public List<String> getReversedOrderLines() {
        return new UtilStream<String>()
                .getList(getLines()
                .stream()
                .sorted(Comparator.reverseOrder()));
    }
    @Override public LinkedHashSet<String> getLinkedHashSetLines() {
        LinkedHashSet<String>set=new LinkedHashSet();
        set.addAll(getLines());
        return set;
    }
    @Override public TreeSet<String> getTreeSetLines() {
        TreeSet<String>set=new TreeSet();
        set.addAll(getLines());
        return set;
    }
    @Override public void addLines(Collection<String> lines) {
        lines.forEach(this::addLine);
    }
    @Override public void removeLine(String line) {
        List<String>lista=getLines();
        lista.remove(line);
        clear();
        addLines(lista);
    }
}