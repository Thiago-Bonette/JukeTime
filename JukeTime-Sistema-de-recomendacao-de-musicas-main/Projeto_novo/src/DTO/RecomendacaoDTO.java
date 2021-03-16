package DTO;

public class RecomendacaoDTO {
     String nome_musica;
     double posto;
     double avaliacao;

    public RecomendacaoDTO(){
        
    }
    
    public RecomendacaoDTO(String nome_musica, double posto){
        this.nome_musica = nome_musica;
        this.posto = posto;
        
    }
    
    public String getNome_musica() {
        return nome_musica;
    }

    public void setNome_musica(String nome_musica) {
        this.nome_musica = nome_musica;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    /**
     * @return the posto
     */
    public double getPosto() {
        return posto;
    }

    /**
     * @param posto the posto to set
     */
    public void setPosto(double posto) {
        this.posto = posto;
    }
}
