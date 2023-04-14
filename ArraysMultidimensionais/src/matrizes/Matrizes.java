package matrizes;

import javax.swing.JOptionPane;

public class Matrizes {
	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que solicite ao usuário a entrada de 4 notas
		 * para cada aluno, calcular a média e exibir em tela.
		 * Ao final, mostrar a média da turma.
		 * Ao lado da média do aluno, deve seguir a seguinte regra de negócio:
		 * Se media >= 7,5				Aluno aprovado
		 * Se média >= 5,5 e < 75		Aluno em recuperação
		 * Se média < 5,5				Aluno reprovado
		 * 
		 */
		
		//Vetor dos alunos
		String [] alunos = {"JOAO", "JOSE", "MARIA"};
		
		//Matriz das notas
		float [][] notas = new float[3][4];
		
		//para controlar o somatório das notas de cada aluno
		//para calcular a media do aluno
		float somaNotas, mediaAluno;
		
		//Para armazenar o status do aluno e usar para imprimir o boletim
		String statusAluno;
		
		//informar as notas dos alunos
		//laço externo para associar aluno à nota
		for (int i = 0; i < 3; i++) {
			System.out.println("Aluno: " + alunos[i]);
			//laço interno para informar as notas de cada aluno
			somaNotas = 0;
			mediaAluno = 0;
			for(int j = 0; j < 4; j++) {
				notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("informe a nota n " + (j+1)));
				somaNotas = somaNotas + notas[i][j];
			}
			mediaAluno = somaNotas / 4;
			if (mediaAluno < 5.5) {
				statusAluno = "REPROVADO";
			} else if (mediaAluno >= 5.5 && mediaAluno <= 7.5) {
				statusAluno = "EM RECUPERAÇÃO";
			} else {
				statusAluno = "APROVADO";
			}
			
			//impressão do boletim
			
			System.out.println("\n********** BOLETIM **********");
			System.out.println("Aluno: " + alunos[i]);
			System.out.println("Notas");
			for (int j1 = 0; j1 < 4; j1++) {
				System.out.println((j1+1) + " - " + notas[i][j1]);
			}
			
			System.out.println("Média: " + mediaAluno + " - " + statusAluno);
		}
		
	}

}
