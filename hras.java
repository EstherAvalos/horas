import java.util.Scanner;

public class hras {
    public static void main(String[] args) {
      Scanner entrada =new Scanner(System.in) ;
      int horastotales, semanas, dias, horas;
      System.out.println("Digite el numero de horas: ");
      horastotales=  entrada.nextInt();
      semanas= horastotales/168;
      dias= horastotales/24;
      horas= horastotales%24;

        System.out.println("\nEl equivalente es: ");
        System.out.println("Semanas: "+semanas);
        System.out.println("Dias: "+dias);
        System.out.println("Horas: "+ horas);
    }
}