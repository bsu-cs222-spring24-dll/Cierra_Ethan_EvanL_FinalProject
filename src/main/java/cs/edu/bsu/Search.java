package cs.edu.bsu;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class WikipediaTravelSearch {

    public static void main(String[] args) {
        try {
            String searchTerm = "Travel"; // Your search term

            // URL encode the search term
            String encodedSearchTerm = URLEncoder.encode(searchTerm, "UTF-8");

            // Wikipedia API URL for search
            String apiUrl = "https://en.wikipedia.org/w/api.php?action=query&format=json&list=search&srsearch=" + encodedSearchTerm;

            // Create URL object
            URL url = new URL(apiUrl);

            // Open connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set request method
            connection.setRequestMethod("GET");

            // Get input stream
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();

            // Read response
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Parse JSON response
            JsonReader jsonReader = Json.createReader(new java.io.StringReader(response.toString()));
            JsonObject jsonResponse = jsonReader.readObject();
            JsonObject query = jsonResponse.getJsonObject("query");
            JsonArray searchResults = query.getJsonArray("search");

            // Print search results titles
            for (int i = 0; i < searchResults.size(); i++) {
                JsonObject resultObject = searchResults.getJsonObject(i);
                String title = resultObject.getString("title");
                System.out.println(title);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
