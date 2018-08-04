package com.ersathi.ersathi;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPref {

    private Context context;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private static final String MY_PREF_FILE_NAME="LOGINCHECKER";
    private static final String IS_LOGGED_IN="isLoggedIn";

    public SharedPref (Context context) {
        sharedPreferences = context.getSharedPreferences(MY_PREF_FILE_NAME, context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }
}
