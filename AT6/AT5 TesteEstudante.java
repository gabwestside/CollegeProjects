import java.util.Scanner;

public class TesteEstudante {
public static void main(String[] args) {
	System.out.println("Sele��o de Monitoria para Disciplinas de"
			+ "Engenharia de Energias (use virgula em decimais)\n\n");
		
	Scanner dados;
	Estudante estudante1 = new Estudante();
	
	
	//CADASTRO DO CANDIDATO
	System.out.println("Nome do(a) estudante");
	dados = new Scanner(System.in);
		estudante1.nome = dados.next();
		
	System.out.println("Matricula do(a) estudante");
	dados = new Scanner(System.in);
		estudante1.matricula = dados.nextInt();
	
/*	System.out.println("Reprovou cadeiras no semestre anterior: s/n?");
	dados = new Scanner(System.in);
		estudante1.reprovacao = dados.next();
*/
		
	System.out.println("A quantos semestres o(a) estudante est� na instituicao?");	
	dados = new Scanner(System.in);
		estudante1.semestre = dados.nextInt();

	System.out.println("Concorrer a monitoria de qual disciplina? Digite o numero da opcao\n" +
	"1- Ci�ncia dos Materiais (2vagas)\n" + "2- F�SICA I (2vagas)\n" +
	"3- Qu�mica II (2vaga)\n" + "4- Calculo II (2vaga)\n" +
	"5- Eletromagnetismo (3vaga)\n" + "6- Equa��es Diferenciais I (3vaga)\n" +
	"7- Calculo Vetorial (2vaga)\n" + "8- Engenharia do Meio Ambiente (2vaga)\n" +
	"9- Circuitos El�tricos I (4vaga)\n" + "10- Laborat�rio DE Circuitos El�tricos I (1vaga)\n" +
	"11- Laborat�rio de Ci�ncia dos Materiais (2vaga)\n" );
	dados = new Scanner(System.in);
		estudante1.n_disciplina = dados.nextInt();
		estudante1.Disciplina();
	
	System.out.println("IDE do(a) estudante:");	
	dados = new Scanner(System.in);
		estudante1.ide = dados.nextFloat();
	
	System.out.println("Nota do(a) estudante na diciplina escolhida:");	
	dados = new Scanner(System.in);
		estudante1.nota_da_disciplina = dados.nextFloat();
	
	System.out.println("Qual o status do(a) estudante?\n digite (true) para ativo, ou (false) para inativo");	
	dados = new Scanner(System.in);
		estudante1.status = dados.nextBoolean();
	
	estudante1.Info();
	System.out.println("\n");
	
	
	//Utilizar o Simulador De sele��o
	SimuladorDeSelecao selec = new SimuladorDeSelecao();
	selec.selecao1(estudante1);//primeira etapa de sele��o
	selec.concorrentes();//simular concorrentes
	selec.selecao2(estudante1);//segunda etapa de sele��o
	}
}
