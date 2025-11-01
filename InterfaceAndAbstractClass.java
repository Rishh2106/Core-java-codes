public class InterfaceAndAbstractClass {
    public interface MyInterface {                                           //Interface
        void information();
        String greet(String greetName);
    }
    abstract class MyAbstractClass {                                          //Abstract class
        abstract void absDisplay();
        int age;
        void personInfo(String name, int age){
            System.out.println("Bleh bleh");
        }
        
    }
    public class absClassExample extends MyAbstractClass {                     //Inheritance from abstract class
        void absDisplay() {
            System.out.println("This is the implemented from the abstract class");
        }
        void personInfo(String name, int age){                              //Overriding the method in the abstract class
            System.out.println("Name: " + name + ", Age: " + age);
            
        }                                                                   //Everything in the abstract doesn't need to be implemented in the class that inherits the abstract class
    }
    private class InnerClass implements MyInterface {                           //Implementation of interface
        public void information() {
            System.out.println("This is the implemented from the interface");
        }
       
        public String greet(String greetName) {                              //Every method in an interface should be implemented in the class that implements the interface
            return "Hello " + greetName;
        }
    }
    public static void main(String[] args) {
        InnerClass obj = new InterfaceAndAbstractClass().new InnerClass();
        obj.information();
        System.out.println(obj.greet("Rishi"));
        absClassExample obj2 =new InterfaceAndAbstractClass().new absClassExample();
        obj2.absDisplay();
        obj2.personInfo("Rishi", 20);
    }
    
}
