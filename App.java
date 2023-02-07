package main;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int nodes, arcs;
		System.out.print("Введите колличество вершин графа:\n ");
		nodes = sc.nextInt();
		System.out.print("Введите колличество дуг графа:\n ");
		arcs = sc.nextInt();
		
		Graph graph = new Graph(nodes, arcs);

		int settingMethod;
		System.out.print("Выберите способ задания графа: \n 1. Матрица инцидентности \n"
				+ " 2. Матрица смежности \n 3. Список смежности\n ");
		settingMethod = sc.nextInt();

		switch (settingMethod) {
		case 1:
			graph.setIncMatrix();
			break;
		case 2:
			graph.setAdjMatrix();
			break;
		case 3:
			graph.setAdjList();
			break;

		default:
			System.out.println("Неправильный номер!");
			System.exit(0);
		}

		int printingMethod;
		System.out.print("Выберите способ отображения графа: \n 1. Матрица инцидентности \n"
				+ " 2. Матрица смежности \n 3. Список смежности\n ");
		printingMethod = sc.nextInt();
		
		switch (printingMethod) {
		case 1:
			graph.getIncMatrix();
			break;
		case 2:
			graph.getAdjMatrix();
			break;
		case 3:
			graph.getAdjList();
			break;

		default:
			System.out.println("Неправильный номер!");
			System.exit(0);
		}
	}

	// МИ -1 1 0 0 0 0 1 -1 0 0 0 -1 0 1 0 1 0 0 -1 0 -1 0 0 0 1 0 0 0 1 -1 0 0 2 0 0
	// МС 0 1 0 0 1 0 0 0 1 0 0 1 2 0 0 1 0 0 0 0 0 0 0 1 0

}
