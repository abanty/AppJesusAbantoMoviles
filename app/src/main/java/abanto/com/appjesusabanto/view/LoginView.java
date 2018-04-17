package abanto.com.appjesusabanto.view;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import abanto.com.appjesusabanto.R;
import abanto.com.appjesusabanto.interfaces.LoginInterface;
import abanto.com.appjesusabanto.presentator.LoginPresentator;

public class LoginView extends AppCompatActivity implements  LoginInterface.View {

    private EditText Nombre, Clave;
    private TextView info,bienvenido;
    private Button login;
    private int counter = 5;
    private LoginInterface.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        Nombre = (EditText) findViewById(R.id.txtname);
        Clave = (EditText) findViewById(R.id.txtpass);
        info = (TextView) findViewById(R.id.tvinfo);
        login = (Button) findViewById(R.id.btnlogin);
//        bienvenido = (TextView) findViewById(R.id.txtbienvenido);
        presenter = new LoginPresentator(this);

//        info.setText("N° de intentos restantes: 4");
    }

    public void ingresar(View view){

        presenter.datos(Nombre.getText().toString(), Clave.getText().toString());
    }


    @Override
    public void validar(Boolean log) {
        if (log == true){
            Toast.makeText(this, "Ingreso Satisfactorio", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, MainActivity.class));
        }else{
            counter--;
            info.setText("N° de intentos restantes " + String.valueOf(counter));

            if(counter == 0){
                login.setEnabled(false);
                new CountDownTimer(10000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        info.setText("segundos restantes: " + millisUntilFinished / 1000);
                    }
                    public void onFinish() {
                        counter = 4;
                        info.setText("N° de intentos restantes: " + String.valueOf(counter) );
                        login.setEnabled(true);
                    }
                }.start();
            }
        }
    }
}
