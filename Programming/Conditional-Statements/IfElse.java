// import java.util.*;

// public class IfElse {

//     public static void main(String[] args) {
//         int age = 22;
//         if (age>=12) {
//             System.out.println("Adult : Drive, Vote");
//         }
//         else{
//             System.out.println("Not Adult");
//         }
//     }
// }


// import java.util.*;

// public class IfElse {

//     public static void main(String[] args) {
//        int A = 1;
//        int B= 5;
//        if (A>=B) {
//         System.out.println("A is the largets 2");
//        }
//        else{
//         System.out.println("B is largets of 2");
//        }
//     }
// }


// ODD OR EVEN 
// import java.util.*;

// public class IfElse {

//     public static void main(String[] args) {
     
//         Scanner sc = new Scanner(System.in);
//         System.err.print("Enter your Number : ");
//         int num = sc.nextInt();

//         if (num % 2 ==0) {
//             System.out.println("The Number is Even");
//         }else{
//             System.out.println("The Number is Odd");
//         }
       
//     }
// }


// income tax calculator

import java.util.*;
public class IfElse {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if (income<500000) {
            tax = 0;
        }
        else if (income>= 500000 && income <1000000) {
            tax=(int)(income*0.2);
        }
        else{
            tax=(int)(income*0.3);
        }
        System.out.println("Your tax is : " + tax);
    }
}
