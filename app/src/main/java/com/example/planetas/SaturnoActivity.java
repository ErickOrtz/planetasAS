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

public class SaturnoActivity extends AppCompatActivity {

    Button buttonSubmit;
    ImageButton imageButtonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercurio);

        // Configuración del título
        TextView titulo = findViewById(R.id.titleText);
        titulo.setText("Quiz De Saturno");

        // Configuración de la imagen del planeta
        ImageView imageViewPlanet = findViewById(R.id.imgPlanet);
        imageViewPlanet.setImageResource(R.drawable.saturno);

        // Configuración de las preguntas y respuestas
        cargarPreguntas();

        // Configuración del botón de retroceso
        imageButtonBack = findViewById(R.id.btnBack);
        imageButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SaturnoActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Configuración del botón de enviar respuestas
        buttonSubmit = findViewById(R.id.btnSubmit);
        final int[] correctAnswers = {
                R.id.radio1_2, R.id.radio2_2, R.id.radio3_3,
                R.id.radio4_3, R.id.radio5_3, R.id.radio6_2,
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

                Toast.makeText(SaturnoActivity.this,
                        "Respuestas correctas: " + score + "/10", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void cargarPreguntas() {

        TextView pregunta1 = findViewById(R.id.question1);
        pregunta1.setText("1.\t¿Cuál es el lugar de Saturno en el Sistema Solar?");
        ((RadioButton) findViewById(R.id.radio1_1)).setText("Cuarto planeta");
        ((RadioButton) findViewById(R.id.radio1_2)).setText("Sexto planeta");
        ((RadioButton) findViewById(R.id.radio1_3)).setText("Séptimo planeta");
        ((RadioButton) findViewById(R.id.radio1_4)).setText("Quinto planeta");

        TextView pregunta2 = findViewById(R.id.question2);
        pregunta2.setText("2.\t¿Por qué son famosos los anillos de Saturno?");
        ((RadioButton) findViewById(R.id.radio2_1)).setText("Porque están hechos de hielo puro");
        ((RadioButton) findViewById(R.id.radio2_2)).setText("Porque son los únicos visibles desde la Tierra con un telescopio");
        ((RadioButton) findViewById(R.id.radio2_3)).setText("Porque tienen planetas pequeños orbitándolos");
        ((RadioButton) findViewById(R.id.radio2_4)).setText("Porque están hechos de gases");

        TextView pregunta3 = findViewById(R.id.question3);
        pregunta3.setText("3.\t¿Por qué no podemos aterrizar en Saturno?");
        ((RadioButton) findViewById(R.id.radio3_1)).setText("Tiene vientos muy rápidos");
        ((RadioButton) findViewById(R.id.radio3_2)).setText("Está demasiado lejos");
        ((RadioButton) findViewById(R.id.radio3_3)).setText("No tiene una superficie sólida");
        ((RadioButton) findViewById(R.id.radio3_4)).setText("Tiene mucha gravedad");

        TextView pregunta4 = findViewById(R.id.question4);
        pregunta4.setText("4.\t¿Qué gas importante se encuentra en la atmósfera de Saturno?");
        ((RadioButton) findViewById(R.id.radio4_1)).setText("Oxígeno");
        ((RadioButton) findViewById(R.id.radio4_2)).setText("Nitrógeno");
        ((RadioButton) findViewById(R.id.radio4_3)).setText("Helio ");
        ((RadioButton) findViewById(R.id.radio4_4)).setText("Dióxido de carbono");

        TextView pregunta5 = findViewById(R.id.question5);
        pregunta5.setText("5.\t¿Cuál es la temperatura aproximada en Saturno?");
        ((RadioButton) findViewById(R.id.radio5_1)).setText("0 grados");
        ((RadioButton) findViewById(R.id.radio5_2)).setText("50 grados bajo cero");
        ((RadioButton) findViewById(R.id.radio5_3)).setText("180 grados bajo cero");
        ((RadioButton) findViewById(R.id.radio5_4)).setText("300 grados bajo cero");

        TextView pregunta6 = findViewById(R.id.question6);
        pregunta6.setText("6.\t¿Qué característica especial tienen los vientos de Saturno?");
        ((RadioButton) findViewById(R.id.radio6_1)).setText("Son más lentos que los de Júpiter");
        ((RadioButton) findViewById(R.id.radio6_2)).setText("Alcanzan velocidades de 300 km/h y forman un hexágono en el polo norte");
        ((RadioButton) findViewById(R.id.radio6_3)).setText("Solo ocurren durante el día");
        ((RadioButton) findViewById(R.id.radio6_4)).setText("No afectan su atmósfera");

        TextView pregunta7 = findViewById(R.id.question7);
        pregunta7.setText("7.\t¿Quién fue la primera persona en observar los anillos de Saturno?");
        ((RadioButton) findViewById(R.id.radio7_1)).setText("Isaac Newton");
        ((RadioButton) findViewById(R.id.radio7_2)).setText("Johannes Kepler");
        ((RadioButton) findViewById(R.id.radio7_3)).setText("Galileo Galilei");
        ((RadioButton) findViewById(R.id.radio7_4)).setText("Nicolás Copérnico");

        TextView pregunta8 = findViewById(R.id.question8);
        pregunta8.setText("8.\t¿Cómo se compara la gravedad de Saturno con la de la Tierra?");
        ((RadioButton) findViewById(R.id.radio8_1)).setText("Es mucho mayor");
        ((RadioButton) findViewById(R.id.radio8_2)).setText("Es mucho menor");
        ((RadioButton) findViewById(R.id.radio8_3)).setText("Es similar pero un poco menor");
        ((RadioButton) findViewById(R.id.radio8_4)).setText("Es igual");

        TextView pregunta9 = findViewById(R.id.question9);
        pregunta9.setText("9.\t¿Qué tamaño tiene Saturno en comparación con otros planetas?");
        ((RadioButton) findViewById(R.id.radio9_1)).setText("Es el más grande del Sistema Solar");
        ((RadioButton) findViewById(R.id.radio9_2)).setText("Es el segundo planeta más grande después de Júpiter");
        ((RadioButton) findViewById(R.id.radio9_3)).setText("Es más pequeño que la Tierra");
        ((RadioButton) findViewById(R.id.radio9_4)).setText("Es del mismo tamaño que Urano");

        TextView pregunta10 = findViewById(R.id.question10);
        pregunta10.setText("10.\t¿Para qué se utiliza el helio presente en Saturno?");
        ((RadioButton) findViewById(R.id.radio10_1)).setText("Para fabricar globos");
        ((RadioButton) findViewById(R.id.radio10_2)).setText("Para resonancias magnéticas y naves espaciales");
        ((RadioButton) findViewById(R.id.radio10_3)).setText("Para producir energía en la Tierra");
        ((RadioButton) findViewById(R.id.radio10_4)).setText("Como fuente de calor");
    }

}
