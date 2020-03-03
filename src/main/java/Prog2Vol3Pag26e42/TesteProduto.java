/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prog2Vol3Pag26e42;

import prog2vol3pag26e42.Fornecedor;
import prog2vol3pag26e42.Produto;

public class TesteProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("O preço máximo de um produto é: "+Produto.getVALOR_MAXIMO());
        
        Fornecedor fornecedor1 = new Fornecedor("1234321", "Zé Maria");
        Fornecedor fornecedor2 = new Fornecedor("543212345", "Cláudio");
        
        //7º)pág. 42
        Produto.getMediaValor();
        
        Produto produto1 = new Produto(1, "TV LCD", 3500, fornecedor1);
        Produto produto2 = new Produto(2, "Notebook", 200, fornecedor2);
        Produto produto3 = new Produto(3, "Impressora", 232, fornecedor2);
        
        //7º)pág. 42
        Produto.getMediaValor();
        
        //6)pág.26
        produto1.atualizarPreco(15);
        produto2.atualizarPreco(15);
        produto3.atualizarPreco(15);
        System.out.println("Produto 01: "+produto1.getValor());
        System.out.println("Produto 02: "+produto2.getValor());
        System.out.println("Produto 03: "+produto3.getValor());
    }
    
}
