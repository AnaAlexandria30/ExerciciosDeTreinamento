package br.ufpb.ana;

import java.util.Scanner;

public class  ProgramaDescontos {
    public static void main (String [] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos produtos você quer comprar?");
        int quant = Integer.parseInt(leitor.nextLine());
        Produto[] produtos = new Produto[quant];
        for (int k=0; k<quant; k++){
            Produto p = new Produto();
            System.out.println("Qual o nome do produto?");
            p.setNome(leitor.nextLine());
            System.out.println("Qual o preço original do produto?");
            p.setPreco(Double.parseDouble(leitor.nextLine()));
            double valorComDesconto = calculaValorComDesconto(p.getPreco());
            System.out.printf("O valor a pagar pelo produto é R$ %.2f\n", valorComDesconto);
            produtos[k] = p;
        }
        System.out.println("Somatorio dos descontos: " + calculaSomatorioDescontos(produtos));
        System.out.println("Nome do protudo com maior desconto: " + verificaProdutoComMaiorDesconto(produtos));

        leitor.close();

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



