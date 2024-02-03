package main.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEg {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.id = 1;
        emp.name = "vamsi";
        emp.city = "hyd";

        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\vamsitallapudi\\Desktop\\EmpSerialized.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.close();
            fos.close();
            System.out.println("Serialized data is saved in EmpSerialized.txt on Desktop");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
