import java.util.ArrayList;

/**
 * @author Antonio Ruiz Benito = speedemon
 */
public class SpeeDemon3_39 {

    /*
     * Crea una función que encuentre todos los triples pitagóricos
     * (ternas) menores o iguales a un número dado.
     * - Debes buscar información sobre qué es un triple pitagórico.
     * - La función únicamente recibe el número máximo que puede
     *   aparecer en el triple.
     * - Ejemplo: Los triples menores o iguales a 10 están
     *   formados por (3, 4, 5) y (6, 8, 10).
     *
     *  Formula --> a² + b² = c²
     *
     */

    public static void triplesPitagoricos(int numMax) {

        ArrayList<String> result = new ArrayList<String>();




        for (int a = 1; a <= numMax; a++) {

            for (int b = a; b <= numMax; b++) {

                for (int c = b; c <= numMax; c++) {

                    int powA = a * a;
                    int powB = b * b;
                    int powC = c * c;
                    int aSumB = powA + powB;

                    System.out.println("valor de c ->" + powC);
                    System.out.println("valor de a + b ->" + aSumB);

                    if(powC == aSumB) {

                        String data = "(" + a + ", " + b + ", " + c + ")";

                        result.add(data);

                    }


                }

            }

        }





        System.out.println(result);

    }

    public static void main(String args[]) {

        triplesPitagoricos(10);



    }

}

