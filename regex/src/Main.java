import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.*;
public class Main {
    public static void main(String[] args)  throws Exception{
        FileWriter fr = new FileWriter("output.txt");
        FileReader gr = new FileReader("input.txt");
        Scanner scan = new Scanner(gr);
        String text="";
        //reading
        while(scan.hasNextLine()) {
            text+= scan.nextLine();
            text+="\n";
        }
        double res=0;
        StringTokenizer st = new StringTokenizer(text,"\n ?!,");
        while(st.hasMoreTokens()){
            String t=st.nextToken();
            boolean result = t.matches("[+-]?[0-9]+");
            if(result){
                res+=Double.parseDouble(t);
                System.out.println(t);
            }
            else{
                result=t.matches("[+-]?[0-9]+[.][0-9]+[fd]?");
                if(result) {
                    res += Double.parseDouble(t);
                    System.out.println(t);
                }
                else{
                    result=t.matches("[+-]?[0-9][.][0-9]+e[+-][0-9]+");
                    if(result){
                        res+=Double.parseDouble(t);
                        System.out.println(t);
                    }
                    else{
                        result=t.matches("[.][0-9]+");
                        if(result){
                            res+=Double.parseDouble(t);
                            System.out.println(t);
                        }
                    }
                }
            }
        }
        fr.write(Double.toString(res));
        gr.close();
        fr.close();
        System.out.println("Succede, check output.txt!");
    }
}
