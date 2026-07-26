package SUPER_X_DEMO;
class Demo{
    Demo(){
        System.out.println("Constructor of Demo class");
    }

    void fun(){
        System.out.println("In fum method");

    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.fun();
    }
}