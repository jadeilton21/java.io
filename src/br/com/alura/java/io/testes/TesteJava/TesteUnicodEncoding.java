package br.com.alura.java.io.testes.TesteJava;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.sql.SQLOutput;

public class TesteUnicodEncoding {


    public static void main(String[] args) throws UnsupportedEncodingException {





        String s = "C";
        System.out.println(s.codePointAt(0));


        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());



        byte[] bytes = s.getBytes("windows-1252");
        System.out.print(bytes.length + ", windows-1252, ");
        String sNovo = new String(bytes, "windows-1252");
        System.out.println(sNovo);


        bytes = s.getBytes("UTF-8");
        System.out.print(bytes.length + ", UTF-8 ,");
        sNovo = new String(bytes, "UTF-8");
        System.out.println(sNovo);


        bytes = s.getBytes("US-ASCII");
        System.out.print(bytes.length + ", US-ASCII, ");
        sNovo = new String(bytes, "US-ASCII");
        System.out.println(sNovo);


















    }
}
