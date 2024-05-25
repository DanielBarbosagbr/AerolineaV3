package modelo;

public class Asiento {


    //representa las clases del avion

    public enum Clase{
        PCLASE, ECOCLASE
    }

    //representa las ubicaciones de los asientos

    public enum Ubicacion{
        IZQUIERDA, DERECHA
    }

    //Atributos :

    private int numero;

    private Clase clase;

    private Ubicacion ubicacion;

    private Pasajero pasajero;

    //estado: true = disponible, false = ocupada
    private boolean estado; 

    /**
     * Crea la silla con su número identificador. <br>
     * <b>post: </b> El objeto silla tiene sus datos básicos número, clase y ubicación asignados. El pasajero no está asignado y tiene valor null.
     *
     * @param pNumero    Número de silla. pNumero > 0.
     * @param pClase     Clase de silla. pClase pertenece {EJECUTIVA,ECONOMICA}.
     * @param pUbicacion Ubicación de la silla. pUbicacion pertenece {VENTANA, CENTRAL, PASILLO}.
     */

    public Asiento(int pNumero, Clase pClase, Ubicacion pUbicacion){
        numero = pNumero;
        clase = pClase;
        ubicacion = pUbicacion;
        // Inicialmente no hay ningún pasajero en la silla
        pasajero = null;
        estado = true; 

    }

    //METODOS:


    /**
     * Asigna la silla al pasajero recibido como parámetro. <br>
     * <b>post: </b> La silla queda asignada al pasajero recibido como parámetro.
     *
     * @param pPasajero Pasajero a asignar en la silla. pPasajero !=null.
     */

    public void asignarAPasajero(Pasajero pPasajero) {
        pasajero = pPasajero;
        estado = false;
        
    }

 

    public boolean obtenerEstado(){
        return estado; 
    }

    /**
     * Desasigna la silla al pasajero. La silla queda nuevamente libre. <br>
     * <b>post: </b> La silla queda sin pasajero asignado.
     */
    public void desasignarSilla() {
        pasajero = null;
        estado = true; 
    }

    /**
     * Indica si la silla está asignada.
     *
     * @return Retorna true si la silla esta asignada, false en caso contrario.
     */
    public boolean sillaAsignada() {
        boolean asignada = true;
        if (null == pasajero) {
            asignada = false;
        }
        return asignada;
    }
    public boolean sillaLibre() {
        boolean libre = true;
        if (pasajero != null) {
            libre = false;
        }
        return libre;
    }
    /**
     * Indica si la silla está asignada al pasajero recibido como parámetro.
     *
     * @param pPasajero Pasajero a comparar con el de la silla.
     * @return Retorna true si el pasajero ocupa la silla, false si la silla está vacía o no coincide con el pasajero recibido como parámetro.
     */
    public boolean sillaAsignadaPasajero(Pasajero pPasajero) {
        boolean asignadaPasajero = false;
        if (null == pasajero) {
            asignadaPasajero = false;
        } else if (pasajero.igualA(pPasajero)) {
            asignadaPasajero = true;
        }

        return asignadaPasajero;
    }
    /**
     * Retorna el número de la silla.
     *
     * @return Número de la silla.
     */
    public int darNumero() {
        return numero;
    }

    /**
     * Retorna la clase de la silla.
     *
     * @return Clase de la silla.
     */
    public Clase darClase() {
        return clase;
    }

    /**
     * Retorna la ubicación de la silla.
     *
     * @return Ubicación de la silla.
     */
    public Ubicacion darUbicacion() {
        return ubicacion;
    }

    /**
     * Retorna el pasajero asignado a la silla.
     *
     * @return Pasajero asignado a la silla. Si no hay pasajero retorna null.
     */
    public Pasajero darPasajero() {
        return pasajero;
    }
    
    
}





