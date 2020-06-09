package com.example.textdetection;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class TextRecognition extends Application {

    public final static String RESULT_TEXT = "RESULT TEXT";


    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}

