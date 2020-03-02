/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2vol3pag26e42;

import prog2vol3pag26e42.Fornecedor;
import prog2vol3pag26e42.Produto;

public class TesteProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
    
        Fornecedor fornecedor1 = new Fornecedor();
        Fornecedor fornecedor2 = new Fornecedor();
        
        produto1.setCodigo(1);
        produto1.setNome("TV LCD");
        produto1.setValor(3500);
        produto2.setCodigo(2);
        produto2.setNome("Notebook");
        produto2.setValor(2000);
        produto3.setCodigo(3);
        produto3.setNome("Impressora");
        produto3.setValor(232);

        fornecedor1.setCnpj("1234321");
        fornecedor1.setNome("Zé Maria");
        fornecedor2.setCnpj("543212345");
        fornecedor2.setNome("Cláudio");
        
        //6)
        produto1.atualizarPreco(15);
        produto2.atualizarPreco(15);
        System.out.println("Produto 01: "+produto1.getValor());
        System.out.println("Produto 02: "+produto2.getValor());
        

    }
    
}
