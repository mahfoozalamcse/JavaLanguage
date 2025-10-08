package AdvanceJava3;

import java.io.*;

// object file handeling

class Student implements Serializable {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class SerializeDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s = new Student("John", 101);

        // Serialize object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(s);
        }

        // Deserialize object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student s2 = (Student) ois.readObject();
            System.out.println("Name: " + s2.name + ", ID: " + s2.id);
        }
    }
}

