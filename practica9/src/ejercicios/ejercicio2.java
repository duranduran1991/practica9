package ejercicios;

import java.util.*;

public class ejercicio2 {
	/*
	 * 2. Programa que lee 5 nombres de personas. Introducirlos en un array y
	 * ordenarlos alfabéticamente. Comprobar si otro nombre introducido después
	 * se encuentra entre esos 5.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1;
		String cadena;
		String cadenas[] = new String[5];

		for (int i = 0; i < cadenas.length; i++) {
			System.out.println(" Introduce la palabra " + x);
			cadenas[i] = sc.nextLine();
			x++;
		}
			Arrays.sort(cadenas);
		
		/*for (int i = 0; i < cadenas.length; i++) {
				System.out.println(cadenas[i]);
			}*/	
		
		System.out.println("Introduce el nombre a comparar");
		cadena=sc.nextLine();
		
		for(int i=0;i<cadenas.length;i++){
			if(cadenas[i].equalsIgnoreCase(cadena)){
			System.out.println("El nombre se encuentra dentro de la cadena");	
				break;
			}else{
			System.out.println("No se ha encontrado");	
				break;
			}
			
		}

	}

}
