public class Professor extends Pessoa{
    private double salario;

    public Professor() {}

    public Professor(double salario) {
        this.salario = salario;
    }

    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public void cadastrarProfessor(String n, int idP, double sal){
        setNome(n);
        setIdade(idP);
        setSalario(sal);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
