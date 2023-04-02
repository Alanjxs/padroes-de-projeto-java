# Padrões de Projeto em JAVA

## Singleton

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
