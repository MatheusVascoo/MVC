package modelo;

import java.util.ArrayList;
import java.util.List;

public class BaseDados {
	private List<Cliente> dados = new ArrayList<>(); 
	
	public boolean adicionarCliente(Cliente cliente) {
		dados.add(cliente);
		return true;
	}
	
	public List<Cliente> obterCliente(){
		return dados;
	}
}
