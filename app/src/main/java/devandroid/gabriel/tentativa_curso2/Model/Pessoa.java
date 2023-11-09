package devandroid.gabriel.tentativa_curso2.Model;



public class Pessoa {
    //Criando os atributos
        private String primeiroNome;
        private String segundoNome;
        private String cursoDesejado;
        private String telefoneContato;

    //CONSTRUCTOR

        public String getPrimeiroNome(){
            return primeiroNome;
        }

        public void setPrimeiroNome(String primeirroNome){
            this.primeiroNome = primeirroNome;}

         public String getSegundoNome(){return segundoNome;}

        public void setSegundoNome(String segundoNome){this.segundoNome = segundoNome;}

        public String getCursoDesejado(){return cursoDesejado;}

        public void setCursoDesejado(String cursoDesejado){this.cursoDesejado= cursoDesejado;}

        public String getTelefoneContato(){return telefoneContato;}

        public void setTelefoneContato(String telefoneContato){this.telefoneContato = telefoneContato;}



}