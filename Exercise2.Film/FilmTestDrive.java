public class FilmTestDrive{
    
    public static void main(String[] args){
        Film movie1 = new Film();
        movie1.setTitle("Dune");
        movie1.setYear(2021);
        movie1.setDuration(155);
        movie1.play();
        Film movie2 = new Film();
        movie2.setTitle("The Odyssey");
        movie2.setYear(2026);
        movie2.setDuration(173);
        movie2.play();

    }
}