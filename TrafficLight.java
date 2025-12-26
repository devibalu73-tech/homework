import java.util.scanner;
class TrafficLight
{
	public void main(string[]args)
	{
		scanner sc = new scanner(system.in);
		String a = sc.nextLine();
		switch(a)
		{
			case "Red":
			system.out.println("Stop");
			break;
			case "Yellow":
			system.out.println("Wait");
			break;
			case "Green":
			systam.out.println("Go");
			break;
			default:
			system.out.println("Invalid Input");
		}
	}
}
			