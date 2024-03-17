
public class MoodyTest {
    public static void main (String[] args) {
        MoodyObject m = new MoodyObject();
        m.speak (); // test Parent class
        
        m = new HappyObject(); // test inheritance sebuah class
        m.speak();
        m.laugh();
        
        m = new SadObject();  // test inheritance sebuah class
        m.speak();
        m.cry();
        
    }
    
}
