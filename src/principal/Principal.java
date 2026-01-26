package principal;

import modelos.Conversion;
import modelos.MenuPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner opcionUsuario=new Scanner(System.in);
        Conversion conversion=new Conversion();
        MenuPrincipal menu=new MenuPrincipal();

        while (true){
            menu.mostrarOpciones();
            try {
                var opcion=opcionUsuario.nextInt();
                if (opcion==9){
                    break;
                }
                // crear switch en cuyos case se llame a conversión con los codigos de ambas monedas
                switch (opcion){
                    case 1:
                        conversion.solicitarYconvertir("USD","ARS");
                        break;
                    case 2:
                        conversion.solicitarYconvertir("ARS","USD");
                        break;
                    case 3:
                        conversion.solicitarYconvertir("USD","BRL");
                        break;
                    case 4:
                        conversion.solicitarYconvertir("BRL","USD");
                        break;
                    case 5:
                        conversion.solicitarYconvertir("USD","COP");
                        break;
                    case 6:
                        conversion.solicitarYconvertir("COP","USD");
                        break;
                    case 7:
                        conversion.solicitarYconvertir("USD","MXN");
                        break;
                    case 8:
                        conversion.solicitarYconvertir("MXN","USD");
                        break;
                    default:
                        System.out.println("\nOpción inválida.");
                }
            }catch (Exception e){
                System.out.println("\nPor favor, ingrese una opción válida.");
                opcionUsuario.nextLine();
            }
        }

    }
}
