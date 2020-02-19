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
public class Prog2Vol2Pag27{
    
    public void quest05(){
        System.out.println("<< Questão 05>>");
        int x = 10;
        int y = 5;
        int exp = ++x + ++y; //Troquei o sinal para facilitar a visualização
        System.out.println("Valor da exp 01: "+exp);
        x = 10;
        y = 5;
        exp = x++ + y++; //Troquei o sinal para facilitar a visualização
        System.out.println("Valor da exp 02: "+exp);
    }
    
    public void quest09(){
        float nota1=10, nota2=8, nota3=9;
        String nome = "Jefferson";
        System.out.println("<< Questão 09>>");
        System.out.println("A média do aluno "+ nome+" foi: "+(nota1+nota2+nota3)/3);
    }
    
    public void quest10(){
        String nome = "pindamonhangaba";
        String nomeX= "";
        
        System.out.println("<< Questão 10>>");
        System.out.println("Quantidade de letras: "+nome.length());
        System.out.println("Letra Inicial do nome: "+nome.substring(0,1));
        nomeX = nome.substring(0,1);
        nomeX = nomeX.toUpperCase();
        nomeX = nomeX+nome.substring(1,nome.length());
        System.out.println("Com a primeira letra maiúscula: "+nomeX);
    }
}
