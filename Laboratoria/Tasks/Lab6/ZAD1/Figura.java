package Tasks.Lab6.ZAD1;

public class Figura {
	
	//pola metody i kontruktory
	Punkt punkt;
	String kolor = "bialy";
	
	
	Figura(){
		punkt = new Punkt(0,0);
	}
	public Figura(String kolor){
		this.kolor=kolor;
	}
	Figura(Punkt punkt){
		this.punkt=punkt;
	}
	String getKolor(){
		return kolor;
	}
	public String opis(){
		return "Klasa Figura. Kolor obiektu: "+kolor;
	}
			
	
}
