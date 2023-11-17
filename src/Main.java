import functions.*;
import functions.basic.*;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        try {
            TabulatedFunction A = new LinkedListTabulatedFunction(0, 10, 11);
            System.out.println(A.toString());
            System.out.println(A.hashCode());
            A.setPointY(1, 0.00001);
            System.out.println(A.hashCode());
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}