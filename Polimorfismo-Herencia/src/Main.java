public class Main {
    public static void main(String[] args) {
        Cliente clientecito = new Cliente();
        Trabajador trabajadorcito = new Trabajador();
        clientecito.setNombre("César");
        clientecito.setEdad(28);
        clientecito.setTelefono(12345);
        clientecito.setCredito(98765);
        System.out.println("Mi nombre es "+clientecito.getNombre()+", tengo "+clientecito.getEdad()+" años, " +
                "mi número de telefono es: "+clientecito.getTelefono()+" y mi credito es: "+clientecito.getCredito());
        trabajadorcito.setSalario(4500000);
        System.out.println("Además, mi salario es de "+trabajadorcito.getSalario()+" pesos");
    }
}