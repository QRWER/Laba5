import functions.*;
import functions.basic.*;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File fileOut = new File("output3.txt");
            FileOutputStream streamOut = new FileOutputStream(fileOut);
            ObjectOutputStream objectOut = new ObjectOutputStream(streamOut);
            TabulatedFunction a = TabulatedFunctions.tabulate(new Exp(), 0, 10, 11);
            objectOut.writeObject(a);
            objectOut.close();
            FileInputStream streamIn = new FileInputStream("output3.txt");
            ObjectInputStream ObjectIn = new ObjectInputStream(streamIn);
            TabulatedFunction b = (ArrayTabulatedFunction) ObjectIn.readObject();
            for(int i = 0; i<10; i++){
                double aValue = a.getPointY(i);
                double bValue = b.getPointY(i);
                System.out.println( aValue + " " + bValue);
                System.out.println(aValue == bValue);
                System.out.println();
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}