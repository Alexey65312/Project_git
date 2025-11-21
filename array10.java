import java.util.Scanner;

public class array10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introdueix un numero");
        String num = input.nextLine();
        int first = num.charAt(0);
        int last = num.charAt(num.length()-1);
        if (first == last) {
            System.out.println(num);
        }
        input.close();
    }
}
