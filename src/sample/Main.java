package sample;
import java.util.*;
public class Main {
    //В каждом слове текста n-ю букву заменить заданным символом. Если n больше длины слова, корректировку не выполнять.
    public static void main(String[] args) {
        System.out.println("Введите текст");
        Scanner sc1 = new Scanner(System.in);
        String text = sc1.nextLine();
        String[] strArr = text.split(" ");
        System.out.println("Введите номер");
        int k = 0;
        Scanner sc2 = new Scanner(System.in);
        try {
            k = sc2.nextInt();
        }
        catch (InputMismatchException fg) {
            System.out.print("Значение не является числом");
            return;
        }
        System.out.println("Введите символ");
        Scanner sc3 = new Scanner(System.in);
        char symbol = sc3.next().charAt(0);

        String newStrArr[] = new String[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() >= k) {
                newStrArr[i] = strArr[i].substring(0, k - 1) + symbol + strArr[i].substring(k);
            }
            else {
                newStrArr[i] = strArr[i];
            }
            System.out.print(newStrArr[i] + " ");
        }
    }
}