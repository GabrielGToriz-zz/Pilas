package pilaslaptop;

import javax.swing.*;

public class Pila {
    private Nodo UltimoValorIngresado;
    int tam = 0;
    String Lista = "";

    public Pila() {
        UltimoValorIngresado = null;
        tam = 0;
    }

    //PILA VACIA
    public boolean PilaVacia() {
        return UltimoValorIngresado == null;
    }

    //INSERTAR EN LA PILA
    public void InsertarNodo(String nodo) {
        Nodo _nuevoNodo = new Nodo(nodo);

        _nuevoNodo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = _nuevoNodo;
        tam++;
    }

    //ELIMINAR OBJETOS DE LA PILA
    public String EliminarNodo() {
        String aux = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tam--;
        return aux;
    }

    //ULTIMO VALOR INGRESADO
    public String UltimoValorIngresado() {
        return UltimoValorIngresado.informacion;
    }

    //Tamaño de la pila
    public int tamano() {
        return tam;
    }

    //Vaciar la pila
    public void Vaciar() {
        while (!PilaVacia()) {
            EliminarNodo();
        }
    }

    //MOSTRAR TODA LA PILA
    public void Mostrar() {
        Nodo recorrido = UltimoValorIngresado;
        while (recorrido != null) {
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }
}
