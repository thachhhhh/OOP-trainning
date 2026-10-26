public class Screening {
    private Film film; // Composition: Screening HAS a film
    private String room;
    private String date;
    private int sold;

    public Screening(Film film, String room,String date){
        this.film = film;
        this.room = room;
        this.date = date;
        this.sold = 0;
    }
    public void sell(int n){
        if (n>0){
            this.sold +=n;
        }
    }
    public int runningTime(){
        return film.runningTime();
    }
    public int getSold(){return sold;}
    public Film getFilm(){return film;}
    public String getRoom(){return room;}
    public String getDate(){return date;}
    @Override
    public String toString(){
        return "Screening: " + film.getName() + " @ " + room + ", " + date;
    }

}