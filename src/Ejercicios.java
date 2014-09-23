import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

//Trabajo en grupo Kevin Lanza,Maynor Morales,Iveth Sabillon,Walter Valle,Alex Escoto,Maverick del Cid

public class Ejercicios {
	
	//Devuelve true si todos los elementos de 'mi_lista' son pares, de lo contrario devuelve false
	static boolean sonPares(ArrayList<Integer> mi_lista)
	{
		
		int num=0;//Se crea una variable numerica
		for(int i=0;i<mi_lista.size();i++){//ciclo para recorrer la lista
			
			if(mi_lista.get(i)%2==0){//Se le saca el residuo de la operacion
				num++;//Se va sumando la variable si es verdad
				
			}
		if(num==mi_lista.size()){//Se mira si es par en toda la lista  
			return true;
		}
		}
		
		return false;
	}
	
	//Devuelve el numero menor almacenado en 'mi_lista'
	static int getMenor(ArrayList<Integer> mi_lista)
	{
	int menor = mi_lista.get(0); // Se hace una variable para ir evaluar si es la menor
		
		for(int i = 0; i < mi_lista.size(); i++)
		{
			if (mi_lista.get(i) < menor )// Se evalua si la variable es menor a numero que tire la lista
			{
				menor = mi_lista.get(i); // Si el numero de la lista es menor  se convierte en el valor de la variable
			}
		}
		return menor; // Devuelve la respuesta
	}
	
	//Devuelve el numero menor de un archivo
	//Dado, el archivo unicamente contiene enteros
	static int getNumeroMayor(String nombre_archivo)
	{
		int mayor = -9999;//Se hace una variable de tipo int
		try//Se hace un try para poder escribir en el archivo
		{
			File archivo = new File(nombre_archivo);// se hace un archivo y se le asigna el valor de la variable ya hecha
			Scanner s = new Scanner (archivo);//Se hace un scanner 
			while(s.hasNext())//Aqui con el while se ponen las condiciones para q recorra todo el archivo
			{
				int num = s.nextInt();//el usuario agrega un numero
				if (num > mayor)//con un if se evalua si el numero es menor que la variable hecha
					mayor=num;//Si el numero es menor,la variable toma el valor de ese numero
				}
			}catch (Exception e)//Se define el catch para asignar un error 
			{
				e.printStackTrace();
			}
		return mayor;//Devuelve la respuesta
	}
	
	//Devuelve cuantas veces existe la string buscada en el archivo con nombre nombre_archivo
	static int cuantasVecesExiste(String nombre_archivo, String buscada)
	{
		int existe=0;//Se crea una variable
		
		try
		{
			File archivo = new File(nombre_archivo);//Se le da nombre al archivo
			Scanner s = new Scanner (archivo);//SE hace un scanner
			while(s.hasNext())//Aqui con el while se ponen las condiciones para q recorra todo el archivo
			{	
				String resultado = s.next();//Utilizamos el scanner con la variable
				if (resultado.equals(buscada))//Se evalua si nuestra variable hecha es la igual a la que buscamos
				{
					existe++;//Si existe que vaya sumando nuestra otra variable
				}
				}
			
			
			}catch (Exception e)//Se define el catch para asignar un error 
			{
				e.printStackTrace();
			}
		return existe;//devuelve la respuesta
}
}

