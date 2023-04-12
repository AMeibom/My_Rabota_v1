package com.example.my_rabota_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class Leo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leo);

        Button button1 = findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Leo.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
            }
        });
        TextView textView = findViewById(R.id.textView); // получаем ссылку на TextView
        String text = ""; // создаем пустую строку
        try {
            InputStream is = getAssets().open("leo.txt"); // открываем файл
            int size = is.available(); // получаем размер файла
            byte[] buffer = new byte[size]; // создаем буфер
            is.read(buffer); // считываем файл в буфер
            is.close(); // закрываем InputStream
            text = new String(buffer); // преобразуем буфер в строку
        } catch (IOException ex) {
            ex.printStackTrace(); // обрабатываем ошибки
        }
        textView.setText(text); // устанавливаем текст в TextView
    }
}