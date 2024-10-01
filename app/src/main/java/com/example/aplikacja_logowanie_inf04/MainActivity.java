package com.example.aplikacja_logowanie_inf04;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private EditText haslo;
    private EditText powtorzHaslo;
    private Button button;
    private TextView textViewOdpowiedz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        haslo = findViewById(R.id.haslo);
        powtorzHaslo = findViewById(R.id.powtorzHaslo);
        button = findViewById(R.id.button);
        textViewOdpowiedz = findViewById(R.id.textViewOdpowiedz);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dataEmail = email.getText().toString();

                    if(haslo.getText().toString().equals(powtorzHaslo.getText().toString()) && email.getText().toString().contains("@")){
                        textViewOdpowiedz.setText("Witam " + dataEmail);
                    }
                    else{
                        textViewOdpowiedz.setText("Zjebałeś hasło albo e-mail");
                    }
            }
        });

    }
}