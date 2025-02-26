public class Ex6 {
    public static double mulComAdicao(double a, int b) { // Mudei o tipo da função de float para double
        double multi = 0;

        for (int i = 0; i < b; i++) {
            multi += a;
        }

        return multi;
    }

    public static void main(String[] args) {

        double a = 5.5;
        int b = 3;
        double resultado = mulComAdicao(a,b);

        System.out.println("Operação: " + a + " x " + b);
        System.out.println("Resultado: " + resultado); //The method mulComAdicao(float, int) in the type Ex6 is not applicable for the arguments (double, int) Mudei de float para double por causa dessa mensagem

    }
}
