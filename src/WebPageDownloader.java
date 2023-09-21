import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebPageDownloader {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java WebPageDownloader <url>");
            return;
        }

        String urlToFetch = args[0];

        try {
            // Create URL object with the provided URL
            URL url = new URL(urlToFetch);

            // Open connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Read and print response content
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // Disconnect
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
