public class Corrida {
    public static void main(String[] args) {

        var carro = new Automovel[2];

        // (piloto, marca, modelo)
        carro[0] = new Automovel("Geovane", "POLO", "2012");
        carro[1] = new Automovel("Piloto2", "COOPER", "Mini");

        boolean corridaFinalizada = false;
        
        while (!corridaFinalizada) {
           Automovel.imprimirBarreira();

            for (int i = 0; i < carro.length; i++) {
                carro[i].imprimeCarro();
            }

            Automovel.imprimirBarreira();

            for (int i = 0; i < carro.length; i++) {
                carro[i].imprimeDistancia();
            }

            if (carro[0].getDistancia() >= 120 || carro[1].getDistancia() >= 120) {
                corridaFinalizada = true;
            }
            // delay para fazer o efeito de movimento
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // condições para vitoria ou empate 
        }
        if (carro[0].getDistancia() >= 120 && carro[1].getDistancia() >= 120) {
            System.out.println("EMPATE!");
        } else if (carro[0].getDistancia() >= 120) {
            System.out.println("Piloto 1 (" + carro[0].getPiloto() + ") GANHOU!");
        } else {
            System.out.println("Piloto 2 (" + carro[1].getPiloto() + ") GANHOU!");
        }
    }
}

