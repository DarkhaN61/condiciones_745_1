import java.util.Scanner;

class Condicion {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese su nombre");
    int nom = leer.nextInt();
    System.out.println("Ingrese su dia de nacimiento");
    int dia = leer.nextInt();
    System.out.println("Ingrese su mes de nacimiento");
    int mes = leer.nextInt();
    System.out.println("Ingrese su año de nacimiento");
    int an = leer.nextInt();
    System.out.println("Ingrese el dia actual");
    int dia2 = leer.nextInt();
    System.out.println("Ingrese mes actual");
    int mes2 = leer.nextInt();
    System.out.println("Ingrese año actual");
    int an2 = leer.nextInt();	
    resultado = an2 - an - 1;
    resultado2 = an2 - an;
    if(dia>dia2)
    {	
	if(mes>=mes2)
          {
      System.out.println("Su edad es: "+resultado+"");
	   }
	else{
            System.out.println("Su edad es: "+resultado2+"");
            }
      System.out.println("El numero: "+n1+" es el mayor");
    }
    else
    {
      System.out.println("El numero: "+n2+" es el mayor");
    }
  }
}
