package devandroid.gabriel.tentativa_curso2.Model;

public class Curso_desejado {

    private String nome_do_curso;

    public Curso_desejado(String curso_controller) {
        this.nome_do_curso = curso_controller;
    }


    public String getNome_do_curso() {
        return nome_do_curso;
    }

    public void setNome_do_curso(String nome_do_curso) {
        this.nome_do_curso = nome_do_curso;
    }
}
