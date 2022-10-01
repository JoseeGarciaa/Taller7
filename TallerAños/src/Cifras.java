import java.util.Scanner;

public class Cifras {
	
	Scanner leer = new Scanner (System.in);
	
	int numero, cifras;
	char seguir;
	
public void cifras(){
	
	System.out.println("digite un numero entero para contar cifras");
	numero = leer.nextInt();
	  cifras= 0;
	  
	  
	do {
	
	
	  numero=numero/10;
		cifras++;
		
	}
	  while(numero!=0);
		   System.out.println("El número tiene " + cifras+ " cifras");
		   preguntar();
		   
		   
	
	
       
       
}

public void preguntar () {
	
	System.out.println("si quiere continuar digite la letra S mayuscula, si no quiere segir digite N");
	seguir = leer.next().charAt(seguir);
	
	if(seguir == 'S') {
		 cifras();
	}
	else {
		salir();
	}
}
public void salir() {
	
	System.out.println("el programa ha terminado");
}


}
