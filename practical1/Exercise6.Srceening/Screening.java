 public class Screening {
    // Hidden instance variables (Encapsulation + Instance Data)
    private String title;
    private String room;
    private int seats;
    private int sold;
    // Constructor replacing static init()
    public Screening(String title, String room, int seats){
            this.title = title;
            this.room = room;
            this.seats = seats;
            this.sold = 0;
    }
    // Encapsulation: Getter methods
    public String getTitle(){
        return title;
    }
    public String getRoom(){
        return room;
    }
    public int getSeats(){
        return seats;
    }
    public int getSold(){
        return sold;
    }
    // Instance Business Methods
    public void sell(int n) {
        if (sold + n <= seats) sold += n;
        else System.out.println("You cannot have negative sold seats");
    }

    public void cancel(int n) {
        if(n <=0) {
            System.out.println("You cannot cancel negatively");
            return;
        }
        if (sold - n >= 0) sold -= n;
        else System.out.println("You cannot cancel more seats than there are");
    }
    public void printInfo(){
        System.out.println(title+ ": " + sold + "/" + seats);
    } // moved from  public static void main(String args[]) outside 
    public static void main(String args[]) {
        Screening dune = new Screening("Dune", "2H-201", 40);
        dune.sell(3);
        dune.cancel(1);
        dune.printInfo();// Dune: 2/40

    }// Use Static when using math like math.PI, math.max())
    // Use non-static when using instance variables ( tickets, seats, screening)
 }
