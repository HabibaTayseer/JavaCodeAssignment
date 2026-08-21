package Session1;

public class Casting {
    static void main() {
        //Casting
        //primitive casting or  refrence casting
        // safe because a space smaller than l "inplest" "updown casting"
        int a =12812 ;
        long l = a ;
        System.out.println(l);
        //"narrowing casting" "bkhaf mn al data loss" "down casting"
        long x = 1238897864665463456l;
        int y = (int)x ;
        System.out.println(y);
    }

}
