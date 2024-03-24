package BuilderPattern;

public class TestBuilder {
    public static void main(String[] args) {
        HttpClient client = new HttpClient.HttpClientBuilder().method("GET").
                url("http://localhost:3306").secure("root","test")
                .header("{}").build();
        System.out.println(client);

        HttpClient client1 = new HttpClient.HttpClientBuilder().method("POST").url("http://localhost/")
                .header("{}").body("{}").build();
        System.out.println(client1);
    }
}
