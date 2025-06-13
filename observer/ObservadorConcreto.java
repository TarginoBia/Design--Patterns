package observer;

public class ObservadorConcreto implements Observer {
    public void update(String message) {
        System.out.println("Notificado: " + message);
    }
}
