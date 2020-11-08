import java.io.*;

public class CopyBytes {

  public static void main(String[] args) {
    // Declare input and output file streams
    FileInputStream inFile = null;
    FileOutputStream outFile = null;

    // Declare a variable to hold a byte
    byte byteRead = 0;
    try {
      // Connect inFile to in.dat
      inFile = new FileInputStream("in.dat");

      // Connect outFile to out.dat
      outFile = new FileOutputStream("out.dat");

      // Reading bytes from in.dat and writing it to out.dat
      while (true) {
        byteRead = (byte) inFile.read();

        if (byteRead == -1)
          break;

        outFile.write(byteRead);
      }
    } catch (FileNotFoundException e) {
      System.out.println("\nFile not found");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        // Close files
        inFile.close();
        outFile.close();
      } catch (IOException e) {
      }
    }
  }
}