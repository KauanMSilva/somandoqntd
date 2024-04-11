public class Aluno {

  String nome;

  public static int quantidade;

  public static final String CURSO = "Java";

  public Aluno(String nome) {
     this.nome = nome;
     quantidade = quantidade + 1;
  }
  public static void main(String args[]) {
    Aluno aluno1 = new Aluno("Thiago");
    Aluno aluno2 = new Aluno("Henry");
    Aluno aluno3 = new Aluno("Tevez");
    Aluno aluno4 = new Aluno("Zebreu");
    System.out.println("Quantidade de alunos: " +
                        Aluno.quantidade);
  }
  

}