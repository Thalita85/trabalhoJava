package ProdutosDescontos;

class Eletronico extends Produto {
    private int garantia; 

   
    public Eletronico(String nome, double preco, int garantia) {
        super(nome, preco); 
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

        public double calcularPrecoComDesconto() {
        double desconto = 0.1; // 10% de desconto
        return getPreco() * (1 - desconto); 
    }
}
