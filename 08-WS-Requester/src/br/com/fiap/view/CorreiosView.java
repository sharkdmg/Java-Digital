package br.com.fiap.view;

import java.util.Scanner;

import org.tempuri.CalcPrecoPrazoWSStub;
import org.tempuri.CalcPrecoPrazoWSStub.CalcPrazo;
import org.tempuri.CalcPrecoPrazoWSStub.CalcPrazoResponse;
import org.tempuri.CalcPrecoPrazoWSStub.CalcPrecoResponse;

public class CorreiosView {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Ler dois CEPs e calcular o prazo de entrega
		//SEDEX 40010
		System.out.println("Digite o código do serviço: ");
		String codigo = sc.next();
		
		System.out.println("Digite o CEP de Destino: ");
		String cepDest = sc.next();
		
		System.out.println("Digite o CEP de Origem: ");
		String cepOrig = sc.next();
		
		try {
			
		CalcPrazo valores = new CalcPrazo();
		valores.setNCdServico("40010");
		valores.setSCepDestino(cepDest);
		valores.setSCepOrigem(cepOrig);
		
		CalcPrecoPrazoWSStub stub = new CalcPrecoPrazoWSStub();
		CalcPrazoResponse resp = stub.calcPrazo(valores);
		
		System.out.println("O prazo de entrega é: " +resp.getCalcPrazoResult().getServicos().getCServico()[0].getDataMaxEntrega());
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();

	}

}
