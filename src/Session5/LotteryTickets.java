package Session5;

import java.util.Random;

public class LotteryTickets {
    //magicNumbers
    private static final int LENGTH = 6;
    private static final int MAX_LOTTERY_NUM =69;
    static void main() {
        int[] ticket =generateTicketsNumber();
        printTicketNumbers(ticket);

    }
    public static int[] generateTicketsNumber(){
        int [] ticket = new int [LENGTH];
        Random random = new Random();
        for (int i = 0 ; i < ticket.length ; i ++){
            ticket[i]=random.nextInt(MAX_LOTTERY_NUM)+1;
        }
        return ticket;
    }
    public static void printTicketNumbers(int[] ticket){
//        for(int i = 0 ; i < ticket.length ; i++){
//            System.out.print(ticket[i]+" | ");
//        }
        //enhanced for loop
        //for (int variable:array name)
        for (int number : ticket ){
            System.out.print(number +" | ");
        }
    }

}
