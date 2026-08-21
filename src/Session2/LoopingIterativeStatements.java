package Session2;
import java.util.Scanner;

public class LoopingIterativeStatements {
    static void main() {
        //1.While:
//        .Condition controlled
//        .Pre test:condition checked before first iteration
//        .Use it when you do not know the number of iterations in advance and loop may not be runed
          //EX1 :
          // Write a program that calculates the gross week salary of employee with a rate 15 $ and can’t exceed 40 hours a week

          //What We Have?
//        int rate = 15;
//        int maxWeeklyHours=40;
//
//          //What We Need ?
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter your working hours ");
//        double WorkingHours = scanner.nextDouble();
//
//        //Validations
//        while (WorkingHours>maxWeeklyHours) {
//            System.out.println("Please enter value between 1-40-");
//            WorkingHours=scanner.nextDouble();
//
//        }
//    scanner.close();
//          //Calculations
//        double grossSalary = WorkingHours*rate;
//        System.out.println("The Gross Salary is "+grossSalary +"$");

        //2.Do While Loop
 //       .Condition controlled
//        .post test: Condition tested after first iteration ;
//        .Used when the loop need to be excuted at least one time
//     .Write a program that allow user to add to numbers and keep repeating as he wants
//        boolean response;
//        Scanner scanner = new Scanner(System.in);
//        do{
//            System.out.println("Enter first number");
//            int num1 = scanner.nextInt();
//            System.out.println("Enter second number");
//            int num2 = scanner.nextInt();
//            int sum = num1+num2;
//            System.out.println("The Sum is "+ sum);
//            System.out.println("Do you want to continue? 1/true 2/false");
//            response = scanner.nextBoolean();
//        }while(response);


        //3.For
//        .Count controlled
//        .Pre test:condition checked before first iteration
//        .Used when you know the count of iterations
       // Write a program that allow a cashier to scan a given number of items and get the cost

//        Scanner scanner = new Scanner (System.in);
//        System.out.println("Please enter number of products ");
//        int NumberOfItems = scanner.nextInt();
//        int Total = 0;
//        for (int i=1;i<=NumberOfItems;i++){
//            System.out.println("Please Enter Price Of Item "+i);
//            double price = scanner.nextDouble();
//            Total+=price;
//        }
//        scanner.close();
//        System.out.println("Total Of Items ="+Total);




    }
}
