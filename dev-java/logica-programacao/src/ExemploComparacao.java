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
        System.out.println(x == y); // false
        System.out.println(x != y); // true
        System.out.println(x > y); // true
        System.out.println(x < y); // false
        System.out.println(x >= y); // true
        System.out.println(x <= y); // false

        System.out.println("Boolean: "); // false
        boolean a = true;
        System.out.println(a && true && 3 < 8);

    }
}
