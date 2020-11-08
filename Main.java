/////////////// Checking for file if it exists

// import java.io.File;
// public class Main {
// public static void main(String[] args) {
// File x = new File("input2.txt");
// if (x.exists()) {
// System.out.println(x.getName() + " exists!");
// } else {
// System.out.println("Doesn't exist");
// }
// }
// }

////////////// Creating file
import java.util.*;

public class Main {
  public static void main(String[] args) {
    // createFile g = new createFile();
    createFile.openFile();
    createFile.addRecords();
    createFile.closeFile();
  }
}