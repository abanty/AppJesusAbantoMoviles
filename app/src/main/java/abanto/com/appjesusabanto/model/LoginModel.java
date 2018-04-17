package abanto.com.appjesusabanto.model;

import android.content.Intent;
import android.widget.Toast;

import abanto.com.appjesusabanto.interfaces.LoginInterface;

public class LoginModel implements LoginInterface.Model {

    private LoginInterface.Presenter presenter;
    private boolean var = false;


    public LoginModel(LoginInterface.Presenter presenter) {
        this.presenter = presenter;
    }


    @Override
    public void datos(String usuario, String clave) {
        if((usuario.equals("Abanto")) && (clave.equals("123456"))){
            var = true;
        }
        presenter.validaruser(var);
    }
}
