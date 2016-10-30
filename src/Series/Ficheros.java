package Series;

import java.io.*;
import java.util.ArrayList;

public class Ficheros {
    private FileInputStream fileI;
    private ObjectInputStream input;
    private FileOutputStream fileO;
    private ObjectOutputStream output;

     /**
     * Implementa el método de abrir fichero para leer
     * @param fichero nombre del fichero a abrir
     */
    public void abrirLeer(String fichero)throws IOException
    {
        fileI = new FileInputStream (fichero);
        input = new ObjectInputStream (fileI);
    }

    /**
     * Implementa el método de abrir fichero para escribir
     * @param fichero nombre del fichero a abrir
     */
    public void abrirEscribir(String fichero)throws IOException
    {
        fileO = new FileOutputStream (fichero);
        output = new ObjectOutputStream (fileO);
    }

    /**
     * Implementa el método de leer un ArrayList de un fichero
     * @return ArrayList array
     */
    public ArrayList leer() throws IOException, ClassNotFoundException
    {
        ArrayList frases=null;
        if (input!=null) {
                frases=(ArrayList) input.readObject();
        }
       return frases;
    }

    /**
     * Implementa el método de escribir en el fichero un array de frases cifradas
     * @param frases array
     */
    public void escribir (ArrayList frases) throws IOException
    {
        if (output!=null)
            output.writeObject(frases);
    }

    /**
     * Implementa el método para cerrar fichero independientemente de para que lo
     * hayamos abierto
     */
    public void cerrar() throws IOException
    {
        if(output != null){
            output.close();
        }
        else if(input != null){
            input.close();
        }
    }
}
