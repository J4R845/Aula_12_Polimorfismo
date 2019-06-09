
package pkg12polimorfismo;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        a.locomover();
        p.locomover();
        r.locomover();
    }
    
}
