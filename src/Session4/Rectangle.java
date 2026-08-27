//OOP PRINCIPLES:
//1.Encapsulation: every fields in classes must be private
//2.

//CONSTRUCTORS:
// Is a special method run at the beginning of life cycle of object usually public run every time make object has no return type
//1.Default constructor (does not take parameters )
//2.Parametrized constructor "overloaded constructor"
//A constructor must run for every object

package Session4;

public class Rectangle {
    private double length;
    private double width ;
//Constructor
    public Rectangle(){
        //this is default constructor
        //implementation need when make object
        System.out.println("This is default constructor");
//        length=20;
//        width=10;
    }
    public Rectangle(double length , double width){
        //this is parametrized constructor
        System.out.println("This is parametrized constructor");
        this.length=length;
        setWidth(width);
    }

//Setters
    public void setLength(double length){
        this.length=length;
    }
    public void setWidth(double width){
        this.width=width;
    }
//getters
    public double getLength() {
        return length;
    }
    public double getWidth(){
        return width;
    }
//methods
    public double calculateArea(){
        return length*width;
    }
    public double calculatePerimeter(){
        return (length+width)*2;
    }

}
