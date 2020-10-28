package com.company;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;


public class AdressBook {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        //Creamos un hashmap (clave=nombre, valor=telefono)
        HashMap<String, Integer> agenda = new HashMap<>();

        //Creamos el teclado
        Contactos teclado = new Contactos();

        String nombre;
        int telefono;

        //menu
        while (!salir) {

            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Salir");
            try {
                System.out.println("Ingresa el numero de la opcion que deseas realizar");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        nombre = teclado.pedirString("Ingresa el nombre").toLowerCase().trim();
                        telefono = teclado.pedirInt("Ingresa el telefono");
                        if(!agenda.containsKey(nombre)){
                            agenda.put(nombre.toLowerCase().trim(), telefono);
                            System.out.println("Se ha añadido el contacto");
                        }else{
                            System.out.println("Ya existe el contacto");
                        }
                        break;
                    case 2:
                        if(agenda.entrySet().isEmpty()){
                            System.out.println("No hay contactos");
                        }else{
                            for(Map.Entry<String, Integer> entry: agenda.entrySet()){
                                System.out.println("Telefono: "+entry.getValue()+" Nombre:"+entry.getKey());
                            }
                        }
                        break;
                    case 3:
                        telefono = teclado.pedirInt("Ingresa el telefono");
                        if(agenda.containsValue(telefono)){
                            agenda.remove(telefono);
                            System.out.println("El contacto se ha borrado");
                        }else{
                            System.out.println("El contacto no existe");
                        }

                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 6");
                }

            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }

        }

    }

}
