package org.example;
public class Pessoa {

    private Documento documento;

    public Pessoa (Fabrica fabrica) {
        this.documento = fabrica.createDocumento();

    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
}
