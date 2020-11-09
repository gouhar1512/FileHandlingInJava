import java.io.*;

class Student implements Serializable {
  String name;
  int rollNo;
  String branch;

  public Student(String argName, int argRollNo, String argBranch) {
    this.name = argName;
    this.rollNo = argRollNo;
    this.branch = argBranch;
  }

  public void showDetails() {
    System.out.printf("%s %s %s\n", name, rollNo, branch);
  }
}

public class ReadWriteObject {
  public static void main(String[] args) {
    // Declare data streams
    ObjectInputStream dis = null;
    ObjectOutputStream dos = null;

    // Construct a file
    File objFile = new File("studentData.dat");

    // Writing integers to rand.dat file
    try {
      Student s1 = new Student("Ushran", 141, "ECE");
      Student s2 = new Student("Aman", 224, "CSE");
      Student s3 = new Student("Mohit", 245, "CSE");
      // Create output stream for intFile file
      dos = new ObjectOutputStream(new FileOutputStream(objFile));
      dos.writeObject(s1);
      dos.writeObject(s2);
      dos.writeObject(s3);
      dos.writeObject(null); // to mark end of file
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
      dis = new ObjectInputStream(new FileInputStream(objFile));
      Student s = null;
      while (true) {
        s = (Student) dis.readObject();
        if (s == null) {
          break;
        }
        s.showDetails();

      }
    } catch (IOException ioe) {
      System.out.println(ioe.getMessage());

    } catch (ClassNotFoundException cfe) {
      System.out.println(cfe.getMessage());
    }

    finally {
      try {
        dis.close();
      } catch (IOException ioe) {

      }
    }
  }
}

// how to serialize object data and why required
