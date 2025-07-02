
// import java.util.Arrays;

// public class mergeArrays {
//     // Java program to merge two array 
// // using System.arraycopy() method

//     public static void main(String[] args) {

//         int[] arr1 = { 10, 20, 30, 40 };
//         int[] arr2 = { 50, 60, 70, 80 };

//         // determines length of both arrays
//         int a1 = arr1.length;
//         int b1 = arr2.length;

//         // resultant array size
//         int c1 = a1 + b1;

//         // create the resultant array
//         int[] c = new int[c1];

//         // using the pre-defined function arraycopy
//         System.arraycopy(arr1, 0, c, 0, a1);
//         System.arraycopy(arr2, 0, c, a1, b1);

//         System.out.println("" + Arrays.toString(c));
//     }
// }
    

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class mergeArrays {
    public static void main(String[] args) {
        int nums[][]=new int[5][4];
         for (int i=0;i<=4;i++){
             for (int j=0;j<=3;j++){
             
               nums[i][j]=(int) (Math.random() * 50);
         }
             
         }
         for (int i=0;i<5;i++){
             for(int j=0;j<4;j++){
             System.out.print(nums[i][j]+ " "); 
         }
             System.out.println();


         }
         
         for (int n[]:nums){
             for (int m :n){
             System.out.print(m +" ");

             }
             System.out.println();
             
         }
        
        
        
    }
}