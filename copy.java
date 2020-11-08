import java.io.*;

// Copying characters from one file into another
public class copy {

  public static void main(String[] args) {
    // Declare and create input an output files
    File inFile = new File("input.dat");
    File outFile = new File("output.dat");

    // Creating file streams
    FileReader ins = null;
    FileWriter outs = null;

    try {
      ins = new FileReader(inFile);
      outs = new FileWriter(outFile);

      // Read and write till the end

      int ch;
      while ((ch = ins.read()) != -1) {
        outs.write(ch);
      }
    } catch (Exception e) {
      System.out.println(e);
      System.exit(-1);
    }
    // Closing files
    finally {
      try {
        ins.close();
        outs.close();
      } catch (IOException e) {

      }
    }
  }
}
