import java.util.Scanner;

public class Bisiesto {
	
	Scanner leer = new Scanner (System.in);
	
	 int año, a;
	 public void añosBisiesto() {
		 do {
  System.out.println("Introduce un año");
	
  año = leer.nextInt(); 
   
   if ((año % 4 == 0 && año % 100 != 0) || (año % 100 == 0 && año % 400 == 0)) {
       System.out.println("El año " + año + " es bisiesto");
   } else {
       System.out.println("El año " + año + " no es bisiesto");
   }
   System.out.println("si quiere seguir con otro año oprima 1 si quiere saber las cifras de un numero presione 2");
  
   a = leer.nextInt();
	 }
		 while (a==1); 
	 } 
}
