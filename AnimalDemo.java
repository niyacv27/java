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
public class AnimalDemo{
   public static void main(String[] args){
     Dog dog=new Dog();
     Cat cat=new Cat();
     dog.makesound();
     cat.makesound();
     System.out.println("Dog species:"+Animal.species);
     System.out.println("Cat species:"+Animal.species);
  }
}  
            
      
    
