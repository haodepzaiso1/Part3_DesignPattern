package CommandPattern;

public class GUImain {

	public static void main(String[] args) {
		// 1. Tạo Receiver
        Document myDoc = new Document();

        // 2. Tạo các Command và gắn với Receiver
        Command save = new SaveCommand(myDoc);
        Command print = new PrintCommand(myDoc);

        // 3. Tạo Invoker (Button)
        Button saveButton = new Button();
        Button printButton = new Button();

        // 4. Thiết lập lệnh cho nút bấm
        saveButton.setCommand(save);
        printButton.setCommand(print);

        // Giả lập người dùng click
        System.out.println("--- Người dùng tương tác ---");
        saveButton.click();
        printButton.click();
    }
	}


