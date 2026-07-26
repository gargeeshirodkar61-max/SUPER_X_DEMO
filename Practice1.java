package SUPER_X_DEMO;
class Demo{
    int x=50;
    Demo(){
        System.out.println("Constructor of Demo class");
    }

    void fun(){
        System.out.println("In fun method");

    }

    static void run(){
        System.out.println("In run method");
    }
}

class Child extends Demo{
    int x=100;
    Child(){
        System.out.println("Constructor of Child class");
    }

    void gun(){
        System.out.println("In gun method" + x);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.x);
        d.fun();
        Demo.run();

        Child c = new Child();
        System.out.println(c.x);
        c.gun();
    }
}