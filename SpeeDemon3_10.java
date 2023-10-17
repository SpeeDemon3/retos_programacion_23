import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

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
            con.setRequestMethod("GET");

            // Obtenemos el codigo de respuesta
            // por ejemplo: 200, significa que el GET request ha sido satisfactorio
            //  404 Not Found, el servidor no ha encontrado el resource solicitado
            int responseCode = con.getResponseCode();

            // Comprobamos si el codigo es distinto de 200
            if(responseCode != 200) {

                System.out.println("Error " + responseCode);

            } else {
                // Creamos un objeto StringBuilder donde se ira guardando la informacion mientras tenga espacio
                StringBuilder infoString = new StringBuilder();

                // El método openStream() de la url, inicia una nueva conexión con el servidor en el que se resuelve la URL.
                // A continuación, se envía una solicitud HTTP GET a través de la conexión.
                // Si todo va bien (es decir, 200 que ya hemos comprobado con anterioridad), el servidor devuelve
                //  el mensaje de respuesta HTTP que lleva los datos.
                Scanner sc = new Scanner(urlApi.openStream());
                while(sc.hasNext()) {
                    infoString.append(sc.nextLine());
                }

                // Cerramos el Scanner
                sc.close();

                // Lo guardamos en un array dividiendolo por las comas
                String[] data = infoString.toString().split(",");

                // Recorremos e imprimimos por consola
                for (String d : data) {
                    System.out.println(d);
                }
                

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
