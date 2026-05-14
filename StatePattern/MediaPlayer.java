package StatePattern;

public class MediaPlayer {
	private State state;
    private String icon;

    public MediaPlayer() {
        // Trạng thái mặc định ban đầu là Paused
        this.state = new PausedState();
        this.icon = "PLAY_ICON"; 
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    // Ủy quyền cho State xử lý
    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void showStatus() {
        System.out.println("Hiện tại: " + state.getClass().getSimpleName() + " | Icon: " + icon);
    }
}
