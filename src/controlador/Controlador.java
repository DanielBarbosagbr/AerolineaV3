package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.*;
import vista.*;

public class Controlador implements ActionListener{

    private Nave modelo; 
    private InterfazAvion vista; 
    private DialogoAsignacion dAsignacion; 
    private DialogoDatosPasajero datosPasajero; 
    private Funcionario funcionario; 
    
    
    int numeroSilla = 0;
    
    
    
    
    public Controlador(Nave modelo, InterfazAvion vista)  {
        this.modelo = modelo;
        this.vista = vista;
        boolean variable = true;
        boolean seguirCodigo = false; 
        
        while(!seguirCodigo){

            String opc = vista.mostrarMenu();
            int intentos = 0;
            boolean accesoConfirmado = false;
            

            
            if(opc == "Ingresar."){
                while( !accesoConfirmado || intentos == 2){
                      
                    String nombreFuncionario = vista.preguntarNombreFuncionario();
                    String contraseñaFuncionario = vista.preguntarContraseñaFuncionario();

                    funcionario = new Funcionario(nombreFuncionario, contraseñaFuncionario);
                    boolean aprobado = funcionario.validarDatos();

                    if(aprobado == true){
                        vista.setVisible(true);
                        seguirCodigo = true;
                        accesoConfirmado = true;
                        
                    }else{
                        vista.contraseñaErrada();
                        intentos ++;
                    }
                }


            }else if (opc == "Registrar nuevo funcionario."){
                String nombreFuncionario = vista.preguntarNombreFuncionario();
                String contraseñaFuncionario = vista.preguntarContraseñaFuncionario();
            
                funcionario = new Funcionario(nombreFuncionario, contraseñaFuncionario);
                funcionario.escribirRegistro();
                vista.mostrarRegistroExitoso();
            }
        }
        

        vista.getPanelBotones().getBotonOpcion1().addActionListener( this);
        vista.getPanelBotones().getbPorcOcupacion().addActionListener(this);
        vista.getPanelBotones().getbAnular().addActionListener(this);
        vista.getPanelBotones().getbBuscarPasajero().addActionListener(this);
        vista.getPanelBotones().getbRegistro().addActionListener(this);

        while(variable == true){

            vista.getPanelBotones().getBotonOpcion1().addActionListener( this );
            vista.getPanelBotones().getBotonOpcion2().addActionListener( this );
            vista.getMapaAsientos().getAsiento1().addActionListener( this );
            vista.getMapaAsientos().getAsiento2().addActionListener(this);
            vista.getMapaAsientos().getAsiento3().addActionListener(this);
            vista.getMapaAsientos().getAsiento4().addActionListener(this);
            vista.getMapaAsientos().getAsiento5().addActionListener(this);
            vista.getMapaAsientos().getAsiento6().addActionListener(this);
            vista.getMapaAsientos().getAsiento7().addActionListener(this);
            vista.getMapaAsientos().getAsiento8().addActionListener(this);
            vista.getMapaAsientos().getAsiento9().addActionListener(this);
            vista.getMapaAsientos().getAsiento10().addActionListener(this);
            vista.getMapaAsientos().getAsiento11().addActionListener(this);
            vista.getMapaAsientos().getAsiento12().addActionListener(this);
            vista.getMapaAsientos().getAsiento13().addActionListener(this);
            vista.getMapaAsientos().getAsiento14().addActionListener(this);
        }

    }
    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Acciones de respuesta a los eventos de la interfaz.
     * @param e Evento generado por un elemento de la interfaz.
     */

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub

            if (e.getSource() == vista.getMapaAsientos().getAsiento1()){
                
                numeroSilla = 1; 
                //registra al pasajero pasando numero de silla para tacharla en el arreglo 
                registrarPasajero(numeroSilla);

                mostrarDatosP(numeroSilla);    
        
            }else if(e.getSource() == vista.getMapaAsientos().getAsiento2()){
                
                numeroSilla = 2; 
                
                registrarPasajero(numeroSilla);

                mostrarDatosP(numeroSilla);
            
            }else if(e.getSource() == vista.getMapaAsientos().getAsiento3()){
                
                numeroSilla = 3; 
                
                registrarPasajero(numeroSilla);

                mostrarDatosP(numeroSilla);

            }else if(e.getSource() == vista.getMapaAsientos().getAsiento4()){
                
                numeroSilla = 4; 
                
                registrarPasajero(numeroSilla);

                mostrarDatosP(numeroSilla);
            
            }else if(e.getSource() == vista.getMapaAsientos().getAsiento5()){
                
                numeroSilla = 5; 
                
                registrarPasajero(numeroSilla);

                mostrarDatosP(numeroSilla);
            
            }else if(e.getSource() == vista.getMapaAsientos().getAsiento6()){
                
                numeroSilla = 6; 
                
                registrarPasajero(numeroSilla);

                mostrarDatosP(numeroSilla);
                
            }else if(e.getSource() == vista.getMapaAsientos().getAsiento7()){
                
                numeroSilla = 7; 
                
                registrarPasajero(numeroSilla);

                mostrarDatosP(numeroSilla);
            
            }else if(e.getSource() == vista.getMapaAsientos().getAsiento8()){
                
                numeroSilla = 8; 
                
                registrarPasajero(numeroSilla);

                mostrarDatosP(numeroSilla);
            
            }else if(e.getSource() == vista.getMapaAsientos().getAsiento9()){
                
                numeroSilla = 9; 
                
                registrarPasajero(numeroSilla);

                mostrarDatosP(numeroSilla);

            }else if(e.getSource() == vista.getMapaAsientos().getAsiento10()){
                
                numeroSilla = 10; 
                
                registrarPasajero(numeroSilla);

                mostrarDatosP(numeroSilla);
            
            }else if(e.getSource() == vista.getMapaAsientos().getAsiento11()){
                
                numeroSilla = 11; 
                
                registrarPasajero(numeroSilla);

                mostrarDatosP(numeroSilla);
            
            }else if(e.getSource() == vista.getMapaAsientos().getAsiento12()){
                
                numeroSilla = 12; 
                
                registrarPasajero(numeroSilla);

                mostrarDatosP(numeroSilla);

            }else if(e.getSource() == vista.getMapaAsientos().getAsiento13()){
                
                numeroSilla = 13; 
                
                registrarPasajero(numeroSilla);

                mostrarDatosP(numeroSilla);
            
            }else if(e.getSource() == vista.getMapaAsientos().getAsiento14()){
                
                numeroSilla = 14; 

                registrarPasajero(numeroSilla);

                mostrarDatosP(numeroSilla);
                
            }else if(e.getSource() == vista.getPanelBotones().getbPorcOcupacion()){
                
                mostrarPorcentaje();
                
            }else if(e.getSource() == vista.getPanelBotones().getbAnular()){
                eliminarPasajero();
            }else if(e.getSource() == vista.getPanelBotones().getbBuscarPasajero()){
                buscarPasajero();
            }else if(e.getSource() == vista.getPanelBotones().getbRegistro()){
                
                numeroSilla = 0;
                boolean variable = false; 

                try{
                    numeroSilla = vista.preguntarSilla();
                }catch(Exception ex){
                    vista.mostrarInputmitmach();
                    numeroSilla = vista.preguntarSilla();
                }

                while(!variable){
                    if(numeroSilla>0 && numeroSilla<15){
                        variable = true;
                    }else{
                        vista.mostrarInputmitmach();
                        try{
                            numeroSilla = vista.preguntarSilla();
                        }catch(Exception ex){
                            vista.mostrarInputmitmach();
                            numeroSilla = vista.preguntarSilla();
                        }
                        
                    }
                     
                }

                registrarPasajero(numeroSilla);

                mostrarDatosP(numeroSilla);

            }
        }
    

    public void registrarPasajero (int numeroSilla){

        dAsignacion = new DialogoAsignacion(vista, modelo, numeroSilla ); 
        dAsignacion.setVisible(true);
        //vista.actualizar();


    }

    public void mostrarDatosP (int numeroSilla){



        if(numeroSilla <= 5){

            Asiento[] sillas = modelo.obtenerAsientoPclass();
            datosPasajero = new DialogoDatosPasajero(vista, sillas[numeroSilla-1]);
            datosPasajero.setVisible(true);
        }else {
            Asiento[] sillas = modelo.obtenerAsientosClaseEco();
            datosPasajero = new DialogoDatosPasajero(vista, sillas[numeroSilla-7]);
            datosPasajero.setVisible(true);
        }

    }
    /**
     * Muestra el porcentaje de ocupacion del avión.
     */
    public void mostrarPorcentaje (){
        
        double porcentajeOc = modelo.calcularPorcentajeOcupacion();

        vista.mostrarPorcentaje(porcentajeOc);
    }  
    /**
     * Procesa la anulaci�n del registro de un pasajero.
     */
    public void eliminarPasajero( )
    {
        // Pregunta el n�mero de c�dula

        String cedula = vista.preguntarCedula();

        if( cedula != null && !cedula.isEmpty( ) )
        {
            Pasajero pasajero = new Pasajero( cedula, "no importa" );

            if( !modelo.desasignarSilla( pasajero ) )
            {
                vista.pasajeroNulo();
            }else{
                vista.pasajeroEliminado();
            }
                
        }

        vista.actualizar(modelo);
    }
    /**
     * Procesa la b�squeda de un pasajero.
     */
    public void buscarPasajero( )
    {
        // Pregunta el n�mero de c�dula
        String cedula = vista.preguntarCedula();
        if( cedula != null && !cedula.isEmpty( ) )
        {
            Pasajero pasajero = new Pasajero( cedula, "no importa" );

            Asiento silla = modelo.buscarPasajero( pasajero );

            if( silla != null )
            {
                DialogoDatosPasajero vDatos = new DialogoDatosPasajero( vista, silla );
                vDatos.setVisible( true );
            }
            else
            {
                vista.pasajeroNulo();
            }

        }
    }
    public void prueba (){
        System.out.println("soy prueba y funciono");
    }



}