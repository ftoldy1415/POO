package Teste;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TurmaAlunos {
    private Map<String,Aluno> turma;


    //aliniea 2

    public void addAluno (Aluno a){
        this.turma.put(a.getNumero(),a.clone());
    }

    //alinea 3
    public Aluno getAluno (String codAluno){

        Aluno result = this.turma.get(codAluno).clone();
        return result;
    }

    //alinea 4
    public void removeAluno (String codAluno){
        this.turma.values().remove(codAluno);
    }

    //alinea 5
    public Set<String> todosOsCodigos(){
        Set<String> result = this.turma.keySet();
        return result;
    }

    //alinea 6
    public int qtsAlunos(){
        return this.turma.size();
    }

    //alinea 7
    public Collection<Aluno> alunosOrdemAlfabetica(){
        AlunoAlfabetica comp = new AlunoAlfabetica();
        return this.turma.values().stream().sorted(comp).collect(Collectors.toList());
    }

    //alinea 8
    public Set<Aluno> alunosOrdemDescrescenteNumero(){

    }
    //CONSTRUCTORES

    public TurmaAlunos (Map<String,Aluno> turma){
        Map<String, Aluno> map = turma.values().stream().collect(Collectors.toMap(Aluno::getNumero, Aluno::clone));
        this.turma = map;
    }

    public TurmaAlunos (TurmaAlunos ta){
        this.turma= ta.turma.values().stream().collect(Collectors.toMap(l->l.getNumero(), l->l.clone()));
    }


    //GETTER

    public Map<String,Aluno> getTurma(){
        return this.turma.values().stream().collect(Collectors.toMap(t->t.getNumero(), t->t.clone()));
    }

    //SETTER

    public void setTurma(Map<String, Aluno> turma) {
        this.turma = turma;
    }

    //CLONE

    public TurmaAlunos clone (TurmaAlunos ta){
        return new TurmaAlunos(ta);
    }




}


