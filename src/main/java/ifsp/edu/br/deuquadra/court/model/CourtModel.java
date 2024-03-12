package ifsp.edu.br.deuquadra.court.model;

public class CourtModel {
    private long idQuadra;
    private long empresaIdEmpresa;
    private int preco;

    private String imagemUrl;
    private String nome;
    private String descricao;

    
    public long getIdQuadra() {
        return idQuadra;
    }
    public void setIdQuadra(long idQuadra) {
        this.idQuadra = idQuadra;
    }
    public long getEmpresaIdEmpresa() {
        return empresaIdEmpresa;
    }
    public void setEmpresaIdEmpresa(long empresaIdEmpresa) {
        this.empresaIdEmpresa = empresaIdEmpresa;
    }
    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }
    public String getImagemUrl() {
        return imagemUrl;
    }
    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    
}
