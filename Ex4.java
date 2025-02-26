import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n[] = new int[11];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %do numero: \n", i + 1);
            n[i] = sc.nextInt(); 
        }

        System.out.println("\nNúmeros na ordem inversa: ");

        for (int i = 9; i >= 0; i--) {
            System.out.printf("%d\n", n[i]);
        }
        
        sc.close();

    }
}