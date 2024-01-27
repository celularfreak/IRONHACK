/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce your name");

        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Now introduce your age");
        int age = scanner.nextInt();

        while (age < 0) {
            System.err.println("Your age cannot be negative");
            age = scanner.nextInt();
        }

        if(age > 18) {
            System.out.println("Welcome this app");
        } else {
            System.out.println("Access forbidden");
        }

        scanner.close();

    }
}*/


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // Open file to be written in
        FileWriter writer = new FileWriter("demo.txt", true);

        // Write in file
        writer.write("Hello file! \n");
        writer.write("Second line! \n");

        // Create a file if not exist or update the content of the writer
        writer.close();

        // Open file
        File file = new File("demo.txt");
        // Create a scanner object to iterate over the file
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            System.out.println(data);
        }

        // Close buffer
        scanner.close();
    }
}
