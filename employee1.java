import java.util.Scanner;
public class employee1 {
    private String name;
    private int id;
    private double amount;
    void getter()
    {
        System.out.println(name);
        System.out.println(id);
        System.out.println(amount);
    }
    void setter(String n,int i,double s)
    {
        name=n;
        id=i;
        amount=s;
    }

}
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        employee1 e=new employee1();
        System.out.println("enter name:");
        String a=sc.nextLine();
        System.out.println("enter id:");
        int b=sc.nextInt();
        System.out.println("enter amount:");
        double c=sc.nextDouble();
        e.setter(a,b,c);
        e.getter();
    }
}
