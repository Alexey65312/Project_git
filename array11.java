public class array11 {
    public static void main(String[] args) {
        int[] first = {1,2,3,4,5};
        int[] last = new int[5];
        for(int i = 0; i < first.length; i++){
            last[i] = first[first.length-1-i];
            System.out.println(last[i]);
        }
    }
}
