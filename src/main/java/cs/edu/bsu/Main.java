package cs.edu.bsu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;


public class Main {
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


            Scanner console = new Scanner(System.in);

            System.out.println("Enter '1' to learn what national parks are in each state, or enter '2' to search for national parks specifically");
            String userInput= console.nextLine();
            if(userInput.equals("1"))
            {
                System.out.println("Which state would you like to learn about?");
                userInput=console.nextLine();
                if(userInput.equals("Indiana"))
                {
                    System.out.println("There are two national parks in the state of Indiana: \n\nGeorge Rogers Clark Park\n\nIndiana Dunes Park");
                }
            }
            else
            {
                System.out.println("What type of park are you looking for?");
                userInput=console.nextLine();

                if(userInput.equals("beach"))
                {
                    System.out.println("Here are some beaches to visit: \n\nGulf Islands National Seashore\n\nCape Lookout National Seashore");
                }

                if(userInput.equals("hiking trails"))
                {
                    System.out.println("Here are some National parks with hiking trails to visit: \n\nYosemite National Park\n\nZion National Park\n\nGrand Canyon National Park\n\nArches National Park");
                }
            }


            /*
            // Parse JSON response
            Object Json;
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

        */} catch (IOException e) {
            e.printStackTrace();
       }
    }
}
