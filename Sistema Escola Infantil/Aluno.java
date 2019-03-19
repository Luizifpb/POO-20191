package Sistem.Escolar;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String data_nascimento;
    private String nome_da_mae;
    private int matricula;
    private List<Double> notas= new ArrayList<>();

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public void setNome_da_mae(String nome_da_mae) {
        this.nome_da_mae = nome_da_mae;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public String getNome_da_mae() {
        return nome_da_mae;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setNotas(double nota){
        this.notas.add(nota);
    }

    public void getNotas(){
        for(double i:notas) {
            System.out.println(i);
        }
    }

    public void removenota(double nota_a_remover){
        notas.remove(nota_a_remover);
    }
}
