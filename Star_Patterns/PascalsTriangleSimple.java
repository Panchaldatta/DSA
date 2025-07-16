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
public class PascalsTriangleSimple {
    public static void main(String[] args) {
        int n = 5; // number of rows

        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

