import java.io.*;
import java.util.*;
import java.lang.*;

public class createFile {
  private static Formatter x;

  public static void openFile() {
    try {
      x = new Formatter("records.txt");
    } catch (Exception e) {
      System.out.println("Error:  can't create file");
    }
  }

  public static void addRecords() {
    x.format("%s%s%s", "7 ", " Ushran", " Gouhar");
  }

  public static void closeFile() {
    x.close();
  }
}
