package modelo;

import modelo.Asiento.Clase;
import modelo.Asiento.Ubicacion;

public class Nave {
    //__________________________________________
    //Constantes
    //---------------------------------------

    public final static int asientos_primera_clase = 6;

    public final static int asientos_clase_eco = 8;

    //--------------------------------------
    //Atributos
    //---------------------------------------

    /*
     * asientos primera clase
     */
    private Asiento [] asientosPrimeraClase = new Asiento[asientos_primera_clase];

    /*
     * asientos clase economica
     */
    
    private Asiento [] asientosClaseEco = new Asiento[asientos_clase_eco];

    

    public Nave(){

        
        
        //Variable que controla el for 
        int i; 

        //Añade los asientos de p clase al arreglo y les da ubicacion 

        for (i = 0; i < asientos_primera_clase; i++){
            if (i % 2 == 0){
                asientosPrimeraClase[i] = new Asiento(i+1, Clase.PCLASE, Ubicacion.DERECHA);
            }else if (i % 2 == 1 ){
                asientosPrimeraClase[i] = new Asiento(i+1, Clase.PCLASE, Ubicacion.IZQUIERDA);
            }
        }

        //Añade los asientos de clase eco al arreglo y les da ubicacion 

        for (i = 0; i < asientos_clase_eco; i++){
            if (i % 2 == 0){
                asientosClaseEco[i] = new Asiento(i+7, Clase.ECOCLASE, Ubicacion.DERECHA);
            }else if (i % 2 == 1 ){
                asientosClaseEco[i] = new Asiento(i+7, Clase.ECOCLASE, Ubicacion.IZQUIERDA);
            }
        }

    }


    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Asigna la silla al pasajero en la clase y ubicación especificados. <br>
     * <b>post: </b> Si existe una silla con la clase y la ubicación dada, el pasajero queda asignado en la primera de ellas según el orden numérico.
     *
     * @param pClase     Clase elegida por el pasajero. Clase pertenece {Clase.EJECUTIVA, Clase.ECONOMICA}.
     * @param pUbicacion Ubicación elegida por el pasajero. Si clase = Clase.ECONOMICA entonces ubicación pertenece {IZQUIERDA O DERECHA}, <br>
     *                   o si clase = Clase.EJECUTIVA entonces ubicación pertenece {VENTANA, PASILLO}.
     * @param pPasajero  Pasajero a asignar. pPasajero != null y no tiene silla en el avión.
     * @return Silla asignada al pasajero o null si no se pudo asignar una silla al pasajero en la ubicación y clase especificados.
     */
    @SuppressWarnings("null")
    public void asignarSilla(Pasajero pPasajero, int numSilla) {
        // evalua el numero del asiento y dependiendo de eso escoge en que arreglo posicion del arreglo buscarla
        if(numSilla <= 5){
            asientosPrimeraClase[numSilla-1].asignarAPasajero(pPasajero);
            

        }else {
            asientosClaseEco[numSilla-7].asignarAPasajero(pPasajero);
        }
        
    }


    /**
     * Busca un pasajero en el avión.
     *
     * @param pPasajero Pasajero a buscar. pPasajero != null.
     * @return Silla en la que se encontró el pasajero. Si no lo encuentra retorna null.
     */
    public Asiento buscarPasajero(Pasajero pPasajero) {
        // Busca el pasajero en ejecutiva
        Asiento silla = buscarPasajeroEjecutivo(pPasajero);
        // Si no estaba en ejecutiva
        if (null == silla) {
            // Busca en económica
            silla = buscarPasajeroEconomico(pPasajero);
        }

        return silla;

    }

    /**
     * Busca un pasajero en las sillas ejecutivas. <br>
     * <b>pre: </b> La lista de sillas ejecutivas está inicializada.
     *
     * @param pPasajero Pasajero a buscar. pPasajero != null.
     * @return Silla en la que se encontró el pasajero. Si no lo encuentra retorna null.
     */
    public Asiento buscarPasajeroEjecutivo(Pasajero pPasajero) {
        boolean encontrado = false;
        Asiento silla = null;
        for (int i = 0; i < asientos_primera_clase && !encontrado; i++) {
            silla = asientosPrimeraClase[i];
            if (silla.sillaAsignada() && silla.darPasajero().igualA(pPasajero)) {
                encontrado = true;
            }
        }
        if (!encontrado) {
            silla = null;
        }
        return silla;
    }

    /**
     * Busca un pasajero en las sillas económicas. <br>
     * <b>pre: </b> La lista de sillas económicas está inicializada.
     *
     * @param pPasajero Pasajero a buscar. pPasajero != null.
     * @return Silla en la que se encontró el pasajero. Si no lo encuentra retorna null.
     */
    public Asiento buscarPasajeroEconomico(Pasajero pPasajero) {
        boolean encontrado = false;
        Asiento silla = null;
        for (int i = 0; i < asientos_primera_clase && !encontrado; i++) {
            silla = asientosClaseEco[i];
            if (silla.sillaAsignada() && silla.darPasajero().igualA(pPasajero)) {
                encontrado = true;
            }
        }
        if (!encontrado) {
            silla = null;
        }
        return silla;
    }
    /**
     * Devuelve arreglo de asientos primera clase.
     * @return arreglo de asientos p class.
     */
    public Asiento[] obtenerAsientoPclass (){
        
        return asientosPrimeraClase;
    }
    /**
     * Devuelve arreglo de asientos clase economica.
     * @return arreglo de asientos clase eco.
     */
    public Asiento[] obtenerAsientosClaseEco (){
        
        return asientosClaseEco;
    }
    
    
    public boolean obtenerEstadoAsientoPC (int numSilla){

        boolean estado = asientosPrimeraClase[numSilla-1].obtenerEstado();
        
        return estado;

    }

    public boolean obternerEstadoAsiencosCE (int numSilla){
        
        //NUMERO DE SILLA - 7 PARA QUE DE EL NUMERO EN QUE SE POSICIONA DENTRO DEL ARREGLO
        boolean estado = asientosClaseEco[numSilla-7].sillaLibre();

        return estado;
    }
    /**
     * Retorna el n�mero de sillas ejecutivas ocupadas. <br>
     * <b>pre: </b> La lista de sillas ejecutivas est� inicializada.
     * @return N�mero de silla ejecutivas ocupadas.
     */
    public int contarSillasEjecutivasOcupadas( )
    {
        int contador = 0;
        for( Asiento sillaEjecutiva : asientosPrimeraClase )
        {
            if( sillaEjecutiva.sillaAsignada( ) )
            {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Retorna el n�mero de sillas econ�micas ocupadas. <br>
     * <b>pre: </b> La lista de sillas econ�micas est� inicializada.
     * @return N�mero de sillas econ�micas ocupadas.
     */
    public int contarSillasEconomicasOcupadas( )
    {
        int contador = 0;
        for( Asiento sillaEconomica : asientosClaseEco )
        {
            if( sillaEconomica.sillaAsignada( ) )
            {
                contador++;
            }
        }
        return contador;
    }
    /**
     * Calcula el porcentaje de ocupaci�n del avi�n.
     * @return Porcentaje total de ocupaci�n.
     */
    public double calcularPorcentajeOcupacion( )
    {
        double porcentaje;
        int totalSillas = asientos_clase_eco + asientos_primera_clase;
        int sillasOcupadas = contarSillasEconomicasOcupadas( ) + contarSillasEjecutivasOcupadas( );
        porcentaje = ( double )sillasOcupadas / totalSillas * 100;
        return porcentaje;
    }

    /**
     * Desasigna la silla de un pasajero. <br>
     * <b>post: </b> Si se encuentra una silla con el pasajero, la silla quedara con su pasajero igual a null.
     * @param pPasajero Pasajero a retirar. pPasajero != null.
     * @return Retorna true si encontr� el pasajero y des asign� la silla, false en caso contrario.
     */
    public boolean desasignarSilla( Pasajero pPasajero )
    {
        // Busca el pasajero en el avi�n
        Asiento silla = buscarPasajero( pPasajero );
        boolean resultado = false;
        // Si lo encuentra desasigna
        if( silla != null )
        {
            silla.desasignarSilla( );
            resultado = true;
        }
        return resultado;
    }
    

 
    

}
