/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2vol3pag26e42;

public class Produto {
    private int codigo=0;
    private String nome="";
    private float valor=0;
    private Fornecedor fornecedor;
    //4º)
    private static int totalProdutos=0;
    private static int numeroProdutos=0;
    
    //8º)pág. 42
    private static final int VALOR_MAXIMO = 50000;
    
    public Produto(int codigo,String nome,float valor,Fornecedor fornecedor){
        this.codigo=codigo;
        this.nome = nome;
        this.valor=valor;
        this.fornecedor = fornecedor;
        //5º)pág. 42
        numeroProdutos+=1;
        totalProdutos+=valor;
    }
    //6º)pág. 42
    public static void getMediaValor(){
        System.out.println("A média de valores dos produtos é: "+(float)totalProdutos/(float)numeroProdutos);
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public void atualizarPreco (float valor){
        this.setValor(this.getValor() + this.getValor() * (valor/100));
    }

    public static int getVALOR_MAXIMO() {
        return VALOR_MAXIMO;
    }

}
