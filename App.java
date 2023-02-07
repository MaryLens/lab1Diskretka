package main;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int nodes, arcs;
		System.out.print("������� ����������� ������ �����:\n ");
		nodes = sc.nextInt();
		System.out.print("������� ����������� ��� �����:\n ");
		arcs = sc.nextInt();
		
		Graph graph = new Graph(nodes, arcs);

		int settingMethod;
		System.out.print("�������� ������ ������� �����: \n 1. ������� ������������� \n"
				+ " 2. ������� ��������� \n 3. ������ ���������\n ");
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
			System.out.println("������������ �����!");
			System.exit(0);
		}

		int printingMethod;
		System.out.print("�������� ������ ����������� �����: \n 1. ������� ������������� \n"
				+ " 2. ������� ��������� \n 3. ������ ���������\n ");
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
			System.out.println("������������ �����!");
			System.exit(0);
		}
	}

	// �� -1 1 0 0 0 0 1 -1 0 0 0 -1 0 1 0 1 0 0 -1 0 -1 0 0 0 1 0 0 0 1 -1 0 0 2 0 0
	// �� 0 1 0 0 1 0 0 0 1 0 0 1 2 0 0 1 0 0 0 0 0 0 0 1 0

}
