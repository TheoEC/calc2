package Serial;

public class Protocolo {
    private String tipoDado;
    private String senha;
    private String acesso;
    private String Luminosidade;
    private String LeituraComando;
    
    public void intepretaComando(){
        String aux[] = LeituraComando.split(";");
        
        if (aux.length == 2) {
            this.senha = aux[0];
            this.Luminosidade = aux[1];
        }
        
    }

    public String getTipoDado() {
        return tipoDado;
    }

    public void setTipoDado(String tipoDado) {
        this.tipoDado = tipoDado;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

    public String getLuminosidade() {
        return Luminosidade;
    }

    public void setLuminosidade(String Luminosidade) {
        this.Luminosidade = Luminosidade;
    }

    public String getLeituraComando() {
        return LeituraComando;
    }

    public void setLeituraComando(String LeituraComando) {
        this.LeituraComando = LeituraComando;
        this.intepretaComando();
    }
    
    
}
