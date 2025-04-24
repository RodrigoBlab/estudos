

/* Metodos contutores, temos dois tipos de metodos, o all args contructor */


package ppointermediario;

public   class Donajacira {
 String nome;
 int idade; 
 boolean vivoOUNao;
 double saldobancario;

    // este metodo construtor  vazio 
    public Donajacira(){

    }

// metodo construtor com argumentos sendo passados, observa que dentro do parenteses a gente cria como se fosse uma nova variavel,eu coloquei n1, pra ficar mais claro
// nornalmente é com o mesmo nome do atributo 

public Donajacira (String n1){
     this.nome=n1; 
     // o this, serve para o java setar o atributo que a gente ta atribuindo ao argumento, variavel 
        

    }
    // exemplos com outros nomes de referencia 
    public Donajacira (int id){
        this.idade=id;
    }

    public Donajacira (boolean test){
        this.vivoOUNao=test;
    }
    
    
    
    // all args consturctor 
    // esse construtor esta passando mais de um argumento com os mesmo nomes dos atributos 
    
    public Donajacira( String nome, int idade, boolean vivoOUNao, double saldobancario){
        this.nome=nome;
        this.idade=idade;
        this.vivoOUNao= vivoOUNao;
        this.saldobancario=saldobancario;

    }
    

    



}


