public class Pessoa {
    private TipoDocumento tipoDocumento;
    private String numeroDocumento;

    

    @Override
    public String toString() {
        return "Pessoa [tipoDocumento=" + tipoDocumento + ",\n numeroDocumento=" + numeroDocumento + "]";
    }

    public Pessoa() {
        super();
    }

    public Pessoa(TipoDocumento tipoDocumento, String numeroDocumento) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    
}
