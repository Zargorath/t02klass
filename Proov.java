import java.util.Scanner;
public class Proov{
	public static void main(String[] args){
		
		//Väärtuste sisestus
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sisestage kera parameetrid.");
		System.out.println("Kera raadius: ");
		float kera_raadius = scan.nextFloat();
		
		System.out.println("Kera segmendi raadius: ");
		float kera_segmendi_raadius = scan.nextFloat();
		
		System.out.println("Kera segmendi kõrgus: ");
		float kera_segmendi_kõrgus = scan.nextFloat();
		
		Kera kera1 = new Kera(kera_raadius, kera_segmendi_raadius, kera_segmendi_kõrgus);
		
		//Õiged arvutused
		
		System.out.println("Kera pindala: " + kera1.kera_pindala());
		System.out.println("Kera ruumala: " + kera1.kera_ruumala());
		System.out.println("Antud kera segmendi pindala: " + kera1.segmendi_pindala());
		System.out.println("Antud kera segmendi ruumala: " + kera1.segmendi_ruumala());
	}
}

/*
[krisliiv@greeny t02klass]$ java Proov
Sisestage kera parameetrid.
Kera raadius:
1
Kera segmendi raadius:
1
Kera segmendi kõrgus:
1
Kera pindala: 12.0
Kera ruumala: 3.0
Antud kera segmendi pindala: 9.0
Antud kera segmendi ruumala: 2.0
*/

/*
[krisliiv@greeny t02klass]$ java Proov
Sisestage kera parameetrid.
Kera raadius:
5
Kera segmendi raadius:
8
Kera segmendi kõrgus:
5
Kera pindala: 314.0
Kera ruumala: 392.0
Antud kera segmendi pindala: 358.0
Antud kera segmendi ruumala: 261.0
*/

