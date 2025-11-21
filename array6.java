public class array6 {
    public static void main(String[] args) {
        String[] assig = {"Programació", "BBDD", "Lleg de marq", "Sistemes informatics"};
        int[] note = {5,6,9,6};
        int suma = 0;
        for (int i = 0; i < assig.length; i++){
            System.out.println("Assignatura: "+assig[i]+" nota: "+note[i]);
            suma += note[i];
        }
        System.out.println("Mitjana: "+(suma/assig.length));
    }
}
