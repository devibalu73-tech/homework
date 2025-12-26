import java.util.scanner;
class Area
{
	public static void main(string[]args)
	{
		scanner sc = new scanner(system.in);
		{
			system.out.println('Choode yuor option");
			int value = sc.nextInt();
			switch(value)
			{
				case 1:
				system.out.println("Enter r=");
				int r=sc.nextInt();
				double area=3.14*r*r;
				System.out.print("Area of the circle="+area);
				break;
				case 2:
				System.out.println("Enter a=");
				int a=sc.nextInt();
				area=a*a;
				systam.out.print("Area of square="+area);
				break;
				case 3:
				System.out.print("Enter l=");
				int l=sc.nextInt();
				System.out.print("Enter b=");
				int b=sc.nextInt();
				area=l*b;
				system.out.print("Area of rectangle=");
				break;
				case 4:
				system.out.print("Enter k=");
				int k=sc.nextInt();
				System.out.print("Enter h=");
				int h=sc.nextInt();
				area=0.5*k*h;
				system.out.print("Area of trianhle"+area);
				break;
				default:
				System.out.print("Invalid shape");
			}
		}
	}
}
				
				
		