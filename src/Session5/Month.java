//Overloading: another picture to method with different implementation.
//To make overloading we need to change signature "Method name the same + change in parameter list(in number , in data type in order"

package Session5;

public class Month {

    public static String getMonth(int monthNum){
        switch(monthNum){
            case 1: return"Jan";
            case 2: return"Feb";
            case 3: return"march";
            case 4: return"April";
            case 5: return"May";
            case 6: return"June";
            case 7: return"July";
            case 8: return"Aug";
            case 9: return"Sep";
            case 10: return"Oct";
            case 11: return"Nov";
            case 12: return"Dec";
            default:return "Invalid day number";
        }
    }
    public static int getMonth(String monthName) {
        switch (monthName) {
            case"Jan" :return 1 ;
            case"Feb" :return 2;
            case"Mar" :return 3;
            case"Apr" :return 4;
            case"May" :return 5;
            case"June":return 6;
            case"July":return 7;
            case"Aug ":return 8 ;
            case"Sep" :return 9 ;
            case"Oct" :return 10 ;
            case"Nov" :return 11 ;
            case"Dec" :return 12 ;
            default   :return -1;
        }
    }
}
