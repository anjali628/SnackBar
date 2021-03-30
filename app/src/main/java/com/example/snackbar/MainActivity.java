package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button mcustomviewsnackbar,mdefaultviewsnackbar,mactioncallsnackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mcustomviewsnackbar=findViewById(R.id.customViewSnackbar);
        mactioncallsnackbar=findViewById(R.id.actionCallSnackbar);
        mdefaultviewsnackbar=findViewById(R.id.defaultSnackbar);



        mdefaultviewsnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar=Snackbar.make(v,"Hi, MySelf Anjali Bindal",Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });

        mactioncallsnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar=Snackbar.make(v,"Message has been Deleted",Snackbar.LENGTH_LONG).setAction("Undo", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       //you can display toast or perform a action

                        Snackbar snackbar=Snackbar.make(v,"Message has been Restored",Snackbar.LENGTH_LONG);
                        snackbar.show();
                    }
                });
                snackbar.show();
            }
        });

        mcustomviewsnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar=Snackbar.make(v,"This is Custom",Snackbar.LENGTH_LONG).setAction("Undo", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //perform any action

                        Snackbar snackbar=Snackbar.make(v,"Message has been Restored",Snackbar.LENGTH_LONG);
                        snackbar.show();

                    }
                });
                snackbar.setActionTextColor(Color.YELLOW);
                snackbar.setTextColor(Color.WHITE);
                snackbar.show();
            }
        });


    }
}