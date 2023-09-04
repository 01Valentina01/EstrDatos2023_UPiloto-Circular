/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Jirg
 */
public class InterfazAppColaCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ResizingIterableArrayColaCircular queue = new ResizingIterableArrayColaCircular();
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        do
        {
            System.out.println("\n\n COLA CIRCULAR");
            System.out.println(" 1. Ingresar Nodo:");
            System.out.println(" 2. Buscar Nodo:");
            System.out.println(" 3. Modificar Nodo:");
            System.out.println(" 4. Eliminar Nodo");
            System.out.println(" 5. Desplegar Lista");
            System.out.println(" 6. Salir");
            System.out.print(" Escoja una opcion:");
            opcion = teclado.nextInt();

            switch (opcion)
            {
                case 1:
                    System.out.println("\n INGRESAR NODO:");
                    System.out.println(" Ingrese el dato del nodo:");
                    int dato = teclado.nextInt();
                    queue.enqueue(dato);
                    break;
                case 2:
                    System.out.println("\n BUSCAR DATO:");
                    System.out.println(" Ingrese el dato del Nodo a buscar:");
                    dato = teclado.nextInt();
                    queue.buscarNodo(dato);
                    break;
                case 3:
                    System.out.println("\n MODIFICAR NODO:");
                    System.out.println(" Ingrese el Nodo a modificar:");
                    dato = teclado.nextInt();
                    queue.modificarNodo(dato);
                    break;

                case 4:
                    System.out.println("\n ELIMINAR nODO:");
                    System.out.println(" Ingrese el Nodo a eliminar:");
                    dato = teclado.nextInt();
                    queue.dequeue(dato);
                    break;
                case 5:
                    System.out.println("\n LISTA DE NODOS:");
                    queue.desplegar();
                    break;
                case 6:
                    System.out.println("\n\n PROGRAMA FINALIZADO");
                    break;
                    default:
                        System.out.println("\n OPCION NO VALIDA!!!");

            }
        } while (opcion != 6);

    }

}
/*
 queue.enqueue(10);
        queue.enqueue(24);
        queue.enqueue(63);
        queue.enqueue(78);
        queue.enqueue(1);
        queue.enqueue(34);
        queue.enqueue(10);
        queue.enqueue(45);
        queue.enqueue(58);
        queue.enqueue(8);
        queue.enqueue(16);
        queue.enqueue(80);
        queue.enqueue(34);
        queue.desplegar();

        
        System.out.println("Elemento eliminado: " + queue.dequeue());
        System.out.println("Elemento eliminado: " + queue.dequeue());
        System.out.println("Elemento eliminado: " + queue.dequeue());
        System.out.println("Elemento eliminado: " + queue.dequeue());
        

        System.out.println("El tamaño de la cola es: " + queue.size());
        
       Iterator it = queue.iterator();
        while(it.hasNext()){
            System.out.println("Los elementos de la cola son: "+it.next());
            
        }
         
 */
