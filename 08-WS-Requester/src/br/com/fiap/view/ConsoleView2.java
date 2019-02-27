package br.com.fiap.view;

import java.util.Scanner;

import br.com.fiap.bo.DisciplinaBOStub;
import br.com.fiap.bo.DisciplinaBOStub.CalcularPS;
import br.com.fiap.bo.DisciplinaBOStub.CalcularPSResponse;

public class ConsoleView2 {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			//Calcular a nota PS
		
			System.out.println("Digite a sua nota da AM:");
			float am = sc.nextFloat();
			
			System.out.println("Digite a sua nota da NAC:");
			float nac = sc.nextFloat();
			
			CalcularPS valores = new CalcularPS();
			valores.setAm(am);
			valores.setNac(nac);
			
			DisciplinaBOStub stub = new DisciplinaBOStub();
			CalcularPSResponse resp = stub.calcularPS(valores);
			System.out.println("Você precisa tirar na PS: " + resp.get_return());

		}catch (Exception e) {
			e.printStackTrace();
		}


	}

}
