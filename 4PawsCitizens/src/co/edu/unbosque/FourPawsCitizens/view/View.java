package co.edu.unbosque.FourPawsCitizens.view;

import java.util.Scanner;

public class View {
	private Scanner read;

	public View() {
		read = new Scanner(System.in);
	}

	public void printMessage(String m) {
		System.out.println(m);
	}

	public String captureData(String m) {
		String solution = "";
		m = leer.nextLine();
		solution  = m;
		return solution ;
	}
}
