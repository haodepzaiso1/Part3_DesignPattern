package StatePattern;

public class Main {

	
		public static void main(String[] args) {
	        MediaPlayer player = new MediaPlayer();
	        player.showStatus();

	        System.out.println("\n--- Người dùng nhấn PLAY ---");
	        player.play();
	        player.showStatus();

	        System.out.println("\n--- Người dùng nhấn PAUSE ---");
	        player.pause();
	        player.showStatus();
	        
	        System.out.println("\n--- Nhấn PAUSE lần nữa ---");
	        player.pause();
	    
	}

}
