package br.com.dio.iphone.model;

import br.com.dio.iphone.interfaces.*;

public class Iphone implements Navegador, Telefone, ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA NO IPHONE...");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA NO IPHONE...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA NO IPHONE...");
    }

    @Override
    public void ligar() {
        System.out.println("LIGANDO PARA NÚMERO NA AGENDA...");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO LIGAÇÃO...");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("OUVINDO UMA GRAVAÇÃO NO CORREIO DE VOZ...");

    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA NO NAVEGADOR SAFARI...");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA NO NAVEGADOR SAFARI...");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA NO NAVEGADOR SAFARI...");
    }
}
