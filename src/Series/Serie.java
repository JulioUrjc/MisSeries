/**
 *
 * @author July
 */
package Series;

import java.io.Serializable;

public class Serie implements Serializable, Comparable<Serie>{
    final int COLUMNAS=3;
    String titulo;
    int temporada;
    int capitulo;
    

    public Serie(String titulo, int temporada, int capitulo) {
        this.titulo = titulo;
        this.temporada = temporada;
        this.capitulo = capitulo;
    }

    public int getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(int capitulo) {
        this.capitulo = capitulo;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Object[] datos(int id){
        Object []datos= new Object[COLUMNAS];
            datos[0]=" "+id+".  "+titulo;
            datos[1]=temporada;
            datos[2]=capitulo;
        return datos;
    }

    @Override
    public String toString() {
        return titulo + "     " + temporada + "     " + capitulo;
    }
    
    @Override
    public int compareTo(Serie s) {
        int temp = this.temporada-s.temporada;
        return temp == 0 ? this.capitulo-s.capitulo : temp;
    }

    public boolean equals(Serie s){
        return this.temporada-s.temporada==0;
    }
}
