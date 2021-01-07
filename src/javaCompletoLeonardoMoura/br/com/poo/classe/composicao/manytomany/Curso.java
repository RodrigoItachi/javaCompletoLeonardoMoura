package javaCompletoLeonardoMoura.br.com.poo.classe.composicao.manytomany;

import java.util.ArrayList;

public class Curso {
	String nome;
	ArrayList<Aluno> alunos = new ArrayList<>();

	void addAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
}