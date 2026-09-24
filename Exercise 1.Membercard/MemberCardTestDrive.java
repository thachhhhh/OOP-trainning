public class MemberCardTestDrive{
    public static void main(String[] args){
        MemberCard card = new MemberCard();
        card.Setnem("thach");
        card.setStudentId("2511019");
        card.setEmail("tranbaothach2007@gmail.com");

        System.out.println("Name: "+ card.getName());
        System.out.println("StudentId: "+ card.getStudentId());
        System.out.println("Email: "+ card.getEmail());
    }
}
