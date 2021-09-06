import java.util.*;
public class BuyTickets {
    public static void main(String args[]){
        int[] arr = {2, 4, 7};
        int d = 60;
        List<Integer> tickets = buyTickets(arr, d);
        System.out.println("All Done");
        for(int i = 0; i < tickets.size(); i++){
            System.out.println(tickets.get(i));
        }
    }

    private static List<Integer> buyTickets(int[] arr, int d) {
        List<Integer> ticketsToBuy = new ArrayList<Integer>();
        int ticket = 1;
        int i = 0;
        while(d >= ticket){
            if(i > arr.length-1){
                ticketsToBuy.add(ticket);
                ticket++;
                d = d - ticket;
            }
            else if(arr[i] > ticket){
                ticketsToBuy.add(ticket);
                d = d - ticket;
                ticket++;

            }
            else if(arr[i] == ticket){
                ticket++;
                i++;
            }
            else {
                break;
            }
        }
        return ticketsToBuy;
    }
}
