class Person{
    private int a;
    Person(int a){
        this.a=a;
    }
    public void display(int age){
        System.out.println(age+a+"age + a");
    }
    
}
public class Demo extends Person{
    String name;
    int age;
     Demo(String N,int a,int pos){
        super(a);
        this.name=N;
        this.age=a;
    }
    void show(){
        System.out.println( "this is form ol "+name);
    }
    void show(int n){
        System.out.println( "this is form ol-1 "+age+n);
    }
    @Override
    public void display(int a){
        super.display(a);
        System.out.println("name "+name);
    }
    public static void main(String[] args) {
        Demo d=new Demo("devil", 19,1);
        d.display(d.age);
        d.show();
        d.show(200);
        System.out.println( "Executed success"); 

    }
}