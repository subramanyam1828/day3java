public class user {
    void salary(double a,double b){
        System.out.println("parameter1");
    }
    void salary(){
        System.out.println("parameter2");
    }
    void salary(double a){
        System.out.println("parameter3");
   
    }
    void salary(double a,double b,double c){
        System.out.println("parameter4");
    }
    class Main{
        public static void main(String[] args) {
            user us=new user();
            us.salary(89000,78000);
            us.salary();
            us.salary(100000);
            us.salary(34000,56000,780000);
        }
                }
    }
    

    
    

