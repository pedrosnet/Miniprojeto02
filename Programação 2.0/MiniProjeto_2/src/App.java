import java.util.Scanner;

	class Main{

		public static void main(String[] args) throws Exception{

			Personagem Jogador42 = new Personagem();
            Jogador42.nome = "Jogador 42";
            Jogador42.energia = 100;

			Personagem Chefe = new Personagem();
            Chefe.nome = "Chefe";
            Chefe.energia = 100;

			Scanner leitor = new Scanner(System.in);
			String intro;
			String opcao;
            String opcao2;
			String opcao3;
            String opcao4;
			
			String i1 = "2";
			String c1 = "2";
			String c2 = "3";
			String c3 = "2"; 
			String c4 = "1";
			
			String introducao = "\nVocê acorda em uma sala estranha, e em você há um papel colocado com: 'Jogador 42' \nVocê escuta um voz que sai de um alto falante no canto da sala:\n - Seja bem-vindo ao teste de sua vida! \nvocê vai passar por 3 teste, se você errar, ou se você demorar demais você levará um choque, \ncontudo se você acertar, eu que levarei um choque, enfim, boa sorte! \nUma porta a sua frente se abre, o que fazer? \n\n1. Esperar na sala \n2. Seguir o caminho\n";
			
			String falha1 = "\nVocê decide esperar, após esperar um tempo, \num aparelho faz com que a sala libere eletricidade \ne lhe cause dano e você é obrigado a passar pra próxima sala\n";

			String enigma1 = "\nApós chegar na nova sala, você se depara com uma mesa com uma cara em cima \nvocê vai até ela e de abre, e nela está escrito: \nO que é, o que é, Sobe, sobe, sobe e jamais desce... \n1. Balão \n2. Idade \n3. Avião \n"; 

			String final1 =  "\nVocê errou a charada, \nO chão embaixo de você se abre e você cai em um abismo sem fim\n";

			String enigma2 = "\nVocê acertou a charada, \nVocê escuta um som de choque e gritos\nContudo você continua sua jornada \n \nUma porta se abre e você vai até ela\nAo entrar você vê outro papel a sua frente,\ncontudo existem 3 salas de cores diferentes, uma preta, uma roxa e uma rosa, no papel está escrito:\nQual cor forma se misturarmos azul com vermelho?\n\n1. Rosa \n2. Preto \n3. Roxo\n";
			
			String final2 =  "\nA sala que você entrou é esmagada por vigas de ferro, você perdeu\n";
			
			String enigma3 = "\nVocê chegar em uma sala com uma porta aberta, \ne nela se encontra um copo com algo que se parece com água, \na porta para a próxima sala se encontra aberta, \ncontudo seu cansaço fala mais alto, o que fazer? \n1. Beber \n2. Seguir em frente\n";
			
			String falha2 = "\nVocê bebe a água e sem algo estranho \nvocê não deveria ter confiado nele, \nmas você segue em frente\n"; 
			
			String enigma4 = "\nAo entrar na sala você vê um homem de preto \ne ele diz que é o criador daquilo tudo,\nele fala que você ir embora pela porta ao lado \nVocê lembra por tudo que passou e: \n1.Sair pela porta ao lado \n2.Lutar com o homem de preto\n";

			String final3 =  "\nVocê sai pela porta ao lado, e se vê no meio da sua cidade, \nvocê segue sua vida como sempre foi\n";
			
			String final4 =  "\nVocê luta com o homem de preto, \nvocê o derrota e decida se tornar o novo homem de preto \nVocê agora será o novo líder\n";
            
			String final5 = "\nVocê decide lutar com o homem de preto, \nContudo você está muito cansado e perde\n";
			
			
			System.out.println(introducao);
			intro = leitor.nextLine();

			if (intro.equals(i1)) {
				System.out.println(enigma1);
			} else {
        System.out.println(falha1);
				Jogador42.alterarEnergia(-25);
				System.out.println(enigma1);
			}
			
			opcao = leitor.nextLine();

			if(opcao.equals(c1)) {
				Chefe.alterarEnergia(-25);
				System.out.println(enigma2);
			} else { 
				System.out.println(final1);
				System.exit(1);
			}
			
            opcao2 = leitor.nextLine();
	
			if(opcao2.equals(c2)) {
				Chefe.alterarEnergia(-25);
				System.out.println(enigma3);
			} else { 
				System.out.println(final2);
				System.exit(1);
			}

			opcao3 = leitor.nextLine(); 

			if(opcao3.equals(c3)) {
				System.out.println(enigma4);
			} else {
				Jogador42.alterarEnergia(-50);
				System.out.println(falha2);
				System.out.println(enigma4);
			}

            opcao4 = leitor.nextLine();

			if(opcao4.equals(c4)) {
				System.out.println(final3);
			} else { 
				if(Jogador42.energia >= Chefe.energia) {
					System.out.println(final4);
					System.exit(1);
				} else {
					System.out.println(final5); 
					System.exit(1);
				}
			}
		}
	}