package com.example.testtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numText;
    Button calcButton;
    TextView resText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numText = findViewById(R.id.num_text);
        calcButton = findViewById(R.id.calc_button);
        resText = findViewById(R.id.res_text);

        //onClick = "sendAnswer"
        //setOnClickListener
        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double d = Double.parseDouble(numText.getText().toString());
                d *= 5;
                resText.setText(Double.toString(d));
            }
        });
    }
}