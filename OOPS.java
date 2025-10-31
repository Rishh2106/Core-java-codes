
public class OOPS {                                                       //Class
    abstract class OrderProcessor {
    // Abstract method: the implementation details are hidden.
    abstract void updateOrder(int orderUpdate);
    abstract void display();
}
    private class ExampleClass1 extends OrderProcessor {                 // Inheritance from abstract class
        String name = "From class";                                      // Encapsulation of data
        private int order = 1;

        @Override
        public void updateOrder(int orderUpdate) {
            if (orderUpdate > 50) {
                this.order = orderUpdate;
            }
        }

        @Override
        public void display() {
            System.out.println("Name: " + name + ", Order: " + order);
        }
    }

    public static void main(String[] args) {
        ExampleClass1 obj = new OOPS().new ExampleClass1();                   //Object
        obj.updateOrder(100); // Using the abstraction method to update the order
        obj.display(); // Using the abstraction method to display the order
    }
}
