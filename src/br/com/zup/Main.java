package br.com.zup;

public class Main {

    public static void main(String[] args) {
	 Fornecedor fornecedor = new Fornecedor("Ana","Rio de Janeiro","586903329", 700,400);

	 fornecedor.valorSaldo();
	 System.out.println(fornecedor.valorSaldo());
    }
}
