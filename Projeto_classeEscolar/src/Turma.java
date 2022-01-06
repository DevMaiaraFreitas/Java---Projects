import java.util.ArrayList;

public class Turma {
   private String nomeTurma;
   private Professor professor;
   private Aluno aluno;
   private ArrayList<Aluno> listaAlunos = new ArrayList<>();

   public Turma(){}

   public Turma(String nome) {
      this.nomeTurma = nome;
   }

   public void adicionarAluno(Aluno a){
      listaAlunos.add(new Aluno(a.getNome(),a.getIdade(),a.getNota()));
      System.out.println("Aluno(a) " + a.getNome() + " adicionado.");
   }

   public void adicionarProfessor(Professor p){
      p = new Professor(p.getNome(),p.getIdade(),p.getSalario());
      System.out.println("Professor(a) " + p.getNome()+ " adicionado.");
   }

   public  void visualizarTurma(ArrayList a, Professor p){
      System.out.println("________________");
      System.out.println("Lista da Turma: "+nomeTurma);
      for (int cont = 0; cont < listaAlunos.size(); cont++) {
         System.out.println("Aluno(a): " + listaAlunos.get(cont).getNome() + " nota:" + listaAlunos.get(cont).getNota()+ "|| Professor(a):"+ p.getNome());
      }
      System.out.println("________________");
   }

   public String getNomeTurma() {
      return nomeTurma;
   }

   public void setNomeTurma(String nomeTurma) {
      this.nomeTurma = nomeTurma;
   }

   public Professor getProfessor() {
      return professor;
   }

   public void setProfessor(Professor professor) {
      this.professor = professor;
   }

   public Aluno getAluno() {
      return aluno;
   }

   public void setAluno(Aluno aluno) {
      this.aluno = aluno;
   }

   public ArrayList<Aluno> getListaAlunos() {
      return listaAlunos;
   }

   public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
      this.listaAlunos = listaAlunos;
   }
}
