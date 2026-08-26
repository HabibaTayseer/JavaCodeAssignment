package Session3;
import java.util.Scanner;

//Notes
//next() -> btakhod lhad awl space ya3ny lw katb sentence feha kza eord htakhod awl word lghayt al space
//nextLine() -> htakhod lghayt al end of input stream
//charAt(index) -> use it when you want to find letter on string using index

public class JumpingStatments {
    static void main() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter text to check");
        String text = scanner.nextLine();
        boolean letterFound = false;
        int position = 0;
        for (int i =0;i<text.length();i++){
            char currentLetter=text.charAt(i);
            if (currentLetter=='A'||currentLetter=='a'){
                letterFound=true;
                position=i+1;
                break;
            }

        }
        if (letterFound){
            System.out.println("This Text Contain letter 'a' at "+position);
        }
        else{
            System.out.println("cant found letter 'a'");
        }

        //Another way
//        for (int i =0;i<text.length();i++){
//            char currentLetter=text.charAt(i);
//            if (currentLetter=='A'||currentLetter=='a'){
//                System.out.println("Letter a is found at position "+(i+1));
//                break;
//            }
//
//        }

    }
}
