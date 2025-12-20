public class TesteDocumento {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
       
        Pessoa pf = new Pessoa();  
        pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTeste());
        System.out.println("\n\n");
        
        Pessoa pj = new Pessoa();  
        pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
        pj.setNumeroDocumento(pj.getTipoDocumento().geraNumeroTeste());
        System.out.println("\n\n");

        System.out.println(pf.toString());
        System.out.println(pj.toString());
         System.out.println("\n\n");

        /*for (TipoDocumento doc : TipoDocumento.values()) {
             System.out.println(doc + " - " + doc.geraNumeroTeste  ());
        }*/       
       
       /*  Pessoa pessoa1 = new Pessoa(TipoDocumento.CPF, TipoDocumento.CPF.geraNumeroTeste());
        Pessoa pessoa2 = new Pessoa(TipoDocumento.CNPJ, TipoDocumento.CNPJ.geraNumeroTeste());
        System.out.println(pessoa1);
        System.out.println(pessoa2);
        */
    }

}
