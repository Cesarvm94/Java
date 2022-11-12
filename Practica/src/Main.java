public class Main {
    public static void main(String[] args) {
        System.out.println("El resultado de la suma es: "+ suma(1,2,3));
        Coche Micoche = new Coche();
        Micoche.SumarPuerta();
        System.out.println("El numero de puertas que tiene el coche son: "+ Micoche.puertas);
    }

    public static int suma(int a, int b,int c){ //Función que suma 3 valores
        return a+b+c;
    }
}

class Coche{
    int puertas = 4;

    public void SumarPuerta(){
        this.puertas++;//hola
    }
}
