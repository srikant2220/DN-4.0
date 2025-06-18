package SingletonPatternExample;
class Logger {
    private static Logger instance;
    private Logger()
    {
    }
    public static Logger get()
    {
        if(instance==null)
        {
            instance=new Logger();
        }
        return instance;
    }    
}
