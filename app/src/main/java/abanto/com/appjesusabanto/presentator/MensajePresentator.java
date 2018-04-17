package abanto.com.appjesusabanto.presentator;

import abanto.com.appjesusabanto.interfaces.MensajeInterface;
import abanto.com.appjesusabanto.view.MensajesView;

public class MensajePresentator implements MensajeInterface.Presenter {

    private MensajeInterface.View view;
    private MensajeInterface.Model model;

    public MensajePresentator(MensajesView view){
        this.view = view;
//        model = new MensajesView(this);
    }


    @Override
    public void validardata(Boolean data) {
        if (view != null){
            view.validar(data);
        }
    }

    @Override
    public void datos(String[] contact, String[] message) {
        if (view != null){
            model.datos(contact,message);
        }
    }
}
