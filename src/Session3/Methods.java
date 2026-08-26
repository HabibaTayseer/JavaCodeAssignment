//Methods -> used to break complex programs to small manageable pieces
//public static int calculateSum(int number1, int number2){
//    int sum = number1+number2;
//    return sum;
//}

//public static int calculateSum(int number1, int number2) 🡪 method header
//Access modifiers:
//public: is access modifier means any code in any class can access this method
//Private: can be seen only in the same class "cant be called at another class even if at the same package"
//Protected:
//No access modifier : can be seen at the same package "Package private->"private at the level of the same package

//Non access modifier
//static: non access modifier  means that method or variable belongs to the class itself
//Final: if i do something final it can not be changed or edited
//Abstract:

//int is the return type🡪 this indicates the return type of the method "Mandatory"
//calculateSum is the name-> should start with a verb and lower case "camel case"
//(int number1, int number2)-> parameter list   can be empty if no external data is needed for the task
//calculateSum(int number1, int number2)🡪 method signature - must be unique within a class
//Then method body inside the curly braces
//If there is a return type then the method must return some value of the same type
//"return value the same type as the return type"


package Session3;
import java.util.Scanner;

public class Methods {
    static Scanner scanner = new Scanner(System.in);
    static void main() {
        String name = getUserName();
        greetUser(name);
        scanner.close();

    }
//Methods
    static String getUserName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        return name;
    }
    static void greetUser(String name){
        System.out.println("Hello "+name);
    }
}
