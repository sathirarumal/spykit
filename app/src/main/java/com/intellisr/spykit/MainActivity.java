package com.intellisr.spykit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import com.ramotion.circlemenu.CircleMenuView;

public class MainActivity extends AppCompatActivity {

    EditText p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p= findViewById(R.id.pw);

        final CircleMenuView menu = (CircleMenuView) findViewById(R.id.circle_menu);
        menu.setEventListener(new CircleMenuView.EventListener() {
            @Override
            public void onMenuOpenAnimationStart(@NonNull CircleMenuView view) {
                Log.d("DDD", "onMenuOpenAnimationStart");
            }


            @Override
            public void onMenuCloseAnimationStart(@NonNull CircleMenuView view) {
                Log.d("DDD", "onMenuCloseAnimationStart");
            }


            @Override
            public void onButtonClickAnimationEnd(@NonNull CircleMenuView view, int index) {


                if(p.getText().toString().equals("sra123")) {
                    Log.d("DDD", "onButtonClickAnimationEnd| index: " + index);
                    switch (index) {
                        case 0:
                            goMlkit();
                            break;
                        case 1:
                            goShiva();
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
                }
            }

            @Override
            public boolean onButtonLongClick(@NonNull CircleMenuView view, int index) {
                Log.d("DDD", "onButtonLongClick| index: " + index);
                return true;
            }

            @Override
            public void onButtonLongClickAnimationStart(@NonNull CircleMenuView view, int index) {
                Log.d("DDD", "onButtonLongClickAnimationStart| index: " + index);
            }

            @Override
            public void onButtonLongClickAnimationEnd(@NonNull CircleMenuView view, int index) {
                Log.d("DDD", "onButtonLongClickAnimationEnd| index: " + index);
            }
        });


    }

    public void goMlkit(){
        Intent intent=new Intent(this,MlKit.class);
        startActivity(intent);
    }

    public void goShiva(){
        Intent intent=new Intent(this,shiva.class);
        startActivity(intent);
    }



}
