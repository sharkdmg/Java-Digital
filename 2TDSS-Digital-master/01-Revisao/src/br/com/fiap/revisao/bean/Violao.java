package br.com.fiap.revisao.bean;

public class Violao extends InstrumentoMusical {

	//SOBRESCRITA: m�todos com a mesma assinatura na classe pai e filha
	@Override
	public String emitirSom() {
		return "La-Sol";
	}

	@Override
	public String acordes() {
		return "";
	}
	
}