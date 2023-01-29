public class Operateurs {
    public static void main(String[] args) {

        //region Opérateurs arithmétiques
        int result = 1 + 2;
        // result is now 3
        System.out.println("1 + 2 = " + result);
        int original_result = result;

        result = result - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;

        result = result * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + result);
        original_result = result;

        result = result / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;

        result = result + 8;
        // result is now 10
        System.out.println(original_result + " + 8 = " + result);
        original_result = result;

        result = result % 7;
        // result is now 3
        System.out.println(original_result + " % 7 = " + result);
        //endregion

        //region Opérateurs unaires
        int nombre = +1;
        // result is now 1
        System.out.println(nombre);

        // Decrement operator; decrements a value by 1
        nombre--;
        // result is now 0
        System.out.println(nombre);

        // Increment operator; increments a value by 1
        nombre++;
        // result is now 1
        System.out.println(nombre);
        ++nombre;
        System.out.println(nombre);

        // Unary minus operator; negates an expression
        nombre = -nombre;
        // result is now -1
        System.out.println(nombre);

        // Logical complement operator; inverts the value of a boolean
        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);
        //endregion

        //region Affectations composées
        int x = 5; // x is 5

        // Incrementation
                x += 5; // x = x + 5;

        // Decrementation
                x -= 2; // x = x -2;

        // Multiplication
                x *= 2; // x = x * 2;

        // Modulus
                x %= 3; // x = x % 3;
        //endregion

        //region Opérateurs d'égalité et relationnels
        int value1 = 1;
        int value2 = 2;
        boolean resultat;

        resultat = value1 == value2;
        System.out.printf("value1 == value2 : %s \n", resultat);

        resultat = value1 != value2;
        System.out.printf("value1 != value2 : %s \n", resultat);

        resultat = value1 > value2;
        System.out.printf("value1 > value2 : %s \n", resultat);

        resultat = value1 < value2;
        System.out.printf("value1 < value2 : %s \n", resultat);

        resultat = value1 <= value2;
        System.out.printf("value1 <= value2 : %s \n", resultat);
        //endregion

        //region Opérateurs conditionnels
        // ET : les deux conditions doivent être vraies
        resultat = (value1 == 1) && (value2 == 2);
        System.out.printf("value1 is 1 AND value2 is 2 : %s \n", resultat);

        // OU : l'une, l'autre ou les deux doivent être vraies
        resultat = (value1 == 1) || (value2 == 2);
        System.out.printf("value1 is 1 OR value2 is 2 : %s \n", resultat);
        //endregion
    }
}
