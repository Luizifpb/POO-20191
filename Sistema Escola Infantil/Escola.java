package Sistem.Escolar;
import java.util.ArrayList;
import java.util.List;

public class Escola {
    private List<Turma> turmas_da_escola= new ArrayList<>();
    private List<Professores> professores_da_escola = new ArrayList<>();
    private List<Aluno> alunos_da_escola = new ArrayList<>();

    public void setAlunos_da_escola(Aluno alunos_da_escola) {
        this.alunos_da_escola.add(alunos_da_escola);
    }

    public void setTurmas_da_escola(Turma turmas_da_escola){
        this.turmas_da_escola.add(turmas_da_escola);
    }

    public void setProfessores_da_escola(Professores professores_da_escola){
        this.professores_da_escola.add(professores_da_escola);
    }

    public void getProfessores_da_escola(){
        for(Professores i:professores_da_escola){
            System.out.println(i.getNome());
            System.out.println(i.getGrau_instrucao());
            System.out.println(i.getMatricula());
            System.out.println();
        }
    }

    public void getTurmas_da_escola(){
        for(Turma i:turmas_da_escola){
            System.out.println(i.getCodigo_da_turma());
            System.out.println(i.getNome_da_turma());
            System.out.println(i.getTipo());
            System.out.println(i.getHorario());
            System.out.println(i.getSala());
            System.out.println();
        }
    }

    public void getAlunos_da_escola(){
        for(Aluno i: alunos_da_escola){
            System.out.println(i.getNome());
            System.out.println(i.getMatricula());
            System.out.println(i.getData_nascimento());
            System.out.println(i.getNome_da_mae());
        }
    }
}
