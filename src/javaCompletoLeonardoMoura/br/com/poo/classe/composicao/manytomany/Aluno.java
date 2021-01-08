package javaCompletoLeonardoMoura.br.com.poo.classe.composicao.manytomany;

import java.util.ArrayList;

public class Aluno {
	final String nome;
	final ArrayList<Curso> cursos = new ArrayList<>();

	public Aluno(String nome) {
		this.nome = nome;
	}

	Curso obterCursoPorNome(String nome) {
		for (Curso curso : this.cursos) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}

		return null;
	}

	void addCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}

	@Override
	public String toString() {
		return nome;
	}
}