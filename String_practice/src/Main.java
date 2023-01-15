import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("output.txt");
        FileReader gr = new FileReader("input.txt");
        Scanner scan = new Scanner(gr);
        int e;
        String replace;
        e=scan.nextInt();
        replace=scan.next();
        String buf;
        String a="";
        while(scan.hasNextLine()) {
            buf = scan.nextLine();
            a += " \n" + buf;
        }
        StringTokenizer st = new StringTokenizer(a,"\n,. !?");
    while(st.hasMoreTokens()){
    StringBuilder k =new StringBuilder(st.nextToken());
    if(k.length()>replace.length()){
        k.replace(e,e+1,replace);
        fr.write(k+"\n");
    }
    else {
        fr.write(k + "\n");
    }
    }
        gr.close();
        fr.close();
        System.out.println("Succede, check output ");
    }
}