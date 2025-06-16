package main.designPatterns.structural.proxy.cacheEg;

public class RealData implements Data {
    @Override
    public String checkData(String data) {
        return "realData";
    }
}
