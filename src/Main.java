public class Main {
    public static void main(String[] args){
        /*DatosPersonales obj = new DatosPersonales("Gabriela","Palacios Torres");

        System.out.println(obj.getNombre());*/

        Coleccion objc = new Coleccion();
        objc.add("Javier");
        objc.add("Pedrito");
        objc.add("Joshua");
        objc.add("Emmanuel");
        objc.add("Brenda");

        objc.show();
    }
}
