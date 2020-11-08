import java.io.*;

public class writingBytes {

  public static void main(String[] args) {
    byte cities[] = { 'D', 'E', 'L', 'H', 'I', '\n', 'M', 'U', 'M', 'B', 'A', 'I' };

    // Create an output file stream
    FileOutputStream outFile = null;
    try {
      // Connect the output stream to city.txt
      outFile = new FileOutputStream("city.txt");

      // Write data to the stream
      outFile.write(cities);
      outFile.close();
    } catch (IOException e) {
      System.out.println(e);
      System.exit(-1);
    }
  }
}
