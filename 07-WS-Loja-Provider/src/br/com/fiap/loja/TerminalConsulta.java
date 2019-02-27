package br.com.fiap.loja;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import org.apache.log4j.Logger;

import br.com.fiap.loja.bo.EstoqueBO;
import br.com.fiap.loja.to.ProdutoTO;
import br.com.fiap.singleton.ConfiguracaoSingleton;

public class TerminalConsulta {

	private static Logger log = Logger.getLogger(TerminalConsulta.class);
	
	//Camada de apresenta��o 
	public static void main(String[] args) {
		
		log.warn("In�cio da aplica��o");
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// Recupera a data atual formatada
		String data = sdf.format(Calendar.getInstance().getTime());
		
		EstoqueBO bo = new EstoqueBO();
		
		//Recupera o valor configurado
		String nome = ConfiguracaoSingleton.getInstance()
										.getProperty("loja");
		
		int codigo;
		do {
			System.out.print("Digite o c�digo: ");
			codigo = sc.nextInt(); // l� o c�digo do produto
			
			try {
				//Pesquisa o produto na camada de neg�cio
				ProdutoTO to = bo.consultarProduto(codigo);
				System.out.println(to.getDescricao());
				System.out.println("Pre�o: " + to.getPreco());
				System.out.println("Qtd: " + to.getQuantidade());
			} catch (Exception e) {
				//e.printStackTrace();
				System.err.println(e.getMessage());
				log.error("Produto n�o encontrado");
			}
			
			System.out.println(nome + " " + data + "\n");
		} while (codigo != 0);

		log.warn("Fim da aplica��o!");
		
		sc.close();
	}

}
