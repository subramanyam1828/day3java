public class encapsulation {
    private int amount=0;
    void getter(){
        System.out.println(amount);
    }
    void setter(int num){
        amount=num;
    }
}
class Main{
    public static void main(String[] args) {
        encapsulation us=new encapsulation();
        us.setter(1000);
        us.getter();
        
    }
}
    
    
    

