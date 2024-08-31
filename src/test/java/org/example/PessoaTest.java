package org.example;

import AbstractFactory.Fabrica;
import AbstractFactory.FabricaPf;
import AbstractFactory.FabricaPj;
import AbstractFactory.Pessoa;

import org.junit.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    public void deveEmitirDocumentoPf() {
        org.example.Fabrica fabrica = new FabricaPf();
        Pessoa aluno = new Pessoa(fabrica);
        assertEquals("Documento Pf", aluno.getDocumento().emitir());
    }

    @Test
    void deveEmitirDocumentoPj() {
        Fabrica fabrica = new FabricaPj();
        Pessoa aluno = new Pessoa(fabrica);
        assertEquals("Documento Pf", aluno.getDocumento().emitir());
    }
}