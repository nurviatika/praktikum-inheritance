
public class Parent03 {
    String ParentName;
    Parent03 (){}
    
    Parent03 (String ParentName) {
        this.ParentName = ParentName;
        System.out.println("Konstruktor Parent");
    }
}

class Baby extends Parent03 {
    String babyName;
    
    Baby (String babyName) {
        super();
        this.babyName = babyName;
        System.out.println("Konstruktor Baby");
        System.out.println(babyName);
    }
    
    public void cry () {
        System.out.println("huhu huhu");
    }
}
