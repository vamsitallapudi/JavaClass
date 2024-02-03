package main.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEg {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Deserializing Employee..");
        Employee employee = null;
            FileInputStream fis = new FileInputStream("C:\\Users\\vamsitallapudi\\Desktop\\EmpSerialized.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            employee = (Employee) ois.readObject();
            ois.close();
            fis.close();
        System.out.println("Name of employee: " + employee.name);
        System.out.println("City of employee: " + employee.city);

    }
}
