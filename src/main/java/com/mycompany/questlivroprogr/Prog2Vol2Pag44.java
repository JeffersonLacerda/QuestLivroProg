/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aprendendo;

/**
 *
 * @author Jefferson
 */
public class Prog2Vol2Pag44 {   
    
    public void quest01(){
        int nota1=9, nota2=8, faltas=15;
        float media = (nota1+nota2)/2;
        
        if(faltas>15){
            System.out.println("Aluno reprovado por faltas");
        }else{
            if(media>=7){
                System.out.println("Aluno aprovado");
            }else if ((media<7) &&(media>4)){
                System.out.println("Aluno de recuperação");
            }else{
                System.out.println("Aluno Reprovado");
            }
        }
    } 
    
    public void quest02(){
        //Muito grande e simples!!
    }
    
    public void quest03(){
        for(int numero=10;numero<15;numero++){
            System.out.println("*");
        }
    }
}
