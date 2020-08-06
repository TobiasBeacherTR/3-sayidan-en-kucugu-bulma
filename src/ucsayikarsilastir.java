import java.util.Scanner;
public class ucsayikarsilastir {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Ilk sayiyi giriniz : ");
		int x=scanner.nextInt();
		System.out.print("2. sayiyi giriniz : ");
		int y=scanner.nextInt();
		System.out.print("3. sayiyi giriniz : ");
		int z=scanner.nextInt();
		
		int k=Math.min(Math.min(x, y),Math.min(y, z) );
		
		System.out.println("En küçüðü : " + k );

	}

}
