package examples.practice.arrays;

import javax.net.ssl.SNIHostName;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.text.Element;
import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args){
        int[] arr = {7,1,4,8,2,6,3,9,0};
        System.out.println(Arrays.toString(arr));

        int att2[] = {4,5,6,8,9,6};
        System.out.println(Arrays.toString(att2));


        int arrayLength = arr.length;
        System.out.println(arrayLength);
        System.out.println(arr[5]);
        arr[0] = 10;
        System.out.println(Arrays.toString(arr));


        char[] charArr = {'s','f','g','r','e','t'};
        System.out.println(charArr);

        String[] arrString = {"aadil", "kamal","Vinoth","Hyder","Raju"};
        System.out.println(Arrays.toString(arrString));

        int[] intArray;
        intArray = new int[20];
        System.out.println(intArray.length);

        int intArray1[];
        intArray1 = new int[7];
        System.out.println(intArray1.length);
        // Declaring array literal
        intArray1 = new int[]{4,5,8,2,9,6,7};
        System.out.println(Arrays.toString(intArray1));
        for (int i = 0; i< intArray1.length; i ++){
            System.out.println(intArray1[i]);
        }
        System.out.println("BREAK");
//        OR
        for (int j : intArray1){
            System.out.println(j);
        }

        int[] arr1 = new int[5];
        arr1[0] = 5;
        arr1[1] = 4;
        arr1[2] = 3;
        arr1[3] = 2;
        arr1[4] = 1;
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i<arr1.length; i++){
            System.out.println("Element at index "+ i+ " : "+arr1[i] );
        }

        int [][] arr2 = {{5,8,3,6,4},{1,1,1}};

        System.out.println(Arrays.deepToString(arr2));
        System.out.println(arr2[0][0]);
        System.out.println(arr2[0][1]);
        System.out.println(arr2[0][2]);
        System.out.println(arr2[0][3]);
        System.out.println(arr2[0][4]);
        System.out.println(arr2[1][0]);
        System.out.println(arr2[1][1]);
        System.out.println(arr2[1][2]);

        int[] arr3 = {5,6,2,1,9,3};
        System.out.println("Array 3 values: ");
        for (int i = 0; i<=arr3.length-1; i++){
            System.out.print(arr3[i]+" ");
        }
//        INT
        int[] arr4 = {9,8,7,6,5,4,3,2,1};
        System.out.println("\n\nThe values of Array 4: ");
        for (int val : arr4){
            System.out.print(val+" ");
        }
//       DOUBLE
        double[] arrDbl1 = {1.0,5,6.0,8,9.5};
        System.out.println("\n\nArray Double 1 values: ");
        for (double val : arrDbl1) System.out.print(val+" ");
//        FLOAT
        float[] arrFloat = {1f,5.1f,6.2f,8f,6.5f};
        System.out.println("\n\nArray float values: ");
        for (float val : arrFloat) System.out.print(val+" ");
//        LONG
        long[] arrLong = {10254L,23065489L, 16358414226354L,1452368752569745635L,1L};
        System.out.println("\n\nArray Long values: ");
        for (long val : arrLong) System.out.print(val+" ");
//        SHORT
        short[] arrShort = {25315,5,3654,9999,11111, 0,25687};
        System.out.println("\n\nArray short values: ");
        for (short val : arrShort) System.out.print(val+" ");

//        BYTE
        byte[] arrByte = {1,2,0,3,4,5,6,127};
        System.out.println("\n\nArray byte values: ");
        for (byte val : arrByte) System.out.print(val+" ");

//        CHAR
        char[] arrChar = {'a','1','g','l','m','%','!','+'};
        System.out.println("\n\nArray character values: ");
        for (char val : arrChar) System.out.print(val+" ");

//        BOOLEAN
        boolean[] arrBoolean = {true, false, true};
        System.out.println("\n\nArray boolean values: ");
        for (boolean val: arrBoolean) System.out.print(val+" ");

//        STRING
        String[] arrayString = {"aadar","sadar","kadar"};
        System.out.println("\n\nArray string values: ");
        for (String val: arrayString) System.out.print(val+" ");

//        INT 2D ARRAY

        int[][] arrInt2d = {{5,4,7,9},{6,3,7,9}};
        System.out.println("\n\n2D Array int values: ");
        for (int[] val :arrInt2d) System.out.println(Arrays.toString(val));
//        DOUBLE 2D ARRAY
        double[][] arrDouble2d = {{5.2,626.24,5,6.0,2.8},{8.2,2.1,52.3,6.23,4,9.01}};
        System.out.println("\n\n2D Array double values: ");
        for (double[] val : arrDouble2d) System.out.println(Arrays.toString(val));

//        FLOAT 2D ARRAY
        float[][] arrFloat2D = {{5.2F,5589.5F,54F,652.3F,1.2F},{5.3F,86.32F,54.2365F,1.0F,4.0F,90}};
        System.out.println("\n\n2D Array float values: ");
        for (float[] val : arrFloat2D) System.out.println(Arrays.toString(val));

//        LONG 2D ARRAY
        long[][] arrLong2d = {{5245L,6253L,5264L,265L,3L,25L},{47565L,3L,52L,333L,69854L}};
        System.out.println("\n\n2D Array long values: ");
        for (long[] val : arrLong2d) System.out.println(Arrays.toString(val));

//        SHORT 2D ARRAY
        short[][] arrShort2d = {{1,22,333,4444},{54,63,888,1}};
        System.out.println("\n\n2D Array short values: ");
        for (short[] var : arrShort2d) System.out.println(Arrays.toString(var));
//        BYTE 2D ARRAy
        byte[][] arrByte2d = {{1,22,33,44,55,6},{1,2,3,4,5,6}};
        System.out.println("\n\n2D Array byte values: ");
        for (byte[] val : arrByte2d) System.out.println(Arrays.toString(val));
//        CHAR 2D ARRAY
        char[][] arrChar2d = {{'a','d','k','h'},{'f','g','l','t'}};
        System.out.println("\n\n2D Array char values: ");
        for (char[] val : arrChar2d) System.out.println(Arrays.toString(val));

//        BOOLEAN 2D ARRAY
        boolean[][] arrBoo2d = {{true, true, false},{false,true,false}};
        System.out.println("\n\n2D Array Boolean values: ");
        for (boolean[] val : arrBoo2d) System.out.println(Arrays.toString(val));

//        STRING 2D ARRAY

        String[][] arrStr2d = {{"aad","dar","studio"},{"ble","java","kotlin"}};
        System.out.println("\n\n2D Array String values: ");
        for (String[] val : arrStr2d) System.out.println(Arrays.toString(val));

//        MULTIDIMENSIONAL ARRAY
        int[][] arrayInt;
        arrayInt = new int[4][4];
        arrayInt[0][0] =0;
        arrayInt[0][1] = 1;
        arrayInt[0][2] = 2;
        arrayInt[0][3] = 3;
        arrayInt[1][0] = 4;
        arrayInt[1][1] = 5;
        arrayInt[1][2] = 6;
        arrayInt[1][3] = 7;
        arrayInt[2][0] = 8;
        arrayInt[2][1] = 9;
        arrayInt[2][2] = 10;
        arrayInt[2][3] = 11;
        arrayInt[3][0] = 12;
        arrayInt[3][1] = 13;
        arrayInt[3][2] = 14;
        arrayInt[3][3] = 15;

        for (int[] val : arrayInt) System.out.println(Arrays.toString(val));


        System.out.println("\n\nARRAY 2D OPERATION");
        int r = 3;
        int c = 4;
        int[][] arrIntOpr = new int[r][c];

        int cr= 1;
        for (int i = 0; i < r; i++){
            for (int j = 0; j< c; j++){
                arrIntOpr[i][j] = cr;
                cr++;
            }
        }
        for (int[] var : arrIntOpr) System.out.println(Arrays.toString(var));
        System.out.println("Display the element at row second - colum third element of the array: "+arrIntOpr[1][2]);

//        REPRESENTATION OD OF THE 3D ARRAY
        System.out.println("\n\n\nREPRESENTATION OF 3D ARRAY");
    }

}
