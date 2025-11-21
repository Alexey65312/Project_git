import java.util.Arrays;
import java.util.Scanner;
public class array5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[6];
        System.out.println("Escriu 6 paraules");
        words[0] = input.nextLine();
        words[1] = input.nextLine();
        words[2] = input.nextLine();
        words[3] = input.nextLine();
        words[4] = input.nextLine();
        words[5] = input.nextLine();
        String[] p1 = Arrays.copyOfRange(words, 0, 3);
        String[] p2 = Arrays.copyOfRange(words, 3, 6);
        for (String p : p1){

        System.out.println(p);
        }
        for (String p : p2){
        
        System.out.println(p);
        }
        input.close();
    }
}
