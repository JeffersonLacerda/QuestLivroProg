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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        AloMundo alo = new AloMundo();
//        System.out.println(alo.mensagem());
       
        //Executando questões da página 27
//        Prog2Vol2Pag27 prog2Vol2Pag27 = new Prog2Vol2Pag27();
//        prog2Vol2Pag27.quest05();
//        prog2Vol2Pag27.quest09();
//        prog2Vol2Pag27.quest10();
        
        //Executando questões da página 44
//        Prog2Vol2Pag44 prog2Vol2Pag44 = new Prog2Vol2Pag44();
//        prog2Vol2Pag44.quest01();
//        prog2Vol2Pag44.quest03();
        //Ficaram faltando alguns
        
        //Executando questões da página 61
//        Prog2Vol2Pag61 prog2Vol2Pag61 = new Prog2Vol2Pag61();
//        prog2Vol2Pag61.quest01();
//        prog2Vol2Pag61.quest07();
        
        //Executando questões do vol.3 página 26
        //5)
        Prog2Vol3Pag26Produto produto1 = new Prog2Vol3Pag26Produto(), produto2= new Prog2Vol3Pag26Produto(), produto3= new Prog2Vol3Pag26Produto();
        Prog2Vol3Pag26Fornecedor forn1 = new Prog2Vol3Pag26Fornecedor(), forn2 = new Prog2Vol3Pag26Fornecedor();
        
        produto1.codigo=1;
        produto1.nome="TV LCD";
        produto1.valor=3500;
        produto2.codigo=2;
        produto2.nome="Notebook";
        produto2.valor=2000;
        produto3.codigo=3;
        produto3.nome="Impressora";
        produto3.valor=232;
        
        forn1.CNPJ="1234321";
        forn1.nome="Zé Maria";
        forn2.CNPJ="543212345";
        forn2.nome="Cláudio";
        
        //6)
        produto1.atualizarPreco(15);
        produto2.atualizarPreco(15);
        System.out.println("Produto 01: "+produto1.valor);
        System.out.println("Produto 02: "+produto2.valor);
        //
        
        
    }
    
}
