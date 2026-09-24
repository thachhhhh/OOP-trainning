public class PlayTime{
    private int hours;
    private int minutes;
    
    private void Validate(int hours,int minutes){
        if(hours <0 && minutes <0){
            System.out.println("Hours and Minutes cannot be negative");
            System.exit(1);
        } else if (hours <0){
            System.out.println("Hours cannot be negative");
            System.exit(1);
        } else if (minutes <0){
            System.out.println("Minutes cannot be negative");
            System.exit(1);
        }
    }

    public int GetHours(){
        return hours;
    }
    public void setHours(int hours){
            this.hours = hours;
        
    }
// ----------------------------------------
     public int GetMinutes(){
        return minutes;
    }
    public void setMinutes(int minutes){ 
        this.minutes = minutes;
    }

    public void print(){
            Validate(this.hours,this.minutes);
            System.out.println( hours + " h "+ minutes +" min");
    }
    public PlayTime add(PlayTime other){
        int TotalMinutes = (this.hours * 60 + this.minutes)+(other.hours*60+other.minutes);
        PlayTime result = new PlayTime();
        result.setHours(TotalMinutes /60);
        result.setMinutes(TotalMinutes%60);
        return result;
    }
    public PlayTime subtract(PlayTime other){
        int TotalMinutes = (this.hours*60+this.minutes)-(other.hours*60+ other.minutes);
        if(TotalMinutes <0){
            System.out.println("Total Minutes cannot be negative");
            PlayTime result = new PlayTime();
            result.setHours(0);
            result.setMinutes(0);
            return result;
        }
        PlayTime result = new PlayTime();
        result.setHours(TotalMinutes/60);
        result.setMinutes(TotalMinutes%60);
        return result;
    }
        
}
