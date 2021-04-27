package aps_estuturas;

import java.util.Random;

public class Teste{
    public static void main(String[] args) {
        TadFila fila_Comum = new TadFila(60);
        TadFila fila_Prioridade = new TadFila(60);
        int numeros = 0;
        int prioridade = 3;
        int[] num = new int[11];
        Random gerador = new Random();

        System.out.println("O Banco está aberto!!");
        System.out.println();

        for(int i = 0; i<num.length; i++){
            numeros = gerador.nextInt(60) + 1;
            for(int j=0; j<num.length; j++){
                if(numeros == num[j] && j != i){
                    numeros = gerador.nextInt(60) + 1;
                }else{
                    num[i] = numeros;
                }
            }
        }

       for(int i = 0; i < num.length; i++){
            fila_Comum.Enqueue(num[i]);         
        }

        for(int i = 0; i<num.length; i++){
            numeros = gerador.nextInt(60) + 1;
            for(int j=0; j<num.length; j++){
                if(numeros == num[j] && j != i){
                    numeros = gerador.nextInt(60) + 1;
                }else{
                    num[i] = numeros;
                }
            }
        }

       for(int i = 0; i < num.length; i++){
            fila_Prioridade.Enqueue(num[i]);         
        }

        System.out.println("Fila Comum!!!");
        fila_Comum.imprimeFila();
        System.out.println();
        System.out.println("Fila Prioritaria!!!");
        fila_Prioridade.imprimeFila();
        System.out.println();
        
        while(!fila_Comum.isEmpty() || !fila_Prioridade.isEmpty()){
            int contador = 0;
            while(!fila_Comum.isEmpty() && contador < prioridade){
                atendeFila(fila_Prioridade);
                contador++;
            }

            if(!fila_Comum.isEmpty()){
                atendeFila(fila_Comum);
            }

            if(fila_Prioridade.isEmpty()){
                while(!fila_Comum.isEmpty()){
                    atendeFila(fila_Comum);
                }
            }
        }
        System.out.println();
        System.out.println("O Banco agradece sua visita, volte sempre!!! Você é o cliente Número 1.");
    }        
    private static void atendeFila(TadFila fila){
        int pessoaAtendida = fila.Dequeue();
        if(pessoaAtendida == 0){
            System.out.println("Proximo da fila comum.");
        }else{
            System.out.println("Cliente " + pessoaAtendida + " foi atendida");
        }
    }
}