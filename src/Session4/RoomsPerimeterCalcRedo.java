package Session4;

import java.util.Scanner;

public class RoomsPerimeterCalcRedo {
    Scanner scanner = new Scanner(System.in);
    static void main() {
     RoomsPerimeterCalcRedo home = new RoomsPerimeterCalcRedo();
     Rectangle R1 = home.getRoomDimentions();
     Rectangle R2 = home.getRoomDimentions();
     home.scanner.close();
     double totalPerimeter = home.calcTotalPerimeter(R1,R2);
     System.out.println("Total perimeter is "+totalPerimeter);
    }
    Rectangle getRoomDimentions(){
        System.out.println("Please enter room length");
        double length = scanner.nextDouble();
        System.out.println("Please enter room width");
        double width = scanner.nextDouble();
        Rectangle home = new Rectangle(length,width);
        return home;
    }
    double calcTotalPerimeter(Rectangle R1 ,Rectangle R2) {
        return (R1.calculatePerimeter()+ R2.calculatePerimeter());
    }

}
