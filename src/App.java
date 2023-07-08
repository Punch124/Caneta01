

public class App {
    public static void main(String[] args) throws Exception {
      Caneta c1 = new Caneta();
      c1.cor = "azul ";
      c1.modelo = "BIC ";
      c1.tampada = false;
      c1.ponta = 0.5f;
      c1.tampar();
      c1.status();
      c1.rabiscar();

      Caneta c2 = new Caneta();
      c2.cor = "Vermelha ";
      c2.modelo = "Compactor ";
      c2.tampada = true;
      c2.ponta = 1.0f;
      c2.destampar();
      c2.status();
      c2.rabiscar();


      Caneta c3 = new Caneta();
      c3.caneta_costumizavel();

    }
    
   
}
