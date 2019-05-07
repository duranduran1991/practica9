package ejercicios;
import java.util.*;
public class ejercicio1 {
	/*1. Programa que lea 10 números por teclado , pida otro más y compruebe cuantas
	veces se repite este último entre los 10 introducidos.*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,cont=0,x=1;
		int numero[]=new int[10];
		
		for(int i=0;i<numero.length;i++){
			System.out.println(" Introduce el numero " + x);
			numero[i]=sc.nextInt();
			x++;
		}
		System.out.println("Introduce el numero a buscar");
		num=sc.nextInt();
		for(int i=0;i<numero.length;i++){
			if(numero[i]==num){
				cont++;
			}
		}
		System.out.println(" El numero " + num + " se repite " + cont + " veces " );
	
	}
	
	

}
