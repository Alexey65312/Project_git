import java.util.Arrays;
import java.util.Scanner;
public class array4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];
        for(int n = 0; n < 5; n++){
            System.out.println("Introdueix el 5 numeros ");
            numeros[n] = input.nextInt();
            System.out.println("Els nombers son: "+numeros.length);
            
        }
        Arrays.sort(numeros);
        for (int n : numeros){
            System.out.println(n);
        }
        input.close();
        
    }
}
