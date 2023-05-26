interface Nadador {
    void nadar();
}


interface Corredor {
    void correr();
}

interface Ciclista {
    void pedalar();
}

class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Triatleta extends Pessoa implements Nadador, Corredor, Ciclista {
    public Triatleta(String nome) {
        super(nome);
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo.");
    }

    @Override
    public void pedalar() {
        System.out.println(getNome() + " está pedalando.");
    }
}
