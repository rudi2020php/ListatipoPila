
package listastipopila;

public class ListasTipoPila {

    public static void main(String[] args) {
        
        //declaramos las variables globales
        int opcion = 0, nodo = 0;
        Pila pila = new Pila();
        
        do {                
                try {
                opcion = Integer.parseInt(JOptionPane.showImputDialog(null, 
                        "Menú de Opciones \n\n"
                                + "1.- Insertar Un NODO \n"
                                + "2.- Eliminar un NODO \n"
                                + "3.- ¿La Pila está vacía? \n"
                                + "4.- ¿Cúal es el último valor ingresado a la Pila? \n"
                                + "5.- ¿Cúantos NODOS tiene la Pila? \n"
                                + "6.- Vaciar Pilas \n"
                                + "7.- Mostrar contenido de la Pila \n"
                                + "8.- salir \n\n\n"
                                + "by: Rudi Dearcia"));
                
                
            } catch (Exception e) {
            }
            } while (opcion != 8);
    }
    
}
