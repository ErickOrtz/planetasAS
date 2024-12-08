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

public class VenusActivity extends AppCompatActivity {

    Button buttonSubmit;
    ImageButton imageButtonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercurio);

        // Configuración del título
        TextView titulo = findViewById(R.id.titleText);
        titulo.setText("Quiz De Venus");

        // Configuración de la imagen del planeta
        ImageView imageViewPlanet = findViewById(R.id.imgPlanet);
        imageViewPlanet.setImageResource(R.drawable.venus);

        // Configuración de las preguntas y respuestas
        cargarPreguntas();

        // Configuración del botón de retroceso
        imageButtonBack = findViewById(R.id.btnBack);
        imageButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VenusActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Configuración del botón de enviar respuestas
        buttonSubmit = findViewById(R.id.btnSubmit);
        final int[] correctAnswers = {
                R.id.radio1_2, R.id.radio2_2, R.id.radio3_3,
                R.id.radio4_3, R.id.radio5_1, R.id.radio6_2,
                R.id.radio7_2, R.id.radio8_3, R.id.radio9_2, R.id.radio10_3
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

                Toast.makeText(VenusActivity.this,
                        "Respuestas correctas: " + score + "/10", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void cargarPreguntas() {

        TextView pregunta1 = findViewById(R.id.question1);
        pregunta1.setText("1.\t¿Cuál es la posición de Venus en el Sistema Solar?");
        ((RadioButton) findViewById(R.id.radio1_1)).setText("Primer planeta");
        ((RadioButton) findViewById(R.id.radio1_2)).setText("Segundo planeta");
        ((RadioButton) findViewById(R.id.radio1_3)).setText("Tercer planeta");
        ((RadioButton) findViewById(R.id.radio1_4)).setText("Cuarto planeta");

        TextView pregunta2 = findViewById(R.id.question2);
        pregunta2.setText("2.\t¿Por qué hace tanto calor en Venus?");
        ((RadioButton) findViewById(R.id.radio2_1)).setText("Porque está más cerca del Sol que la Tierra");
        ((RadioButton) findViewById(R.id.radio2_2)).setText("Porque su atmósfera es muy densa y provoca un efecto invernadero");
        ((RadioButton) findViewById(R.id.radio2_3)).setText("Porque tiene volcanes activos");
        ((RadioButton) findViewById(R.id.radio2_4)).setText("Porque no tiene océanos");

        TextView pregunta3 = findViewById(R.id.question3);
        pregunta3.setText("3.\t¿Qué sucedió con el gran océano que se cree que existió en Venus?");
        ((RadioButton) findViewById(R.id.radio3_1)).setText("Se congeló");
        ((RadioButton) findViewById(R.id.radio3_2)).setText("Fue destruido por volcanes");
        ((RadioButton) findViewById(R.id.radio3_3)).setText("Desapareció por causas desconocidas");
        ((RadioButton) findViewById(R.id.radio3_4)).setText("Se evaporó debido a su cercanía al Sol");

        TextView pregunta4 = findViewById(R.id.question4);
        pregunta4.setText("4.\t¿De dónde proviene el nombre \"Venus\"?");
        ((RadioButton) findViewById(R.id.radio4_1)).setText("De una estrella");
        ((RadioButton) findViewById(R.id.radio4_2)).setText("De la diosa griega de la luna");
        ((RadioButton) findViewById(R.id.radio4_3)).setText("De la diosa romana del amor y la belleza");
        ((RadioButton) findViewById(R.id.radio4_4)).setText("De un científico famoso");

        TextView pregunta5 = findViewById(R.id.question5);
        pregunta5.setText("5.\t¿Cómo es conocido Venus cuando se ve desde la Tierra?");
        ((RadioButton) findViewById(R.id.radio5_1)).setText("El lucero del alba o lucero de la tarde");
        ((RadioButton) findViewById(R.id.radio5_2)).setText("El planeta rojo");
        ((RadioButton) findViewById(R.id.radio5_3)).setText("La estrella polar");
        ((RadioButton) findViewById(R.id.radio5_4)).setText("El gigante gaseoso");

        TextView pregunta6 = findViewById(R.id.question6);
        pregunta6.setText("6.\t¿Qué tipo de rocas se pueden encontrar en Venus?");
        ((RadioButton) findViewById(R.id.radio6_1)).setText("Granito");
        ((RadioButton) findViewById(R.id.radio6_2)).setText("Rocas basálticas");
        ((RadioButton) findViewById(R.id.radio6_3)).setText("Rocas sedimentarias");
        ((RadioButton) findViewById(R.id.radio6_4)).setText("Rocas metamórficas");

        TextView pregunta7 = findViewById(R.id.question7);
        pregunta7.setText("7.\t¿Cuál es una característica única del movimiento de rotación de Venus?");
        ((RadioButton) findViewById(R.id.radio7_1)).setText("Es el más rápido del sistema solar");
        ((RadioButton) findViewById(R.id.radio7_2)).setText("Es contrario al de los demás planetas del sistema solar");
        ((RadioButton) findViewById(R.id.radio7_3)).setText("Es igual al de la Tierra");
        ((RadioButton) findViewById(R.id.radio7_4)).setText("Es más lento que el de cualquier otro planeta");

        TextView pregunta8 = findViewById(R.id.question8);
        pregunta8.setText("8.\t¿Cuántas naves espaciales han explorado Venus?");
        ((RadioButton) findViewById(R.id.radio8_1)).setText("Más de 20");
        ((RadioButton) findViewById(R.id.radio8_2)).setText("Más de 30");
        ((RadioButton) findViewById(R.id.radio8_3)).setText("Más de 40 ");
        ((RadioButton) findViewById(R.id.radio8_4)).setText("Más de 50");

        TextView pregunta9 = findViewById(R.id.question9);
        pregunta9.setText("9.\t¿Por qué Venus es tan brillante en el cielo?");
        ((RadioButton) findViewById(R.id.radio9_1)).setText("Porque está cubierto de hielo");
        ((RadioButton) findViewById(R.id.radio9_2)).setText("Porque su atmósfera refleja mucha luz solar ");
        ((RadioButton) findViewById(R.id.radio9_3)).setText("Porque tiene muchos volcanes activos");
        ((RadioButton) findViewById(R.id.radio9_4)).setText("Porque está cerca de la Tierra");

        TextView pregunta10 = findViewById(R.id.question10);
        pregunta10.setText("10.\t¿Cuándo se puede observar Venus desde la Tierra?");
        ((RadioButton) findViewById(R.id.radio10_1)).setText("Durante todo el día");
        ((RadioButton) findViewById(R.id.radio10_2)).setText("Al mediodía");
        ((RadioButton) findViewById(R.id.radio10_3)).setText("Solo al amanecer o al atardecer");
        ((RadioButton) findViewById(R.id.radio10_4)).setText("Solo en la noche profunda");
    }

}
