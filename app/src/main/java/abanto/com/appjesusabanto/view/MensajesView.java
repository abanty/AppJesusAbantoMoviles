package abanto.com.appjesusabanto.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;

import abanto.com.appjesusabanto.R;
import abanto.com.appjesusabanto.interfaces.LoginInterface;
import abanto.com.appjesusabanto.interfaces.MensajeInterface;
import abanto.com.appjesusabanto.presentator.LoginPresentator;
import abanto.com.appjesusabanto.presentator.MensajePresentator;

public class MensajesView extends AppCompatActivity implements MensajeInterface.View{

    private EditText name, message;
    private Button sendmensaje;
    private TableLayout lista;
    private MensajeInterface.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensajes_view);

        name = (EditText) findViewById(R.id.txtnombre);
        message = (EditText) findViewById(R.id.txtmensaje);
        sendmensaje = (Button) findViewById(R.id.btnenviar);
        lista = (TableLayout) findViewById(R.id.lista);
        presenter = new MensajePresentator(this);

    }
    public void result(View view){
        presenter.datos(new String[]{name.getText().toString()}, new String[]{message.getText().toString()});
    }




    @Override
    public void validar(Boolean data) {

    }
}
