package FactoryMethodPatternExample;
public abstract class DocumentFactory<T> {
    public abstract T createDocument(String type);
}
