package Teste;

public class Lugar {

        /** Matricula do veiculo estacionado */
        private String matricula ;
        /** Nome do proprietario */
        private String nome ;
        /** Tempo atribuido ao lugar , em minutos */
        private int minutos ;
        /** Indica se lugar é permanente , ou de aluguer */
        private boolean permanente ;

        public Lugar(String matricula, String nome, int minutos, boolean permanente) {
            this.matricula = matricula;
            this.nome = nome;
            this.minutos = minutos;
            this.permanente = permanente;
        }

        public Lugar(Lugar l){
            this.matricula = l.matricula;
            this.nome = l.nome;
            this.minutos = l.minutos;
            this.permanente = l.permanente;
        }

        //CLONE

        public Lugar clone(){
            return new Lugar(this);
        }

        //GETTERS

        public String getMatricula() {
        return matricula;
        }

        public String getNome() {
        return nome;
        }

        public int getMinutos() {
        return minutos;
        }

        public boolean isPermanente() {
        return permanente;
    }

        //SETTERS

        public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

        public void setNome(String nome) {
        this.nome = nome;
    }

        public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

        public void setPermanente(boolean permanente) {
        this.permanente = permanente;
    }
}

