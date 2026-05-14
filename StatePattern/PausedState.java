package StatePattern;

public class PausedState implements State{
	@Override
    public void play(MediaPlayer player) {
        player.setState(new PlayingState());
        player.setIcon("PLAY_ICON");
        System.out.println("Đã chuyển sang trạng thái: Đang phát.");
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Máy đang tạm dừng rồi, không làm gì cả.");
    }
}