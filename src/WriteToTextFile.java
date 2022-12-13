import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteToTextFile {
    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter("src/user.txt", true));
            //asking users for their names, addresses, and ages
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your name:");
            String name = sc.nextLine();
            System.out.println("Please enter your address:");
            String address = sc.nextLine();
            System.out.println("Please enter your age:");
            int age = sc.nextInt();
            pw.printf("%s,%s,%d\n", name,address,age);
        }
        catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
        finally {
            if(pw!=null)
                pw.close();
        }
    }
}