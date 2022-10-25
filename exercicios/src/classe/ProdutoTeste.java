package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 4222.21);
        var p2 = new Produto("Celular", 2000.21);
        
        Produto.desconto = 0.5;
        
        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.5);
        double mediaCarrinho = (precoFinal1 + precoFinal2)/2;
        
        System.out.printf("Média do carrinho = R$%.2f", mediaCarrinho);
    }
}
