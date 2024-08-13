package com.example;

import java.util.List;
import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);
    private static final PaisDAO paisDAO = new PaisDAO();

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    agregarPais();
                    break;
                case 2:
                    buscarPais();
                    break;
                case 3:
                    actualizarPais();
                    break;
                case 4:
                    eliminarPais();
                    break;
                case 5:
                    mostrarPaises();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, intenta de nuevo.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú de Países:\n");
        System.out.println("1. Agregar País");
        System.out.println("2. Buscar País");
        System.out.println("3. Actualizar País");
        System.out.println("4. Eliminar País");
        System.out.println("5. Mostrar Países");
        System.out.println("6. Salir");
        System.out.print("\nElige una opción: ");
    }

    private static void agregarPais() {
        System.out.print("Ingrese el nombre del país: ");
        String nombrePais = scanner.nextLine();
        System.out.print("Ingrese la capital del país: ");
        String capital = scanner.nextLine();
        Pais pais = new Pais(0, nombrePais, capital);
        paisDAO.agregarPais(pais);
        System.out.println("País agregado exitosamente.");
    }

    private static void buscarPais() {
        System.out.print("Ingrese el ID del país a buscar: ");
        int id = Integer.parseInt(scanner.nextLine());
        Pais pais = paisDAO.obtenerPaisPorId(id);
        if (pais != null) {
            System.out.println(pais);
        } else {
            System.out.println("País no encontrado.");
        }
    }

    private static void actualizarPais() {
        System.out.print("Ingrese el ID del país a actualizar: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el nuevo nombre del país: ");
        String nombrePais = scanner.nextLine();
        System.out.print("Ingrese la nueva capital del país: ");
        String capital = scanner.nextLine();
        Pais pais = new Pais(id, nombrePais, capital);
        paisDAO.modificarPais(pais);
        System.out.println("País actualizado exitosamente.");
    }

    private static void eliminarPais() {
        System.out.print("Ingrese el ID del país a eliminar: ");
        int id = Integer.parseInt(scanner.nextLine());
        paisDAO.eliminarPais(id);
        System.out.println("País eliminado exitosamente.");
    }

    private static void mostrarPaises() {
        List<Pais> paises = paisDAO.obtenerPaises();
        if (paises.isEmpty()) {
            System.out.println("No se encontraron países.");
        } else {
            System.out.println("\nLista de países:\n");
            for (Pais pais : paises) {
                System.out.println(pais);
            }
        }
    }
}
