public class Documentary extends Film {
    private String topic;
    public Documentary(String name,int year,int duration,String topic){
        super(name,year,duration);
        this.topic = topic;
    }
    public String getTopic(){return topic;}
    @Override
    public String kind(){return "Documentary";}
    @Override
    public String toString(){
        return super.toString() + " [" + topic + "] ";
    }
}