package Session4;
import java.util.Scanner;

public class InstantPayCheck {
    //GlobalVariables
    static Scanner scanner = new Scanner(System.in);
    //what we have ?
    static double requiredSalary=2000;
    static double requiredCreditScore=500;

    static void main() {
        //what we need ?
        double salary = getEmployeeSalary();
        double score = getEmployeeScore();
        boolean qualified = isQualified(salary,score);
        check(qualified);
    }

    //logic/calsulations
    static double getEmployeeSalary(){
        System.out.println("Enter your salary");
        //double salary = scanner.nextDouble();
        //return salary;
        return scanner.nextDouble();
    }
    static double getEmployeeScore (){
        System.out.println("Enter your score");
//        double score = scanner.nextDouble();
//        return score;
        return scanner.nextDouble();
    }
    static boolean isQualified(double salary , double score ){
        if (salary>=requiredSalary&&score>=requiredCreditScore){
            return true;
        }
        else{
            return false ;
        }
    }
    static void check (boolean qualified){
        if (qualified){
            System.out.println("congrats , you are qualified for the loan ");
            }
        else{
            System.out.println("you are not qualified for the loan ");

        }
    }
}

