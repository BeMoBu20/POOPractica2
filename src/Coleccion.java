import java.util.List;
import java.util.ArrayList;

public class Coleccion {
    List<String> listaDatos = new ArrayList<>();

    public void add(String nombre){
        listaDatos.add(nombre);
    }

    public void show(){
        for (String dato : listaDatos){
            System.out.println(dato);
        }
    }
}
