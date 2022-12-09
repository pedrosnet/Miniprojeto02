public class Personagem  {

	String nome;
	int energia;
	
	Personagem (String nome, int energia){
	}
	
	public Personagem() {
    }

    void alterarEnergia(int alteracao){
		this.energia = this.energia + alteracao;
		
		if(alteracao > 0){
			System.out.println("Após esta ação, " + this.nome + " recuperou " + alteracao + " pontos de energia\n");

		} else {
			System.out.println("Após esta ação, " + this.nome + " perdeu " + alteracao + " pontos de energia\n");
		}
		
		if(this.energia > 100) {
			this.energia = 100;
	} else if(this.energia < 0){
			this.energia = 0;
			System.out.println(this.nome + " foi derrotado.");
			System.exit(1);
		}
		
	}
	
}