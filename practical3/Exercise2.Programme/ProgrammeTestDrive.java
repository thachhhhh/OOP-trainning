public class ProgrammeTestDrive{
    public static void main(String[] args){
        Title[] programme = new Title[3];
        programme[0] = new Film("Dune",2021,155);
        programme[1] = new Series("Bluey",2018,9,7);
        programme[2] = new ShortFilm("The Neighbors' Window",2019,20);
        int total = 0;
        for (Title t:programme){
            System.out.println(t);
            total = total + t.runningTime();
        }
        System.out.println("Total: " + total + " min");
        Title longest = programme[0];
        for (Title t : programme){
            if(t.runningTime()> longest.runningTime()){
                longest = t;
            }
        }
        System.out.println("Longest: "+ longest.getName());
    }
}