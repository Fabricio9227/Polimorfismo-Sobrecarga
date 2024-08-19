package com.aula06.aula13;

public class Mamifero extends Animal {
    //Atributos
    protected String corPelo;

    //Métodos 
    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
    
}
