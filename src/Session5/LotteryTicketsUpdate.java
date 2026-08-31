package Session5;

import java.util.Random;

public class LotteryTicketsUpdate {
    private static final int LENGTH=6;
    private static final int MAX_LOTTERY_NUMB=69;
    static void main() {
        //method generate ticket
        //method to print
        //method to search
        int[]ticket=generateTicketNumbers();
        printTicketNumbers(ticket);


    }
    public static int[] generateTicketNumbers(){
        int [] ticket = new int [LENGTH];
        Random random = new Random();
        for (int i =0 ; i < ticket.length ;i++){
            int randomNumber ;
            do{
                randomNumber= random.nextInt(MAX_LOTTERY_NUMB)+1;
            }while (search(ticket,randomNumber));
            ticket[i]=randomNumber;
        }
        return ticket;
    }
    public static void printTicketNumbers (int [] ticket){
        for (int number : ticket){
            System.out.print(number +" | ");
        }
    }
    public static boolean search (int[]array , int numToSearch){
        for (int value : array ){
            if (value == numToSearch){
                return true ;
            }
        }
        return false;
    }

}
