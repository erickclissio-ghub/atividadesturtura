public class NodoArvore {

    private int valor;
    private NodoArvore esquerda;
    private NodoArvore direita;

    public NodoArvore(int valor, NodoArvore esquerda, NodoArvore direita) {
        this.valor = valor;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoArvore getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NodoArvore esquerda) {
        this.esquerda = esquerda;
    }

    public NodoArvore getDireita() {
        return direita;
    }

    public void setDireita(NodoArvore direita) {
        this.direita = direita;
    }
}
