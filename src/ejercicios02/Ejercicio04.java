package ejercicios02;

import java.util.ArrayDeque;
import java.util.Stack;
import java.util.TreeSet;

public class Ejercicio04 {
	public static void main(String[] args) {
		ArrayDeque<Character> cola=new ArrayDeque<>();
		cola.add('e');
		cola.add('r');
		Stack<Character> pila=new Stack<>();
		pila.push('h');
		pila.push('p');
		pila.push('r');
		TreeSet<Character> conjunto=new TreeSet<>(cola);
		conjunto.addAll(pila);
		System.out.println(conjunto);
	}
}
