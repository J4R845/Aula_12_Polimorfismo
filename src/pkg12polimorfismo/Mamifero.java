
package pkg12polimorfismo;
public class Mamifero extends Animal {
    
    private String corPelo;

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");       
    }
    
    
    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getIndade() {
        return indade;
    }
    public void setIndade(int indade) {
        this.indade = indade;
    }
    public int getMenbro() {
        return menbro;
    }
    public void setMenbro(int menbro) {
        this.menbro = menbro;
    }
}
