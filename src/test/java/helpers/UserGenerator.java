package helpers;

import com.google.gson.Gson;
import helpers.random.RandomUser;
import helpers.random.Result;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Objects;

public class UserGenerator {

    public static Result generateUser() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Gson gson = new Gson();
        String url = "https://randomuser.me/api/?nat=us";

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {

            RandomUser user = gson.fromJson(Objects.requireNonNull(response.body()).string(), RandomUser.class);

            return user.getResults().get(0);
        }
    }
}
