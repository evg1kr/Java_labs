import java.util.ArrayList;
import java.util.Collections;
public class Shelf {
    public ArrayList<Book> t;
    public Shelf(){
        t=new ArrayList<>();
    }
    void sort_by_name()
    {
        Collections.sort(t);
    }
    void sort_by_author(){
        Collections.sort(t,new BookByAuthorComparator());
    }
    void input(String a, String b){
            t.add(new Book(b,a));
    }
    void output(){
        for(int i=0;i<t.size();i++){
            System.out.println(t.get(i).toString());
        }
    }
    void search(String Name){
        Book book = new Book("",Name);
        int i = Collections.binarySearch(t, book, new BookByAuthorComparator());
        if(i>=0 && i<t.size()) {
            System.out.println("Искомый элемент "+t.get(i).toString());
        }
        else{
            System.out.println("Книги с таким автором нет");
        }
    }
}
