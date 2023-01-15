import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader a = new FileReader("input.txt");
        Scanner in = new Scanner(a);
        FileWriter out = new FileWriter("output.txt");
        String str="";

        shelf k=new shelf();
        while(in.hasNextLine()){
            str=in.nextLine();
            k.full_input(str);
        }
//        k.input("a",2023,"b",19,3.2);
//        k.input("d",2024,"b",17,2.2);
//        k.input("e",2023,"f",18,4.2);
//        k.input("k",2024,"f",15,7.3);
        k.output(out);
        out.write("\n----------------\n");
        k.sort_by_price();
        out.write("Сортировка по цене\n");
        k.output(out);
        out.write("\n----------------\n");
        k.sort_by_name();
        out.write("Сортировка по имени\n");
        k.output(out);
        out.write("\n----------------\n");
        k.search("'eskap'",out);
        out.write("\n----------------\n");
        k.group_by_firm(out);
        out.close();
    }
}