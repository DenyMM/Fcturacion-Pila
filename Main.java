package ea;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static Scanner entrada = new Scanner (System.in);
    
	public static void main(String[] args) {
		String opc; 
	     String oth = null;
		do { 	
		Stack  pila1 = new Stack  ();
		Stack  pila2 = new Stack  ();
		
		int artiCode = 0;
        String artiName = null ;
        int pieces = 0;
        int pricePi = 0;
        int menu = 0;
        
        System.out.println("--------------------------------");
        System.out.println("- 1- Codigo del articulo       -");
        System.out.println("- 2- Nombre del articulo       -");
        System.out.println("- 3- Numero de piezas          -");
        System.out.println("- 4- Precio del articulo       -");
        System.out.println("- 5- Salir                     -");
        System.out.println("--------------------------------");
        
        System.out.print("¿Que quieres hacer?");
        menu = entrada.nextInt();
        
		/*Apilar*/
        if (menu == 1) {
        System.out.print("Ingrese el codigo del articulo: ");
    	artiCode = entrada.nextInt();
    	System.out.print("¿Quieres insertar otro dato?");
        menu = entrada.nextInt();
        }
        if (menu ==2) {
		System.out.print("Ingrese el nombre del articulo: ");
		artiName = entrada.next();
		System.out.print("¿Quieres insertar otro dato?");
        menu = entrada.nextInt();
        }
        if (menu ==3) {
		System.out.print("Ingrese el numero de piezas: ");
		pieces = entrada.nextInt();
		System.out.print("¿Quieres insertar otro dato?");
        menu = entrada.nextInt();
        }
        if (menu ==4) {
		System.out.print("Ingrese el precio del articulo: ");
		pricePi = entrada.nextInt();
		System.out.print("¿Quieres insertar otro dato?");
        menu = entrada.nextInt();
        } else {
        	System.out.print("Gracias");
        }
        
	
		pila1.push("Codigo del articulo: "+artiCode);
		pila1.push("Nombre del articulo: "+artiName);
		pila1.push("Piezas: "+pieces);
		pila1.push("Precio de piezas: "+pricePi);
		
		pila2.push(pila1);
	
	
	 System.out.println("Datos de factura: "+ artiCode + artiName + pieces + pricePi);
	 
	 System.out.print("¿Ver las facturas acumuladas?");
			 System.out.println ("S / N"); 
	            opc = entrada.next();  
	            if (opc == "S") {
	            	System.out.print("Estas son sus facturas: " + pila2 );
	            } else {
	            	System.out.print("¿Quiere realizar otra factura?" );
	            	System.out.print("Si / No" );
	            	oth = entrada.next();
	            }
	            
	        } while (oth.equals("si") || oth.equals("Si") || oth.equals("SI"));{
	        	
	        } 
     }
	}
