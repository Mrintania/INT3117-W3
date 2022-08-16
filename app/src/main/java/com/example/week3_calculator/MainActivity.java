package com.example.week3_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    float num1,num2,total;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton add,minus,multiply,divide;
        EditText val_1,val_2;
        Button btn_cal,btn_clr;

        add = findViewById(R.id.rad_add);
        minus = findViewById(R.id.rad_minus);
        multiply = findViewById(R.id.rad_multiply);
        divide = findViewById(R.id.rad_divide);
        val_1 = findViewById(R.id.val_1);
        val_2 = findViewById(R.id.val_2);
        btn_cal = findViewById(R.id.btn_cal);
        btn_clr = findViewById(R.id.btn_clr);

        btn_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Float.parseFloat(val_1.getText().toString());
                num2 = Float.parseFloat(val_2.getText().toString());

                if (add.isChecked()){
                    total = num1 + num2;
                    Toast.makeText(MainActivity.this,Float.toString(total),Toast.LENGTH_SHORT).show();
                }
                else if (minus.isChecked()){
                    total = num1 - num2;
                    Toast.makeText(MainActivity.this,Float.toString(total),Toast.LENGTH_SHORT).show();
                }
                else if (multiply.isChecked()){
                    total = num1 * num2;
                    Toast.makeText(MainActivity.this,Float.toString(total),Toast.LENGTH_SHORT).show();
                }
                else if (divide.isChecked()){
                    total = num1 / num2;
                    Toast.makeText(MainActivity.this,Float.toString(total),Toast.LENGTH_SHORT).show();
                }
                else if (!add.isChecked() && !minus.isChecked() && !multiply.isChecked() && !divide.isChecked()){
                    Toast.makeText(MainActivity.this,"TTTTT",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val_1.setText("");
                val_2.setText("");
            }
        });

    }
}