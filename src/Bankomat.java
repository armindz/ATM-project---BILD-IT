import java.util.ArrayList;

public class Bankomat  {

	ArrayList <Racun> listaRacuna = new ArrayList <Racun>();

	
	 
public Bankomat () {
}

	
public void kreirajRacun (Racun racun) {
	
	if (listaRacuna.isEmpty()) {
		
		listaRacuna.add(racun);
		System.out.println("Racun je uspjesno dodat");
		}
	
	
	else {
	
		for (int i=0; i < listaRacuna.size(); i++) {
		
			Racun vlasnik = listaRacuna.get(i);
			
			int brojRacunaPostojecegKorisnika = vlasnik.getBrojRacuna();
			double iznosNaRacunuNovogKorisnika = racun.getIznosNaRacunu();
			int brojRacunaNovogKorisnika = racun.getBrojRacuna();
		
		
	
			if (brojRacunaNovogKorisnika < 0  ) {
				
				System.out.println("Greska! Broj racuna je negativan broj, molimo unesite pozitivan broj");
				return;
				}
			
			
			if (brojRacunaNovogKorisnika == brojRacunaPostojecegKorisnika) {
				
				System.out.println("Greska! Vec postoji korisnik s tim brojem racuna.");
				return;
				}
				
		
			if (iznosNaRacunuNovogKorisnika < 0) {
				
				System.out.println("Greska! Iznos na racunu je negativan.");
				return;
				}
		}
				
		
			
				
				listaRacuna.add(racun);
				System.out.println("Racun je uspjesno dodat.");
				}
			return;
		
	}
	



	
public void skiniSRacuna (int brojPosiljaoca, double iznosNovca) {
	

// IZVUCI POSILJAOCA IZ LISTE
for (int i=0; i < listaRacuna.size(); i++) {

Racun racun = listaRacuna.get(i);

int brojRacunaPosiljaoca = racun.getBrojRacuna();
double stanjeNaRacunuPosiljaoca = racun.getIznosNaRacunu();



if (brojRacunaPosiljaoca == brojPosiljaoca) {
	
	System.out.println("Broj racuna posiljaoca pronadjen");
	
	
	if (stanjeNaRacunuPosiljaoca - iznosNovca < 0) {
		
		System.out.println("Korisnik nema dovoljno sredstava za transfer novca.");
		return;
	}
	
	
	else if (stanjeNaRacunuPosiljaoca - iznosNovca > 0 ) {
		
		System.out.println("Korisnik ima dovoljno sredstava za transfer novca.");
			
		racun.skiniSRacuna(iznosNovca);
	}
}
}
}

public void dodajNaRacun (int brojPrimaoca, double iznosNovca) {
		
		// IZVUCI PRIMAOCA IZ LISTE
	
		for (int i=0; i < listaRacuna.size(); i++) {
			
			Racun racun = listaRacuna.get(i);
			
			int brojRacunaPrimaoca = racun.getBrojRacuna();
		

			// ako je nadjen primaoc izvrsi transakciju
		if (brojRacunaPrimaoca == brojPrimaoca) {
			
			racun.dodajNaRacun(iznosNovca);
		}
		}
}
public void transferNovca (int brojPosiljaoca, int brojPrimaoca, double iznosNovca) {
	
	// IZVUCI POSILJAOCA IZ LISTE
	for (int i=0; i < listaRacuna.size(); i++) {

	Racun racun = listaRacuna.get(i);

	int brojRacunaPosiljaoca = racun.getBrojRacuna();
	double stanjeNaRacunuPosiljaoca = racun.getIznosNaRacunu();



	if (brojRacunaPosiljaoca == brojPosiljaoca) {
		
		System.out.println("\n Broj racuna posiljaoca pronadjen");
		
		if (stanjeNaRacunuPosiljaoca - iznosNovca < 0) {
			
			System.out.println("\n Korisnik nema dovoljno sredstava za transfer novca.");
			return;
		}
		
		
		
		if (stanjeNaRacunuPosiljaoca - iznosNovca > 0 ) {
			
			System.out.println("\n Korisnik ima dovoljno sredstava za transfer novca.");
				
			
		

// IZVUCI PRIMAOCA IZ LISTE

for (int y=0; y < listaRacuna.size(); y++) {
	
	Racun racun1 = listaRacuna.get(y);
	
	int brojRacunaPrimaoca = racun1.getBrojRacuna();


	// ako je nadjen primaoc izvrsi transakciju
if (brojRacunaPrimaoca == brojPrimaoca) {
	
	racun1.dodajNaRacun(iznosNovca);
	racun.skiniSRacuna(iznosNovca);
	
	System.out.println("\n Transakcija je uspjesna.");
	
	
}
}
}
	}
	}
	
	
	
	}


@Override
public String toString() {
	return "Bankomat [listaRacuna=" + listaRacuna + "]";
}
}




	

		
				
			
			
		
	










