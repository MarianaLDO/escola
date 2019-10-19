package entidadesRelacionamentos;

import java.util.ArrayList;

public class Professor {
	
	private String nome;
	private long matricula;
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public long getMatricula() {
		return matricula;
	}



	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}



	public ArrayList<Turma> getTurmas() {
		return turmas;
	}



	public void setTurmas(ArrayList<Turma> turmas) {
		this.turmas = turmas;
	}



	ArrayList<Turma> turmas = new ArrayList<Turma>();
	
}
