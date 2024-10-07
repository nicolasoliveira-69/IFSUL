import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int continuar = 1;
        do {
            System.out.println("Digite o número da forma geométrica que deseja calcular a área e o perímetro: ");
            System.out.println("1 - Círculo");
            System.out.println("2 - Quadrado");
            int escolha = teclado.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Digite o raio do circulo: ");
                    double raio = teclado.nextDouble();
                    Circulo circulo = new Circulo(raio);
                    
                    
                    System.out.println("Área: " + circulo.CalcularArea());
                    System.out.println("Circunferência: " + circulo.CalcularPerimetro());
                    break;
                case 2:
                    System.out.println("Digite o lado do quadrado: ");
                    double lado = teclado.nextDouble();
                    Quadrado quadrado = new Quadrado(lado);
                    
                    
                    System.out.println("Área do quadrado: " + quadrado.CalcularArea());
                    System.out.println("Perímetro do quadrado: " + quadrado.CalcularPerimetro());
                    break;
            }
            System.out.println("Deseja calcular mais alguma área e perímetro? (1 - Sim / 2 - Não)");
            continuar = teclado.nextInt();
        } while (continuar == 1);
        System.out.println("Programa encerrado.");
        teclado.close();
    }
   
}

abstract class FiguraGeometrica {
    public abstract double CalcularArea();
    public abstract double CalcularPerimetro();
}

class Quadrado extends FiguraGeometrica {
    private double lado;
    

    public Quadrado(double lado) {
       this.lado = lado; 
    }

    @Override
    public double CalcularArea() {
      return lado * lado;
    }

    @Override
    public double CalcularPerimetro() {
      return lado * 4;
    }
}

class Circulo extends FiguraGeometrica {
    private double raio;
   
    public Circulo(double raio) {
    this.raio = raio;
    }

    @Override
    public double CalcularArea() {
        return 3.14 * (raio * raio);
    }

    @Override
    public double CalcularPerimetro() {
        return 2 * 3.14 * raio;
    }
}
