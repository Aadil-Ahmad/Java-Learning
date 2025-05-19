public class Main{
    public static void main(String[] args){
        System.out.println("Upward\n");
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println("\nInverted\n");
        for (int i = 5; i >= 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }


        int n = 5;
        int spc = n-1;
        int str = 1;
         for (int i = 1; i <= n; i++){
             for (int j =1; j<= spc; j ++){
                 System.out.print("\t ");
             }
             spc --;
             for (int k = 1; k <= str; k ++){
                 System.out.print("*\t ");
             }
             str += 2;
             System.out.println(" ");
         }

        System.out.println("\nCOMBINATION \n");
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for (int i = 5; i >= 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        int num1 = 500;
        int num2 = 300;

        int sum = num1 + num2;
        System.out.println("The sum is : " +sum);
        int diff = num1 - num2;
        System.out.println("The diff is : " + diff);
        float divide = (float) num1 / num2;
        System.out.println("The division is : " +divide);

        float modulo = (float) num1 % num2;
        System.out.println("The modulo is : " +modulo);
    }
}