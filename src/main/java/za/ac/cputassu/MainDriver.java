package za.ac.cputassu;

public class MainDriver {

    public static  void main(String[] args)
    {
        Proxy proxy =new Proxy();
        FastThing fastThing =new FastThing();
        fastThing.sayHello();
        proxy.sayHello();

    }



}
