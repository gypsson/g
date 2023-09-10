
public class Carro {
    String nome;
    String marca;
    int ano;
    int vel;

    //metodos
    void acelerar (int acelercao){
        vel+=acelercao;
    }
    void freiar(int reduzir){
        vel-=reduzir;
    }
    void buzinar() {
        System.out.println("Buzinou");
    }
}