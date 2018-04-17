package abanto.com.appjesusabanto.interfaces;

public interface LoginInterface {
    interface View{
        void validar(Boolean log);
    }
    interface Presenter{

        void validaruser(Boolean log);
        void datos(String usuario, String clave);
    }
    interface Model{
        void datos(String usuario, String clave);
    }
}
