package Observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class SocialMediaFeed implements PropertyChangeListener {
    private List<String> statuses = new ArrayList<>();

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        // Khi nhận được thông báo, lấy giá trị mới và thêm vào feed
        String newStatus = (String) evt.getNewValue();
        statuses.add(newStatus);
        System.out.println("[Feed Update]: " + newStatus);
    }

    public void showFeed() {
        System.out.println("Current Feed: " + statuses);
    }
}