package com.example.planetas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MercurioActivity extends AppCompatActivity {

    Button buttonSubmit;
    ImageButton imageButtonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercurio);

        // Configuración del título
        TextView titulo = findViewById(R.id.titleText);
        titulo.setText("Quiz De Mercurio");

        // Configuración de la imagen del planeta
        ImageView imageViewPlanet = findViewById(R.id.imgPlanet);
        imageViewPlanet.setImageResource(R.drawable.mercurio);

        // Configuración de las preguntas y respuestas
        cargarPreguntas();

        // Configuración del botón de retroceso
        imageButtonBack = findViewById(R.id.btnBack);
        imageButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MercurioActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Configuración del botón de enviar respuestas
        buttonSubmit = findViewById(R.id.btnSubmit);
        final int[] correctAnswers = {
                R.id.radio1_3, R.id.radio2_3, R.id.radio3_2,
                R.id.radio4_3, R.id.radio5_2, R.id.radio6_1,
                R.id.radio7_3, R.id.radio8_2, R.id.radio9_3, R.id.radio10_1
        };

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = 0;

                for (int i = 0; i < correctAnswers.length; i++) {
                    int groupId = getResources().getIdentifier("radioGroup" + (i + 1), "id", getPackageName());
                    RadioGroup group = findViewById(groupId);
                    if (group.getCheckedRadioButtonId() == correctAnswers[i]) {
                        score++;
                    }
                }

                Toast.makeText(MercurioActivity.this,
                        "Respuestas correctas: " + score + "/10", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void cargarPreguntas() {

        TextView pregunta1 = findViewById(R.id.question1);
        pregunta1.setText("1.\t¿Qué tamaño tiene el Sol visto desde Mercurio en comparación con la Tierra");
        ((RadioButton) findViewById(R.id.radio1_1)).setText("Igual de grande");
        ((RadioButton) findViewById(R.id.radio1_2)).setText("Dos veces más grande");
        ((RadioButton) findViewById(R.id.radio1_3)).setText("Tres veces más grande");
        ((RadioButton) findViewById(R.id.radio1_4)).setText("Cuatro veces más grande");

        TextView pregunta2 = findViewById(R.id.question2);
        pregunta2.setText("2.\t¿Por qué Mercurio no es el planeta más caluroso del sistema solar?");
        ((RadioButton) findViewById(R.id.radio2_1)).setText("Porque está cubierto de grafito");
        ((RadioButton) findViewById(R.id.radio2_2)).setText("Porque tiene hielo en su superficie");
        ((RadioButton) findViewById(R.id.radio2_3)).setText("Porque su atmósfera no atrapa los rayos solares");
        ((RadioButton) findViewById(R.id.radio2_4)).setText("Porque su órbita es muy rápida");

        TextView pregunta3 = findViewById(R.id.question3);
        pregunta3.setText("3.\t¿Dónde se puede encontrar hielo en Mercurio?");
        ((RadioButton) findViewById(R.id.radio3_1)).setText("En los cráteres iluminados");
        ((RadioButton) findViewById(R.id.radio3_2)).setText("En zonas frías y oscuras");
        ((RadioButton) findViewById(R.id.radio3_3)).setText("En toda su superficie");
        ((RadioButton) findViewById(R.id.radio3_4)).setText("En su atmósfera");

        TextView pregunta4 = findViewById(R.id.question5);
        pregunta4.setText("4.\t¿De qué color es Mercurio?");
        ((RadioButton) findViewById(R.id.radio4_1)).setText("Amarillo");
        ((RadioButton) findViewById(R.id.radio4_2)).setText("Rojo");
        ((RadioButton) findViewById(R.id.radio4_3)).setText("Gris ");
        ((RadioButton) findViewById(R.id.radio4_4)).setText("Blanco");

        TextView pregunta5 = findViewById(R.id.question4);
        pregunta5.setText("5.\t¿Qué mineral cubrió a Mercurio en el pasado?");
        ((RadioButton) findViewById(R.id.radio5_1)).setText("Carbón");
        ((RadioButton) findViewById(R.id.radio5_2)).setText("Grafito ");
        ((RadioButton) findViewById(R.id.radio5_3)).setText("Hierro");
        ((RadioButton) findViewById(R.id.radio5_4)).setText("Oro");

        TextView pregunta6 = findViewById(R.id.question6);
        pregunta6.setText("6.\t¿Cuánto tarda Mercurio en completar una órbita alrededor del Sol?");
        ((RadioButton) findViewById(R.id.radio6_1)).setText("88 días terrestres");
        ((RadioButton) findViewById(R.id.radio6_2)).setText("50 días terrestres");
        ((RadioButton) findViewById(R.id.radio6_3)).setText("365 días terrestres");
        ((RadioButton) findViewById(R.id.radio6_4)).setText("164 días terrestres");

        TextView pregunta7 = findViewById(R.id.question7);
        pregunta7.setText("7.\t¿Cuál es la velocidad de Mercurio al girar alrededor del Sol?");
        ((RadioButton) findViewById(R.id.radio7_1)).setText("20 km por segundo");
        ((RadioButton) findViewById(R.id.radio7_2)).setText("30 km por segundo");
        ((RadioButton) findViewById(R.id.radio7_3)).setText("50 km por segundo");
        ((RadioButton) findViewById(R.id.radio7_4)).setText("100 km por segundo");

        TextView pregunta8 = findViewById(R.id.question8);
        pregunta8.setText("8.\t¿Qué característica hace que Mercurio tenga tantos cráteres?");
        ((RadioButton) findViewById(R.id.radio8_1)).setText("Su cercanía al Sol");
        ((RadioButton) findViewById(R.id.radio8_2)).setText("Sus lluvias de meteoritos");
        ((RadioButton) findViewById(R.id.radio8_3)).setText("Su temperatura extrema");
        ((RadioButton) findViewById(R.id.radio8_4)).setText("Su atmósfera");

        TextView pregunta9 = findViewById(R.id.question9);
        pregunta9.setText("9.\t¿Cuál es la relación de la gravedad de Mercurio con la Tierra?");
        ((RadioButton) findViewById(R.id.radio9_1)).setText("Es igual");
        ((RadioButton) findViewById(R.id.radio9_2)).setText("Es mayor");
        ((RadioButton) findViewById(R.id.radio9_3)).setText("Es menor (0,38 veces la de la Tierra) ");
        ((RadioButton) findViewById(R.id.radio9_4)).setText("Es inexistente");

        TextView pregunta10 = findViewById(R.id.question10);
        pregunta10.setText("10.\t¿Qué podemos aprender sobre la gravedad de Mercurio?");
        ((RadioButton) findViewById(R.id.radio10_1)).setText("Un gramo en la Tierra equivale a 0,38 gramos en Mercurio");
        ((RadioButton) findViewById(R.id.radio10_2)).setText("Un gramo en la Tierra equivale a 1,5 gramos en Mercurio");
        ((RadioButton) findViewById(R.id.radio10_3)).setText("Es igual que en la Tierra");
        ((RadioButton) findViewById(R.id.radio10_4)).setText("No se puede medir en Mercurio");
    }

}
