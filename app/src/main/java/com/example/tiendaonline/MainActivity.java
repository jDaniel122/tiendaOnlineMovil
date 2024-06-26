package com.example.tiendaonline;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    public void loginButtonClicked(View view) {
        Intent intent = new Intent(this, productos.class);
        startActivity(intent);
    }

    public void registerButtonClicked(View view) {
        Intent intent = new Intent(this, registroUsuario.class);
        startActivity(intent);
    }
}