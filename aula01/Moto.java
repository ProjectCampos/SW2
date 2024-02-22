public class Moto extends Auto implements ICompra{

    public Moto(String marca, String ncarro, int ano) {
        super(marca, ncarro, ano);
    }

    @Override
    public double valor() {
        double preco = 90.000;
        return preco;
    }

    @Override
    public String compra() {
        this.setMarca("Ninja");
        String modelo = "Ninja 650";
        this.setAno(2023);
        double total = valor();

        return null;
    }
    
}
