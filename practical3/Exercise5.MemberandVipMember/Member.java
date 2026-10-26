public class Member{
    private String name;
    private String studentId;
    private double basePrice;
    public Member(String name,String studentId){
        this.name = name;
        this.studentId = studentId;
    }
    public String getName(){return name;}
    public String studentId(){return studentId;}
    public double price(double basePrice){
        return basePrice;
    }
    public String toString(){
        return name +"("+ studentId +") ";
    }
    public boolean equals(Object o){
        if(this == o){
            return true;
        }

        if (!(o instanceof Member)){
            return false;
        }
        
        Member other = (Member) o;

        return java.util.Objects.equals(this.studentId,other.studentId);
    }
}