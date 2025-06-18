package FactoryMethodPatternExample;
public class wd extends DocumentFactory{
    public WordDocument createDocument(String type)
    {
        if(type.equalsIgnoreCase("word"))
        {
            return new word();
        }
        return null;
    }
}
