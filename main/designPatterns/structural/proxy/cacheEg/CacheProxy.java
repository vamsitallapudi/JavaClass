package main.designPatterns.structural.proxy.cacheEg;

import java.util.HashMap;
import java.util.Map;

public class CacheProxy implements Data {
    Map<String, String> map = new HashMap<>();
    @Override
    public String checkData(String data) {
        if(map.containsKey(data)) {
            System.out.println("through cache");
            return map.get(data);
        } else {
            System.out.println("through real-time");
            RealData realData = new RealData();
            map.put("data", realData.checkData(data));
            return map.get(data);
        }
    }
}
