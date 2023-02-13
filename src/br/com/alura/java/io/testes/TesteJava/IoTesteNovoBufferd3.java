package br.com.alura.java.io.testes.TesteJava;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class IoTesteNovoBufferd3 {


    public static void main(String[] args) throws Exception{


        BufferedWriter entradaDeDados = new BufferedWriter(new FileWriter("atividade.txt"));

        entradaDeDados.write("Jadeilton lindão");
        entradaDeDados.write(System.lineSeparator());
        entradaDeDados.write("Fayaaaaaaaaaaaaa");
        entradaDeDados.write(System.lineSeparator());
        entradaDeDados.write("Jadeilton vc é foda");
        entradaDeDados.write(System.lineSeparator());


        entradaDeDados.close();

    }
}
