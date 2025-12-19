public class Formulario {

    enum Genero {
        MASCULINO,
        FEMININO,
        OUTRO;

        private char valor;

        Genero() {
            this.valor = this.name().charAt(0);  // Assign first letter as value
        }

        public char getValor() {
            return valor;
        }

    }

    private String nome;
    private Genero genero;

}
