import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        String str;
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        str = sc1.nextLine();

        if (str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")){
            System.out.printf("A letra '%s' é uma vogal.\n", str);
        } else {
            System.out.printf("A letra '%s' é uma consoante.\n", str);
        }

        sc1.close();
    }
}