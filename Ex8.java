public class Ex8 {
    public static boolean haColisaoEntreCirculos(int x1, int y1, double r1, int x2, int y2, double r2) {
        double dist_centros = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)); //The method pow(double, double) in the type Math is not applicable for the arguments (double) -> Declarei como double
        if ((r1 + r2) >= dist_centros) { // Se a soma dos raios dos dois círculos for maior que a distância entre os seus centros retorne true ou false
            return true; // Sobrepõe
        } else {
            return false; // Não sobrepõe
        }
    }

    public static void main(String[] args) {

        //Circulo 1
        int x1 = 2, y1 = 3;
        float r1 = 5;

        //Circulo 2
        int x2 = 7, y2 = 3;
        float r2 = 4;

        System.out.println("Há sobreposição entre os círculos? " + (haColisaoEntreCirculos(x1, y1, r1, x2, y2, r2)));

    }
}
