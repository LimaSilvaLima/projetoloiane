public class TesteEnum2 {
        public static void main(String[] args) {
            
            DiaSemana[] dias = DiaSemana.values();

            System.out.println("\n\n\n");
            for ( int i = 0; i < dias.length; i++) {
                System.out.println(dias[i] + " - " + dias[i].getValor());
            }
            System.out.println("\n\n\n");
            
            for ( DiaSemana dia : DiaSemana.values() ) {
                System.out.println(dia + " - " + dia.getValor());
            }
        }
    
}
