package devandroid.gabriel.tentativa_curso2.View;

import androidx.appcompat.app.AppCompatActivity;



import android.os.Bundle;


import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


import java.util.ArrayList;

import devandroid.gabriel.tentativa_curso2.Controller.Curso_Controller;
import devandroid.gabriel.tentativa_curso2.Controller.PessoaControler;
import devandroid.gabriel.tentativa_curso2.Model.Pessoa;
import devandroid.gabriel.tentativa_curso2.R;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa;

    Curso_Controller cursoController;

    ArrayList<String> lista_curso;

//
    PessoaControler pessoaControler;
//

    EditText txt_Nome;
    EditText txt_sobrenome;
    EditText txt_Tipo_Curso;
    EditText txt_telefone0;

    Button button_Salvar;
    Button button_Limpar;
    Button button_Enviar;
    Spinner lista_spnner;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pessoaControler = new PessoaControler(MainActivity.this);


        pessoa = new Pessoa();  //Criaçao do objeto(Instaciando)
        pessoaControler.buscar(pessoa);

        cursoController = new Curso_Controller();
        lista_curso = cursoController.dadosSinner();


        txt_Nome = findViewById(R.id.txt_Nome);
        txt_sobrenome = findViewById(R.id.txt_sobrenome);
        txt_telefone0 = findViewById(R.id.txt_telefone0);
        txt_Tipo_Curso = findViewById(R.id.txt_Tipo_Curso);

        button_Enviar = findViewById(R.id.button_Enviar);
        button_Limpar = findViewById(R.id.button_Limpar);
        button_Salvar = findViewById(R.id.button_Salvar);
        lista_spnner =  findViewById(R.id.lista_spnner);

        txt_Nome.setText(pessoa.getPrimeiroNome());
        txt_sobrenome.setText(pessoa.getSegundoNome());
        txt_telefone0.setText(pessoa.getCursoDesejado());
        txt_Tipo_Curso.setText(pessoa.getTelefoneContato());
        pessoaControler.buscar(pessoa);

        //Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,cursoController.dadosSinner());
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        lista_spnner.setAdapter(adapter);




        button_Limpar.setOnClickListener(v -> {
            txt_Nome.setText("");
            txt_sobrenome.setText("");
            txt_telefone0.setText("");
            txt_Tipo_Curso.setText("");
            pessoaControler.limpar();
        });
        button_Enviar.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this,"Volte Sempre",Toast.LENGTH_LONG).show();
            finish();
        });
        button_Salvar.setOnClickListener(v -> {
            pessoa.setPrimeiroNome(txt_Nome.getText().toString());
            pessoa.setSegundoNome(txt_sobrenome.getText().toString());
            pessoa.setCursoDesejado(txt_Tipo_Curso.getText().toString());
            pessoa.setTelefoneContato(txt_telefone0.getText().toString());
            pessoaControler.salvar(pessoa);



            Toast.makeText(MainActivity.this,"Salvo",Toast.LENGTH_LONG).show();
        });
    }
}