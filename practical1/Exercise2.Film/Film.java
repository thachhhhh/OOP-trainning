public class Film{
        private String title;
        private int year;
        private int duration;
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
            this.title = title;
            
    }
//---------------------------------------------
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
//---------------------------------------------
    public int getDuration(){
        return duration;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }
//---------------------------------------------
    public void play(){
        boolean TitleNotValid = (title == null || title.trim().isEmpty());
        boolean YearNotValid =(year <= 0 );
        boolean DurationNotValid = (duration <= 0);
        if (TitleNotValid && YearNotValid || TitleNotValid && DurationNotValid || YearNotValid && DurationNotValid){
            System.out.println("Error: Multiple invalid fields provided. Cannot play film.");
            return;
        } else if(TitleNotValid){
            System.out.println("A title cannot be null or empty");
            return;
        } else if(YearNotValid){
            System.out.println("Year cannot be zero or negative");
            return;
        } else if(DurationNotValid){
            System.out.println("Duration cannot be zero or negative");
            return;
        }
        System.out.println("Now playing "+ title + " ("+ year + "), "+ duration +" min");
    }
    
//---------------------------------------------
    }
