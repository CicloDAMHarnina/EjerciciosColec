package ejercicios02;

import java.util.Stack;

public class Ejercicio03 {

	public static void main(String[] args) {
		//La estructura de Pila
		Stack<Estudiante> pila=new Stack<>();
		Estudiante uno=new Estudiante("1", "pablo" );
		uno.setNota(5.4f);
		Estudiante unoA=new Estudiante("2", "fernando");
		unoA.setNota(5.4f);
		Estudiante unoB=new Estudiante("3", "abel");
		unoB.setNota(5.4f);
		Estudiante unoC=new Estudiante("4", "alberto");
		pila.push(uno);
		pila.push(unoA);
		pila.push(unoB);
		pila.push(unoC);
		String dniBusqueda="8";		
		new Ejercicio03().comprobar(pila, dniBusqueda);
		

	}

	public void comprobar(Stack<Estudiante> pila, String dniBusqueda) {
		Estudiante pop=null;
		pop = pila.pop();
		boolean encontrado=false;
		while(!encontrado&&pop!=null){			
			if(pop.dni.equals(dniBusqueda)){
				if(pop.getNota()==null)
					System.out.println("el estudiante "+pop.nombre+" NO tiene calificacion");
				else
				System.out.println(pop);
				encontrado=true;
			}
			if(!pila.isEmpty())pop = pila.pop();
			else pop=null;
		}
		if(!encontrado) System.out.println("el estudiante "+dniBusqueda+ " no esta dado de alta");
	}

}
