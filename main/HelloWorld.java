package main;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

/**
 * HelloWorld
 */
public class HelloWorld {

    public Map<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {

       HelloWorld helloWorld = new HelloWorld();
        helloWorld.loadMap();
        String ans = helloWorld.findLocation(5076);
        System.out.println(ans);
    }

    public int calculateArea(int length, int breadth) {
        return length * breadth;
    }
    public String findLocation(int pincode) {
        // to find location based on pincode
        String location = map.get(pincode);
        return location;
    }
    public void loadMap() {
        map.put(5084, "KPHB");
        map.put(5091, "JNTU");
        map.put(5076, "Kondapur");
    }

}