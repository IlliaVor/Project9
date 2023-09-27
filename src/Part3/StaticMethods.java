package Part3;

public class StaticMethods {
    public static int staticVar;

    public static void staticMethod() {
        System.out.println(
                "This is a static method. Static variable: " + staticVar);
                 //nonStaticMethod(); // The result will be error
    }

    public void nonStaticMethod() {
        System.out.println(
                "This is a non-static method. Static variable: " + staticVar);
                 staticMethod();
    }
    static void accessStaticMethod() {
        System.out.println("Inside static method");
        staticMethod();

    }

    public static void main(String[] args) {

        StaticMethods.staticVar = 5;
        System.out.println(
                "Static variable using class name: " +
                        StaticMethods.staticVar);


        StaticMethods obj1 = new StaticMethods();
        StaticMethods obj2 = new StaticMethods();


        obj1.staticVar = 20;


        System.out.println("Static variable obj1: " + obj1.staticVar);
        System.out.println("Static variable obj2: " + obj2.staticVar);


        StaticMethods.staticMethod();


        obj1.nonStaticMethod();
        obj1.accessStaticMethod();


    }
}


