package ejercicios;
import java.util.*;
public class ejercicio3 {
	/*3. Leed números de teclado hasta que lo desee el usuario hasta un máximo de 20, y
	metedlos de forma ordenada en un array (desplazando los demás a la derecha si
	fuera necesario). Si el número ya está repetido mostrad un error y leed el
	siguiente.*/
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int numero[]=new int[3];
	
	for(int i=0;i<numero.length;i++){
	System.out.println("Introduce los numeros a ordenar");
	numero[i]=sc.nextInt();
	}
	Arrays.sort(numero);
	
	for(int i=0;i<numero.length;i++){
	System.out.println(numero[i]);
		}
	
	}

}
