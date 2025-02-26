import java.util.Scanner;

public class Ex1 {

    // public static void trocar(int *a, int *b) {
    //     int temp;

    //     temp = *a;
    //     *a = *b;
    //     temp = *b;

    //}
    public static void main(String[] args) {
            
        int n1, n2;
        //Scanner sc1 = new Scanner(System.in);
        //Scanner sc2 = new Scanner(System.in);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1o numero: ");
        n1 = sc.nextInt();

        System.out.println("Digite o 2o numero: ");
        n2 = sc.nextInt();


        System.out.printf("\n1o numero: %d\n", n1);
        System.out.printf("2o numero: %d\n", n2);

        int temp;

        temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("\nTrocando...\n");

        System.out.printf("1o numero: %d\n", n1);

        System.out.printf("2o numero: %d\n", n2);

        //sc1.close();
        //sc2.close();

        sc.close();

    }
}