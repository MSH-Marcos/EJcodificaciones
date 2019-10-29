import clases.codificador;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        String frase = "La Operación Regenbogen ha sido todo un éxito, desplazarse mañana dia 25 al puerto de Bremen";

        String codigo = codificador.codificar(frase);

        System.out.println(codigo);

/*        codigo = codificador.decodificar(codigo);

        System.out.println(codigo);*/
    }
}
