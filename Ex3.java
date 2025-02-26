import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float n[] = new float[11]; // Perguntei pro GPT como era pra fazer essa parte. Pelo que eu entendi, ele cria um array n e o operador 'new' inicializa o array vazio e aloca espaço na memória pra ele 
        float maior;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %do numero: \n", i + 1);
            n[i] = sc.nextInt();
        }

        maior = n[0];

        for (int j = 0; j < 10; j++) {
            if (n[j] > maior) {
                maior = n[j];
            }
        }

        //System.out.printf("O maior número é %.2f%n\n", maior);
        System.out.println("O maior número é " + maior);

        sc.close();
    }
}