package br.edu.ifce.atvPOO.staticEfinal;

public class Area { 
	
    public static double calcQuadrado(double lado) {
        return lado * lado;
    }

   
    public static double calcRetangulo(double largura, double altura) {
        return largura * altura;
    }

  
    public static double calcTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

  
    public static double calcCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

}
