package abanto.com.appjesusabanto.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import abanto.com.appjesusabanto.R;

public class MainActivity extends AppCompatActivity {


    private ImageButton mensaje, contacto, encuesta, curso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensaje = (ImageButton) findViewById(R.id.btnmensaje);
        contacto = (ImageButton) findViewById(R.id.btncontacto);
        encuesta = (ImageButton) findViewById(R.id.btnencuesta);
        curso = (ImageButton) findViewById(R.id.btncurso);

        mensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MensajesView.class);
                startActivity(intent);
            }
        });

//        contacto.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent2 = new Intent(MainActivity.this,ContactosView.class);
//                startActivity(intent2);
//            }
//        });
//
//        encuesta.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent3 = new Intent(MainActivity.this,EncuestasView.class);
//                startActivity(intent3);
//            }
//        });
//
//        curso.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent4 = new Intent(MainActivity.this,CursosView.class);
//                startActivity(intent4);
//            }
//        });

    }


}


