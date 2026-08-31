package Session5;

import java.util.Scanner;

public class Grades {
    private static int[] grades;
    private static Scanner scanner = new Scanner (System.in);
    private static int numberOfGrades ;
    static void main() {
        //1.Take number of grades from user
        //2.Get grades from user
        //3.Print grades
        // calculate (max , minimum , average )
//   -------------------------------------------------------------------------
        getNumOfGrades();
        getGrades();
        printGrades();
        System.out.println("The Average of your grades is : "+String.format("%.2f",calcAverage()));
        System.out.println("The highest grade is : "+getHighest()+" and the lowest grade is : "+getLowest());


    }
    public static void getNumOfGrades () {
        System.out.println("Please enter number of grades ");
        numberOfGrades = scanner.nextInt();
        grades = new int[numberOfGrades];

    }
    public static void getGrades(){
        for(int i=0 ; i < numberOfGrades ; i++){
            System.out.println("Please enter grade num  "+(i+1));
            grades [i]= scanner.nextInt();
        }
    }
    public static void printGrades(){
        for (int grade : grades){
            System.out.println(grade);
        }
    }
    public static double calcAverage (){
        return calcTotal()/numberOfGrades ;

    }
    public static double calcTotal(){
        int total=0;
        for (int grade : grades ){
            total+=grade;
        }
        return total ;
    }
    public static int getHighest (){
        int highest = grades[0]; //expect that the highest value is the first one
        for (int grade : grades ){
            if (grade > highest){
                highest=grade;
            }
        }
        return highest ;
    }
    public static int getLowest (){
        int lowest = grades[0];
        for (int grade : grades ){
            if (grade < lowest){
                lowest=grade;
            }
        }
        return lowest ;
    }

}
