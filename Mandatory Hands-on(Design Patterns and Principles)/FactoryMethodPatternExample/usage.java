package FactoryMethodPatternExample;
public class usage {
    public static void main(String[] args)
    {
        wd obj1=new wd();
        WordDocument w=obj1.createDocument("word");
        w.storedata();//Output: Storing in Word Document
        pd obj2=new pd();
        PdfDocument p=obj2.createDocument("pdf");
        p.storedata();//Output: Storing in pdf document
        ed obj3=new ed();
        ExcelDocument e=obj3.createDocument("excel");
        e.storedata();//Output: Storing in excel document
    }
}
