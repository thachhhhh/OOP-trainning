public class Title{
    private String name;
    private int year;

    public Title(String name,int year){
        this.name = name;
        this.year = year;
    }
    public String getName(String name){return name;}
    public int getYear(int year){return year;}

    public int runningTime(){
        return 0;
    }
    public void printInfo(){
        System.out.println(name + " ("+ year + ")"+ " - "+ runningTime()+ " min");
    }
}