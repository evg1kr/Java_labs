import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Dictionary1 {
    public ArrayList<Word> eng = new ArrayList();
    public ArrayList<Word> french = new ArrayList<>();
    String translate(String str, String eng_path, String fre_path) throws FileNotFoundException {
        input(eng_path,0);
        input(fre_path,1);
sort_eng();
sort_french();
        String result=str;
        StringTokenizer st = new StringTokenizer(str," ,?!\n");
        while(st.hasMoreTokens()){
            String t = st.nextToken();
            int key;
            key = search_for_eng(t);
            String trs=search_for_french(key);
            result = result.replace(t,trs);
        }
        return result;
    }
    void input(String path, int mode) throws FileNotFoundException {
        FileReader fr = new FileReader(path);
        Scanner in = new Scanner(fr);
        while(in.hasNext()){
            int k;
            String t;
            k=in.nextInt();
            t=in.next();
            Word a = new Word(t,k);
            if(mode==0){
            eng.add(a);
            }
            else{
                french.add(a);
            }
        }
    }
    void sort_eng() {
        Collections.sort(this.eng,(o1,o2)->o1.name.compareTo(o2.name));
    }
    void sort_french(){
        Collections.sort(this.french,((o1, o2) -> Integer.compare(o1.key,o2.key)));
    }
    int search_for_eng(String Name) {
        Word drug1 = new Word(Name, 0);
        int i = Collections.binarySearch(this.eng, drug1);
        if (i >= 0 && i < this.eng.size()) {
            return eng.get(i).key;
        } else {
           return 0;
        }

    }
    String search_for_french(int key) {
        for (int i = 0; i < french.size(); i++) {
            if (key == french.get(i).key){
                return french.get(i).name;
            }
        }
        return "----";
    }
}
