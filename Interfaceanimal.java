interface Animal{
    void makesound();
    String species="mammals";
}
class Dog implements Animal{
   public void makesound(){
      System.out.println("Bark");
   }
}
class Cat implements Animal{
   public void makesound(){
     System.out.println("Meow");
   }
}
public class Interfaceanimal{
   public static void main(String[] args){
     Animal dog=new Dog();
     Animal cat=new Cat();
     dog.makesound();
     cat.makesound();
     System.out.println("Dog species:"+Animal.species);
     System.out.println("Cat species:"+Animal.species);
  }
}  
            
      
    
