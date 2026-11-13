public class student {
    private int id;
    void getter(){
        System.out.println(id);
    }
    void setter(int id){
        this.id=id;
    }
}
class Main{
    public static void main(String[] args) {
        student s=new student();
        s.setter(101);
        s.getter();
    }
}
    
    
    
    

