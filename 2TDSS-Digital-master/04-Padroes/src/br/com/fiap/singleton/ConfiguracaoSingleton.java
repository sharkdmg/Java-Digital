package br.com.fiap.singleton;

import java.io.IOException;
import java.util.Properties;

public class ConfiguracaoSingleton {

	//1 - Atributo est�tico que armazena a �nica instancia
	private static Properties prop;
	
	//2 - M�todo est�tico que retorna a �nica instancia
	public static Properties getInstance() {
		if (prop == null) {
			prop = new Properties();
			try {
				//carregar o objeto com as informa��es do arquivo
				prop.load(ConfiguracaoSingleton.class.
					getResourceAsStream("/app.properties"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return prop;
	}
	
	//3 - Construtor privado (ninguem instancia a classe)
	private ConfiguracaoSingleton() {}
}




