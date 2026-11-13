public class user1 {
    void name(){
        System.out.println("FUNCTION1");
    }
}
 class user2 extends user1{
    void name(){
        System.out.println("FUNCTION2");
    }
}
class Main{
    public static void main(String[] args) {
        user1 us=new user1();
        us.name();
        user2 us2=new user2();
        us2.name();
    }
    }
    
    

