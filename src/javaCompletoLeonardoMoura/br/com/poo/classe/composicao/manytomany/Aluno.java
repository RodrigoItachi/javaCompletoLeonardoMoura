package javaCompletoLeonardoMoura.br.com.poo.classe.composicao.manytomany;

import java.util.ArrayList;

public class Aluno {
	String nome;
	ArrayList<Curso> cursos = new ArrayList<>();

	void addCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
}