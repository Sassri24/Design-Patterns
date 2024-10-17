class PrinterManager {
    // Create a private static instance of the same class
    private static PrinterManager instance;

    //  Make the constructor private so that this class cannot be instantiated
    private PrinterManager() {}

    //  Create a public static method that returns the instance of the class, ensuring it is created only once
    public static PrinterManager getInstance() {
        // If instance is null, create a new instance
        if (instance == null) {
            instance = new PrinterManager();
        }
        // Return the single instance of PrinterManager
        return instance;
    }

    //  Define a method to print messages
    public void print(String message) {
        System.out.println(message);
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        //  Get the single instance of PrinterManager
        PrinterManager manager = PrinterManager.getInstance();
        // Use the instance to print a document
        manager.print("Printing document...");
    }
}
