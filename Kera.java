public class Kera{
	double R, h, r;
	public Kera(double kera_raadius, double segmendi_raadius, double segmendi_kõrgus){
		if(kera_raadius<=0){
			throw new RuntimeException("Sobimatu väärtus");
		}
		if(segmendi_raadius<=0){
			throw new RuntimeException("Sobimatu väärtus");
		}
		if(segmendi_kõrgus<=0){
			throw new RuntimeException("Sobimatu väärtus");
		}
		
		R = kera_raadius;
		h = segmendi_kõrgus;
		r = segmendi_raadius;
		
	}
	
	public double kera_pindala(){
		return Math.round(4 * 3.14 * Math.pow(R, 2)*100)/100;
	}
	
	public double kera_ruumala(){
		return Math.round((4/3) * 3.14 * Math.pow(R, 3)*100)/100;
	}
	
	public double segmendi_pindala(){
		return Math.round(Math.PI * (2 * R * h + Math.pow(r, 2))*100)/100;
	}
	
	public double segmendi_ruumala(){
		return Math.round(Math.PI * Math.pow(h, 2)*(R - (h/3))*100)/100;
	}
}