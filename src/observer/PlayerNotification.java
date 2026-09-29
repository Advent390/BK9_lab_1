package observer;
public class PlayerNotification implements Observer {
    @Override public void update(String event) {
        System.out.println("Повідомлення гравцю: " + event);
    }
}
