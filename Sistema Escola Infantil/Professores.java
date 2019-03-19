package Sistem.Escolar;

public class Professores {
    private String grau_instrucao, nome;
    private int matricula;
    private float salario_base;

    public String getGrau_instrucao() {
        return grau_instrucao;
    }

    public void setGrau_instrucao(String grau_instrucao) {
        this.grau_instrucao = grau_instrucao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(float salario_base) {
        this.salario_base = salario_base;
    }
}
