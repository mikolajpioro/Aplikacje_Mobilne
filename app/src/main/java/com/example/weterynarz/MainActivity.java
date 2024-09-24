package com.example.weterynarz;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    String[] animalList = {"Pies", "Kot", "Świnka morska"};
    ListView listView;
    SeekBar suwak;
    TextView wiek;
    int progress;
    private EditText nameInput;
    String answerName;
    Button submitButton;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = findViewById(R.id.editTextImieiNazwisko);
        submitButton = (Button) findViewById(R.id.button3);
        answer = findViewById(R.id.textViewOdpowiedz);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = nameInput.getText().toString();
                answer.setText("Welcome " + name);

            }
        });

        listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.textView, animalList);
        listView.setAdapter(arrayAdapter);
        suwak = (SeekBar) findViewById(R.id.seekBar2);
        wiek = (TextView) findViewById(R.id.seekBarText);

        suwak.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                wiek.setText("Ile ma lat?    " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

}