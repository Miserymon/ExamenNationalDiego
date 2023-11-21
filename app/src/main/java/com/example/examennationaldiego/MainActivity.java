package com.example.examennationaldiego;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_Usermain;
    private EditText et_PassMain;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener referencias a los elementos de la interfaz de usuario
        et_Usermain = findViewById(R.id.et_usermain);
        et_PassMain = findViewById(R.id.et_passMain);
        buttonLogin = findViewById(R.id.buttonLogin);

        // Agregar un OnClickListener al botón de inicio de sesión
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener el nombre de usuario y la contraseña
                String username = et_Usermain.getText().toString();
                String password = et_PassMain.getText().toString();

                // Verificar si los campos están vacíos
                if (username.isEmpty() || password.isEmpty()) {
                    // Mostrar un mensaje indicando que se deben ingresar ambos datos
                    Toast.makeText(MainActivity.this, "Ingrese nombre de usuario y contraseña", Toast.LENGTH_SHORT).show();
                } else {
                    // Si los datos son válidos, iniciar la actividad Menu
                    Intent intent = new Intent(MainActivity.this, Menu.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                }
            }
        });
    }
}
