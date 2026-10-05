package br.ufpb.ana;

public class MetodoMain {

    public static void main( String[] args){
        Produto produto1 = new Produto("Vestido", 120.00);
        Produto produto2 = new Produto("Short", 35.00);
        Produto produto3 = new Produto("Calça Jeans", 50.0);
        Produto[] produtos = {produto1, produto2, produto3};
        System.out.println("Somatorio dos descontos: " + calculaSomatorioDescontos(produtos));
        System.out.println("Nome do protudo com maior desconto: " + verificaProdutoComMaiorDesconto(produtos));
    }

    public static double calculaValorComDesconto(double valorProduto) {
        if (valorProduto < 50) {
            return (valorProduto);
        } else if (valorProduto < 100) {
            return (valorProduto - (valorProduto*0.05));
        } else {
            return (valorProduto - (valorProduto*0.10));
        }
    }

    public static double calculaSomatorioDescontos(Produto[] produtos) {
        double somatorio = 0;
        for(int k=0; k < produtos.length; k++) {
            Produto produto = produtos[k];
            double preco = produto.getPreco();
            double valorComDesconto = calculaValorComDesconto(preco);
            double desconto = preco - valorComDesconto;
            somatorio = somatorio + desconto;
        }
        return somatorio;
    }

    public static String verificaProdutoComMaiorDesconto(Produto[] produtos) {
        double maiorDesconto = 0;
        String nomeProduto = "";
        for(int k=0; k < produtos.length; k++) {
            Produto produto = produtos[k];
            double preco = produto.getPreco();
            double valorComDesconto = calculaValorComDesconto(preco);
            double desconto = preco - valorComDesconto;
            if(maiorDesconto < desconto) {
                maiorDesconto = desconto;
                nomeProduto = produto.getNome();
            }
        }
        return nomeProduto;
    }

}