package canetateste;

public class Caneta {
    private String marca;
    private String cor;
    private float tamanho;
    
    void Caneta() {
        this.cor = null;
        this.marca = null;
        this.tamanho = 0;
    }
    public String getCor() {
        return this.cor;
    }
    public String getMarca() {
        return this.marca;
    }
    public float getTamanho() {
        return this.tamanho;
    }
    public void setCor(String c) {
        this.cor = c;
    }
    public void setMarca(String m) {
        this.marca = m;
    }
    public void setTamanho(float t) {
        this.tamanho = t;
    }
    @Override
    public String toString() {
        return "Marca: " + getMarca() + 
                ", Cor: " + getCor() + 
                ", Tamanho: " + getTamanho();
    }
}