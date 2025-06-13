public class sumofarrays {
     public void sumofarray() {
   }

   static double sum(int[] var0, int var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 += var0[var3];
      }

      return (double)var2 / (double)var1;
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{10, 2, 3, 4, 5, 6, 7, 8, 9};
      int var2 = var1.length;
      System.out.println(sum(var1, var2));
   }
}
