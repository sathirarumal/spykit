package com.intellisr.spykit;

import androidx.appcompat.app.AppCompatActivity;
import org.tensorflow.lite.Interpreter;

import android.os.Bundle;

public class MlKit extends AppCompatActivity {

    protected Interpreter tflite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ml_kit);

        //tflite = new Interpreter(load)

    }
}
