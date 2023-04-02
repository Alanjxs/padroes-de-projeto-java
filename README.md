# Padrões de Projeto em JAVA

## Singleton
### O Singleton é um padrão de projeto criacional que permite que apenas uma única instância de uma classe seja criada e acessível globalmente em todo o sistema. Isso significa que o Singleton restringe a criação de objetos de uma determinada classe a apenas uma instância única em todo o sistema.

### O padrão Singleton é útil em situações em que precisamos ter certeza de que apenas uma instância de uma classe será usada em todo o sistema, como em um gerenciador de recursos ou configuração do sistema. O Singleton pode ser implementado de várias maneiras, mas o mais comum é o uso de uma variável estática privada na própria classe Singleton para armazenar a única instância da classe e um método público de acesso a essa instância.

    public class Singleton {

        private static Singleton instance;
    
        private Singleton() {
            // construtor privado para impedir a criação de instâncias fora da classe
        }

        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }

        // outros métodos e variáveis da classe Singleton
    }


## Strategy

### O padrão de projeto Strategy é um padrão de projeto comportamental que permite que diferentes algoritmos ou estratégias sejam selecionados em tempo de execução, dependendo do contexto em que são necessários. O padrão Strategy envolve três componentes principais: uma classe de contexto, uma interface de estratégia e várias classes de estratégia.

### A classe de contexto é a classe que contém a lógica principal do programa e que deve executar diferentes algoritmos ou estratégias, dependendo do contexto em que são necessários.

### A interface de estratégia define os métodos que as classes de estratégia devem implementar. Esses métodos podem ser diferentes algoritmos que resolvem o mesmo problema de maneiras diferentes.

### As classes de estratégia implementam a interface de estratégia e fornecem diferentes implementações dos métodos definidos pela interface. Cada classe de estratégia representa uma estratégia ou algoritmo diferente que pode ser selecionado em tempo de execução pelo objeto de contexto.

### O padrão de projeto Strategy é útil em situações em que a lógica do programa precisa ser flexível e pode mudar com frequência. Ele permite que diferentes algoritmos ou estratégias sejam adicionados ou removidos do programa facilmente, sem afetar o código existente.


## Facade

###  padrão Facade é um padrão de projeto estrutural que fornece uma interface unificada para um conjunto de interfaces em um subsistema mais amplo. Ele define uma interface de nível superior que facilita o uso do subsistema, ocultando a complexidade subjacente e fornecendo um conjunto de métodos simples e fáceis de usar.

### Em outras palavras, o padrão Facade é uma fachada que esconde a complexidade de um sistema maior, fornecendo uma interface simplificada e fácil de usar para seus clientes. Isso permite que os clientes interajam com o subsistema de uma forma mais intuitiva e fácil de entender, sem se preocupar com a complexidade subjacente.
