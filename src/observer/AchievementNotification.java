package observer;
public class AchievementNotification implements Observer {
    @Override public void update(String event) {
        System.out.println("Система досягнень отримала подію: " + event);
    }
}
