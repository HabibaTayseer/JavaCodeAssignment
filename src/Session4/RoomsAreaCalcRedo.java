package Session4;

import java.util.Scanner;

public class RoomsAreaCalcRedo {
    Scanner scanner = new Scanner(System.in);
    static void main() {
    RoomsAreaCalcRedo Home = new RoomsAreaCalcRedo();
    Rectangle kitchen = Home.getRoomDimentions();
    Rectangle bathroom = Home.getRoomDimentions();
    Home.scanner.close();
    double totalArea= Home.calculateTotalArea(kitchen,bathroom);
    System.out.println("The total area is : "+totalArea);
    }
    Rectangle getRoomDimentions( ){
        System.out.println("Enter length ");
        double length = scanner.nextDouble();
        System.out.println("Enter width ");
        double width = scanner.nextDouble();
        //Rectangle room = new Rectangle(length,width);
        return new Rectangle(length,width) ;
    }
    double calculateTotalArea(Rectangle kitchen,Rectangle bathroom){
        return kitchen.calculateArea()+ bathroom.calculateArea();
    }

}
