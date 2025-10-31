public class OOPS {
    private class ExampleClass1 {
        String name="From class";
        int order=1;
        public void display() {
            System.out.println("Name: " + name + order);
        }
        //Example of class and encapsulation
        
    }
    public static void main(String[] args) {
        ExampleClass1 obj = new OOPS().new ExampleClass1(); //Creating object of inner private class
        obj.display();
    }
}