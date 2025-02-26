public class Ex7 {
    public static int contarVogais(String str) {
        int vogais = 0;
        char letras[];

        str.toLowerCase(); // Padronizar as letras em minúsculas para ficar mais fácil

        letras = str.toCharArray(); // retorna o conteúdo da string como um array de chars.

        //char[] vogaisLista = {"a","e","i","o","u","á","é","í","ó","ú","à","è","ì","ò","ù","â","ê","î","ô","û"}; Não deu certo

        char[] vogaisLista = {'a','e','i','o','u','á','é','í','ó','ú','à','è','ì','ò','ù','â','ê','î','ô','û','ã','õ'};

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vogaisLista.length; j++) {
                if (letras[i] == vogaisLista[j]) {
                    vogais += 1;
                }

            }
        }

        // if (vogais == 0) {
        //     System.out.println("Não existem vogais nessa palavra.");
        // }

        return vogais;

    }

    public static void main(String[] args) {

        String palavra = "Programação";
        int qtdVogais = contarVogais(palavra);

        if (qtdVogais == 0) {
            System.out.printf("Não existem vogais na palavra '%s'.", palavra);
        } else {
            System.out.printf("Palavra: '%s'\n", palavra);
            System.out.println("Qtd de vogais: " + qtdVogais);
        }
    }
}
