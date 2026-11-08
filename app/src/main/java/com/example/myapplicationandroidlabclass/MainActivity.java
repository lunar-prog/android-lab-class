package com.example.myapplicationandroidlabclass;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView ftxt;
    EditText name_edit1;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_main);
        ftxt = (TextView) findViewById(R.id.textview1);
        name_edit1 = (EditText) findViewById(R.id.fname_edit);
        bt1 = (Button) findViewById(R.id.savebt);
        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String name = name_edit1.getText().toString();
                Toast.makeText(getApplicationContext(), "Welcome" +name,
                        Toast.LENGTH_LONG).show();

            }
        })
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}