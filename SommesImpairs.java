import java.util.Scanner;

public class SommesImpairs {
    public static void main (String[]args) { 
        Scanner scanner = new Scanner(System.in);
    System.out.println ("entrez un nombres: ");
  int nombre = scanner.nextInt();
  int somme = calculerSommeImpairs(nombre);
  System.out.println("la somme des nombres impairs jusqu'a " + nombre + " est " + somme);
  scanner.close();
   }

   public static int calculerSommeImpairs(int max) {   
    int somme = 0;
    for (int i = 1; i <= max; i++) { 
        System.out.println("i = "+i);
        if (i % 2 !=0){
            somme += 1;
            System.out.println("somme = "+somme);
             }
            }
            return somme;
        }
    }
    
