// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]){

//         // long a = 25;
//         // int b = a;
//         // System.out.println(b);

//         Scanner sc = new Scanner(System.in);

//         // Float 
//         float number = sc.nextFloat();

//         System.out.println(number);
//     }

// }

// **********Type casting ***************

// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]){

  

//         Scanner sc = new Scanner(System.in);

//         // Float 
//            float a = 25.12f;
//      int b = (int)a;
//         float number = sc.nextFloat();

//         System.out.println(b);
//     }

// }
// 
// ******** TYPE OF PROMOTION **********
import java.util.*;

public class JavaBasics {

    public static void main(String args[]){
        short a = 5;
        byte b = 25;
        char c = 'c';

        byte bt = (byte) (a+b+c);

        System.out.println(bt);
    }
}