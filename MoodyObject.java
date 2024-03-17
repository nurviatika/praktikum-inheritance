
public class MoodyObject {
    protected String getMood () {
        return "Moody";
    }
    
    public void speak() {
        System.out.println ("aku" + getMood());
    }
    
    void laugh() {}
    void cry() {}
    
}
