package clases;

public class codificador {

    public static String codificar(String texto) {
        char[] array = texto.toCharArray();
        String resultado = "";

        for (int i = 0; i < array.length; i++) {
            array[i] = (char)((int)array[i] * 2 - 3);
        }

        resultado = new String(array);

        return resultado;
    }
}
