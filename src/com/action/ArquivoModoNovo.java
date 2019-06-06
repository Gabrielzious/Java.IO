package com.action;

import com.excecoes.ExcecaoDeArquivoInexistente;
import com.excecoes.ExcecaoDeEnderecoInvalido;

import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ArquivoModoNovo implements Arquivo {

    String nomeDoArquivo;

    public ArquivoModoNovo(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    @Override
    public void escreve(String texto) throws ExcecaoDeEnderecoInvalido {
        try {
            Path newTxt = Paths.get("C:\\Users\\user\\IdeaProjects\\JavaIo2\\" + this.nomeDoArquivo +".txt");
            Files.write(newTxt, texto.getBytes());
        }
        catch(IOException e){
                throw new ExcecaoDeEnderecoInvalido("Endereço nao encontrado");
            }

        }

    @Override
    public String ler() throws ExcecaoDeArquivoInexistente{
        try {
            Path caminho = Paths.get("C:\\Users\\user\\IdeaProjects\\JavaIo2\\" + this.nomeDoArquivo + ".txt");
            String conteudoDoFile = new String(Files.readAllBytes(caminho));
            System.out.println(conteudoDoFile);
            return conteudoDoFile;
        //}catch(OutOfMemoryError e){
          //  throw new OutOfMemoryError("Required array size too large");
        }
        catch(IOException e){
            throw new ExcecaoDeArquivoInexistente("Não foi possível ler o arquivo especificado. Verifique se é um arquivo valido ou se o endereço está correto");
        }
    }
}