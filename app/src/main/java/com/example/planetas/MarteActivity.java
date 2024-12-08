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

public class MarteActivity extends AppCompatActivity {

    Button buttonSubmit;
    ImageButton imageButtonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercurio);

        // Configuración del título
        TextView titulo = findViewById(R.id.titleText);
        titulo.setText("Quiz De Marte");

        // Configuración de la imagen del planeta
        ImageView imageViewPlanet = findViewById(R.id.imgPlanet);
        imageViewPlanet.setImageResource(R.drawable.marte);

        // Configuración de las preguntas y respuestas
        cargarPreguntas();

        // Configuración del botón de retroceso
        imageButtonBack = findViewById(R.id.btnBack);
        imageButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MarteActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Configuración del botón de enviar respuestas
        buttonSubmit = findViewById(R.id.btnSubmit);
        final int[] correctAnswers = {
                R.id.radio1_3, R.id.radio2_2, R.id.radio3_2,
                R.id.radio4_1, R.id.radio5_3, R.id.radio6_1,
                R.id.radio7_3, R.id.radio8_3, R.id.radio9_2, R.id.radio10_1
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

                Toast.makeText(MarteActivity.this,
                        "Respuestas correctas: " + score + "/10", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void cargarPreguntas() {

        TextView pregunta1 = findViewById(R.id.question1);
        pregunta1.setText("1.\t¿Qué lugar ocupa Marte en el Sistema Solar?");
        ((RadioButton) findViewById(R.id.radio1_1)).setText("Segundo planeta");
        ((RadioButton) findViewById(R.id.radio1_2)).setText("Tercer planeta");
        ((RadioButton) findViewById(R.id.radio1_3)).setText("Cuarto planeta");
        ((RadioButton) findViewById(R.id.radio1_4)).setText("Quinto planeta");

        TextView pregunta2 = findViewById(R.id.question2);
        pregunta2.setText("2.\t¿Por qué se llama Marte \"el planeta rojo\"?");
        ((RadioButton) findViewById(R.id.radio2_1)).setText("Por su cercanía al Sol");
        ((RadioButton) findViewById(R.id.radio2_2)).setText("Por la presencia de hierro oxidado que le da su color");
        ((RadioButton) findViewById(R.id.radio2_3)).setText("Por su actividad volcánica");
        ((RadioButton) findViewById(R.id.radio2_4)).setText("Por la abundancia de rocas de color rojo");

        TextView pregunta3 = findViewById(R.id.question3);
        pregunta3.setText("3.\t¿De qué proviene el nombre \"Marte\"?");
        ((RadioButton) findViewById(R.id.radio3_1)).setText("De la diosa romana del amor");
        ((RadioButton) findViewById(R.id.radio3_2)).setText("Del dios romano de la guerra");
        ((RadioButton) findViewById(R.id.radio3_3)).setText("De un científico famoso");
        ((RadioButton) findViewById(R.id.radio3_4)).setText("De un término griego antiguo");

        TextView pregunta4 = findViewById(R.id.question4);
        pregunta4.setText("4.\t¿Qué características tiene Marte similares a la Tierra?");
        ((RadioButton) findViewById(R.id.radio4_1)).setText("Volcanes y montañas");
        ((RadioButton) findViewById(R.id.radio4_2)).setText("Océanos y ríos");
        ((RadioButton) findViewById(R.id.radio4_3)).setText("Una atmósfera rica en oxígeno");
        ((RadioButton) findViewById(R.id.radio4_4)).setText("Una temperatura similar");

        TextView pregunta5 = findViewById(R.id.question5);
        pregunta5.setText("5.\t¿Qué mineral se forma en Marte debido a su actividad volcánica?");
        ((RadioButton) findViewById(R.id.radio5_1)).setText("Cuarzo");
        ((RadioButton) findViewById(R.id.radio5_2)).setText("Olivino");
        ((RadioButton) findViewById(R.id.radio5_3)).setText("Tridimita ");
        ((RadioButton) findViewById(R.id.radio5_4)).setText("Basalto");

        TextView pregunta6 = findViewById(R.id.question6);
        pregunta6.setText("6.\t¿Qué hace especial al Monte Olimpo en Marte?");
        ((RadioButton) findViewById(R.id.radio6_1)).setText("Es el volcán más grande del Sistema Solar");
        ((RadioButton) findViewById(R.id.radio6_2)).setText("Es el único volcán activo en Marte");
        ((RadioButton) findViewById(R.id.radio6_3)).setText("Tiene actividad de tormentas eléctricas constante");
        ((RadioButton) findViewById(R.id.radio6_4)).setText("Es el volcán más antiguo del Sistema Solar");

        TextView pregunta7 = findViewById(R.id.question7);
        pregunta7.setText("7.\t¿Cuántas lunas tiene Marte?");
        ((RadioButton) findViewById(R.id.radio7_1)).setText("Ninguna");
        ((RadioButton) findViewById(R.id.radio7_2)).setText("Una");
        ((RadioButton) findViewById(R.id.radio7_3)).setText("Dos");
        ((RadioButton) findViewById(R.id.radio7_4)).setText("Cuatro");

        TextView pregunta8 = findViewById(R.id.question8);
        pregunta8.setText("8.\t¿Qué sucederá con la luna Fobos en el futuro?");
        ((RadioButton) findViewById(R.id.radio8_1)).setText("Se alejará de Marte");
        ((RadioButton) findViewById(R.id.radio8_2)).setText("Se desintegrará en el espacio");
        ((RadioButton) findViewById(R.id.radio8_3)).setText("Chocará contra Marte");
        ((RadioButton) findViewById(R.id.radio8_4)).setText("Se convertirá en un anillo alrededor de Marte");

        TextView pregunta9 = findViewById(R.id.question9);
        pregunta9.setText("9.\t¿Quién fue la primera persona en observar Marte con un telescopio?");
        ((RadioButton) findViewById(R.id.radio9_1)).setText("Isaac Newton");
        ((RadioButton) findViewById(R.id.radio9_2)).setText("Galileo Galilei");
        ((RadioButton) findViewById(R.id.radio9_3)).setText("Copérnico");
        ((RadioButton) findViewById(R.id.radio9_4)).setText("Johannes Kepler");

        TextView pregunta10 = findViewById(R.id.question10);
        pregunta10.setText("10.\t¿Qué evidencias sugieren la posible existencia de vida en Marte?");
        ((RadioButton) findViewById(R.id.radio10_1)).setText("Fotografías de la NASA que muestran estructuras similares a microbios");
        ((RadioButton) findViewById(R.id.radio10_2)).setText("Descubrimiento de agua en la superficie actual");
        ((RadioButton) findViewById(R.id.radio10_3)).setText("Observación directa de seres vivos");
        ((RadioButton) findViewById(R.id.radio10_4)).setText("Análisis de muestras de suelo terrestre");
    }

}
