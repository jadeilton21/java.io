package br.com.alura.java.io.testes.TesteJava;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class IoScannerSeparacao {


    public static void main(String[] args) throws Exception{


        Scanner saida = new Scanner(new File("atividade.txt"));

        while(saida.hasNextLine()){

            String linha = saida.nextLine();
            System.out.println(linha);



            Scanner novo = new Scanner(linha);
            novo.useLocale(Locale.US);
            novo.useDelimiter(",");

            String valor1 = novo.next();
            int valor2 = novo.nextInt();
            int valor3 = novo.nextInt();
            int valor4 = novo.nextInt();

            System.out.println(valor1 + valor2 + valor3 + valor4);

            novo.close();

        }
        saida.close();
    }
}
