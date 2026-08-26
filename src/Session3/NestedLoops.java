package Session3;

import java.util.Scanner;

public class NestedLoops {
    static void main() {
        int numberOfStudents = 3 ;
        int numberOfCourses=4;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1 ; i <=numberOfStudents ;i++){
            double total = 0;

            for(int j=1;j<=numberOfCourses ;j++){
                System.out.println("Please enter the grade of course " +j +" for student "+i);
                double score = scanner.nextDouble();
                total+=score;
            }
            System.out.println("The average score of student "+i+" equals " +(total/4));
        }
    }
}
