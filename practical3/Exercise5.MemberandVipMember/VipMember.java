public class VipMember extends Member{
    private double discountPercent;
    public VipMember(String name,String studentId,double discountPercent){
        super(name,studentId);
        setDiscountPercent(discountPercent);
    }
    public double getDiscountPercent(){
        return discountPercent;
    }
    @Override
    public double price(double basePrice){
        return basePrice*(1.0-discountPercent/100);
    }

    @Override
    public String toString(){
        return super.toString() + "VIP " + (int) discountPercent + "%";
    }
    public void setDiscountPercent(double discountPercent){
        if (discountPercent >=100){
            this.discountPercent = 100;
        } else if(discountPercent < 0){
            this.discountPercent = 0;
        } else {
            this.discountPercent = discountPercent;
        }
    }
}