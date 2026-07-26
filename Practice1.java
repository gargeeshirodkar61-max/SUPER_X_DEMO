package SUPER_X_DEMO;
class Demo{
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
        d.fun();
        Demo.run();
    }
}