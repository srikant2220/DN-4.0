package FactoryMethodPatternExample;
public class pd extends DocumentFactory{
    public PdfDocument createDocument(String type)
    {
        if(type.equalsIgnoreCase("pdf"))
        {
            return new pdf();
        }
        return null;
    }
}
