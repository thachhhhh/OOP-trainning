public class TicketCartTestDrive{
    public static void main(String[] args){
        Ticket t1 = new Ticket();
        t1.setFilmTitle("Spiderman");
        t1.setPrice(5.99);
        t1.setStudent(true);

        Ticket t2 = new Ticket();
        t2.setFilmTitle("Suits");
        t2.setPrice(3.99);
        t2.setStudent(false);

        Ticket t3 = new Ticket();
        t3.setFilmTitle("Dune");
        t3.setPrice(7.99);
        t3.setStudent(true);


        TicketCart cart = new TicketCart();
        cart.addToCart(t1);
        cart.addToCart(t2);
        cart.check0ut();
// Test1: remove a ticket is not in the cart
        System.out.println("\n=== TEST 2: Remove Ticket NOT in Cart ===");
        boolean result1 = cart.removeFromCart(t3);
        if (!result1){
            System.out.println("Ticket not found");
        } else{
            System.out.println("Ticket removed");
        }
        System.out.println("Final Cart");
        cart.check0ut();

    }
}