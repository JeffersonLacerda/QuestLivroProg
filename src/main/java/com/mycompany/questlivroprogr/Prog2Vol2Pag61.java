/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aprendendo;

import java.util.Scanner;

/**
 *
 * @author Jefferson
 */
public class Prog2Vol2Pag61 {
    
    public void quest01(){
        
        Scanner teclado = new Scanner(System.in);
        int soma=0, maiorvalor=0;
        
        System.out.print("Informe o tamanho do vetor: ");
        int tamVetor = teclado.nextInt();
        
        //Criando o vetor com o tamanho definido:
        int vetInteiros[] = new int[tamVetor];
        
        //Adicionando os valores no vetor
        for(int i=0; i < vetInteiros.length;i++){
            System.out.print("Informe o "+(i+1)+" valor: ");
            vetInteiros[i]=teclado.nextInt();
            soma+=vetInteiros[i];
            
            //analisando o maior:
            if(i==0)
                maiorvalor=vetInteiros[i];
            else if(vetInteiros[i]>maiorvalor)
                maiorvalor=vetInteiros[i];
        }
        //Média:
        float media = (float)soma/(float)tamVetor;
        
        System.out.println("Soma dos elementos: "+soma);
        System.out.println("Maior elemento: "+maiorvalor);
        System.out.println("Média aritmética: "+media);
    }
    
    public void quest07(){
        //Vou fazer utilizando o desenho da matriz e buscando pelo índice, mas, 
        //há uma maneira muito mais simples, só utilizando o distância entre cada local...
        int tabelaKm[][] = {{0,800,1600,300,1100},
                            {800,0,1100,550,630},
                            {1600,1100,0,1600,450},
                            {300,550,1600,0,1170},
                            {1100,630,450,1170,0}};
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe os locais separados por pipe (ex: 1,2,3): ");
        String locais = teclado.next();
        
        //Separando os valores informados
        String lc[] = locais.split(",");
        
        int origem=0, destino=0, kmTotal=0;
        for(int i=0; i<lc.length;i++){
            if(i==0){
                origem=Integer.parseInt(lc[i])-1;
            }else{
                destino=Integer.parseInt(lc[i])-1;
                kmTotal += tabelaKm[origem][destino];
                origem=destino;
            }
        }
        System.out.println("Km Total: "+kmTotal);
        
    }
}
