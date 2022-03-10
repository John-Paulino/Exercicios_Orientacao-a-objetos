package estrutura_básica_OO;

/**
 * Classe de exemplo para o exercício da aula 2 de Orientação à Objetos.
 */

public class RodarAplicacao {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeDoTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeDoTanque());
        System.out.println(carro1.totalValorTanque(7.75));

        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeDoTanque());
        System.out.println(carro2.totalValorTanque(7.75));

    }
}
