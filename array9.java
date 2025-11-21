import java.util.Scanner;

public class array9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introdueix el teu DNI");
        int  let = 0, num = 0;
        int[] letters = new int[let];
        int[] numbers = new int[num];
        String dni = input.nextLine();
        for(int i = 0; i < dni.length(); i++){
            char c = dni.charAt(i);
            if (Character.isLetter(c)) {
                let++;
            }
            else if (Character.isDigit(c)) {
                num++;
            }
        }
        System.out.println("Lletres: "+let+" "+letters.length);
        System.out.println("Numeros: "+num+" "+numbers.length);
        input.close();
    }
}
