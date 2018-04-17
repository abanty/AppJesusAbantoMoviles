package abanto.com.appjesusabanto.presentator;

import android.util.Log;

import abanto.com.appjesusabanto.interfaces.LoginInterface;
import abanto.com.appjesusabanto.model.LoginModel;
import abanto.com.appjesusabanto.view.LoginView;

public class LoginPresentator implements LoginInterface.Presenter {

    private LoginInterface.View view;
    private LoginInterface.Model model;

    public LoginPresentator(LoginView view){
        this.view = view;
        model = new LoginModel(this);
    }


    @Override
    public void validaruser(Boolean log) {
        if (view != null){
            view.validar(log);
        }
    }

    @Override
    public void datos(String usuario, String clave) {
        if (view != null){
            model.datos(usuario,clave);
        }
    }
}
