package ProdutosDescontos;
public class Main {
    public static void main(String[] args) {
       
        Eletronico eletronico = new Eletronico("Notebook", 1500.0, 12);
        System.out.println("Produto: " + eletronico.getNome());
        System.out.println("Preço original: R$ " + eletronico.getPreco());
        System.out.println("Preço com desconto: R$ " + eletronico.calcularPrecoComDesconto());
        System.out.println("Garantia: " + eletronico.getGarantia() + " meses");
        System.out.println();

        Alimento alimento = new Alimento("Café", 10.0, "10/10/2025");
        System.out.println("Produto: " + alimento.getNome());
        System.out.println("Preço original: R$ " + alimento.getPreco());
        System.out.println("Preço com desconto: R$ " + alimento.calcularPrecoComDesconto());
        System.out.println("Data de validade: " + alimento.getDataDeValidade());
    }
}
