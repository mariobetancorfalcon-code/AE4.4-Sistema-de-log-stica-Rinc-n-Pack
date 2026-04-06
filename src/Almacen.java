import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

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
    public void enviarACamion(int fila, int col){
        Paquete p = muelle[fila][col];
        if (p != null){
            muelle[fila][col] = null;
            colaSalida.add(p);

            String destino = p.getDestino();
            estadisticas.put(destino, estadisticas.getOrDefault(destino, 0)+1);
            System.out.println("Paquete" + p.getCodigo() + " Enviado a la cola de salida para el camion");
        }
        else{
            System.out.println("Error no hay ningun paquete en la posicion dicha");
        }
    }

    public void mantenimientoSeguridad(double pesoMaximo){
        Iterator<Paquete> it = colaSalida.iterator();
        while (it.hasNext()) {
            Paquete p = it.next();
            // Elimina los paquetes que excedan el peso
            if (p.getPeso() > pesoMaximo) {
                System.out.println(" Paquete " + p.getCodigo() + " (Peso: " + p.getPeso() + "kg) retirado por exceso de peso.");
                it.remove();
            }
        }
    }
}
