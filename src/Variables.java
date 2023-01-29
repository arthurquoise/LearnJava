public class Variables {
    public static void main(String[] args) {

        /***************
         Types primitifs
         https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
         ***************/

        // Déclaration d'une variable
        // <type> <nom>;
        // int : entier sur 32 bits
        int age;

        // long : entier sur 64 bits
        long indice;

        // float : précision sur 32 bits
        float distance;

        // double : précision sur 64 bits
        double monnaie;

        // boolean : true ou false
        boolean estVrai;

        // correspond à un caractère
        char lettre;

        // Chaîne de caractère
        // String n'est pas considéré comme un type primitif
        String prenom;

        // <type> <nom> = <valeur>;
        int jour = 5;

        // Affectation
        age = 24;
        monnaie = 15.5;
        lettre = 'a';
        prenom = "Arthur";

        double resulat = age + monnaie;

        // println() permet d'afficher des enregistrements dans la console
        System.out.println(resulat);

        System.out.println(prenom + " a " + age + " ans");
    }
}
