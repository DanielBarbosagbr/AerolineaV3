package modelo;

import java.io.*;
import java.util.*;



public class Funcionario {


// -----------------------------------------------------------------
// Atributos
// -----------------------------------------------------------------

    /**
    * Nombre del funcionario.
    */
    private String nombre;

    /**
    * Contraseña del funcionario.
    */
    private String id;



// -----------------------------------------------------------------
// Constructores
// -----------------------------------------------------------------

    /**
     * Crea un pasajero con su cédula y nombre. <br>
     * <b>post: </b> El pasajero tiene sus datos básicos cédula y nombre asignados.
     *
     * @param pNombre Nombre del funcionario pNombre != null. && pNombre != "".
     * @param pContraseña Contraseña del pasajero. pContraseña != null. && pContraseña != "".
     */
    public Funcionario(String pNombre, String pContraseña ){

        nombre = pNombre;
        id = pContraseña;

        
    }
    
    public void escribirRegistro() {
        FileWriter fw=null;
        PrintWriter pw=null;
        try{
            fw=new FileWriter("funcionarios.txt",true);
            pw=new PrintWriter(fw);
            pw.println(nombre+";"+id);
        }catch (Exception n){
            n.printStackTrace();
    }
    finally{
        try{
            if (null!=fw)
            fw.close();
            }
            catch (Exception e2){
            e2.printStackTrace();
            }
        }
    }

    /**
     *valida que los datos de nombre y contraseña sean correctos 
     *
     * @return true si son correctos los datos.
     * @return false si no son correctos los datos.
     */
    public boolean validarDatos (){

        //leer usuarios y contraseñas del archivo para almacenarlos en un hash map

        Map<String, String> funcionarios = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("funcionarios.txt"))){
            String line; 
            while((line = br.readLine())!= null){
                String[] parts = line.split(";");
                if(parts.length == 2){
                    String nombreUsuario = parts[0].trim();
                    String contraseña = parts[1].trim();
                    funcionarios.put(nombreUsuario, contraseña);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        if(funcionarios.containsKey(nombre) && funcionarios.get(nombre).equals(id)){
            return true;
        }else{
            return false;
        }
    }



}