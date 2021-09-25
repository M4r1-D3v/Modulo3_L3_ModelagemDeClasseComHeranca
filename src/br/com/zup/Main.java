package br.com.zup;

public class Main {

    public static void main(String[] args) {
	 Fornecedor fornecedor = new Fornecedor("Ana","Rio de Janeiro","586903329", 700,400);
	 Colaborador colaborador1 = new Colaborador("Maria","Recife", "563821189",34,4500, 1500);
	 //fornecedor.valorSaldo();
	 //System.out.println(fornecedor.valorSaldo());

		colaborador1.calcularSalario();
		System.out.println(colaborador1.calcularSalario());
    }
}
