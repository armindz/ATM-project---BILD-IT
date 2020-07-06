import java.util.Scanner;

public class MainMetoda {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int tipkovnica;

		Bankomat ATM = new Bankomat();
		
		Racun racun1 = new Racun(0, "Ahmet", 1000, 4422);
		Racun racun2 = new Racun(1, "Armin", 1000, 1124);
		Racun racun3 = new Racun(2, "Elvir", 1000, 2154);
		Racun racun4 = new Racun(3, "Mehmet", 1000, 2193);

		ATM.kreirajRacun(racun1);
		ATM.kreirajRacun(racun2);
		ATM.kreirajRacun(racun3);
		ATM.kreirajRacun(racun4);

		System.out.println(ATM.listaRacuna);
		
		// POCETAK INTERAKCIJE S KORISNIKOM
		System.out.println(	"\n Dobrodosli na bankomat. Koristite tipkovnicu za unos. Ubacite karticu!  ( za ubacivanje kartice unijeti brojracuna )");
		tipkovnica = unos.nextInt();

		
		
		// ISPITAJ VALIDNOST BROJA RACUNA I SIFRE
		for (int i = 0; i < ATM.listaRacuna.size(); i++) {
			
			Racun racunn = ATM.listaRacuna.get(i);
			
			int brojRacuna = racunn.getBrojRacuna();
			int sifra = racunn.getSifra();
			double stanjeRacuna = racunn.getIznosNaRacunu();

				
				if (tipkovnica == brojRacuna) {
					
					System.out.println("Dobrodošli " + racunn.getImeVlasnika());
					
					System.out.println("Molimo unesite sifru");
					tipkovnica = unos.nextInt();

				
					while (tipkovnica != sifra) {
					
					System.out.println("Pogresna sifra...Unesite ponovo!");
					tipkovnica = unos.nextInt();
					}

				
					
					
					// IZBORNIK BANKOMATA
					
					while (tipkovnica != 0) {

						System.out.println("|  (1) SLANJE NOVCA   |  (2) PODIZANJE NOVCA  |  (3)  STANJE NA RACUNU  |   (0)  IZLAZ   |");
					
						tipkovnica = unos.nextInt();
					
					
					
						switch (tipkovnica) {

							
							case 1:

									System.out.println(" |  (1) SLANJE NOVCA   |  ");

									System.out.println("Molimo unesite broj racuna primaoca");
										int brojPrimaoca = unos.nextInt();

									System.out.println("Molimo unesite iznos novca za slanje");
										double iznosZaSlanje = unos.nextDouble();

										ATM.transferNovca(brojRacuna, brojPrimaoca, iznosZaSlanje);

									System.out.println("Odliv sredstava na racun " + brojPrimaoca + " u iznosu od " + iznosZaSlanje);

									continue;

							case 2:

									System.out.println("|  (2) PODIZANJE NOVCA  |");

									System.out.println("Molimo unesite kolicinu novca za podizanje");
										double iznosZaPodizanje = unos.nextDouble();

									
										
										if (stanjeRacuna - iznosZaPodizanje < 0) {
										
											System.out.println("Nedovoljno sredstava na racunu.");
										} 
									
										else {
										
											racunn.skiniSRacuna(iznosZaPodizanje);
										
												System.out.println("Novac uspjesno podignut!");
										}

									
									continue;


							case 3:
								
									System.out.println(" |  (3)   STANJE NA RACUNU   |  ");
						
									System.out.println(racunn.getIznosNaRacunu());

								

									continue;

							}
						
						tipkovnica = -222;
				}
			}

		}
		unos.close();
	}

}
