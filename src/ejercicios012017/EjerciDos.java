package ejercicios012017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EjerciDos {
	public static void main(String[] args) {
		ArrayList<Float> lista = new ArrayList<>();
		int elementos = 100;
		for (int i = 0; i < elementos; i++) {
			lista.add(new Float(EjerciUno.dameValor(elementos)));
		}
		
		Collections.sort(lista);
		mostrar(lista);
		rotar(lista);
		mostrar(lista);
	}

	static void mostrar(ArrayList<Float> lista) {
		System.out.println();
		for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
			Float float1 = (Float) iterator.next();
			System.out.print(float1+",");
		}{
			
		}
	}

	static void rotar(ArrayList<Float> lista) {
		Float remove = lista.remove(lista.size() - 1);
		lista.add(0,remove);

	}
}
