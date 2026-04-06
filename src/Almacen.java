import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Almacen {
    private Paquete[][] muelle;
    private HashSet<String> registroSeguridad;
    private ArrayList<Paquete> colaSalida;
    private HashMap<String, Integer> estadisticas;

    public Almacen(){
        muelle = new Paquete[3][3];
        registroSeguridad = new HashSet<>();
        colaSalida = new ArrayList<>();
        estadisticas = new HashMap<>();
    }

    public void recepcionarPaquete(Paquete p, int fila, int col){
        if (registroSeguridad.contains(p.getCodigo())){
            System.out.println("Error el paquete con codigo" + p.getCodigo());

        }
        else if(muelle[fila][col] == null ){
            muelle[fila][col] = p;
            registroSeguridad.add(p.getCodigo());
            System.out.println("Paquete" + p.getCodigo() + " Recepcionado en la posicion [" + fila + "][" + col + "].");
        }
        else {
            System.out.println("error en la celda [" + fila + "][" + col + "] ya está ocupada.");
        }
    }
}
