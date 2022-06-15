package modelo;
public class Cliente{
	private String nome;
	private String telefone;
	
	//construtor vazio para trabalhar depois
	public Cliente(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", telefone=" + telefone + "]";
	}

	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}