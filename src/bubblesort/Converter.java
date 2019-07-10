package bubblesort;

public class Converter {

    public static int[] converter(String[] valores) {

        int values[] = new int[valores.length];

        for (int i = 0; i < valores.length; i++) {
            values[i] = Integer.parseInt(valores[i]);
        }
        return values;
    }
}
