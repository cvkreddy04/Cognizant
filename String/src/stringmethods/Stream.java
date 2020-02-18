package stringmethods;
import java.util.*;
interface Addable{
	int add(int a,int b);
}
import java.util.stream.Collectors;  
class Product{  
    int id;
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class Stream {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));
        Collections.sort(productsList,(p1,p2)->{  
            return p1.name.compareTo(p2.name);  
            });  
            for(Product p:productsList){  
                System.out.println(p.id+" "+p.name+" "+p.price);  
            }  

Addable a1=(a,b)->(a+b);
System.out.println(a1.add(10,20));     
        }  
}
    


       /* List<Float> productPriceList2 =productsList.stream()  
                                     .filter(p -> p.price > 30000)// filtering data  
                                     .map(p->p.price)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
        System.out.println(productPriceList2);  
    }  
}  */