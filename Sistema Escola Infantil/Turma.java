package Sistem.Escolar;
import java.util.ArrayList;
import java.util.List;
public class Turma {
    private List<String> materiais = new ArrayList<>();
    private List<Professores> professores = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();
    private String nome_da_turma, horario, tipo;
    private int codigo_da_turma, sala;

    public String getNome_da_turma() {
        return nome_da_turma;
    }

    public void setNome_da_turma(String nome_da_turma) {
        this.nome_da_turma = nome_da_turma;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigo_da_turma() {
        return codigo_da_turma;
    }

    public void setCodigo_da_turma(int codigo_da_turma) {
        this.codigo_da_turma = codigo_da_turma;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public void getProfessores() {
        for ( Professores i:professores){
            System.out.println(i.getNome());
            System.out.println(i.getGrau_instrucao());
            System.out.println(i.getMatricula());
            System.out.println();
        }

    }

    public void setProfessores(Professores professor) {
        this.professores.add(professor);
    }

    public void getAluno() {
        for ( Aluno i:alunos){
            System.out.println(i.getNome());
            System.out.println(i.getData_nascimento());
            System.out.println(i.getMatricula());
            System.out.println(i.getNome_da_mae());
            System.out.println();
        }

    }

    public void setAlunos(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void setProfessores(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void setMateriais(String material){
        this.materiais.add(material);
    }

    public void getMateriais() {
        for(String i:materiais) {
            System.out.println(i);
        }
    }

    public boolean removeprofessor(Professores professor){
        if (professores.contains(professor)){
            professores.remove(professor);
            return true;
        }
        return false;
    }

    public boolean removealuno(Aluno aluno){
        if (alunos.contains(aluno)){
            alunos.remove(aluno);
            return true;
        }
        return false;
    }

    public boolean removematerial(String material){
        if (materiais.contains(material)){
            materiais.remove(material);
            return true;
        }
        return false;
    }
}
