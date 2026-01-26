package modelos;

import java.util.Scanner;

public class Conversion {
    Scanner scanner= new Scanner(System.in);

    public void solicitarYconvertir(String base, String target){
        double monto;

        do {
            try{
                System.out.println("\nIngrese el monto a convertir: ");
                monto=scanner.nextDouble();
                if (monto<=0){
                    System.out.println("El monto debe ser un numero positivo.");
                }
            }catch (Exception e){
                System.out.println("Entrada inválida. Por favor ingrese un numero positivo.");
                scanner.nextLine();
                monto=-1;
            }
        }while (monto<=0);

        ConsultaApiExchange consulta=new ConsultaApiExchange();
        double tasaDeCambio=consulta.consultaApiExchange(base, target);
        double resultado=calcular(monto, tasaDeCambio);
        mostrarResultado(monto, base, resultado, target);
    }

    private void mostrarResultado(double monto, String base, double resultado, String target) {
        System.out.println("\nConversión terminada.");
        System.out.println(monto+" "+base+" equivale a "+ String.format("%.4f", resultado) +
                " " + target);
    }

    private double calcular(double monto, double tasaDeCambio) {
        return (monto*tasaDeCambio);
    }
}
