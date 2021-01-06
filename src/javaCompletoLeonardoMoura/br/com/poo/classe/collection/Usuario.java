package javaCompletoLeonardoMoura.br.com.poo.classe.collection;

public class Usuario {
	private String nome;
	private String email;

	public Usuario() {
	}

	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Usuario) {
			Usuario novoUsuario = (Usuario) obj;
			boolean nomeIgual = novoUsuario.nome.equals(this.nome);
			boolean emailIgual = novoUsuario.email.equals(this.email);
			return nomeIgual && emailIgual;
		} else {
			return false;
		}
	}
}