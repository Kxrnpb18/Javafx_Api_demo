package com.example.week10;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        try {
            String apiUrl = "https://api.example.com/users";  // Replace with your API URL
            String jsonResponse = APIUtility.callApiAndGetResponse(apiUrl);

            Gson gson = new Gson();
            User[] users = gson.fromJson(jsonResponse, User[].class);

            for (User user : users) {
                System.out.println("User: " + user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
