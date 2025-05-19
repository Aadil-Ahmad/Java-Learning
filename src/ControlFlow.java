public class ControlFlow {
    public static void main(String[] args){

        int a = 10;

//        if statement
        if (a < 15){
            System.out.println(a+" is less than 15");
        }

        // if-else statement
        if (a>15){
            System.out.println(a+" is greater that 15");
        }else {
            System.out.println(a+" is less than 15");
        }
//        nested if else statement
        if (a==10 || a < 15){
           if (a<15){
               System.out.println(a+ " is less that 15");
           }
           if (a<12){
               System.out.println(a+" is less that 12");
           }
           if (a== 10){
               System.out.println("the value is 10");
           }
        }else {
            System.out.println("Either greater that 15");
        }

//        if-else-if   ladder

        int num = 20;
        if (num == 10){
            System.out.println("num is 10");
        } else if (num == 20) {
            System.out.println("num is 20");
        }else if (num == 30){
            System.out.println("num is 30");
        }
        else {
            System.out.println("incorrect number");
        }

//        switch-case

        int b = 20;
        switch (b){
            case 5:
                System.out.println("it is 5");
                break;
            case 10:
                System.out.println("it is 10");
                break;
            case 15:
                System.out.println("it is 15");
                break;
            case 20:
                System.out.println("it is 20");
                break;
            case 25:
                System.out.println("it is 25");
                break;
            default:
                System.out.println("not present");
        }
    }
}
