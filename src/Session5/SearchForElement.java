// search an element in array

package Session5;
import java.util.Scanner;

public class SearchForElement {
private static Scanner scanner = new Scanner(System.in);
private  static int [] numbers= new int [5];

    static void main() {
        System.out.println("Please enter the number you want to check in the array ");
        int numberToSearch = scanner.nextInt() ; //Take the number the user want to search for
        getnumbers(); //Take the numbers in the array
        System.out.println(searchInArray(numbers,numberToSearch));
    }

    public static void getnumbers(){
        for (int i = 0 ; i < 5 ; i++){
            System.out.println("please enter 5 numbers"+" "+(i+1));
            numbers[i] = scanner.nextInt();
        }
    }

    public static boolean searchInArray(int[] numbers , int numberToSearch ){
        for (int value : numbers  ){
            if (value==numberToSearch){
                return true;
            }
        }
        return false;
    }

}
