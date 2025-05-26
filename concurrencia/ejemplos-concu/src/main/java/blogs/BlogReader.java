package blogs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class BlogReader implements Runnable {
    private final String username;
    private final int postId;

    public BlogReader(String username, int postId) {
        this.username = username;
        this.postId = postId;
    }

    @Override
    public void run() {
        try {
            System.out.println(username + " is authenticating (might take some seconds)...");

            URL url = new URL("https://httpbin.dev/delay/3");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            System.out.println(conn.getResponseCode());

            System.out.println(username + " is fetching blog post #" + postId + "...");
            URL url2 = new URL("https://jsonplaceholder.typicode.com/posts/" + postId);
            HttpURLConnection conn2 = (HttpURLConnection) url2.openConnection();
            conn2.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn2.getInputStream()));

            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine).append("\n");
            }
            in.close();

            System.out.println("\n--- " + username + "'s Blog Post ---");
            System.out.println(response);
        } catch (Exception e) {
            System.out.println("Error fetching blog post for " + username + ": " + e.getMessage());
        }

        System.out.println(username + " has finished reading.\n");
    }
}
