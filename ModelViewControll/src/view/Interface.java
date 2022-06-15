package view;

import java.util.List;
import java.util.Scanner;

import modelo.Cliente;

public class Interface {
	public int menu() {
		
		int opc = 0;
		System.out.println(">>> Menu de opções <<<");
		System.out.println("1) Adicionar cliente");
		System.out.println("2) Listar clientes");
		System.out.println("3) Sair");
		System.out.println("Opção:");


		opc = new Scanner(System.in).nextInt();
		
		return opc;
	}
	
	public Cliente leituraCliente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite o telefone: ");
		String telefone = sc.nextLine();
		
		return new Cliente(nome, telefone);
	}
	
	public void listarCliente(List<Cliente> clientes) {
		System.out.println("Dados dos Clientes");
		for(Cliente cliente: clientes) {
			System.out.println(clientes);
		}
	}
	
	public void msg(String texto) {
		System.out.println(texto);
		
	}
}
