import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Controlador {

    public static ArrayList<String[]> leerData(){

        try(BufferedReader in = new BufferedReader(new FileReader("asociations.txt"))) {

            String txt;

            ArrayList<String[]> traducciones = new ArrayList<String[]>();

            while ((txt = in.readLine()) != null) {
                //String[] tokens = txt.split(",");

                traducciones.add(txt.split(",") );


            }
            return traducciones;
        }
        catch (IOException e) {
            System.out.println("File Read Error");
            return null;
        }
    }



}
