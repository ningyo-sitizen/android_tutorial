package com.example.tutorial;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Preferences {
    static final String keyUserRegist = "user", keyPassRegist = "pass";
    static final String usernameSedangLogin = "username_logged_in";
    static final String statusSedangLogin = "status_sedang_logged_in";

    private static SharedPreferences getSharedPreference(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }
    public static void setRegisteredUser(Context context, String username){
        SharedPreferences.Editor editor =
                getSharedPreference(context).edit();
        editor.putString(keyUserRegist, username);
        editor.apply();
    }

    public static String getRegisteredUser(Context context){
        return getSharedPreference(context).getString(keyUserRegist,"");
    }

    public static void setRegisteredPass(Context context, String password){
        SharedPreferences.Editor editor =
                getSharedPreference(context).edit();
        editor.putString(keyPassRegist, password);
        editor.apply();
    }

    public static String getRegisteredPass(Context context){
        return
                getSharedPreference(context).getString(keyPassRegist,"");
    }

    public static void setLoggedInUser(Context context, String username){
        SharedPreferences.Editor editor =
                getSharedPreference(context).edit();
        editor.putString(usernameSedangLogin, username);
        editor.apply();
    }

    public static String getLoggedInUser(Context context){
        return
                getSharedPreference(context).getString(usernameSedangLogin,"");
    }

    public static void setLoggedInStatus(Context context, boolean status){
        SharedPreferences.Editor editor =
                getSharedPreference(context).edit();
        editor.putBoolean(usernameSedangLogin,status);
        editor.apply();
    }

    public static boolean getLoggedInStatus(Context context){
        return
                getSharedPreference(context).getBoolean(usernameSedangLogin,false);
    }

    public static void clearLoggedInUser (Context context){
        SharedPreferences.Editor editor =
                getSharedPreference(context).edit();
        editor.remove(usernameSedangLogin);
        editor.remove(statusSedangLogin);
        editor.apply();
    }
}

