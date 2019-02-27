package br.com.fiap.teste;

import org.apache.log4j.Logger;

import br.com.fiap.singleton.ConfiguracaoSingleton;

public class Teste {
	
	//Objeto para realizar o logging da classe Teste
	private static Logger log = Logger.getLogger(Teste.class);

	public static void main(String[] args) {
		
		log.trace("Inicio da aplica��o");
		
		//Recuperar a conex�o configurada
		String conexao = 
				ConfiguracaoSingleton.getInstance()
								.getProperty("conexao");
		
		log.debug("Recuperando a conex�o");
		
		System.out.println(conexao);
	}
	
}




