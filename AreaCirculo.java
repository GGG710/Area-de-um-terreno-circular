//Área de um terreno círcular de raio 8 metros

public class AreaCirculo  {
    public static void main(String[] args) {
        
        int raio = 8;
        double area;
        double pi = Math.PI;
        double potencia = Math.pow(raio,2);

        area = pi * potencia;
        System.out.println("Área do terreno em m²= "+(float)area);
    }
}