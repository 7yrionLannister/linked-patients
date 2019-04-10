package ui;

import model.*;

public class Main {

	public static void main(String[] args) {
		Hospital h = new Hospital();
		h.addPatient("Roberto", "Gripa");
		h.addPatient("Maria", "Migrania");
		h.addPatient("Humberto", "Fiebre");
		h.addPatient("Diana", "Gripa");
		h.addPatient("Marcos", "Gripa");
		h.addPatient("Mario", "Gripa");
		
		System.out.println("Antes de eliminar:");
		System.out.println(h.patiensInString());
		h.deletePatient("Humberto");
		System.out.println("Despues de eliminar:");
		System.out.println(h.patiensInString());
	}

}
