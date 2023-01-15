//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Shelf {
    public ArrayList<Book> t = new ArrayList();

    public Shelf() {
    }

    void sort_by_name() {
        Collections.sort(this.t);
    }

    void sort_by_author() {
        Collections.sort(this.t, new BookByAuthorComparator());
    }

    void input(String a, String b) {
        this.t.add(new Book(b, a));
    }

    void output() {
        for(int i = 0; i < this.t.size(); ++i) {
            System.out.println(((Book)this.t.get(i)).toString());
        }

    }
    void output_json() {
        for(int i = 0; i < this.t.size(); ++i) {
            System.out.println(((Book)this.t.get(i)).toString());
        }

    }
    void GroupByAuthor(){
        Stream<Book> stream = t.stream();
        Map<String, List<Book>> DrugsByFirm = stream.collect(Collectors.groupingBy(Book::getAuthor_name));
        System.out.println("Группировка по автору \n");
        for(Map.Entry<String, List<Book>> item : DrugsByFirm.entrySet()){

            System.out.println(item.getKey()+"\n");
            for(Book drug1 : item.getValue()){
                drug1.output();
            }
            System.out.println();
        }
    }
    void search(String Name) {
        Book book = new Book("", Name);
        int i = Collections.binarySearch(this.t, book, new BookByAuthorComparator());
        if (i >= 0 && i < this.t.size()) {
            PrintStream var10000 = System.out;
            Object var10001 = this.t.get(i);
            var10000.println("Искомый элемент " + ((Book)var10001).toString());
        } else {
            System.out.println("Книги с таким автором нет");
        }

    }
}
