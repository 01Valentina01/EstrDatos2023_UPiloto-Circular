/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola;


import java.util.Scanner;

/**
 *
 * @author Jirg
 */
public class ResizingIterableArrayColaCircular{

    Scanner teclado = new Scanner(System.in);
    private Node primero; 
    private Node ultimo; 
    private int count;    
    
    //se inicializa con vacia la cola
    
    private class Node{ 
        int dato;
        Node siguiente; 
        Node anterior; 
       
    }

    public ResizingIterableArrayColaCircular() {  //constructor de la clase 
        
        count = 0;
        primero = null;
        ultimo = null;
    }

    //encolar o insertar en la fila
    public void enqueue(int x) {
        Node nuevo = new Node();
        nuevo.dato = x;
        if(primero == null){
            primero = nuevo;
            primero.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
            primero.anterior = ultimo;
        }
    }
    
    public void modificarNodo(int x){
        Node actual = new Node();
        actual = primero;
        do{
            if(actual.dato == x ){
                System.out.println(" Ingrese un nuevo valor para el Nodo:");
                actual.dato = teclado.nextInt();
            }
            actual = actual.siguiente;
        }while(actual != primero);
    }
    
     public void buscarNodo(int x){
            Node actual = new Node();
            actual = ultimo;
            boolean encontrado = false;
            do{
                if(actual.dato == x){
                    encontrado = true;
                }
                actual = actual.anterior;
            }while(actual != ultimo && encontrado != true);
            
            if(encontrado == true){
                System.out.println("\n NODO ENCONTRADO");
            }else{
                System.out.println("\n NODO NO ENCONTRADO");
            }
        }
     
     
    public void desplegar(){
        Node actual = new Node();
        actual = primero;
        do{
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }while(actual != primero);
    }

    //desencolar o quitar en la fila
    public void dequeue(int x) {
      Node actual = new Node();
      Node anterior = new Node();
      actual = primero;
      anterior = ultimo;
      do{
          if(actual.dato == x){
             if(actual == primero){
                 primero = primero.siguiente;
                 ultimo.siguiente = primero;
                 primero.anterior = ultimo;
             }else if(actual == ultimo){
                 ultimo = anterior;
                 primero.anterior = ultimo;
                 ultimo.siguiente = primero;
             }else{
                 anterior.siguiente = actual.siguiente;
                 actual.siguiente.anterior = anterior;
             }
          }
          anterior = actual;
          actual = actual.siguiente;
      }while(actual != primero);       
    }

    public boolean isEmpty() {
        return count == 0;

    }
    
    public int size() {
        return count;
    }


   
    

    
}
