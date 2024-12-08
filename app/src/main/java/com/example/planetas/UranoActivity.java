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

public class UranoActivity extends AppCompatActivity {

    Button buttonSubmit;
    ImageButton imageButtonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercurio);

        // Configuración del título
        TextView titulo = findViewById(R.id.titleText);
        titulo.setText("Quiz De Urano");

        // Configuración de la imagen del planeta
        ImageView imageViewPlanet = findViewById(R.id.imgPlanet);
        imageViewPlanet.setImageResource(R.drawable.urano);

        // Configuración de las preguntas y respuestas
        cargarPreguntas();

        // Configuración del botón de retroceso
        imageButtonBack = findViewById(R.id.btnBack);
        imageButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UranoActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Configuración del botón de enviar respuestas
        buttonSubmit = findViewById(R.id.btnSubmit);
        final int[] correctAnswers = {
                R.id.radio1_3, R.id.radio2_2, R.id.radio3_1,
                R.id.radio4_3, R.id.radio5_2, R.id.radio6_3,
                R.id.radio7_2, R.id.radio8_2,R.id.radio9_1, R.id.radio10_2
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

                Toast.makeText(UranoActivity.this,
                        "Respuestas correctas: " + score + "/10", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void cargarPreguntas() {

        TextView pregunta1 = findViewById(R.id.question1);
        pregunta1.setText("1.\t¿Qué lugar ocupa Urano en el Sistema Solar?");
        ((RadioButton) findViewById(R.id.radio1_1)).setText("Quinto planeta");
        ((RadioButton) findViewById(R.id.radio1_2)).setText("Sexto planeta");
        ((RadioButton) findViewById(R.id.radio1_3)).setText("Séptimo planeta");
        ((RadioButton) findViewById(R.id.radio1_4)).setText("Octavo planeta");

        TextView pregunta2 = findViewById(R.id.question2);
        pregunta2.setText("2.\t¿Qué característica especial tiene el movimiento de rotación de Urano?");
        ((RadioButton) findViewById(R.id.radio2_1)).setText("Es más rápido que en otros planetas");
        ((RadioButton) findViewById(R.id.radio2_2)).setText("Es vertical, a diferencia de los demás planetas");
        ((RadioButton) findViewById(R.id.radio2_3)).setText("Es más lento que en otros planetas");
        ((RadioButton) findViewById(R.id.radio2_4)).setText("Ocurre en dirección opuesta al Sol");

        TextView pregunta3 = findViewById(R.id.question3);
        pregunta3.setText("3.\t¿Qué gas en la atmósfera de Urano le da su color azul característico?");
        ((RadioButton) findViewById(R.id.radio3_1)).setText("Metano");
        ((RadioButton) findViewById(R.id.radio3_2)).setText("Helio");
        ((RadioButton) findViewById(R.id.radio3_3)).setText("Nitrógeno");
        ((RadioButton) findViewById(R.id.radio3_4)).setText("Hidrógeno");

        TextView pregunta4 = findViewById(R.id.question4);
        pregunta4.setText("4.\t¿Por qué no podemos aterrizar en Urano?");
        ((RadioButton) findViewById(R.id.radio4_1)).setText("Porque tiene anillos que dificultan el aterrizaje");
        ((RadioButton) findViewById(R.id.radio4_2)).setText("Porque su gravedad es demasiado baja");
        ((RadioButton) findViewById(R.id.radio4_3)).setText("Porque no tiene una superficie sólida");
        ((RadioButton) findViewById(R.id.radio4_4)).setText("Porque su atmósfera es tóxica");

        TextView pregunta5 = findViewById(R.id.question5);
        pregunta5.setText("5.\t¿Qué nave espacial ha visitado Urano?");
        ((RadioButton) findViewById(R.id.radio5_1)).setText("Galileo");
        ((RadioButton) findViewById(R.id.radio5_2)).setText("Voyager 2");
        ((RadioButton) findViewById(R.id.radio5_3)).setText("Cassini");
        ((RadioButton) findViewById(R.id.radio5_4)).setText("Hubble");

        TextView pregunta6 = findViewById(R.id.question6);
        pregunta6.setText("6.\t¿Qué tipo de planeta es Urano?");
        ((RadioButton) findViewById(R.id.radio6_1)).setText("Planeta terrestre");
        ((RadioButton) findViewById(R.id.radio6_2)).setText("Planeta gaseoso");
        ((RadioButton) findViewById(R.id.radio6_3)).setText("Planeta gigante de hielo");
        ((RadioButton) findViewById(R.id.radio6_4)).setText("Planeta volcánico");

        TextView pregunta7 = findViewById(R.id.question7);
        pregunta7.setText("7.\t¿Urano tiene anillos?");
        ((RadioButton) findViewById(R.id.radio7_1)).setText("No");
        ((RadioButton) findViewById(R.id.radio7_2)).setText("Sí, pero son muy difíciles de ver ");
        ((RadioButton) findViewById(R.id.radio7_3)).setText("Sí, son más visibles que los de Saturno");
        ((RadioButton) findViewById(R.id.radio7_4)).setText("No se sabe con certeza");

        TextView pregunta8 = findViewById(R.id.question8);
        pregunta8.setText("8.\t¿Qué hace que la gravedad de Urano sea similar a la de la Tierra?");
        ((RadioButton) findViewById(R.id.radio8_1)).setText("Su composición de gases");
        ((RadioButton) findViewById(R.id.radio8_2)).setText("Su baja densidad");
        ((RadioButton) findViewById(R.id.radio8_3)).setText("Su tamaño");
        ((RadioButton) findViewById(R.id.radio8_4)).setText("Su velocidad de rotación");

        TextView pregunta9 = findViewById(R.id.question9);
        pregunta9.setText("9.\t¿Qué combustible puede producir el metano en la atmósfera de Urano?");
        ((RadioButton) findViewById(R.id.radio9_1)).setText("Gas natural");
        ((RadioButton) findViewById(R.id.radio9_2)).setText("Petróleo");
        ((RadioButton) findViewById(R.id.radio9_3)).setText("Hidrógeno líquido");
        ((RadioButton) findViewById(R.id.radio9_4)).setText("Carbón");

        TextView pregunta10 = findViewById(R.id.question10);
        pregunta10.setText("10.\t¿Cómo fue descubierto Urano?");
        ((RadioButton) findViewById(R.id.radio10_1)).setText("Por observación a simple vista");
        ((RadioButton) findViewById(R.id.radio10_2)).setText("Con un telescopio, siendo el primero en descubrirse de esta manera");
        ((RadioButton) findViewById(R.id.radio10_3)).setText("Por una misión espacial tripulada");
        ((RadioButton) findViewById(R.id.radio10_4)).setText("Por la nave Voyager 2");
    }

}
