package br.com.alura.java.io.testes.TesteJava;

import java.io.*;

public class TesteSerializacao {


    public static void main(String[] args) throws Exception {





//        String nome = "Jadeilton lindo";
//
//        ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("Object.2"));
//        oss.writeObject(oss);
//        oss.close();




      ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Object.2"));
      String nomew = (String) ois.readObject();
      ois.close();
      System.out.println(nomew);







    }
}
