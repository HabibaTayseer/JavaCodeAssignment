package Session6;

import Session4.Rectangle;

//square is a rectangle ? yes
public class Square extends Rectangle {
    @Override
    public double calculateArea(){
        return length*length;
    }
    @Override
    public double calculatePerimeter(){
        return (length* 4) ;
    }


}
