public class Main {
    public static void main(String[] args) {
        Persona personita = new Persona();
        personita.setEdad(25);
        personita.setNombre("César");
        personita.setTelefono(12345);
        System.out.println("Mi nombre es:" + personita.getNombre()+", tengo "+ personita.getEdad()+" años y mi número de telefono es: "+ personita.getTelefono());
    }
}

