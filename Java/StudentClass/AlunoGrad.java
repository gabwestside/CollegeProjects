import java.util.Scanner;
import java.util.Random;

public class AlunoGrad extends Aluno {
    private float[] ides = new float[5];
    private int qtdDisciplinas;
    private double salarioMinimo = 1192.40;
    private boolean candidato = true;
    Scanner dados, cidade;

    public AlunoGrad() {
    }

    public AlunoGrad(String nome, int matricula, String cpf, String municipio, float rendaFamiliar, String curso,
            float ide, float cargaHoraria,
            boolean status, int escolha) {

        super(nome, curso, cpf, municipio,
                matricula, escolha, ide,
                rendaFamiliar, cargaHoraria, status);
    }

    public AlunoGrad(String nome, String curso, String cpf, String municipio,
            int matricula, int qtdDisciplinas, int escolha,
            float ide, float rendaFamiliar, float cargaHoraria,
            boolean status,
            float[] ides, boolean candidato, Scanner dados, Scanner cidade) {

        super(nome, curso, cpf, municipio,
                matricula, escolha, ide,
                rendaFamiliar, cargaHoraria, status);

        this.ides = ides;
        this.qtdDisciplinas = qtdDisciplinas;
        this.candidato = candidato;
        this.dados = dados;
        this.cidade = cidade;
    }

    public int getQtdDisciplinas() {
        return this.qtdDisciplinas;
    }

    public void setQtdDisciplinas(int qtdDisciplinas) {
        this.qtdDisciplinas = qtdDisciplinas;
    }

    public void Concorrentes() {
        if (candidato) {
            Random dados = new Random();
            AlunoGrad aluno1 = new AlunoGrad();

            aluno1.setIde(dados.nextInt(3));
            aluno1.setIde(aluno1.getIde() + 7);
            aluno1.setIde(dados.nextFloat());
            ides[0] = aluno1.getIde();

            AlunoGrad aluno2 = new AlunoGrad();

            aluno2.setIde(dados.nextInt(3));
            aluno2.setIde(aluno2.getIde() + 7);
            aluno2.setIde(dados.nextFloat());
            ides[1] = aluno2.getIde();

            AlunoGrad aluno3 = new AlunoGrad();

            aluno3.setIde(dados.nextInt(3));
            aluno3.setIde(aluno3.getIde() + 7);
            aluno3.setIde(dados.nextFloat());
            ides[2] = aluno3.getIde();

            AlunoGrad aluno4 = new AlunoGrad();

            aluno4.setIde(dados.nextInt(3));
            aluno4.setIde(aluno4.getIde() + 7);
            aluno4.setIde(dados.nextFloat());
            ides[3] = aluno4.getIde();

            AlunoGrad aluno5 = new AlunoGrad();

            aluno5.setIde(dados.nextInt(3));
            aluno5.setIde(aluno5.getIde() + 7);
            aluno5.setIde(dados.nextFloat());
            ides[4] = aluno5.getIde();
        }
    }

    @Override
    public void SelecaoIDE() {
        if (getStatus() == true) {
            for (int i = 0; i < 5; i++) {
                if (getIde() < ides[i]) {
                    System.out.println("Nao foi selecionado(a)");
                    break;
                } else {
                    System.out.println("Voc?? foi selecionado(a)");
                    break;
                }
            }
        } else {
            System.out
                    .println(
                            "Voc?? n??o foi selecionado, por n??o est?? matriculado em todas as disciplinas do semestre.");
        }
    }

    @Override
    public void AuxilioAlimentacao() {
        if (getRendaFamiliar() < salarioMinimo) {
            System.out.println("Voc?? faz est?? matriculado em quantas disciplinas?");
            dados = new Scanner(System.in);
            setQtdDisciplinas(dados.nextInt());
            if (getQtdDisciplinas() >= 4) {
                System.out.println(
                        "Voc?? foi selecionado para receber o Auxilio Alimenta????o, e seu nome ir?? ser mostrado na catraca!");
            } else {
                System.out.println(
                        "Para dar continuidade ao recebimento do Auxilio Alimenta????o, ?? necess??rio que o discente esteja matriculado no minimo em 4 cadeiras no semestre atual!");
            }
        } else {
            System.out.println("Sua renda ?? maior que a desejada para o recebimento do Auxilio Alimenta????o");
        }
    }

    @Override
    public void AuxilioTransporte() {
        System.out.println("Voc?? ?? de Reden????o/Acarape?");
        cidade = new Scanner(System.in);
        setMunicipio(cidade.next());

        if (getMunicipio().equalsIgnoreCase("n??o")) {
            System.out.println("Voc?? n??o faz parte de");
            if (getRendaFamiliar() <= 1497.00) {
                System.out.println("Quantas disciplinas est?? cursando?");
                dados = new Scanner(System.in);
                setQtdDisciplinas(dados.nextInt());
                if (getRendaFamiliar() >= 4) {
                    System.out.println("Parab??ns, voc?? foi selecionado para o Auxilio Transporte!");
                } else {
                    System.out.println("Voc?? precisa est?? matriculado em pelo menos 4 cadeiras!");
                }
            } else {
                System.out.println("Sua renda ?? maior que 1,5(um salario e meio)");
            }
        } else {
            System.out.println(
                    "S?? poder?? participar o Auxilio Transporte, alunos que residem fora do campus da UNILAB (Acarape e Reden????o)");
        }
    }
}