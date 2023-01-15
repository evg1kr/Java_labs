import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class shelf {
    public ArrayList<drug> t = new ArrayList();

    public shelf() {
    }

    void sort_by_name() {
        Collections.sort(this.t,(o1,o2)->o1.Name.compareTo(o2.Name));
    }

    void sort_by_price() {
        Collections.sort(this.t, (o1, o2) -> Double.compare(o2.price,o1.price));
    }

    void input(String a, int b, String c, int e, double d) {
        this.t.add(new drug(a,b,c,e,d));
    }
    void full_input(String input) {
        StringTokenizer st = new StringTokenizer(input," ,?!\n");
        int b=0,e=0;
        double d=0;
        String a="",c="";
        while(st.hasMoreTokens()) {
            String t = st.nextToken();
            boolean result = t.matches("<\\w*>");
            if(result){
                c=t;
            }
            else{
            result = t.matches("'\\w*'");
            if(result){
                a=t;
            }
            else {
                result = t.matches("202[2345]");
               if(result){
                   b=Integer.parseInt(t);
               }
               else {
                   result = t.matches("([1-9]|[1-9][0-9]|100)");
                   if(result){
                       e=Integer.parseInt(t);
                   }
                   else{
                       d=Double.parseDouble(t);
                   }
               }
            }
            }
        }
        input(a,b,c,e,d);
}
    void output(FileWriter out) throws IOException {
        for (int i = 0; i < this.t.size(); ++i) {
            out.write(t.get(i).Name+" "+ t.get(i).date+" "+t.get(i).firm_name+" "+t.get(i).num+" "+t.get(i).price+"\n");
        }
    }
    public void group_by_firm(FileWriter fw) throws IOException {
        Stream<drug> stream = t.stream();
        Map<String, List<drug>> DrugsByFirm = stream.collect(Collectors.groupingBy(drug::getFirm_name));
        fw.write("Группировка по компании \n");
        for(Map.Entry<String, List<drug>> item : DrugsByFirm.entrySet()){

            fw.write(item.getKey()+"\n");
            for(drug drug1 : item.getValue()){
            drug1.output(fw);
            }
            System.out.println();
        }
    }
    void search(String Name,FileWriter out) throws IOException {
        drug drug1 = new drug(Name, 0,"",0,0);
        int i = Collections.binarySearch(this.t, drug1);
        if (i >= 0 && i < this.t.size()) {
            out.write("Искомый элемент "+t.get(i).Name+" "+ t.get(i).date+" "+t.get(i).firm_name+" "+t.get(i).num+" "+t.get(i).price);
        } else {
            out.write("Такого лекарства нет\n");
        }

    }
}
