package JogoXadrez;

public class Casa {

	int tipoCasa;
	boolean ocupada;
	Peca peca;
	
	public Casa(int tipoCasa){
		
		this.tipoCasa = tipoCasa;
		
	}
	
	public void setPeca(Peca peca){
		
		this.peca = peca;
		
	}
	
	public Peca getPeca(){
		
		return this.peca;
		
	}
	
	
	
}
