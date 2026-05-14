package StatePattern;

public class PlayingState  implements State {

	@Override
    public void play(MediaPlayer player) {
        System.out.println("Máy đang phát rồi, không làm gì cả.");
    }

    @Override
    public void pause(MediaPlayer player) {
        player.setState(new PausedState());
        player.setIcon("PAUSE_ICON");
        System.out.println("Đã chuyển sang trạng thái: Tạm dừng.");
    }
}