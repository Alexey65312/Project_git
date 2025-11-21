import java.util.Scanner;

public class array7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] choose = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        String cad="";
        int pos;
        do {
            System.out.println("Digues una posició");
            pos = input.nextInt();
            cad += choose[pos];
            if (pos > 0 && pos <= 25){
                System.out.println("Resultat: "+cad);
            }
        }while (pos <= -1);
        //System.out.println("Resultat: "+cad);
        input.close();
    }
}
