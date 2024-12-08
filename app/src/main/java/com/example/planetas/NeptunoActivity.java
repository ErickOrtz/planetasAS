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

public class NeptunoActivity extends AppCompatActivity {

    Button buttonSubmit;
    ImageButton imageButtonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercurio);

        // Configuración del título
        TextView titulo = findViewById(R.id.titleText);
        titulo.setText("Quiz De Neptuno");

        // Configuración de la imagen del planeta
        ImageView imageViewPlanet = findViewById(R.id.imgPlanet);
        imageViewPlanet.setImageResource(R.drawable.neptuno);

        // Configuración de las preguntas y respuestas
        cargarPreguntas();

        // Configuración del botón de retroceso
        imageButtonBack = findViewById(R.id.btnBack);
        imageButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NeptunoActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Configuración del botón de enviar respuestas
        buttonSubmit = findViewById(R.id.btnSubmit);
        final int[] correctAnswers = {
                R.id.radio1_1, R.id.radio2_2, R.id.radio3_2,
                R.id.radio4_3, R.id.radio5_3, R.id.radio6_2,
                R.id.radio7_1, R.id.radio8_1, R.id.radio9_2, R.id.radio10_3
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

                Toast.makeText(NeptunoActivity.this,
                        "Respuestas correctas: " + score + "/10", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void cargarPreguntas() {

        TextView pregunta1 = findViewById(R.id.question1);
        pregunta1.setText("1. ¿Cuál es la temperatura promedio en Neptuno?");
        ((RadioButton) findViewById(R.id.radio1_1)).setText("218 grados bajo cero");
        ((RadioButton) findViewById(R.id.radio1_2)).setText("100 grados bajo cero");
        ((RadioButton) findViewById(R.id.radio1_3)).setText("0 grados");
        ((RadioButton) findViewById(R.id.radio1_4)).setText("50 grados bajo cero");

        TextView pregunta2 = findViewById(R.id.question2);
        pregunta2.setText("2. ¿Cuántas veces ha sido visitado Neptuno por una nave espacial?");
        ((RadioButton) findViewById(R.id.radio2_1)).setText("Nunca");
        ((RadioButton) findViewById(R.id.radio2_2)).setText("Una vez");
        ((RadioButton) findViewById(R.id.radio2_3)).setText("Dos veces");
        ((RadioButton) findViewById(R.id.radio2_4)).setText("Tres veces");

        TextView pregunta3 = findViewById(R.id.question3);
        pregunta3.setText("3. ¿Por qué Neptuno tiene un color azul?");
        ((RadioButton) findViewById(R.id.radio3_1)).setText("Por la cantidad de agua");
        ((RadioButton) findViewById(R.id.radio3_2)).setText("Por el metano en su atmósfera");
        ((RadioButton) findViewById(R.id.radio3_3)).setText("Por su proximidad al sol");
        ((RadioButton) findViewById(R.id.radio3_4)).setText("Por su tamaño");

        TextView pregunta4 = findViewById(R.id.question4);
        pregunta4.setText("4. ¿Cuántos años terrestres tarda Neptuno en dar una vuelta completa alrededor del Sol?");
        ((RadioButton) findViewById(R.id.radio4_1)).setText("1 año");
        ((RadioButton) findViewById(R.id.radio4_2)).setText("10 años");
        ((RadioButton) findViewById(R.id.radio4_3)).setText("164 años");
        ((RadioButton) findViewById(R.id.radio4_4)).setText("100 años");

        TextView pregunta5 = findViewById(R.id.question5);
        pregunta5.setText("5. ¿A qué dios romano hace referencia el nombre de Neptuno?");
        ((RadioButton) findViewById(R.id.radio5_1)).setText("Júpiter");
        ((RadioButton) findViewById(R.id.radio5_2)).setText("Marte");
        ((RadioButton) findViewById(R.id.radio5_3)).setText("Neptuno");
        ((RadioButton) findViewById(R.id.radio5_4)).setText("Plutón");

        TextView pregunta6 = findViewById(R.id.question6);
        pregunta6.setText("6. ¿Qué tipo de composición tiene Neptuno?");
        ((RadioButton) findViewById(R.id.radio6_1)).setText("Rocosa y metálica");
        ((RadioButton) findViewById(R.id.radio6_2)).setText("Gases y líquidos");
        ((RadioButton) findViewById(R.id.radio6_3)).setText("Agua y hielo");
        ((RadioButton) findViewById(R.id.radio6_4)).setText("Carbono sólido");

        TextView pregunta7 = findViewById(R.id.question7);
        pregunta7.setText("7. ¿Qué elementos están presentes en la atmósfera de Neptuno?");
        ((RadioButton) findViewById(R.id.radio7_1)).setText("Hidrógeno, helio y metano");
        ((RadioButton) findViewById(R.id.radio7_2)).setText("Oxígeno y dióxido de carbono");
        ((RadioButton) findViewById(R.id.radio7_3)).setText("Nitrógeno y vapor de agua");
        ((RadioButton) findViewById(R.id.radio7_4)).setText("Sulfuro y oxígeno");

        TextView pregunta8 = findViewById(R.id.question8);
        pregunta8.setText("8. ¿Por qué la vida es imposible en Neptuno?");
        ((RadioButton) findViewById(R.id.radio8_1)).setText("Por su temperatura extrema");
        ((RadioButton) findViewById(R.id.radio8_2)).setText("Por falta de agua");
        ((RadioButton) findViewById(R.id.radio8_3)).setText("Por su gravedad");
        ((RadioButton) findViewById(R.id.radio8_4)).setText("Por sus tormentas constantes");

        TextView pregunta9 = findViewById(R.id.question9);
        pregunta9.setText("9. ¿Cómo es la gravedad de Neptuno en comparación con la Tierra?");
        ((RadioButton) findViewById(R.id.radio9_1)).setText("Más débil");
        ((RadioButton) findViewById(R.id.radio9_2)).setText("Similar");
        ((RadioButton) findViewById(R.id.radio9_3)).setText("Más fuerte");
        ((RadioButton) findViewById(R.id.radio9_4)).setText("Inexistente");

        TextView pregunta10 = findViewById(R.id.question10);
        pregunta10.setText("10. ¿Qué gas presente en la atmósfera de Neptuno puede ser utilizado como combustible?");
        ((RadioButton) findViewById(R.id.radio10_1)).setText("Oxígeno");
        ((RadioButton) findViewById(R.id.radio10_2)).setText("Helio");
        ((RadioButton) findViewById(R.id.radio10_3)).setText("Metano");
        ((RadioButton) findViewById(R.id.radio10_4)).setText("Hidrógeno");
    }
}
