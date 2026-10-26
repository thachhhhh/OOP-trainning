public class Seat{
    private String row;
    private int number;
    private boolean reservable; // true = reservable ; false = full
    public String getRow(){//getter1
        return row; 
    }
    public void setRow(String row){//setter1
        this.row = row.toUpperCase();
    }

    public int getNumber(){//getter2
        return number;
    }
    public void setNumber(int number){//setter2
        if(number <=0){
            System.out.println("Invalid seat number: "+ number);
            return;
        }
            this.number = number;
    }

    public boolean isReservable(){
        return reservable; // getter3
    }
    public boolean reserve(){ // setter3.1
        if(reservable){ // if already reserved
            System.out.println("Seat " + getSeatCode() + " is already reserved");
            return false;
        }
            reservable = true; // Mark as reserved
            System.out.println("Seat " + getSeatCode() +" reserved");
            return true;
        
    } 
    public boolean release(){ //setter3.2
        if(!reservable){ // If not reserved(free)
            System.out.println("Seat "+ getSeatCode()+" is not reserved");
            return false; // removed the reservation
        }
            reservable = false;// Mark as free
            System.out.println("Seat "+ getSeatCode()+" released");
            return true; // available to reserve
    }
    public String getSeatCode(){
        return "" + row + number;
    }
    public void printInfo(){
        String Status = reservable ? "Reserved" : "Available";
        System.out.println("Seat: "+ getSeatCode()+ " [" + Status +"]");
    }
}