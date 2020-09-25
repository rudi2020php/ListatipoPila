package listastipopila;

import javax.swing.JOptionPane;

public class Pila {

    //declaramos las variables 
    private Nodo UltimoValorIngresado;
    int tamano = 0;
    String Lista = "";

    //método constructor pila
    public Pila() {
        UltimoValorIngresado = null;
        tamano = 0;
    }
    
    //método para saber si la pila esta vacia
    public boolean PilaVacia(){
        return UltimoValorIngresado == null;
    }
    
    //método para insertar un nodo a nuestra pila
    public void insertarNodo(int nodo){
        Nodo nuevo_nocdo = new Nodo(nodo);
        nuevo_nocdo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nocdo;
        tamano ++;
    }
    
//    método para eliminar un nodo de la pila
    public int EliminaNodo(){
        int aux = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamano--;
        return aux;
    }
    
//    método para conocer cúal es el último valor ingresado
    public int MostrarUltimoValorIngresado(){
        return UltimoValorIngresado.informacion;
    }
    
//    método para conocer el tamaño de la pila
    public int TamanoPila(){
        return tamano;
    }
    
//    método para vaciar la pila
    public void VaciarPila(){
        while (!PilaVacia()){
            EliminaNodo();
        }
    }
    
//    método para mostrar el contenido de la pila
    public void MostrarValores(){
        Nodo recorrido = UltimoValorIngresado;
        
        while(recorrido != null){
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }
}
