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
    int r = leer.nextInt();
    int r2 = leer.nextInt();	
    r = an2 - an - 1;
    r2 = an2 - an;
    if(dia>31)
     {
       System.out.println("dia invalido");
      }
     if(mes>31)
     {
       System.out.println("mes invalido");
      }
     if(dia<1)
     {
       System.out.println("dia invalido");
      }
      if(mes<1)
     {
       System.out.println("mes invalido");
      }
      if(an>an2)
     {
       System.out.println("puede que usted no haya nacido");
      }
   if(mes>mes2)
    {		
      System.out.println("Su edad es: "+r+"");
    }
    else
    {
     if(mes==mes2)
       { 
         if(dia>dia2)
         { 
           System.out.println("Su edad es: "+r+"");
           }
         else
          {
           System.out.println("Su edad es: "+r2+"");  
           }  
        }
     else
       {
        System.out.println("Su edad es: "+r2+"");
        }
    if(mes==1)
       { 
         if(dia<=20)
           {
             System.out.println("Su signo zodiacal es capricornio");
           } 
         else
           {
            System.out.println("Su signo zodiacal es acuario");
            } 
       }
     if(mes==2)
       { 
         if(dia<=19)
           {
             System.out.println("Su signo zodiacal es acuario");
           } 
         else
           {
            System.out.println("Su signo zodiacal es piscis");
            }   
       }
      if(mes==3)
       { 
         if(dia<=20)
           {
             System.out.println("Su signo zodiacal es piscis");
           } 
         else
           {
            System.out.println("Su signo zodiacal es aries");
            }
       }
        if(mes==4)
       { 
         if(dia<=20)
           {
             System.out.println("Su signo zodiacal es aries");
           } 
         else
           {
            System.out.println("Su signo zodiacal es tauro");
            }
       }
         if(mes==5)
       { 
         if(dia<=20)
           {
             System.out.println("Su signo zodiacal es tauro");
           } 
         else
           {
            System.out.println("Su signo zodiacal es geminis");
            }
       }
        if(mes==6)
       { 
         if(dia<=20)
           {
             System.out.println("Su signo zodiacal es geminis");
           } 
         else
           {
            System.out.println("Su signo zodiacal es cancer");
            }
       }
        if(mes==7)
       { 
         if(dia<=22)
           {
             System.out.println("Su signo zodiacal es cancer");
           } 
         else
           {
            System.out.println("Su signo zodiacal es leo");
            }
       }
         if(mes==8)
       { 
         if(dia<=23)
           {
             System.out.println("Su signo zodiacal es leo");
           } 
         else
           {
            System.out.println("Su signo zodiacal es virgo");
            }
       }
         if(mes==9)
       { 
         if(dia<=22)
           {
             System.out.println("Su signo zodiacal es virgo");
           } 	
         else
           {
            System.out.println("Su signo zodiacal es libra");
            }
       }
         if(mes==10)
       { 
         if(dia<=23)
           {
             System.out.println("Su signo zodiacal es libra");
           } 
         else
           {
            System.out.println("Su signo zodiacal es escorpio");
            }
       }
         if(mes==11)
       { 
         if(dia<=22)
           {
             System.out.println("Su signo zodiacal es escorpio");
           } 
         else
           {
            System.out.println("Su signo zodiacal es sagitario");
            }
       }
         if(mes==12)
       { 
         if(dia<=21)
           {
             System.out.println("Su signo zodiacal es sagitario");
           } 
         else
           {
            System.out.println("Su signo zodiacal es capricornio");
            }
       }             
    }
  }
}
