package examples.practice.strings_example;

public class Concatenation {
    public static void main(String[] args){

//        String s1 = "Computer";
//        String s2 = "-Science";
//
//        String s3 = s1.concat(s2);
//        System.out.println(s3);
//
//        String s4 = "-Portal";
//        String s5 = s3.concat(s4);
//        System.out.println(s5);
//
//        String s6 = "Endorphins";
//        String s7 = "-Studios";
//        s6 = s6.concat(s7);
//        System.out.println(s6);
//
//        String stringLiteral = "String Literal";
//        System.out.println(stringLiteral);
//
//        String newKeyWord = new String("NewKeyWord");
//        System.out.println(newKeyWord);
//
        String rej = "VinothRaju KutriyaHyder";
        String rajResult = rej.substring(6,18);
        System.out.println(rajResult);

        String vinoth1 = "Vinoth Raju";
        String hyder1 = " Kutriya Hyder";
        vinoth1 = vinoth1.concat(hyder1);
        System.out.println(vinoth1.substring(7,20).toUpperCase());



//        System.out.println(vinoth.trim());
//        System.out.println(vinoth.length());
//        System.out.println(vinoth.toLowerCase());
//        System.out.println(vinoth.toUpperCase());

        String hyder = " Kutriya Hyder";
        String kamal = "Kamal Raju";
        String vinoth = kamal.concat(hyder);
        System.out.println(vinoth.substring(6,18).toUpperCase());
    }
}
