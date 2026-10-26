public class PlayTimeTestDrive {
public static void main(String[] args) {
PlayTime film = new PlayTime();
film.setHours(2);
film.setMinutes(35);
PlayTime shortFilm = new PlayTime();
shortFilm.setHours(0);
shortFilm.setMinutes(20);

film.print();//2h35
shortFilm.print();//0h20

PlayTime doubleBill = film.add(shortFilm);// other minutes
doubleBill.print();//2h55
PlayTime gap = film.subtract(shortFilm);//2h15
gap.print(); //gap between short and long movies
film.print(); //the long movie
}
}