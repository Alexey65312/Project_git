import java.util.Scanner;

public class array8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriu una frase ");
        String phrase = input.nextLine();
        String[] words = phrase.split(" ");
        for( String i : words){
            System.out.println(i);
        }
        input.close();
    }
}
