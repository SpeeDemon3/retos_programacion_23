import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Antonio Ruiz Benito = SpeeDemoN
 */
public class SpeeDemon3_28 {

    /*
     * Crea una función que reciba una expresión matemática (String)
     * y compruebe si es correcta. Retornará true o false.
     * - Para que una expresión matemática sea correcta debe poseer
     *   un número, una operación y otro número separados por espacios.
     *   Tantos números y operaciones como queramos.
     * - Números positivos, negativos, enteros o decimales.
     * - Operaciones soportadas: + - * / %
     *
     * Ejemplos:
     * "5 + 6 / 7 - 4" -> true
     * "5 a 6" -> false
     */

    public static boolean isMathematicalExpression(String expression) {

        // Array con la expresiones matematicas
        String[] mathSigns = {"+", "-", "*", "/", "%"};

        // Variable para retornar
        boolean check = false;

        // Patron para buscar cualquier letra en la cadena
        Pattern pattern = Pattern.compile("[a-zA-Z]");

        // Objeto Matcher para encontrar coincidencias
        Matcher matcher = pattern.matcher(expression);

        // Recorro el array
        for (String character : mathSigns) {
            // Quito espacios, compruebo si contiene algun caracter en cada iteracion
            // y si el objeto Matcher NO encuentra alguna coincidencia de tipo alfabetico
            if(expression.trim().contains(character) && matcher.find() != true) {
                check = true;
            }

        }

        return check;
    }


    public static void main(String[] args) {

        String exp1 = "5 + 6 / 7 - 4";
        String exp2 = "5 a 6";
        String exp3 = "5 a 6 + 3";
        String exp4 = "5.2 * 6 + 3 - 3.2";
        String exp5 = "5.2 * a + x - y";

        System.out.println(isMathematicalExpression(exp1));
        System.out.println(isMathematicalExpression(exp2));
        System.out.println(isMathematicalExpression(exp3));
        System.out.println(isMathematicalExpression(exp4));
        System.out.println(isMathematicalExpression(exp5));

    }


}
