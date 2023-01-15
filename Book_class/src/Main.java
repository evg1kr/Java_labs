import java.awt.print.Book;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in= new Scanner(new File("input.txt"));
        int n= in.nextInt();
        Shelf k = new Shelf();
        ObjectMapper objectMapper = new ObjectMapper();
        Book car = new Book("stev","kniga");
        objectMapper.writeValue(new File("target/car.json"), car);
        for(int i=0;i<n;i++){
            String buf1=in.next();
            String buf2=in.next();
            k.input(buf1,buf2);
        }
        k.output();
        System.out.println("---------------------------------");
        k.sort_by_name();
        k.output();
        System.out.println("---------------------------------");
        k.sort_by_author();
        k.output();
        String search_name;
        search_name=in.next();
        k.search(search_name);
    }
}