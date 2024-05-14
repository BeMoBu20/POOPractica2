public class Main {
    public static void main(String[] args){
        /*DatosPersonales obj = new DatosPersonales("Gabriela","Palacios Torres");

        System.out.println(obj.getNombre());*/

        Coleccion objc = new Coleccion();

        objc.add(new DatosPersonales("Javier","Mendez"));
        objc.add(new DatosPersonales("Pedrito","Perez"));
        objc.add(new DatosPersonales("Joshua","Salas"));

        /*objc.show2();*/

        objc.buscar("Pedrito");
    }
}
