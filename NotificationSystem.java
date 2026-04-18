import java.util.ArrayList;

class NotificationSystem {
    private ArrayList<Observer> users = new ArrayList<>();

    public void subscribe(Observer user) {
        users.add(user);
    }

    public void notifyAllUsers(String message) {
        for (Observer user : users) {
            user.update(message);
        }
    }
}