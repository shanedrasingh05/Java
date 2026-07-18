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

import java.util.Scanner;

public class JavaBasicsc {
    public static void main(String[] args) {
        // 1. Create a Scanner object to read console input
        Scanner input = new Scanner(System.in);
        
        // 2. Prompt the user and read the first number
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        
        // 3. Prompt the user and read the second number
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        
        // 4. Calculate the sum
        int sum = num1 + num2;
        
        // 5. Print the output
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        // 6. Close the scanner resource to prevent memory leaks
        input.close();
    }
}
