package construtores;

public class aluno {
	private double nota1;
	private double nota2;
	private double nota3;
	STATUS situacaoAluno;
	
	
	public aluno(double nota1, double nota2, double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	// DEFININDO UM ENUMERADOR
	public enum STATUS {
		APROVADO,
		REPROVADO
	}
	
	//MÉTODO PARA CALCULAR MÉDIA DO ALUNO
	public double calcularMediaAluno() {
		return (this.nota1 + this.nota2 + this.nota3) / 3;
	}
}
