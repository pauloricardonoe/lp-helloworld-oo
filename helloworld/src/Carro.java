class Carro {
    String marca;
    String modelo;
    Integer ano;
    Boolean rebaixado;
    Integer portas;
    String cor;
    float preco;

    Carro(String marca, String modelo, Integer ano, Boolean rebaixado, Integer portas, String cor, float preco){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.rebaixado = rebaixado;
        this.portas = portas;
        this.cor = cor;
        this.preco = preco;
    }

    Carro(){

    }

    public String toString(){
        return "Carro Marca[" + this.marca + "] - Modelo[" + this.modelo + "]";
    }

    void alugar(){
        System.out.println("Carro está alugado...");
    }

    void removerAluguel(){
        System.out.println("Carro devolvido a locadora...");
    }
}
