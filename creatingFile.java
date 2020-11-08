import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class creatingFile {
  public static void main(String[] args) {

    // Method 1
    try {
      // Declare a file stream object
      FileInputStream fis;

      // Assign the filename to the file stream object
      fis = new FileInputStream("test.dat");
    } catch (IOException e) {

    }

    // Method 2

    // Declare a file object
    File inFile;

    // Assign the filename to the file object
    inFile = new File("test.dat");

    try {
      // Declare a file stream object
      FileInputStream fis;

      // Give the value of the file object to the
      // file stream object
      fis = new FileInputStream(inFile);
    } catch (IOException e) {

    }
  }
}
