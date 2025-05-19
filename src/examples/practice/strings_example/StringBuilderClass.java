package examples.practice.strings_example;

public class StringBuilderClass {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Endorphins");
        System.out.println(sb);
        sb.append(" ");
        sb.append("Studios");
        System.out.println(sb);


        StringBuilder s = new StringBuilder();
//        APPEND
        s.append("Endorphins");
        System.out.println(s);
        s.append(" ");
        s.append("Studios");
        System.out.println(s);

        StringBuilder wr = new StringBuilder();
        wr.append("Word ");
        wr.append("Reverser");
        System.out.println(wr);

        StringBuilder wrs = new StringBuilder("Word Reserver");
        System.out.println(wrs);


    }

}
