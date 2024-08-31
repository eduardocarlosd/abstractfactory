package org.example;

public class FabricaPf implements Fabrica {
    public Documento createDocumento() {
        return new DocumentoPf();
    }
}
