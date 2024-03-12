package ifsp.edu.br.deuquadra.company.model;

public class CompanyModel {
    private String nome;
    private String rua;
    private String bairro;
    private String numero;

    private long idEmpresa;
    private long latitude;
    private long longitude;
    private long cidadeIdCidade;
    private long usuarioLocadorIdUsuarioLocador;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public long getIdEmpresa() {
        return idEmpresa;
    }
    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public long getLatitude() {
        return latitude;
    }
    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }
    public long getLongitude() {
        return longitude;
    }
    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }
    public long getCidadeIdCidade() {
        return cidadeIdCidade;
    }
    public void setCidadeIdCidade(long cidadeIdCidade) {
        this.cidadeIdCidade = cidadeIdCidade;
    }
    public long getUsuarioLocadorIdUsuarioLocador() {
        return usuarioLocadorIdUsuarioLocador;
    }
    public void setUsuarioLocadorIdUsuarioLocador(long usuarioLocadorIdUsuarioLocador) {
        this.usuarioLocadorIdUsuarioLocador = usuarioLocadorIdUsuarioLocador;
    }


    
}
