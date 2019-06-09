
package pkg12polimorfismo;
public abstract class Animal {
    // Atributos
    protected float peso;
    protected int indade;
    protected int menbro;
// Metodos Abstratos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

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
