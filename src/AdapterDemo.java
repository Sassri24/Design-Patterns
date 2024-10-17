// Old printer class that only prints text
class TextPrinter {
    public void printText(String text) {
        System.out.println("Printing text: " + text);
    }
}

// Adapter class to make the old printer print images
class ImagePrinterAdapter {
    private TextPrinter textPrinter;

    // Constructor to initialize the adapter with a TextPrinter instance
    public ImagePrinterAdapter(TextPrinter textPrinter) {
        this.textPrinter = textPrinter;
    }

    // Method to convert images to text and print using TextPrinter
    public void printImage(String image) {
        String convertedImage = "[Image converted to text: " + image + "]";
        textPrinter.printText(convertedImage);
    }
}

public class AdapterDemo {
    public static void main(String[] args) {
        // Create an instance of the old TextPrinter
        TextPrinter textPrinter = new TextPrinter();
        // Create an instance of ImagePrinterAdapter, passing the TextPrinter instance
        ImagePrinterAdapter adapter = new ImagePrinterAdapter(textPrinter);
        // Use the adapter to print an image
        adapter.printImage("Beautiful landscape");
    }
}
