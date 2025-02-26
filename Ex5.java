public class Ex5 {
    public static int min(int a, int b) {
        if (a <= b) {
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {

        int a = 10, b = 7;
        
        System.out.println("Números: " + a + " e " + b);
        System.out.println("Min: " + (min(a, b)));
        //min(10, 7);

        a = 5; 
        b = 12;
        
        System.out.println("Números: " + a + " e " + b);
        System.out.println("Max: " + (max(a, b)));
        //max(5, 12);
    }
}
