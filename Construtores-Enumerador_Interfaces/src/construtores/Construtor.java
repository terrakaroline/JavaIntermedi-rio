package construtores;

import construtores.aluno.STATUS;

public class Construtor {
	public static void main(String[] args) {
		//passando os dados através do construtor
		aluno alu = new aluno(8, 8, 8);
		
		double mediaAlunoFinal = alu.calcularMediaAluno();
		
		if (mediaAlunoFinal < 6) {
			alu.situacaoAluno = STATUS.REPROVADO;
		} else {
			alu.situacaoAluno = STATUS.APROVADO;
		}
		
		System.out.println("A média do aluno foi: " + alu.calcularMediaAluno() + " e o aluno foi " + alu.situacaoAluno);
	}
}
