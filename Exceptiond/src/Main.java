import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку, содержащую числа: ");

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        StringTokenizer st = new StringTokenizer(str, " \t\n\r,");
        double sum = 0;
        boolean checkForNumbers = false;

        while(st.hasMoreTokens()){
            double num = 0;
            try {
                num = Double.parseDouble(st.nextToken());
                sum += num;
                checkForNumbers = true;
            } catch (NumberFormatException ignored) {}
        }

        if (checkForNumbers) {
            System.out.println(sum);
        } else {
            System.out.println("Нет чисел в строке!");
        }
    }
}