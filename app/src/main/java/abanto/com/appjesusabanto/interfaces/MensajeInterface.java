package abanto.com.appjesusabanto.interfaces;

public interface MensajeInterface {
    interface View{
        void validar(Boolean data);
    }
    interface Presenter{

        void validardata(Boolean data);
        void datos(String[] contact, String[] message);
    }
    interface Model{
        void datos(String[] contact, String[] message);
    }
}
