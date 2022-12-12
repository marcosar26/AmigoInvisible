package marcos.amigoinvisible.model;

import androidx.annotation.NonNull;

import java.util.Objects;

public class Amigo {
    private final String nombre;
    private Amigo amigoInvisible = null;

    @NonNull
    @Override
    public String toString() {
        return this.nombre + ": " + this.amigoInvisible.getNombre();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amigo)) return false;
        Amigo amigo = (Amigo) o;
        return nombre.equals(amigo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public Amigo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Amigo getAmigoInvisible() {
        return amigoInvisible;
    }

    public void setAmigoInvisible(Amigo amigoInvisible) {
        this.amigoInvisible = amigoInvisible;
    }
}
