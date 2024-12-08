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

public class TierraActivity extends AppCompatActivity {

    Button buttonSubmit;
    ImageButton imageButtonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercurio);

        // Configuración del título
        TextView titulo = findViewById(R.id.titleText);
        titulo.setText("Quiz De La Tierra");

        // Configuración de la imagen del planeta
        ImageView imageViewPlanet = findViewById(R.id.imgPlanet);
        imageViewPlanet.setImageResource(R.drawable.planetatierra);

        // Configuración de las preguntas y respuestas
        cargarPreguntas();

        // Configuración del botón de retroceso
        imageButtonBack = findViewById(R.id.btnBack);
        imageButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TierraActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Configuración del botón de enviar respuestas
        buttonSubmit = findViewById(R.id.btnSubmit);
        final int[] correctAnswers = {
                R.id.radio1_2, R.id.radio2_3, R.id.radio3_2,
                R.id.radio4_3, R.id.radio5_2, R.id.radio6_2,
                R.id.radio7_3, R.id.radio8_3, R.id.radio9_2, R.id.radio10_2
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

                Toast.makeText(TierraActivity.this,
                        "Respuestas correctas: " + score + "/10", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void cargarPreguntas() {

        TextView pregunta1 = findViewById(R.id.question1);
        pregunta1.setText("1.\t¿Qué hace única a la Tierra en comparación con otros planetas?");
        ((RadioButton) findViewById(R.id.radio1_1)).setText("Es el más grande del Sistema Solar");
        ((RadioButton) findViewById(R.id.radio1_2)).setText("Tiene vida");
        ((RadioButton) findViewById(R.id.radio1_3)).setText("Tiene el día más largo");
        ((RadioButton) findViewById(R.id.radio1_4)).setText("No tiene agua");

        TextView pregunta2 = findViewById(R.id.question2);
        pregunta2.setText("2.\t¿Cuánto tiempo tarda la Tierra en completar una órbita alrededor del Sol?");
        ((RadioButton) findViewById(R.id.radio2_1)).setText("24 horas");
        ((RadioButton) findViewById(R.id.radio2_2)).setText("30 días");
        ((RadioButton) findViewById(R.id.radio2_3)).setText("365 días");
        ((RadioButton) findViewById(R.id.radio2_4)).setText("1000 días");

        TextView pregunta3 = findViewById(R.id.question3);
        pregunta3.setText("3.\t¿Cómo se llama el movimiento de la Tierra alrededor del Sol?");
        ((RadioButton) findViewById(R.id.radio3_1)).setText("Rotación");
        ((RadioButton) findViewById(R.id.radio3_2)).setText("Traslación");
        ((RadioButton) findViewById(R.id.radio3_3)).setText("Revolución");
        ((RadioButton) findViewById(R.id.radio3_4)).setText("Giro axial");

        TextView pregunta4 = findViewById(R.id.question4);
        pregunta4.setText("4.\t¿Qué fenómenos ocurren gracias al movimiento de traslación de la Tierra?");
        ((RadioButton) findViewById(R.id.radio4_1)).setText("El día y la noche");
        ((RadioButton) findViewById(R.id.radio4_2)).setText("Los eclipses solares");
        ((RadioButton) findViewById(R.id.radio4_3)).setText("Las estaciones del año");
        ((RadioButton) findViewById(R.id.radio4_4)).setText("Los terremotos");

        TextView pregunta5 = findViewById(R.id.question5);
        pregunta5.setText("5.\t¿Cuánto tiempo tarda la Tierra en girar sobre su eje?");
        ((RadioButton) findViewById(R.id.radio5_1)).setText("12 horas");
        ((RadioButton) findViewById(R.id.radio5_2)).setText("24 horas");
        ((RadioButton) findViewById(R.id.radio5_3)).setText("48 horas");
        ((RadioButton) findViewById(R.id.radio5_4)).setText("365 días");

        TextView pregunta6 = findViewById(R.id.question6);
        pregunta6.setText("6.\t¿Qué provoca el movimiento de rotación de la Tierra?");
        ((RadioButton) findViewById(R.id.radio6_1)).setText("Los terremotos");
        ((RadioButton) findViewById(R.id.radio6_2)).setText("La sucesión del día y la noche");
        ((RadioButton) findViewById(R.id.radio6_3)).setText("Las estaciones del año");
        ((RadioButton) findViewById(R.id.radio6_4)).setText("Los eclipses");

        TextView pregunta7 = findViewById(R.id.question7);
        pregunta7.setText("7.\t¿Qué porcentaje de la superficie de la Tierra está cubierta por agua?");
        ((RadioButton) findViewById(R.id.radio7_1)).setText("50%");
        ((RadioButton) findViewById(R.id.radio7_2)).setText("60%");
        ((RadioButton) findViewById(R.id.radio7_3)).setText("70%");
        ((RadioButton) findViewById(R.id.radio7_4)).setText("80%");

        TextView pregunta8 = findViewById(R.id.question8);
        pregunta8.setText("8.\t¿Cómo pensaba mucha gente que era la forma de la Tierra hace años?");
        ((RadioButton) findViewById(R.id.radio8_1)).setText("Esférica");
        ((RadioButton) findViewById(R.id.radio8_2)).setText("Cuadrada");
        ((RadioButton) findViewById(R.id.radio8_3)).setText("Plana como una pizza");
        ((RadioButton) findViewById(R.id.radio8_4)).setText("Triangular");

        TextView pregunta9 = findViewById(R.id.question9);
        pregunta9.setText("9.\t¿Cuál es la forma actual reconocida de la Tierra?");
        ((RadioButton) findViewById(R.id.radio9_1)).setText("Ovalada");
        ((RadioButton) findViewById(R.id.radio9_2)).setText("Esférica");
        ((RadioButton) findViewById(R.id.radio9_3)).setText("Cúbica");
        ((RadioButton) findViewById(R.id.radio9_4)).setText("Plana");

        TextView pregunta10 = findViewById(R.id.question10);
        pregunta10.setText("10.\t¿Qué mensaje importante se menciona sobre la Tierra?");
        ((RadioButton) findViewById(R.id.radio10_1)).setText("Viajar a otros planetas es prioritario");
        ((RadioButton) findViewById(R.id.radio10_2)).setText("Es necesario cuidar y proteger el medio ambiente");
        ((RadioButton) findViewById(R.id.radio10_3)).setText("Hay que colonizar la Luna primero");
        ((RadioButton) findViewById(R.id.radio10_4)).setText("La Tierra es autosuficiente y no necesita protección");
    }

}
