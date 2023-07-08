import java.util.Scanner;
public class Caneta {
    String cor;
    String modelo;
    float ponta;
    boolean tampada;

    void status() {
        System.out.println("uma caneta : " + this.modelo + this.cor);
        System.out.println(this.ponta);
        System.out.println("ela esta tampada? " + this.tampada);
    }
    
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro! Não dá pra rabiscar.");
        }
        else {
            System.out.println("rabiscado");
        }

    }

    void tampar() {
        this.tampada = true;

    }

    void destampar() {
        this.tampada = false;

    }



     void caneta_costumizavel() {
         Scanner t = new Scanner(System.in);
        System.out.println("Digite o modelo da caneta : ");
        String modelo = t.nextLine();
        System.out.println(modelo);
        System.out.println("Digite a cor de sua tinta: ");
        String cor_tinta = t.nextLine();
        System.out.println(cor_tinta);
        System.out.println("digite a espessura da ponta: ");
        Float espessura_ponta = t.nextFloat();
        System.out.println(espessura_ponta);
        System.out.println("ela está tampada? true/false: ");
        Boolean tampada_destampada = t.nextBoolean();
        System.out.println(tampada_destampada);

        t.close();
    }
 
}
