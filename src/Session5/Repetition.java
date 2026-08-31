//find number of repetition of a certain number

package Session5;
import java.util.Scanner;

public class Repetition {
    private static Scanner scanner = new Scanner (System.in);
    public static int numberToSearch ;
    private static int [] numbers = new int[5];

    static void main() {
        System.out.println("Enter the number you want to search for:");
        numberToSearch = scanner.nextInt();
        getnumbers();
        checkRepetition();


    }
    public static void getnumbers(){
        for (int i = 0 ; i <numbers.length ; i++){
            System.out.println("please enter 5  numbers"+" "+(i+1));
            numbers[i] = scanner.nextInt();
        }
    }
    public static void checkRepetition(){
        int count = 0;
        for (int i=0; i<numbers.length; i++){
                if (numbers[i] == numberToSearch) {
                    count++;
                }
            }
        System.out.println(numberToSearch + " → " + count + " times");

        }
 }


