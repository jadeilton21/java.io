package br.com.alura.java.io.testes.TesteJava;

import java.nio.charset.Charset;

public class TesteUnicodEnconding3 {


    public static void main(String[] args) throws Exception{





        String s = "BB";
        System.out.println(s.codePointAt(01));


        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());



        byte[] bytes = s.getBytes("windows-1252");
        System.out.print(bytes.length + ", windows-1252, ");
        String sNova = new String(bytes, "windows-1252");
        System.out.println(sNova);


        bytes = s.getBytes("UTF-8");
        System.out.print(bytes.length + ", UTF-8 ,");
        sNova = new String(bytes, "UTF-8");
        System.out.println(sNova);



        bytes = s.getBytes("US-ASCII");
        System.out.print(bytes.length + ", US-ASCII, ");
        sNova = new String(bytes, "US-ASCII");
        System.out.println(sNova);
    }
}
