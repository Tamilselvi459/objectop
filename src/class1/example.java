package class1;


public class example {
    String name;
    int age;
    String address;
    public example(String name, int age){
        this.name = name;
        this.age = age;
    }
   public  example(){}

    public void fun(int number){
        System.out.println("Method is overloading with parameter with integer");
    }


    public void function() {
        System.out.println("Method overloading with empty parameter ");
    }
}
