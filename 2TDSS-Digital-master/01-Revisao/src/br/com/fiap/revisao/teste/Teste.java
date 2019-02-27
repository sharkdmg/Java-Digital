package br.com.fiap.revisao.teste;

import br.com.fiap.revisao.bean.InstrumentoMusical;
import br.com.fiap.revisao.bean.Violao;

public class Teste {

	public static void main(String[] args) {
		//InstrumentoMusical i = new InstrumentoMusical();
		//Chama o m�todo do instrumento musical
		//System.out.println(i.emitirSom());
		
		Violao violao = new Violao();
		//Chama o m�todo do viol�o
		System.out.println(violao.emitirSom());
		
		InstrumentoMusical i2 = new Violao();
		//Chama o m�todo do viol�o (Objeto atual)
		System.out.println(i2.emitirSom());
		
		//CAST: for�a um objeto ser de um tipo
		Violao v2 = (Violao) i2;
		
		//TESTE do operador tern�rio
		System.out.println(v2.emitirSom("Mi"));
		
	}
	
}




