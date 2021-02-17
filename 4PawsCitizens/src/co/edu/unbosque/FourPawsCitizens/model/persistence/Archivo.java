package co.edu.unbosque.FourPawsCitizens.model.persistence;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import co.edu.unbosque.FourPawsCitizens.model.*;

public class Archivo {
	
	private ObjectInputStream in;
	private ObjectOutputStream out;

	public Archivo(File archivo) {
		if (archivo.exists()) {
			System.out.println("Archivo existe");
		} else {
			try {
				archivo.createNewFile();

			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

	public void escribirEnArchivo(ArrayList<Pet> alPet, File archivo) {
		try {
			System.out.println(archivo);
			out = new ObjectOutputStream(new FileOutputStream(archivo));
			out.writeObject(alPet);
			out.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
	}

	public ArrayList<Pet> leerArchivo(File archivo) {

		ArrayList<Pet> alPet = new ArrayList<Pet>();
		if (archivo.length() != 0) {
			try {
				in = new ObjectInputStream(new FileInputStream(archivo));
				alPet = (ArrayList<Pet>) in.readObject();
			} catch (FileNotFoundException e) {

				e.printStackTrace();

			} catch (IOException e) {

				e.printStackTrace();

			} catch (ClassNotFoundException e) {

				e.printStackTrace();

			}
		}
		return alPet;
	}

}
