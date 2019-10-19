package entidadesRelacionamentos;

import java.util.ArrayList;

public class Turma {
	 
	private long codigo;
	
	
	 public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	 ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	 ArrayList<Professor> professores = new ArrayList<Professor>();
}
