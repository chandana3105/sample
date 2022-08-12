package oops;

class Pets{
    public void display(){
        System.out.println("Pets");
    }
}
class Dogs extends Pets{
public void pet1() {
System.out.println("German Shepherd");
}
public void pet1(String dogname) {
System.out.println(dogname);
}
}
class Animal {
    private String type;
    private String name;
   
    public void setType(String type){
        this.type = type;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getType(){
   
    return type;
    }
    public String getName(){
        return name;
    }

}
abstract class Animals{
    public abstract void move();
   
}
    class lion extends Animals {
        public void move(){
            System.out.println("move");
        }
    }

public class ooptask{
    public static void main(String[] args){
        Animal obj = new Animal();
        Pets b=new Pets();
        Dogs d = new Dogs();
        d.pet1();
        d.pet1("Golden Retriever");
        b.display();
        obj.setType("pisces");
        obj.setName("fish");
        System.out.println(obj.getType());
        System.out.println(obj.getName());
        Animals myobj=new lion();
        myobj.move();
       
    }
}
