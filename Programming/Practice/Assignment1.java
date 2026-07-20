import java.util.Scanner;

public class Assignment1 {
   public Assignment1() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      int var3 = var1.nextInt();
      int var4 = var1.nextInt();
      int var5 = (var2 + var3 + var4) / 3;
      System.out.println("average is :" + var5);
   }
}