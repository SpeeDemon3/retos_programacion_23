import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author Antonio Ruiz Benito = speedemon
 */
public class SpeeDemon3_10 {

    public static void main(String[] args) {

        try {

            String pokemon = "pikachu";

            // Url con el enlace de la api
            URL urlApi = new URL("https://pokeapi.co/api/v2/pokemon/"+ pokemon);

            // Generaremos un objeto “HttpURLConnection para hacer la conexión a la api, mediante el método de la URL openConnection()
            HttpURLConnection con = (HttpURLConnection)urlApi.openConnection();

            // Llamamos al request GET para hacer la solicitud


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
