package revisao;

public class Agenda {
	//Atributos ou varáveis da classe.	
	private String nome ;
	private String telefone;
	private String email;
	private String endereco;
	
	// Inicializar os atributos (Construtor).

	public Agenda (String nome , String telefone ) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}
	//Métodos gets e sets.
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	//public void setEndereco(String endereco) {
	//	this.endereco = endereco;
	//}
	public void addEmil(String email) {
		 setEmail(email);;
	}
	public void addEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
