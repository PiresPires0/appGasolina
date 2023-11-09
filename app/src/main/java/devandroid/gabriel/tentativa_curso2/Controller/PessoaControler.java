package devandroid.gabriel.tentativa_curso2.Controller;

import android.content.SharedPreferences;



import devandroid.gabriel.tentativa_curso2.Model.Pessoa;
import devandroid.gabriel.tentativa_curso2.View.MainActivity;


    public class PessoaControler {

    SharedPreferences preferences;
    SharedPreferences.Editor Lista_Modificadora;



    public PessoaControler(MainActivity mainActivity) {
        preferences = mainActivity.getSharedPreferences("Lista_Modoficadora", 0);
        Lista_Modificadora = preferences.edit();
    }



    public  void salvar(Pessoa pessoa) {
        Lista_Modificadora.putString("Nome",pessoa.getPrimeiroNome());
        Lista_Modificadora.putString("Sobrenome",pessoa.getSegundoNome());
        Lista_Modificadora.putString("Tipo_de_Curso",pessoa.getCursoDesejado());
        Lista_Modificadora.putString("Telefone",pessoa.getTelefoneContato());
        Lista_Modificadora.apply();



    }
    public Pessoa buscar(Pessoa pessoa){
          pessoa.setPrimeiroNome(preferences.getString("Nome",""));
          pessoa.setSegundoNome(preferences.getString("Sobrenome",""));
          pessoa.setTelefoneContato(preferences.getString("Tipo_de_Curso",""));
          pessoa.setCursoDesejado(preferences.getString("Telefone",""));

          return pessoa;
    }

    public void limpar(){
           Lista_Modificadora.clear();
           Lista_Modificadora.apply();
    };
    }


