public class ExemploComparacao {
    public static void main(String[] args) {

        /*
         * Operadores de comparação Java
         * Os operadores de comparação são usados ​​para comparar dois valores. Isso é
         * importante na programação, porque nos ajuda a encontrar respostas e tomar
         * decisões.
         * 
         * O valor de retorno de uma comparação é trueou false. Esses valores são
         * conhecidos como valores booleanos, e você aprenderá mais sobre eles no
         * capítulo Booleanos e If..Else .
         * 
         * No exemplo a seguir, usamos o operador maior que> ( ) para descobrir se 5 é
         * maior que 3:
         */

        int x = 5;
        int y = 3;
        // operações de comparação !!
        System.out.println("== Operações de Comparação ==");
        System.out.println(x == y); // true or false???
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println("== Operações lógicas ==");
        boolean a = true;
        System.out.println(a && true && 3 < 8);
        boolean vaiTerAula; // ??
        boolean diaSemana = true;
        boolean feriado = true;
        vaiTerAula = diaSemana && !feriado;
        System.out.println(vaiTerAula);
        System.out.println(diaSemana == true && feriado == false);

    }
}
