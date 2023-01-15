import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

public class drug implements Comparable<drug>{
    String Name;
    int date;
    String firm_name;
    int num;
    double price;

    drug(String a, int b, String c, int d, double e) {
        Name = a;
        date = b;
        firm_name = c;
        num = d;
        price = e;
    }
    drug(){
        Name="";
        date=0;
        firm_name="";
        num=0;
        price=0;
    }
    void output(FileWriter a) throws IOException {
        a.write(Name+" "+date+" "+firm_name+" "+num+" "+price+"\n");
    }
    String getFirm_name(){
        return firm_name;
    }
    @Override
    public int compareTo(drug o) {
        return Name.compareTo(o.Name);
    }
}
