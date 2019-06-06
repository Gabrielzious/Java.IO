package com.main;

import com.excecoes.ExcecaoDeArquivoInexistente;
import com.excecoes.ExcecaoDeEnderecoInvalido;

import java.io.IOException;

import com.io.Insertion;

public class Main {


    public static void main(String[] args) throws IOException, ExcecaoDeEnderecoInvalido, ExcecaoDeArquivoInexistente {

        Insertion program1 = new Insertion();


        program1.entrada();
        //program1.leitor();

    }
}