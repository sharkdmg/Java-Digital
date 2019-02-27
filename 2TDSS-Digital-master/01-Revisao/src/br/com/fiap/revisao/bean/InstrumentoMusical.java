package br.com.fiap.revisao.bean;

//Classe abstrata -> n�o pode ser instanciada, pode conter m�todos abstratos 
public abstract class InstrumentoMusical {

	private String fabricante;
	
	//m�todo abstrato n�o possui implementa��o
	public abstract String acordes();
	
	//POLIMORFISMO: v�rios comportamentos para o m�todo
	public String emitirSom() {
		return "Mi";
	}
	
	//SOBRECARGA: m�todos com mesmo nome e par�metros diferentes 
	public String emitirSom(String notaMusical) {
		//Operador tern�rio (condi��o)?Verdadeiro:Falso		
		return (notaMusical.equals("Mi"))?"Fa":"Sol";
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
}