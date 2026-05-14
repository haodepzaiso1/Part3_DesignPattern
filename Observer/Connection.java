package Observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Connection {
	private String status;
    // Đối tượng hỗ trợ quản lý các Observer
    private PropertyChangeSupport support;

    public Connection() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void setStatus(String newStatus) {
        String oldStatus = this.status;
        this.status = newStatus;
        // Thông báo cho tất cả các observer về sự thay đổi
        support.firePropertyChange("status", oldStatus, newStatus);
    }

}
