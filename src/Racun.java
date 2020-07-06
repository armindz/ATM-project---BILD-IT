

public class Racun {

	int brojRacuna;
	String imeVlasnika;
	double iznosNaRacunu;
	int sifra;
	
	
	
	
	public Racun (int brojRacuna, String imeVlasnika, double iznosNaRacunu, int sifra) {
		this.brojRacuna = brojRacuna;
		this.imeVlasnika = imeVlasnika;
		this.iznosNaRacunu = iznosNaRacunu;
		this.sifra = sifra;
	}

	public int getBrojRacuna() {
		return brojRacuna;
	}


	public String getImeVlasnika() {
		return imeVlasnika;
	}


	public double getIznosNaRacunu() {
		return iznosNaRacunu;
	}

	
	
	public void dodajNaRacun (double kolicinaNovca) {
		this.iznosNaRacunu = iznosNaRacunu + kolicinaNovca;
	}
	
	
	
	public void skiniSRacuna (double kolicinaNovca) {
		this.iznosNaRacunu = iznosNaRacunu - kolicinaNovca;
	}
	
	
	
	public void setIznosNaRacunu(double iznosNaRacunu) {
		this.iznosNaRacunu = iznosNaRacunu;
	}
	
	

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	

	@Override
	public String toString() {
		return "\n \n \t \t \t Broj racuna :" + brojRacuna + "| Ime vlasnika: " + imeVlasnika + "|  Iznos na racunu: " + iznosNaRacunu +	"|";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}






