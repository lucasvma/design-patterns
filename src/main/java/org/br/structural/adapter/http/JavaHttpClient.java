package org.br.structural.adapter.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

    @Override public void post(String url, Map<String, Object> data) {
        try {
            URL apiApi = new URL(url);
            URLConnection connection = apiApi.openConnection();
            connection.connect();
        } catch (Exception e) {
            throw new RuntimeException("Error to send HTTP request", e);
        }
    }

}
