import javax.swing.*;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        String t;
        t = JOptionPane.showInputDialog("Введите данные для перевода");

        Dictionary1 a = new Dictionary1();
        try {
            String k;
            k = a.translate(t, "eng.txt", "fr.txt");
            String full;
            full= "Строка на французском :" + k +" Исходная строка:"+t;
            JOptionPane.showMessageDialog(null, full);
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}