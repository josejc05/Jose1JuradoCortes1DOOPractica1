package uax.practica1;

import uax.practica1.coleccion.Coleccion;
import uax.practica1.elementos.Moneda;
import uax.practica1.elementos.Sello;
import uax.practica1.enums.EstadoConservacionMoneda;
import uax.practica1.enums.EstadoConservacionSello;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Aquí creo una nueva colección
        Coleccion coleccion = new Coleccion();
        // Este es el escáner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int opcion = -1; // Inicializo la variable opción

        do {
            try {
                // Imprimo el menú de opciones
                System.out.println("Menú de Colección:");
                System.out.println("1. Añadir Moneda");
                System.out.println("2. Añadir Sello");
                System.out.println("3. Mostrar Monedas");
                System.out.println("4. Mostrar Sellos");
                System.out.println("5. Mostrar Precio Total");
                System.out.println("6. Mostrar Rareza Media");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumo la nueva línea

                switch (opcion) {
                    case 1:
                        // Aquí pido los datos para añadir una moneda
                        String paisMoneda = getStringInput(scanner, "Ingrese el país: ");
                        String autoridadMoneda = getStringInput(scanner, "Ingrese la autoridad gobernante: ");
                        int annusMoneda = getIntInput(scanner, "Ingrese el año: ");
                        double valorMoneda = getDoubleInput(scanner, "Ingrese el valor (decimales con ,): ");
                        scanner.nextLine(); // Consumo la nueva línea

                        String unidadMonetariaMoneda = getStringInput(scanner, "Ingrese la unidad monetaria: ");
                        double rarezaMoneda = getRarezaInput(scanner, "Ingrese la rareza (entre 1 y 100): ");
                        double precioMoneda = getDoubleInput(scanner, "Ingrese el precio (decimales con ,): ");
                        scanner.nextLine(); // Consumo la nueva línea
                        String composicion = getStringInput(scanner, "Ingrese la composición: ");
                        double peso = getDoubleInput(scanner, "Ingrese el peso (g): ");
                        double diametro = getDoubleInput(scanner, "Ingrese el diámetro (mm): ");
                        double grosor = getDoubleInput(scanner, "Ingrese el grosor (mm): ");
                        EstadoConservacionMoneda estadoConservacionMoneda = getEstadoConservacionMoneda(scanner);

                        // Creo una nueva moneda con los datos ingresados
                        Moneda moneda = new Moneda(paisMoneda, autoridadMoneda, annusMoneda, valorMoneda, unidadMonetariaMoneda, rarezaMoneda, precioMoneda,
                                composicion, peso, diametro, grosor, estadoConservacionMoneda);
                        // Añadir la moneda a la colección
                        coleccion.anadirMoneda(moneda);
                        break;

                    case 2:
                        // Aquí pido los datos para añadir un sello
                        String paisSello = getStringInput(scanner, "Ingrese el país: ");
                        String autoridadSello = getStringInput(scanner, "Ingrese la autoridad gobernante: ");
                        int annusSello = getIntInput(scanner, "Ingrese el año: ");
                        double valorSello = getDoubleInput(scanner, "Ingrese el valor (decimales con ,): ");
                        scanner.nextLine(); // Consumo la nueva línea

                        String unidadMonetariaSello = getStringInput(scanner, "Ingrese la unidad monetaria: ");
                        double rarezaSello = getRarezaInput(scanner, "Ingrese la rareza (entre 1 y 100): ");
                        double precioSello = getDoubleInput(scanner, "Ingrese el precio (decimales con ,): ");
                        double altura = getDoubleInput(scanner, "Ingrese la altura (cm): ");
                        double anchura = getDoubleInput(scanner, "Ingrese la anchura (cm): ");
                        scanner.nextLine(); // Consumo la nueva línea
                        String imagen = getNumericInput(scanner, "Ingrese el tamaño de la imagen (cm): ");
                        EstadoConservacionSello estadoConservacionSello = getEstadoConservacionSello(scanner);

                        // Creo un nuevo sello con los datos ingresados
                        Sello sello = new Sello(paisSello, autoridadSello, annusSello, valorSello, unidadMonetariaSello, rarezaSello, precioSello,
                                altura, anchura, imagen, estadoConservacionSello);
                        // Añadir el sello a la colección
                        coleccion.anadirSello(sello);
                        break;

                    case 3:
                        // Mostrar todas las monedas en la colección
                        System.out.println("Monedas en la colección:");
                        for (Moneda m : coleccion.mostrarMonedas()) {
                            System.out.println(m.getPais() + " - " + m.getValor() + " " + m.getUnidadMonetaria());
                        }
                        break;

                    case 4:
                        // Mostrar todos los sellos en la colección
                        System.out.println("Sellos en la colección:");
                        for (Sello s : coleccion.mostrarSellos()) {
                            System.out.println(s.getPais() + " - " + s.getValor() + " " + s.getUnidadMonetaria());
                        }
                        break;

                    case 5:
                        // Mostrar el precio total de la colección
                        System.out.println("Precio total de la colección: " + coleccion.obtenerPrecioTotal());
                        break;

                    case 6:
                        // Mostrar la rareza media de la colección
                        System.out.println("Rareza media de la colección: " + coleccion.obtenerRarezaMedia());
                        break;

                    case 0:
                        // Salir del programa
                        System.out.println("Saliendo...");
                        break;

                    default:
                        // Opción no válida
                        System.out.println("Opción no válida.");
                        break;
                }
            } catch (Exception e) {
                // Capturar cualquier excepción y pedir al usuario que lo intente de nuevo
                System.out.println("Ocurrió un error. Vuelve a intentarlo.");
                scanner.nextLine(); // Consumir la nueva línea para evitar bucles infinitos
            }
        } while (opcion != 0);

        // Cerrar el escáner
        scanner.close();
    }

    private static int getIntInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                // Pedir un número entero al usuario
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                // Si la entrada no es válida, pedir al usuario que lo intente de nuevo
                System.out.println("Entrada no válida. Vuelve a intentarlo.");
                scanner.nextLine(); // Consumir la entrada no válida
            }
        }
    }

    private static double getRarezaInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                // Pedir un número decimal al usuario
                System.out.print(prompt);
                double input = scanner.nextDouble();
                if (input >= 1.0 && input <= 100.0) {
                    return input;
                } else {
                    // Si el valor no está entre 1 y 100, pedir al usuario que lo intente de nuevo
                    System.out.println("Entrada no válida. El valor debe estar entre 1 y 100. Vuelve a intentarlo.");
                }
            } catch (InputMismatchException e) {
                // Si la entrada no es válida, pedir al usuario que lo intente de nuevo
                System.out.println("Entrada no válida. Vuelve a intentarlo.");
                scanner.nextLine(); // Consumir la entrada no válida
            }
        }
    }

    private static double getDoubleInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                // Pedir un número decimal al usuario
                System.out.print(prompt);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                // Si la entrada no es válida, pedir al usuario que lo intente de nuevo
                System.out.println("Entrada no válida. Vuelve a intentarlo.");
                scanner.nextLine(); // Consumir la entrada no válida
            }
        }
    }

    private static String getStringInput(Scanner scanner, String prompt) {
        while (true) {
            // Pedir una cadena de texto al usuario
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (input.matches("[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ ]+")) { // Permitir letras, tildes y espacios
                return input;
            } else {
                // Si la entrada no es válida, pedir al usuario que lo intente de nuevo
                System.out.println("Entrada no válida. Solo se permiten letras, tildes y espacios. Vuelve a intentarlo.");
            }
        }
    }

    private static String getNumericInput(Scanner scanner, String prompt) {
        while (true) {
            // Pedir un número o decimal con coma al usuario
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (input.matches("\\d+(,\\d+)?")) { // Permitir solo números y decimales con coma
                return input;
            } else {
                // Si la entrada no es válida, pedir al usuario que lo intente de nuevo
                System.out.println("Entrada no válida. Solo se permiten números y decimales con coma. Vuelve a intentarlo.");
            }
        }
    }

    private static EstadoConservacionMoneda getEstadoConservacionMoneda(Scanner scanner) {
        while (true) {
            try {
                // Pedir el estado de conservación de la moneda al usuario
                System.out.print("Ingrese el estado de conservación (G, VG, F, VF, XF, AU, UNC): ");
                return EstadoConservacionMoneda.valueOf(scanner.next());
            } catch (IllegalArgumentException e) {
                // Si la entrada no es válida, pedir al usuario que lo intente de nuevo
                System.out.println("Estado de conservación no válido. Vuelve a intentarlo.");
            }
        }
    }

    private static EstadoConservacionSello getEstadoConservacionSello(Scanner scanner) {
        while (true) {
            try {
                // Pedir el estado de conservación del sello al usuario
                System.out.print("Ingrese el estado de conservación (U, NSG, NF, N): ");
                return EstadoConservacionSello.valueOf(scanner.next());
            } catch (IllegalArgumentException e) {
                // Si la entrada no es válida, pedir al usuario que lo intente de nuevo
                System.out.println("Estado de conservación no válido. Vuelve a intentarlo.");
            }
        }
    }
}