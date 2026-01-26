package modelos;

import com.google.gson.Gson;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;

public class ConsultaApiExchange {
    private String apiKey;

    public ConsultaApiExchange() {
        cargarApiKey();
    }

    private void cargarApiKey() {
        try {
            Properties prop = new Properties();
            FileInputStream input = new FileInputStream("config.properties");
            prop.load(input);
            this.apiKey = prop.getProperty("api.key");
            input.close();
        } catch (IOException e) {
            System.out.println("Error cargando API key: " + e.getMessage());
        }
    }

    public double consultaApiExchange(String base, String target){
        Gson gson = new Gson();
        String direccion = "https://v6.exchangerate-api.com/v6/" + this.apiKey + "/pair/" + base + "/" + target;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            RespuestaApi respuestaApi = gson.fromJson(json, RespuestaApi.class);
            return respuestaApi.getConversion_rate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}