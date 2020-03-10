package com.company;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class Main2 {
    public static void main(String[] args) throws IOException {
        while (true) {
            URL url = new URL("https://docs.google.com/forms/u/0/d/e/1FAIpQLScE6sxLFb3BmCmT2TKHQH5ormS0qvjHwO-uTAR8MXaagBvSSQ/formResponse");

            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.setDoInput(true);

            urlConnection.connect();

            DataOutputStream dataOutputStream = new DataOutputStream(urlConnection.getOutputStream());
            String string = "Todos somos pratik";
            dataOutputStream.writeBytes("entry.835030737=" + string);
            dataOutputStream.writeBytes("&entry.1616686619=" + "No");

            InputStreamReader inputStreamReader = new InputStreamReader(urlConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            bufferedReader.close();
        }
    }
}
