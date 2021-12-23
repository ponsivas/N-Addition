package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button C,A;
    EditText V1,V2;
    TextView RE;
    Float F;
    String S;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        C = (Button)findViewById(R.id.CLR);
        A = (Button)findViewById(R.id.ADD);
        V1 = (EditText)findViewById(R.id.N1);
        V2 = (EditText)findViewById(R.id.N2);
        RE = (TextView)findViewById(R.id.RES);

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (V1.getText().length() == 0) {
                    if (V2.getText().length() == 0) {
                        Toast toast = Toast.makeText(getApplicationContext(), "Enter the Values in the input boxes and press ADDITION Button", Toast.LENGTH_LONG);
                        toast.show();
                    }
                }
                else {
                    F = Float.parseFloat(V1.getText().toString()) + Float.parseFloat(V2.getText().toString());
                    S = Float.toString(F);
                    RE.setText(S);
                }
                }
            });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (V1.getText().length() == 0) {
                    if (V2.getText().length() == 0) {
                        Toast toast = Toast.makeText(getApplicationContext(), "Perform the Logical Operations by entering the Values in the input boxes and then press CLEAR Button", Toast.LENGTH_LONG);
                        toast.show();
                    }
                }
                else {
                    V1.setText("");
                    V2.setText("");
                    RE.setText("");
                }
            }
        });


    }
}