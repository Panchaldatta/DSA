// package Star_Patterns;

// public class pascalsTrangle {
    

//     static void printPascalTriangle(int n) {
//         n=4;
//         for (int i = 0; i <=n; i++) {
//             for(int j = 0;j<=i;i++){
//                 System.out.println("* ");

//             }
//             System.out.println();

//         }
//     }
// }


package Star_Patterns;

public class pascalsTrangle {

    static void printPascalTriangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPascalTriangle(4);
    }
}
