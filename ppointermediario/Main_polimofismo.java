 /* POlimofirmos e metodos contrutores */

 
 package ppointermediario;


 public class Main_polimofismo {
    public static void main(String[] args) {
        

        Donajacira jacira = new Donajacira("Mãe de evandro e fioti");
        System.out.println("Meu nome é jacire e " + jacira.nome);


        // criando um objeto dessa mesma classe, e aqui a gente ja passa o valor, como passamos o false no argumento test
        



        Donajacira flora = new Donajacira(false);
        System.out.println(flora.vivoOUNao);

        Donajacira evandro = new Donajacira("evandro", 38, true, 2000);
        System.out.printf(" Meu nome é " + evandro.idade);


        Donajacira leandro = new Donajacira("leandro", 34, true, 0);
        System.out.println("Estou  " + leandro.vivoOUNao);

    }



    
}
