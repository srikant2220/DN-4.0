package FactoryMethodPatternExample;
public class ed extends DocumentFactory {
    public ExcelDocument createDocument(String type)
    {
        if(type.equalsIgnoreCase("excel"))
        {
            return new excel();
        }
        return null;
    }   
}
