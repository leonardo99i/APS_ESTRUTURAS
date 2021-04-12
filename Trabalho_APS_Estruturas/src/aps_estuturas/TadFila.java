package aps_estuturas;

public class TadFila {

    //Atributo
    private double [] dados;
    private int tamVetor;
    private int posFinal;

    //Construtor
    public TadFila(int tamanhoMax){
        this.dados = new double[tamanhoMax];
        this.tamVetor = tamanhoMax;
        this.posFinal = -1;
    }    

    //Metodo
    public void destroyFila(){
        this.dados = null;
        System.gc();
    }

    public boolean isFull(){
        if(this.posFinal == this.tamVetor -1){
            System.out.println("Fila cheia");
            return true;
        }else{
            System.out.println("Filha não cheia");
            return false;
        }
    }

    public boolean isEmpty(){
        if(this.posFinal == -1){
            System.out.println("Fila vazia");
            return true;
        }else{
            System.out.println("Filha não vazia");
            return false;
        }
    }

    public void Enqueue(double valor){
        if(isFull()){
            System.out.println("Não inseriu.");
        }else{
            this.dados[this.posFinal + 1] = valor;
            this.posFinal++;
        }
    }

    public double Dequeue(){
        if(isEmpty()){
            System.out.println("Não remove");
            return 0;
        }else{
            double elemento = this.dados[0];
            for(int i = 0; i < this.posFinal; i++){
                this.dados[i] = this.dados[i+1];
            }
            this.posFinal--;
            return elemento;
        }
    }
}
