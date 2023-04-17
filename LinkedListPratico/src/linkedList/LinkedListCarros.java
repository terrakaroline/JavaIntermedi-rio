package linkedList;

import java.util.LinkedList;

public class LinkedListCarros {
	public static void main(String[] args) {
		/*
		 * addFirst()
		 * addLast()
		 * removeFirst()
		 * removeLast()
		 * getFirst()
		 * getLast()
		 * */
		
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		
		// incluindo Mazda no inicio
		
		cars.addFirst("Mazda");
		System.out.println(cars);
		
		//incluindo bugatti no fim
		cars.addLast("Bugatti");
		System.out.println(cars);
		
		String carro = cars.get(3);
		System.out.println(carro);
		
		//removendo Mazda
		
		cars.removeFirst();
		System.out.println(cars);
		//pega o primeiro
		System.out.println(cars.getFirst());
		System.out.println(cars);
		
	}

}
