public class CarroTestar {
   
    public static void main(String[] args){

         Carro c1 = new Carro();
         c1.nome = "Benz";
         c1.marca = "Mercedes";
         c1.ano = 1990;
         c1.vel = 60;

         //chamando os metodos criados
         c1.acelerar(10);
         System.out.println("A velocidade atual do Carro é de: "+c1.vel);
         c1.freiar(15);
         System.out.println("A nova velocide é: "+ c1.vel+" Km/h");
    }

    
}
