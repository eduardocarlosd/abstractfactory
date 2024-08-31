package org.example;

public class FabricaPj implements Fabrica{
    public Documento createDocumento() {
        return new DocumentoPf();
    }
}
