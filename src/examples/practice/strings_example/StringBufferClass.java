package examples.practice.strings_example;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringBufferClass {

    public static void main(String[] args){
        StringBuffer s = new StringBuffer();

//        APPEND
        s.append("Endorphins");
        s.append(" ");
        s.append("Studio");
        System.out.println(s);
        //        OR
        String str = s.toString();
        System.out.println(str);
//        INSERT
        s.insert(5,"-$a4!-");
        System.out.println(s);
//        DELETE
        s.delete(5,11);
        System.out.println(s);
//        REVERSE
        s.reverse();
        System.out.println(s);
        System.out.println(s.toString().toUpperCase());

        s.reverse();
        System.out.println(s);
//        DELETE AT
        s.deleteCharAt(9);
        System.out.println(s);
        s.insert(9,'s');
        System.out.println(s);

        s.replace(5,8,"AAA");
        System.out.println(s);
        s.replace(5,8,"phi");
        System.out.println(s);




    }
}
