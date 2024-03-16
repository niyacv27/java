class Product{
    int pcode;
    String pname;
    double price;

Product(int pcode,String pname,double price){
    this.pcode=pcode;
    this.pname=pname;
    this.price=price;
}
}
class ProductMain{
    public static void main(String args[]){
        Product p1=new Product(1,"Product 1",20.50);
        Product p2=new Product(2,"Product 2",35.75);
        Product p3=new Product(3,"Product 3",3.55);
        
        Product lowestProduct;
        if(p1.price<p2.price && p1.price<p3.price){
            lowestProduct=p1;
        }
        else if(p2.price<p1.price && p2.price<p3.price)
        lowestProduct=p2;
    
    else{
        lowestProduct=p3;
        
    }
    System.out.println("The lowest product is : "+lowestProduct.pname +" with price "+lowestProduct.price);
}
}
