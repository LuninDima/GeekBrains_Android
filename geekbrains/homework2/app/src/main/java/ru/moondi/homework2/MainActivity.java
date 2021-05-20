package ru.moondi.homework2;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    int buffer;
    char operation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buffer = 0;
        operation = '1';
        text = findViewById(R.id.textDisplay);
        Button clear = findViewById(R.id.button_clear);
        clear.setOnClickListener(View ->{
            text.setText("");
            buffer = 0;
        });
        Button equal = findViewById(R.id.button_equally);
        equal.setOnClickListener(View -> {
        switch (operation){
            case '+':
                buffer += Integer.parseInt(text.getText().toString());
                text.setText(String.valueOf(buffer));
                break;
            case '-':
                buffer -= Integer.parseInt(text.getText().toString());
                text.setText(String.valueOf(buffer));
                break;
            case '/':
                buffer /= Integer.parseInt(text.getText().toString());
                text.setText(String.valueOf(buffer));
                break;
            case '*':
                buffer *= Integer.parseInt(text.getText().toString());
                text.setText(String.valueOf(buffer));
                break;
        }
        });
    }
    public void intoNumber(View view){
        Button b = (Button) view;
        text.setText(text.getText().toString() + b.getText().toString());

    }
    public void calculate(View view){
        Button b = (Button) view;
    buffer = Integer.parseInt(text.getText().toString());
    operation = b.getText().charAt(0);
    text.setText("");
    }
}