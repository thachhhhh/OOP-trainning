import java.util.ArrayList;
public class TicketCart{
    private ArrayList<Ticket> tickets = new ArrayList<>();
    public void addToCart(Ticket ticket){ // setter
        if (ticket != null){
            tickets.add(ticket);
        }
        else{
            System.out.println("Error: You cannot add null ticket");
        }  
    }


    public boolean removeFromCart(Ticket ticket){ // setter
        return tickets.remove(ticket);
    }


    public ArrayList<Ticket> getTickets(){// getter
        return tickets;
    }
    public double getTotalPrice(){
        double total = 0;
        for (Ticket t : tickets){
            total += t.getPrice();
        }
        return total;
    }
    public void check0ut(){
        System.out.println("---Ticket cart---");
        if(tickets.isEmpty()){
            System.out.println("The cart is empty");
        }
        for (Ticket t :tickets){
            t.print();
        }
        System.out.println("------------");
        System.out.println("Total price: $"+getTotalPrice());
    }
}
