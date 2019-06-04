package com.main;

import com.io.LeitorDeArquivos;
import com.excecoes.ExcecaoDeArquivoInexistente;
import com.excecoes.ExcecaoDeEnderecoInvalido;

import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException, ExcecaoDeEnderecoInvalido, ExcecaoDeArquivoInexistente {

        Scanner scan = new Scanner(System.in);




          //Leitor de Aquivos


        System.out.println("insira o nome do primeiro leitor");
        LeitorDeArquivos l1 = new LeitorDeArquivos(scan.next());
        System.out.println("insira o nome do segundo leitor");
        LeitorDeArquivos l2 = new LeitorDeArquivos(scan.next());
        l1.leitor();
        l2.leitor();




        //Geração de arquivos:


//        System.out.println("Insira o nome do primeiro gerador");
//        GeradorDeArquivos g1 = new GeradorDeArquivos(scan.next());
//        System.out.println("Insira o nome do segundo gerador");
//        GeradorDeArquivos g2 = new GeradorDeArquivos(scan.next());
//        g1.entrada();
//        g2.entrada();





    }
}