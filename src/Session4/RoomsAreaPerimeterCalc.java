package Session4;

public class RoomsAreaPerimeterCalc {
    static void main() {
        Rectangle room1 = new Rectangle(); //new is keyword initiate the object and take space in memory
//        room1.setLength(20);
//        room1.setWidth(10);
        double areaOfRoom1 =room1.calculateArea();
        System.out.println("The Area of room 1 is "+areaOfRoom1);
        double perimeter = room1.calculatePerimeter();
        System.out.println("The perimeter of room 1 is "+perimeter);

        Rectangle room2 = new Rectangle(30,15);
//        room2.setLength(10);
//        room2.setWidth(5);
        double areaOfRoom2 =room2.calculateArea();
        System.out.println("The Area of room 2 is "+areaOfRoom2);
        double perimeterOfRoom2 = room2.calculatePerimeter();
        System.out.println("The perimeter of room 2 is "+perimeterOfRoom2);
        System.out.println("The total areas of 2 rooms is "+(areaOfRoom1+areaOfRoom2));
        System.out.println("The total perimeter of 2 rooms is "+(perimeter+perimeterOfRoom2));

    }
}
