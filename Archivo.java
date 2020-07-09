import java.io.*;
import java.util.*;

class Archivo
{
    public static ArrayList<String> leerTodo(String nombreArchivo)
    {
        ArrayList<String> contenido = new ArrayList<String>();
        String cadena = new String();

        try(FileInputStream fis = new FileInputStream(nombreArchivo+".txt");
            DataInputStream din = new DataInputStream(fis);
            BufferedReader br = new BufferedReader(new InputStreamReader(din));)
        {
            cadena = br.readLine();

            while(cadena != null)
            {
                contenido.add(cadena);
                cadena = br.readLine();
            }
        }

        catch(Exception e)
        {    
             e.printStackTrace();
        }

        return contenido;
    }

    public static void guardarTodo(String informacion, String nombreArchivo)
    {
        try 
        {
            FileOutputStream fos = new FileOutputStream(nombreArchivo+ ".txt");
            BufferedWriter out = new BufferedWriter (new OutputStreamWriter(fos));
            out.write(informacion);
            out.close();
        } 

        catch (Exception e) 
        {
            System.out.println("Error al crear el Archivo");
        }
    }
}