package com.action;

import com.excecoes.ExcecaoDeArquivoInexistente;
import com.excecoes.ExcecaoDeEnderecoInvalido;

import java.io.IOException;

public interface Arquivo {

    void escreve(String texto) throws ExcecaoDeEnderecoInvalido;

    String ler() throws ExcecaoDeArquivoInexistente;
}
