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

    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.x);
        d.fun();
        Demo.run();
    }
}