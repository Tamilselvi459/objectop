package class1;

public class example2 extends example{
    int num;
    public example2(String name, int age, String address){
        super(name , age);
        this.address = address;

    }
    public void fun(int number){
        System.out.println("Method is overriding");
    }
}
