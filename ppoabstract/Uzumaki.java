package ppoabstract;

public class Uzumaki extends Ninjas{


    public void nomedoNinja(){
        System.out.println(" meu nome é " + nome);
    }
    
   

    // overide subscrever,  é usar o metodo que é obrigatorio ser implementado, mas implementamos como quisermmos
    // so tem que ser implementado


   @Override
   public void poder() {
    System.out.println(" meu nome é "+ nome+" e atuvando o modo estrategia ninja");
   }

   @Override
   public void estrategiNinja() {
    System.out.println(" meu nome é "+ nome+" e atuvando o modo estrategia ninja");
   }


   @Override
   public void tacarKunai() {
    System.out.println(" meu nome é"+ nome+ " e ativando o modo tacar kunai");
    
   }
     

  
}