public class MemberTestDrive{
    public static void main(String[] args){
        Member linh = new Member("Linh","BI13-123");
        Member linhCopy = new Member("Linh Tran","BI13-123");
        VipMember an = new VipMember("An","BI13-456",20.0);
        Member[] members={linh,an};
        double baseTicketPrice = 5.0;
        double total =0;
        for (Member m:members){
            System.out.println(m);
            System.out.println("+) A ticket("+ m.price(baseTicketPrice)+"$) - "+m);
            System.out.println("------------------------------------------------");
            total += m.price(baseTicketPrice);
        }
        System.out.println(members.length + " tickets, Total: "+total+ "$");

        System.out.println("=== EQUALS TESTS ===");
        //a
        System.out.println("linh.equals(null): "+ linh.equals(null));
        //b
        System.out.println("linh.equals('BI3-123'): "+ linh.equals("BI13-123"));
        //c
        VipMember hacker = new VipMember("Hacker","348B123",150);
        System.out.println("Attack (c) 150% discount member: " + hacker);
        System.out.println("Price paid for 5.0$ ticket: "+ hacker.price(5.0)+ "$");

    }
}