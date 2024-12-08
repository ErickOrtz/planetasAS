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

public class JupiterActivity extends AppCompatActivity {

    Button buttonSubmit;
    ImageButton imageButtonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercurio);

        // Configuración del título
        TextView titulo = findViewById(R.id.titleText);
        titulo.setText("Quiz De Jupiter");

        // Configuración de la imagen del planeta
        ImageView imageViewPlanet = findViewById(R.id.imgPlanet);
        imageViewPlanet.setImageResource(R.drawable.jupiter);

        // Configuración de las preguntas y respuestas
        cargarPreguntas();

        // Configuración del botón de retroceso
        imageButtonBack = findViewById(R.id.btnBack);
        imageButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JupiterActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Configuración del botón de enviar respuestas
        buttonSubmit = findViewById(R.id.btnSubmit);
        final int[] correctAnswers = {
                R.id.radio1_2, R.id.radio2_2, R.id.radio3_2,
                R.id.radio4_3, R.id.radio5_2, R.id.radio6_2,
                R.id.radio7_3, R.id.radio8_3, R.id.radio9_1, R.id.radio10_2
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

                Toast.makeText(JupiterActivity.this,
                        "Respuestas correctas: " + score + "/10", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void cargarPreguntas() {

        TextView pregunta1 = findViewById(R.id.question1);
        pregunta1.setText("1.\t¿Qué lugar ocupa Júpiter en el Sistema Solar?");
        ((RadioButton) findViewById(R.id.radio1_1)).setText("Cuarto planeta");
        ((RadioButton) findViewById(R.id.radio1_2)).setText("Quinto planeta");
        ((RadioButton) findViewById(R.id.radio1_3)).setText("Sexto planeta");
        ((RadioButton) findViewById(R.id.radio1_4)).setText("Séptimo planeta");

        TextView pregunta2 = findViewById(R.id.question2);
        pregunta2.setText("2.\t¿Por qué no es posible aterrizar en Júpiter?");
        ((RadioButton) findViewById(R.id.radio2_1)).setText("Porque está muy lejos");
        ((RadioButton) findViewById(R.id.radio2_2)).setText("Porque no tiene una superficie sólida");
        ((RadioButton) findViewById(R.id.radio2_3)).setText("Porque su gravedad es demasiado alta");
        ((RadioButton) findViewById(R.id.radio2_4)).setText("Porque está cubierto de agua");

        TextView pregunta3 = findViewById(R.id.question3);
        pregunta3.setText("3.\t¿Qué característica tiene el núcleo de Júpiter?");
        ((RadioButton) findViewById(R.id.radio3_1)).setText("Es líquido y muy caliente");
        ((RadioButton) findViewById(R.id.radio3_2)).setText("Es sólido y del tamaño de la Tierra");
        ((RadioButton) findViewById(R.id.radio3_3)).setText("Es gaseoso y denso");
        ((RadioButton) findViewById(R.id.radio3_4)).setText("Está compuesto de metales pesados");

        TextView pregunta4 = findViewById(R.id.question4);
        pregunta4.setText("4.\t¿Qué hace que Júpiter sea único respecto a su movimiento de rotación?");
        ((RadioButton) findViewById(R.id.radio4_1)).setText("Es el más lento del Sistema Solar");
        ((RadioButton) findViewById(R.id.radio4_2)).setText("Dura 24 horas como en la Tierra");
        ((RadioButton) findViewById(R.id.radio4_3)).setText("Es el más rápido, con un día que dura solo 10 horas terrestres");
        ((RadioButton) findViewById(R.id.radio4_4)).setText("Tiene rotación inversa como Venus");

        TextView pregunta5 = findViewById(R.id.question5);
        pregunta5.setText("5.\t¿Qué forma la atmósfera de Júpiter?");
        ((RadioButton) findViewById(R.id.radio5_1)).setText("Una capa de hielo");
        ((RadioButton) findViewById(R.id.radio5_2)).setText("Tres capas de nubes que le dan sus colores");
        ((RadioButton) findViewById(R.id.radio5_3)).setText("Una capa de polvo y gas");
        ((RadioButton) findViewById(R.id.radio5_4)).setText("Una mezcla de dióxido de carbono y agua");

        TextView pregunta6 = findViewById(R.id.question6);
        pregunta6.setText("6.\t¿Qué es la Gran Mancha Roja de Júpiter?");
        ((RadioButton) findViewById(R.id.radio6_1)).setText("Un cráter gigante");
        ((RadioButton) findViewById(R.id.radio6_2)).setText("Una tormenta gigante");
        ((RadioButton) findViewById(R.id.radio6_3)).setText("Un océano de metano");
        ((RadioButton) findViewById(R.id.radio6_4)).setText("Un volcán en erupción");

        TextView pregunta7 = findViewById(R.id.question7);
        pregunta7.setText("7.\t¿Cuántas lunas tiene Júpiter aproximadamente?");
        ((RadioButton) findViewById(R.id.radio7_1)).setText("Más de 20");
        ((RadioButton) findViewById(R.id.radio7_2)).setText("Más de 40");
        ((RadioButton) findViewById(R.id.radio7_3)).setText("Más de 60 ");
        ((RadioButton) findViewById(R.id.radio7_4)).setText("Más de 80");

        TextView pregunta8 = findViewById(R.id.question8);
        pregunta8.setText("8.\t¿Cómo se llama la luna de Júpiter donde podría haber vida?");
        ((RadioButton) findViewById(R.id.radio8_1)).setText("Ganímedes");
        ((RadioButton) findViewById(R.id.radio8_2)).setText("Calisto");
        ((RadioButton) findViewById(R.id.radio8_3)).setText("Europa");
        ((RadioButton) findViewById(R.id.radio8_4)).setText("Io");

        TextView pregunta9 = findViewById(R.id.question9);
        pregunta9.setText("9.\t¿Por qué se considera a Júpiter como un \"mini sistema solar\"?");
        ((RadioButton) findViewById(R.id.radio9_1)).setText("Porque tiene muchas lunas");
        ((RadioButton) findViewById(R.id.radio9_2)).setText("Porque tiene anillos como Saturno");
        ((RadioButton) findViewById(R.id.radio9_3)).setText("Porque tiene atmósfera y océanos");
        ((RadioButton) findViewById(R.id.radio9_4)).setText("Porque su núcleo es similar al Sol");

        TextView pregunta10 = findViewById(R.id.question10);
        pregunta10.setText("10.\t¿Cuántas exploraciones aéreas se han realizado a Júpiter?");
        ((RadioButton) findViewById(R.id.radio10_1)).setText("Cinco");
        ((RadioButton) findViewById(R.id.radio10_2)).setText("Siete");
        ((RadioButton) findViewById(R.id.radio10_3)).setText("Diez");
        ((RadioButton) findViewById(R.id.radio10_4)).setText("Más de quince");
    }

}
