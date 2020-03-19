package domain;

public class User {
	String ime,prezime;

	public User(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}

	public User() {
		super();
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	@Override
	public String toString() {
		return "User [ime=" + ime + ", prezime=" + prezime + "]";
	}
	
	
	
}
