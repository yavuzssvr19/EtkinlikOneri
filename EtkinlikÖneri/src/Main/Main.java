package Main;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ınp=new Scanner(System.in);
		System.out.println("Hava Sıcaklığını Giriniz: ");
		double c=ınp.nextDouble();
		if(c<=5) {
			System.out.println("Kayak Yapmalısın");
			
		}else if(c>5 && c<=10) {
			System.out.println("Sinemaya Gitmelisin");
		}else if(c>10 && c<=15) {
			System.out.println("Sinema veya Pikniğe gitmelisin");
			
		}else if(c>15 && c<=25) {
			System.out.println("Pikniğe gitmelsin ");
			
		}else if(c>25) {
			System.out.println("Yüzmeye gitmelesin");
		}
		
		

	}

}
