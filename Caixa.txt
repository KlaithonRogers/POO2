import java.util.regex.Pattern;
public class Caixa {
    
    private String codigo;
    private String logradouro;
    private String numRua;
    private String cidade;
    private String estado;
    private String cMensagem;
    public boolean lResp;
    
    Caixa(String codigo, String logradouro, String numRua, String cidade, String estado) {
        this.codigo = codigo;
        this.logradouro = logradouro;
        this.numRua = numRua;
        this.cidade = cidade;
        this.estado = estado;
    }   
    
    
    public void setCodigo(String codigo){
        this.codigo = codigo; 
    }
    
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro; 
    }
    
    public void setNumRua(String numRua){
        this.numRua = numRua; 
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade; 
    }
    
    public void setEstado(String estado){
        this.estado = estado; 
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    
    public String getLogradouro(){
        return this.logradouro;
    }
    
    public String getNumRua(){
        return this.numRua;
    }
    
    public String getCidade(){
        return this.cidade;
    }
    
    public String getEstado(){
        return this.estado;
    }
    
    public String getPainel(){
        return (this.cMensagem = ("Código: " + this.codigo+ "\n" + "Logradouro: " + this.logradouro + "\n" + "Nº Rua: " + this.numRua + "\n" + "Cidade: " + this.cidade + "\n" + "Estado: " + this.estado));
    }
     
    public boolean validaCod(String cod){
        if(this.codigo.length() == 5)
           this.lResp = Pattern.matches("^[aA-zZ]{2}\\d{3}$", this.codigo);   
        else
           this.lResp = false;
        return lResp;
    }
    
    
    
}
