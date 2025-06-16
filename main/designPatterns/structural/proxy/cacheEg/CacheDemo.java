package main.designPatterns.structural.proxy.cacheEg;

public class CacheDemo {
    public static void main(String[] args) {
        CacheProxy cacheProxy = new CacheProxy();
        System.out.println(cacheProxy.checkData("data"));
        System.out.println(cacheProxy.checkData("data"));
    }
}
