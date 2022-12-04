package ua.ithillel;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom",2,"Rad");
        System.out.println(cat);

        String json =new Gson().toJson(cat);
        System.out.println(json);
    }
}