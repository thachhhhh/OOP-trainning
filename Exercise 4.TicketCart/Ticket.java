public class Ticket{
    private String FilmTitle;
    private double price;
    private boolean student;

    public String getFilmTitle(){
        return FilmTitle;
    }
    public void setFilmTitle(String FilmTitle){
        if (FilmTitle == null || FilmTitle.trim().isEmpty()) {
            System.out.println("Error: Film Title cannot be empty");
        } else{
            this.FilmTitle = FilmTitle;
        }
        
    }
//----------------------------------------------
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        if (price <= 0) {
            System.out.println("Error: Price must be greater than zero");
        } else {
        this.price = price;
    }}
//----------------------------------------------
    public boolean getStudent(){
        return student;
    }
    public void setStudent(boolean student){
        this.student = student;
    }
//----------------------------------------------
    public void print(){
        String type = student ? "Student": "Standard";
        System.out.println("Ticket: "+ FilmTitle + " [ "+ type +"] - $" + price);
    }
}