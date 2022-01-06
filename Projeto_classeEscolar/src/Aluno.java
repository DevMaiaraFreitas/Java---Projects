public class Aluno extends Pessoa{
    private double nota;

    public Aluno() {}

    public Aluno(double nota) {
        this.nota = nota;
    }

    public Aluno(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    public void cadastrarAluno(String nA, int idA, double nota){
        setNome(nA);
        setIdade(idA);
        setNota(nota);
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
