package dados;

import java.util.concurrent.atomic.AtomicInteger;

public class Marcador {
    private AtomicInteger n_uno = new AtomicInteger(0);
    private AtomicInteger n_dos = new AtomicInteger(0);
    private AtomicInteger n_tres = new AtomicInteger(0);
    private AtomicInteger n_cuatro = new AtomicInteger(0);
    private AtomicInteger n_cinco = new AtomicInteger(0);
    private AtomicInteger n_seis = new AtomicInteger(0);

    public void incremento(int valor) {
        switch (valor) {
            case 1 -> n_uno.incrementAndGet();
            case 2 -> n_dos.incrementAndGet();
            case 3 -> n_tres.incrementAndGet();
            case 4 -> n_cuatro.incrementAndGet();
            case 5 -> n_cinco.incrementAndGet();
            case 6 -> n_seis.incrementAndGet();
        }
    }

    @Override
    public String toString() {
        int result = n_uno.get()+n_dos.get()+n_tres.get()+n_cuatro.get()+n_cinco.get()+n_seis.get();
        return "Número 1: " + n_uno.get() + " veces" + "\n" +
                "Número 2: " + n_dos.get() + " veces" + "\n" +
                "Número 3: " + n_tres.get() + " veces" + "\n" +
                "Número 4: " + n_cuatro.get() + " veces" + "\n" +
                "Número 5: " + n_cinco.get() + " veces" + "\n" +
                "Número 6: " + n_seis.get() + " veces" + "\n"+
                "Total de veces: "+n_uno.get()+" + "+n_dos.get()+" + "+n_tres.get()+" + "+n_cuatro.get()+" + "+n_cinco.get()+" + "+n_seis.get()+" = "+result;
    }
}
