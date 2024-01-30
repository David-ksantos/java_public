package app_noname;

public class Aluno extends Pessoa {
	
	private int matricula;
	private String turno;
	private int mensalidade;
	private boolean status;
	
	public void pagarMensalidade(int valor) {
		this.mensalidade -= valor;
	}
	
	public void trocarTurno(String novoturno) {
		this.turno = novoturno;
	}
	
	public Aluno(){
		status = true;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
