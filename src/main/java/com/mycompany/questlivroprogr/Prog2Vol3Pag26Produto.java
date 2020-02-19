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
public class Prog2Vol3Pag26Produto {
    int codigo=0;
    String nome="";
    float valor=0;
    Prog2Vol3Pag26Fornecedor fornecedor;
    
    void atualizarPreco (float valor){
        this.valor += this.valor*(valor/100);
    }
}
