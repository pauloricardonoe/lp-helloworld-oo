import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Olá mundo!");
//        String nome = JOptionPane.showInputDialog("Digite seu nome:");
//        JOptionPane.showMessageDialog(null, "Olá " + nome);

        Carro carro1 =  new Carro("Fiat", "Uno", 2005, true, 2, "azul", 10);

        Carro carro2 =  new Carro();
        carro2.marca = "Fiat";
        carro2.modelo = "Tempra";
        carro2.ano = 1997;
        carro2.rebaixado = true;
        carro2.cor = "azul";
        carro2.preco = 2000;

        JOptionPane.showMessageDialog(null, "Carro 1 " + carro1.toString());
        JOptionPane.showMessageDialog(null, "Carro 2 " + carro2.toString());
    }
}

