package controle;

import java.util.List;

import modelo.BaseDados;
import modelo.Cliente;
import view.Interface;

public class Controlador {

	public static void main(String[] args) {
		Interface visao = new Interface();
		BaseDados bd = new BaseDados();
		
		int opc = 0;
		do {
			opc = visao.menu();
			switch(opc) {
				case 1:
					Cliente cliente = visao.leituraCliente();
					bd.adicionarCliente(cliente);
					visao.msg("Cliente adicionado com sucesso!!");
					break;
				case 2:
					List<Cliente> dados = bd.obterCliente();
					visao.listarCliente(dados);
					break;
				case 3:
					visao.msg("Sair da aplicação");
					break;
				default:
					visao.msg("Opção inválida");
			}
		}while(opc != 3);

	}

}
