package ejercicios012017;

import java.util.ArrayList;

public class EjerciUno {
public static void main(String[] args) {
	ArrayList<Float> lista=new ArrayList<>();
	int elementos=100;
	for (int i = 0; i < elementos; i++) {
		lista.add(new Float(dameValor(elementos)));
	}
	System.out.println("cantaidad de elementos en la lista "+lista.size());
	float suma=0;
	for (Float float1 : lista) {
		suma+=float1;
	}
	float media=suma/elementos;
	System.out.println("la suma es "+suma+ " y la media "+media);
}

static float dameValor(int elementos) {
	return (float) (Math.random()*elementos);
}
}
