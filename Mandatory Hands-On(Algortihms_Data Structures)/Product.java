package Algorithms.Exercise2;
import java.util.*;
public class Product {
    int productId;
    String productName,category;

    public void linearSearch(int s,Product list[])
    {
        int f=0;
        for(int i=0;i<5;i++)
        {
            if(list[i].productId==s)
            {
                System.out.println("Product found");
                System.out.println("Displaying details...");
                System.out.println(list[i].productId);
                System.out.println(list[i].productName);
                System.out.println(list[i].category);
                f=1;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("Product not found");
        }
    }

    public void binSearch(int s, Product list[])
    {
        int temp;
        String t;
        //implementing Selection Sort technique
        for(int i=0;i<list.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<list.length;j++)
            {
                if(list[j].productId<list[min].productId)
                {
                    min=list[j].productId;
                }   
            }
            temp=list[i].productId;
            list[i].productId=list[min].productId;
            list[min].productId=temp;
            t=list[i].productName;
            list[i].productName=list[min].productName;
            list[min].productName=t;
            t=list[i].category;
            list[i].category=list[min].category;
            list[min].category=t;
        }
        //Now implementing Binary search on sorted array
        int l=0,u=list.length-1,mid=0,f=0;
        while(l<=u)
        {
            mid=(l+u)/2;
            if(list[mid].productId==s)
            {
                System.out.println("Product found");
                f=1;
                break;
            }
            else if(s<list[mid].productId)
            {
                u=u-mid;
            }
            else if(s>list[mid].productId)
            {
                l=l+mid;
            }
        }
        if(f==1)
        {
            System.out.println("Displaying details...");
            System.out.println(list[mid].productId);
            System.out.println(list[mid].productName);
            System.out.println(list[mid].category);
        }
        else
        {
            System.out.println("Product not found");
        }
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int s,size,ch;
        System.out.println("Enter total no. of products : ");
        size=in.nextInt();
        Product list[]=new Product[size];
        for(int i=0;i<size;i++)
        {
            list[i]=new Product();
        }
        System.out.println("Enter details of products : ");
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter id, name and category of product "+(i+1)+": ");
            list[i].productId=in.nextInt();
            in.nextLine();
            list[i].productName=in.nextLine();
            list[i].category=in.nextLine();
        }
        do
        {
            System.out.println("Enter product id to be searched : ");
            s=in.nextInt();
            Product obj=new Product();
            obj.linearSearch(s, list);
            Product obj1=new Product();
            obj1.binSearch(s, list);
            System.out.println("Press 1 to continue or 0 otherwise : ");
            ch=in.nextInt();
        }while(ch==1);
        System.out.println("Thank You!");
    }
}
