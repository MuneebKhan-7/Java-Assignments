import java.util.Scanner;

class Simple{  
    public static void main(String args[]) {  
    // 1) Print even numbers:
    System.out.println("Even numbers:");
    for(int i=0; i<=50; i++){
        System.out.println(2*i);
    }

     // 2) Factorial of a number:
    System.out.print("Enter a number whose factorial needs to be calculated: ");
    Scanner input = new Scanner(System.in);
    int num1 = input.nextInt();
    int fact = 1;
    for(int i = 2; i <= num1; i++) {
        fact = fact * i;
    }
    System.out.println("Factorial is : " + fact);

    // 3) Leap Year:
    System.out.print("Enter a year: ");
    int year = input.nextInt();
    if(year % 4 == 0) {
        System.out.println(year + " is a leap year.");
    }
    else {
        System.out.println(year + " isn't a leap year.");
    }

    // 4) Max of 2 numbers:
    System.out.print("Enter 2 integers: ");
    int n1 = input.nextInt();
    int n2 = input.nextInt();

    if(n1 > n2) {
        System.out.println(n1 + " is the maximum of the two integers.");
    }
    else if(n1 < n2) {
        System.out.println(n2 + " is the maximum of the two integers.");
    }
    else {
        System.out.println("The two numbers are equal.");
    }

    // 6) Min of 2 numbers:
    if(n1 < n2) {
        System.out.println(n1 + " is the maximum of the two integers.");
    }
    else if(n1 > n2) {
        System.out.println(n2 + " is the maximum of the two integers.");
    }
    else {
        System.out.println("The two numbers are equal.");
    }

    // 5) Area of circle:
   System.out.print("Enter the radius of a circle: ");
   float radius = input.nextFloat();
   float area = 22/7 * radius * radius;
   System.out.println("The area of the circle is: " + area + " sq. units.");

   // 6) Palindrome:
   System.out.print("Enter an integer: ");
   int n3 = input.nextInt();
   int temp = n3;
   int rev = 0;
   while(temp != 0) {
    int digit = temp % 10;
    temp /= 10;
    rev = (rev * 10) + digit;
   }
   if(rev == n3) {
    System.out.println(n3 + " is a palindrome.");
   }
   else {
    System.out.println(n3 + " isn't a palindrome.");
   }

   // 7) Fibonacci Numbers(iterative):
   System.out.print("How many Fibonacci numbers do you wish to print? ");
   int n4 = input.nextInt();
   int t1 = -1;
   int t2 = 1;
   System.out.println("First " + n4 + " Fibonacci numbers: ");
   for(int i = 0; i < n4; i++) {
    int t = t1 + t2;
    System.out.print(t + "  ");
    t1 = t2;
    t2 = t;
   }

   // 8) Check if a number is Prime:
   System.out.print("\nEnter an integer: ");
   int n5 = input.nextInt();
   int num = 2;
   while(num <= n5/2) {
    if(n5 % num == 0) {
        break;
    }
    num++;
   }
   if(num > n5/2) {
    System.out.println(n5 + " is a prime number.");
   }
   else {
    System.out.println(n5 + " isn't a prime number.");
   }

   // 9) Pyramid of *:
   System.out.println("Pyramid: ");
   int i, j, row = 10;         
        for (i=0; i<row; i++) {       
            for (j=row-i; j>1; j--) {
                System.out.print(" ");   
            } 

            for (j=0; j<=i; j++ ) {         
            System.out.print("* ");   
            }   
        System.out.println();
        }
    }
}  
