public class ScreeningTestDrive{
    public static void main(String[] args){
        Film dune = new Film("Dune",2021,155);
        //Pass Film into Screening constructor: Composition
        Screening s = new Screening(dune,"2H-201","2026-10-03 19:00");
        s.sell(12);
        System.out.println(s);
        System.out.println(s.getFilm());

        System.out.println("Running time: "+ s.runningTime() + " min");
    }
}