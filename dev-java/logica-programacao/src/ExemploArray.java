public class ExemploArray {
    public static void main(String[] args) {
        // array inicia da posição 0

        String[] pessoas = { "Chaves", "Seu Madruga", "Dona Florinda", "Chiquinha" };
        System.out.println(pessoas[2]);
        System.out.println(pessoas.length);
        for (int i = 0; i < pessoas.length; i++) {
            String pessoa = pessoas[i];

            System.out.println(pessoa);

        }
        // foreach
        for (String pessoa : pessoas) {
            System.out.println(pessoa);
        }

    }
}
