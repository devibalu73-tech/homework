import java.util.scanner;
class Grade
{
	public static void main(string[]args)
	{
		Scanner sc = new scanner(system.in);
		{
			system.out.print("choose your grade");
			char a = sc.next().charAt(0);
			Switch(a)
			{
				case A:
				System.out.println("Very Good");
				break;
				case B:
		        Sytstem.out.println("Good");
				break;
				case C:
				Ststem.out.println("Bad");
				break;
				case D:
				Ststem.out.println("Good");
				break;
				case F:
				System.out.println("Bad");
				break;
				default:
				system.out.println("Invalid Input");
			}
		}
	}
}