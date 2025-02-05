package br.edu.ifce.atvPOO.staticEfinal;

public class Usuario {  
	
    private static int contador = 0;

    private String nome;
    private int idade;

  
    public Usuario(String nome, int idade) {
    	this.nome = nome;
    	this.idade = idade;
        contador++;
    }

    
    public static int getContador() {
        return contador;
    }

    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario("Alice", 13);
        Usuario usuario2 = new Usuario("Miguel", 10);
        Usuario usuario3 = new Usuario("Davi", 16);

        
        System.out.println("Número de instâncias: " + Usuario.getContador());
    }

}
