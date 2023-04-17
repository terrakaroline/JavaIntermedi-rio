package arrayListPratico;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListCarros {
	
	public static void main(String[] args) {
		//construindo um arrayList para os carros
		ArrayList<String> carros = new ArrayList<>();
		
		//adicionando carros ao arraylist
		carros.add("FLUENCE");
		carros.add("KOMBI");
		carros.add("JAGUAR");
		carros.add("BMW");
		carros.add("MERCEDES");
		carros.add("FUSCA");
		carros.add("VECTRA");
		
		//mostra array
		System.out.println(carros);
		
		//substituir MERCEDES POR MITSUBISHI
		carros.set(4, "MITSUBISHI");
		
		//mostra array
		System.out.println(carros);
		
		//Remover VECTRA
		carros.remove("VECTRA");
		System.out.println(carros);
		
		// adicionando carros ao arraylist com o JOptionPane
		carros.add(JOptionPane.showInputDialog("Informe a marca do carro: "));
		
		if (carros.contains("BMW c3")) {
			//substituindo quando não se sabe a posição
			for(int i = 0; i < carros.size(); i++) {
				if("BMW c3".equals(carros.get(i))) {
					carros.set(i, "BUGATTI");
					break;
				}
			}
		} else {
			System.out.println("Não encontrei o item");
		}
		
		System.out.println(carros);
		
		//esvaziando array
		carros.clear();
				
		if (carros.isEmpty()) {
			System.out.println("O vetor está vazio");
		}
		System.out.println(carros);
	}
}
