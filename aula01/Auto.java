public abstract class Auto {
    private String marca;
    private String ncarro;
    private int ano;

    public Auto (String marca, String ncarro, int ano) {
        this.marca = marca;
        this.ncarro = ncarro;
        this.ano = ano;
    }


    //Getters & setters 
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getNcarro(){
        return ncarro;
    }
    
    public void setNcarro(String ncarro){
        this.ncarro = ncarro;
    }
    public int getAno(){
        return ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
}
