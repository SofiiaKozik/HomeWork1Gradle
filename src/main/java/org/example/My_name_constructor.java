package org.example;

import com.google.gson.Gson;

public class My_name_constructor {
    String MY_NAME = "Sofiia";
    String MY_LAST_NAME = "Kozik";

    public String constructor (){
        Person_dto my_personality = new Person_dto();
        my_personality.setName(MY_NAME);
        my_personality.setLastname(MY_LAST_NAME);

        Gson gson = new Gson();
        String json = gson.toJson(my_personality);
        return json;
    }
}
