package es.ies.puerto.model.fichero;
import es.ies.puerto.Interface.Operations;
import es.ies.puerto.model.Empleado;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * @author habcode
 * @version 1.0.0
 */
public class FileOperations implements Operations {
    File fichero;
    String path = "C:\\Users\\Usuario\\Documents\\tarea_ciclo\\programacion\\java-ficheros";

    /**
    /**
     * Constructor de la clase
     */
    public FileOperations(){
        this.fichero = new File(path);
        if (!fichero.exists() || this.fichero.isFile()) {
            throw new IllegalArgumentException("El recurso no es de tipo fichero " + this.path + ".");
        }
    }
    
    
    @Override
    public boolean create(Empleado empleado) {
        if (empleado != null || empleado.getIdentificador() != null) {
            return false;
        }
        Set<Empleado> empleados = read(fichero);
                if (empleados.contains(empleado)) {
                    return false;
                }
                return create(empleado.toString(), fichero);
            }
           
        
            private Set<Empleado> read(File fichero2) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'read'");
            }
        
        
            /**
     * 
     * @param data
     * @param file
     * @return
     */
    private boolean create(String data, File file){ 
          try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(data);
            writer.newLine(); 
            return true;
        } catch (IOException e) {
            return false;
        }
        
    }
   

    @Override
    public boolean update(Empleado empleado) {
        if (empleado == null || empleado.getIdentificador() == null) {
            return false;
        }
        return true;
    
        
}


    @Override
    public Empleado read(String identificador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }


    @Override
    public Empleado read(Empleado empleado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }


    @Override
    public boolean delete(String identificcador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }


    @Override
    public Set<Empleado> empleadosPorPuesto(String puesto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'empleadosPorPuesto'");
    }


    @Override
    public Set<Empleado> empleadosPorEdad(String fechaInicio, String fechaFin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'empleadosPorEdad'");
    }



}
