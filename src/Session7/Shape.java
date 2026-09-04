//if class contain even only one method class will be abstract too;
//lw class hy inherit mn abstract class will be abstract class too ela lw 3mlt override 3la kol al abstract methods
//abstract class can not be initiated
package Session7;

public abstract class  Shape {

    public abstract double calculateArea(); //can't make implementation bec we don't know which shape

    public void print(){
        System.out.println("This is concrete method ");
    }
}
