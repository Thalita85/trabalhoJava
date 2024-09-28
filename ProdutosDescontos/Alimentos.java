package ProdutosDescontos;
class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

   
    public double calcularPrecoComDesconto() {
        double desconto = 0.1; // 10% de desconto
        return getPreco() * (1 - desconto); 
    }
}
