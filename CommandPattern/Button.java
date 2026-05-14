package CommandPattern;


//nút bấm giữ đối tượng Command khi click() nó sẽ được gọi và kích hoạt lệnh đó 
public class Button {
  private Command command;
  
  
  public void setCommand(Command command) {
	  this.command = command;
  }
  
  public void click() {
	  command.execute();
  }
}
