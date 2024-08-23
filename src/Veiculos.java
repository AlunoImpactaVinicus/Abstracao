abstract class Veiculos {
    public String cor;
    public String marca;
    public String modelo;
    public int ano;

    public Veiculos(String cor, String marca, String modelo, int ano) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exbirInformacoes() {
        System.out.println(cor + marca + modelo + ano);
    }

    public void testarVeiculo() {
        System.out.println(modelo + " está funcionado");

    }
}

