package ppoabstract;

/* em uma classe abstratadas e interfaces elas nao podem ser instanciadas
 * criar um objeto apartir dela, tudo que for criado apartir dessa classe
 * soa chamadas de sub classes, e isso obriga a gente a criar objetos 
 * apartir das subclasses 
 * na classe abstratada eu to vendo que nao dar pra fazer quase nada com ela aqui 
    diferença entre abstrata e interface é toda vez que a gente crioa uma interface os metodos obrigatoriamente
    são abstratos, e em uma interfface nao podemos atribuit depois os valores
    na classe abstratas podemos atribuir os valores depois , 
    Misturamos conceitos, polimofirmos com herença com abstração(interfaces e classes abstratas)
    Todos as classes abstratdos servem pra pradonização, então é por isso que quando eu tiver um metodo, todas as outras classes
    tem que ter, e ai essas subclasses elas resolvem o que vao fazer com esse metodo 
      .*/ 

public abstract class Ninjas implements EstrategiadeBatalha{ 
 
    String nome;
    int idade;
    String aldeia;
    int missoes;
    double saldobancario;
    double altura;

        public Ninjas(){

        }
         
        public Ninjas (String nome, int idade,String aldeia){
            this.nome=nome;
            this.idade=idade;
            this.aldeia=aldeia;
        }





     // metodos concretos, eles sao herdados pelas subclasses, mmas a gente implementa e usa
     // se necessario, todos os ninjas vao ter

         
    public void Testando(){
            System.out.println(" nao to entendendo qual a diferença de voce "+aldeia+ " pra habilidade");
        }

         
    public void habilidadeEspecial(){
        System.out.println(" meu nome é"+ nome+ " e esse é o ataque especial");
    }
        
    // metodos abstratos nao podem ter corpo, ele tem que ser 
    // implementado em outras subclasses, é obrigatorio!
    // 


    public abstract void nomedoNinja();


    public abstract void tacarKunai();

    public abstract void estrategiNinja();

    public abstract void poder();



    /* sobescrevendo o metodo da interface ela serve como um contrato, 
     * que vc pode abrir e pegar o que voce quiser, mas ai voce precisa usar o polomofismo 
     * override, assim que fiz um metodo na minha interface, deu erro nas outras subclasses
    */
    
    @Override
    public void estrategiaDeBatalhaninja(){
        System.out.println(" meu nome é"+ nome+ " e essa é a minha estrategia de batalha");
   
    }
     @Override
     public void estrategiaDecombate(){
        System.out.println( " meu nome é" + nome+ " ativando meu modo estrategia combate");
     }


}


