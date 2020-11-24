package pilaslaptop;

import javax.swing.*;

public class ClasePrincipal {
    public static void main(String args[]) {
        int opc = 0;
        String nodo = "";
        Pila pila = new Pila();
        do {
            try {
                opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Menú de opciones\n\n" +
                        "1. Insertar nodo \n" + "2. Eliminar un nodo\n" + "3. ¿La pila esta vacia?\n" + "4. Ultimo valor ingresado\n" + "5. Cuantos nodos tiene la pila\n" + "6. Vaciar pila \n" + "7. Mostrar contenido de pila\n" + "8. Salir.\n\n"));
                switch (opc) {
                    case 1 -> {
                        nodo = JOptionPane.showInputDialog(null,"Ingrese la marca")+" "+JOptionPane.showInputDialog(null, "Ingrese el procesador")+" "+JOptionPane.showInputDialog(null, "Ingrese la memoria insertada");
                        pila.InsertarNodo(nodo);
                    }
                    case 2 -> {
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se ha eliminado el nodo con el valor :" + pila.EliminarNodo());
                        } else {
                            JOptionPane.showMessageDialog(null,"La pila esta vacia");
                        }
                    }
                    case 3 -> {
                        if (pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila NO esta vacia");
                        }
                    }
                    case 4 -> {
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "El ultimo valor agregado es: " + pila.UltimoValorIngresado());
                        } else {
                            JOptionPane.showMessageDialog(null, "La vila esta vacia");
                        }
                    }
                    case 5 -> {
                        JOptionPane.showMessageDialog(null, "La pila contiene: " + pila.tamano() + " nodos.");
                    }
                    case 6 -> {
                        if (!pila.PilaVacia()) {
                            pila.Vaciar();
                            JOptionPane.showMessageDialog(null, "Se ha vaceado la pila correctamene");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                    }
                    case 7 -> pila.Mostrar();
                    case 8 -> opc = 8;
                    default -> JOptionPane.showMessageDialog(null, "Opcón invalida, vuelve a intentar");
                }

            } catch (NumberFormatException e) {

            }
        } while (opc != 8);
    }

}
