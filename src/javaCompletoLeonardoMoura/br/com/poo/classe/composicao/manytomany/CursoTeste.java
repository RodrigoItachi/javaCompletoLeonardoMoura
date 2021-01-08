package javaCompletoLeonardoMoura.br.com.poo.classe.composicao.manytomany;

public class CursoTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("César");

		Curso curso1 = new Curso("Web Design");
		Curso curso2 = new Curso("Java Web");
		Curso curso3 = new Curso("Java POO");

		curso1.addAluno(aluno1);
		curso1.addAluno(aluno2);

		curso2.addAluno(aluno1);
		curso2.addAluno(aluno3);

		aluno1.addCurso(curso3);
		aluno2.addCurso(curso3);
		aluno3.addCurso(curso3);

		System.out.println("Todos Alunos do Curso de " + curso1.nome);
		for (Aluno aluno : curso1.alunos) {
			System.out.println("Meu nome é " + aluno.nome + "\n");
		}

		System.out.println("Todos Alunos do Curso de " + curso2.nome);
		for (Aluno aluno : curso2.alunos) {
			System.out.println("Meu nome é " + aluno.nome + "\n");
		}

		System.out.println("Todos Alunos do Curso de " + curso3.nome);
		for (Aluno aluno : curso3.alunos) {
			System.out.println("Meu nome é " + aluno.nome + "\n");
		}

		System.out.println("--------------------------------------------------------------");
		System.out.println();

		System.out.println("Todos curso que o aluno " + aluno3.nome + " está matriculado");
		for (Curso curso : aluno3.cursos) {
			System.out.println("Curso: " + curso.nome + "\n");
		}

		System.out.println("Todos curso que o aluno " + aluno2.nome + " está matriculado");
		for (Curso curso : aluno2.cursos) {
			System.out.println("Curso: " + curso.nome + "\n");
		}

		System.out.println("Todos curso que o aluno " + aluno1.nome + " está matriculado");
		for (Curso curso : aluno1.cursos) {
			System.out.println("Curso: " + curso.nome + "\n");
		}

		Curso cursoEncontrado = aluno1.obterCursoPorNome(curso2.nome);
//		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Web");
		if (cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
			System.out.println();
		}else {
			System.out.println("Curso não encontrado, assine esse curso.");
		}
	}

}