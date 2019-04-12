package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText textnumber1;
    private TextView textresult1;
    private Button buttonConvert1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiate();
        setAction();
    }
    private void initiate(){
        textnumber1 =findViewById(R.id.textInput1);
        textresult1 =findViewById(R.id.textOutput1);
        buttonConvert1 =findViewById(R.id.buttonConvert1);
    }
    private void setAction(){
        buttonConvert1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int input = Integer.parseInt(textnumber1.getText().toString());
                Model model = new Model();
                if (input < 20) {

                    textresult1.setText(model.getOness()[input]);
                } else if (input < 100) {
                    int tensIndex = input / 10;
                    int onesIndex = input % 10;

                    if (onesIndex != 0) {
                        textresult1.setText(model.getTenss()[tensIndex] + " " + model.getOness()[onesIndex]);
                    } else {
                        textresult1.setText(model.getTenss()[tensIndex]);
                    }
                } else {
                    int hundredsIndex = input / 100;
                    int remainder = input % 100;
                    int tensIndex = remainder / 10;
                    int onesIndex = remainder % 10;
                    if (onesIndex != 0) {
                        textresult1.setText(model.getOness()[hundredsIndex] + " Hundred " + model.getTenss()[tensIndex] +
                                " " + model.getOness()[onesIndex]);
                    } else {

                        textresult1.setText(model.getOness()[hundredsIndex] + " Hundred " + model.getTenss()[tensIndex]);
                    }
                }
            }});
        }
    }
