package SingletonPatternExample;
class testclass {
    public static void main(String[] args) {
        //Logger obj=new Logger(); //we cannot create instance of Logger class from another class since it is a private static instance of the Logger class
        Logger obj1=Logger.get();
        Logger obj2=Logger.get();
        System.out.println(obj1);//both the objects are referring
        System.out.println(obj2);//to the same instance of Logger class
    }    
}
