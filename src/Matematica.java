public class Matematica extends Libro{

    private int capitulos;

    public Matematica( int capitulos) {
        super(1);
        this.capitulos = capitulos;

        if( capitulos == 1){
            setTiempoPrestamo(1);
        }
        if (capitulos >= 2)
            setTiempoPrestamo(3);
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }



}
