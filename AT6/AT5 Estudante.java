public class Estudante {
//TODOS OS ATRIBUTOS
String nome, disciplina, atividade, reprovacao;

int matricula, semestre, n_disciplina, n_vagas=1;// se estiver no primeiro semestre n�o est� apto

float ide, nota_da_disciplina;

boolean status = true, bolsista = false;// status ativo ou inativo

	
	void Disciplina() {
		switch(n_disciplina) {
			case 1:
				disciplina = "Ci�ncia dos Materiais";
				break;
			case 2:
				disciplina = "F�sica I";
				break;
			case 3:
				disciplina = "Qu�mica II";
				break;
			case 4:
				disciplina = "Calculo II";
				break;
			case 5:
				disciplina = "Eletromagnetismo";
				break;
			case 6:
				disciplina = "Equa��es Diferenciais I";
				break;
			case 7:
				disciplina = "Calculo Vetorial";
				break;
			case 8:
				disciplina = "Engenharia do Meio Ambiente";
				break;
			case 9:
				disciplina = "Circuitos El�tricos I";
				break;
			case 10:
				disciplina = "Laborat�rio DE Circuitos El�tricos I";
				break;
			case 11:
				disciplina = "Laborat�rio de Ci�ncia dos Materiais";
				break;
			default:
				System.out.println("Disciplina N�o encontrada. Tente novamente");
				break;

		}
	}
	
	//Mostrar informa��es cadastradas do candidato
	void Info() {
	System.out.println("Nome do estudante:" + nome);
	System.out.println("Matricula:"+ matricula);
	System.out.println("A"+semestre+" semestre(s) na instituicao");
	System.out.println("Indice de Desenvolvimento do Estudante (IDE):"+ide);
		if(status == true) {
			atividade = "Ativo";
		}
		else {
			atividade = "Inativo";
		}
		System.out.println("Status:" + atividade);
		System.out.println("Ultima nota na disciplina" + ": " + nota_da_disciplina);
		
	}
}
