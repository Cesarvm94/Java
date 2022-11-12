public class Main {
    public static void main(String[] args) {
        int numeroWhile=0,numeroIf = 0;

        if (numeroIf > 0){
            System.out.println("Este numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println("Este numero es negativo");
        } else {
            System.out.println("Este numero es cero");
        }

        while (numeroWhile < 3){
            System.out.println("NumeroWhile es igual a: "+numeroWhile);
            numeroWhile++;
            break;
        }

        for(int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println("NumeroFor es igual a: "+numeroFor);
            numeroWhile++;
        }
        String estacion= "Invierno";
        switch (estacion){
            case "Verano":
                System.out.println("Estamos en verano");
            case "Otoño":
                System.out.println("Estamos en otoño");
            case "Primavera":
                System.out.println("Estamos en primavera");
            case "Invierno":
                System.out.println("Estamos en invierno");
            default:
                System.out.println("Estación no válida");
        }
    }
}