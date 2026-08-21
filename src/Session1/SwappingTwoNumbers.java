package Session1;

public class SwappingTwoNumbers {
    static void main() {
        //1
       int a=10;
       int b = 20 ;

//       int temp = a ;
//       a=b;
//       b=temp;
//        System.out.println(a);
//        System.out.println(b);

        //2
        a=a+b ;
        b=a-b ;
        a=a-b ;
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
}
