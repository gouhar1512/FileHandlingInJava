import java.io.*;

public class ReadWriteIntegers {
  public static void main(String[] args) {
    // Declare data streams
    DataInputStream dis = null;
    DataOutputStream dos = null;

    // Construct a file
    File intFile = new File("rand.dat");

    // Writing integers to rand.dat file
    try {
      // Create output stream for intFile file
      dos = new DataOutputStream(new FileOutputStream(intFile));
      for (int i = 0; i < 20; i++) {
        dos.writeInt((int) (Math.random() * 100));
      }
    } catch (IOException ioe) {
      System.out.println(ioe.getMessage());
    } finally {
      try {
        dos.close();
      } catch (IOException ioe) {

      }
    }

    // Reading integers from rand.dat file

    try {
      // Create input stream for intFile file
      dis = new DataInputStream(new FileInputStream(intFile));
      for (int i = 0; i < 20; i++) {
        int n = dis.readInt();
        System.out.print(n + " ");
      }
    } catch (IOException ioe) {
      System.out.println(ioe.getMessage());

    } finally {
      try {
        dis.close();
      } catch (IOException ioe) {

      }
    }
  }
}
