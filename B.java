
public class B extends A {
    B() {
        System.out.println ("Konstruktor B dijalankan ");
        var_a = "Var_a dari class B";
        var_b = "Var_a dari class B";
        
    }
    
    public static void main (String[] args) {
        System.out.println("Object A dibuat");
        A aa = new A();
        System.out.println("Menampilkan nama varibael dari object aa");
        System.out.println(aa.var_a);
        System.out.println(aa.var_b);
        System.out.println(aa.var_c);
        System.out.println(aa.var_d);
        System.out.println("");
        
        System.out.println("oject B dibuat");
        B bb = new B();
        System.out.println("Menampilkan nama variabel object bb");
        System.out.println(aa.var_a);
        System.out.println(aa.var_b);
        System.out.println(aa.var_c);
        System.out.println(aa.var_d);
        System.out.println("");
        
        
    }
    
}
