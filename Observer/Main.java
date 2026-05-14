package Observer;

public class Main {

		public static void main(String[] args) {
	        Connection friend = new Connection();
	        SocialMediaFeed myFeed = new SocialMediaFeed();

	        // Ban đầu chưa đăng ký, cập nhật sẽ không hiện gì
	        System.out.println("--- Trước khi kết nối ---");
	        friend.setStatus("Đang đi học..."); 

	        // Đăng ký observer
	        friend.addPropertyChangeListener(myFeed);

	        System.out.println("\n--- Sau khi kết nối ---");
	        friend.setStatus("Đang làm bài tập Design Pattern!");
	        friend.setStatus("Vừa code xong bài Observer, vui quá!");

	        System.out.println("\n--- Xem toàn bộ Feed ---");
	        myFeed.showFeed();
	    }
	
	}


