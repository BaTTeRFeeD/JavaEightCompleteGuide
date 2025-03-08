package batterfeed.Test;

import java.util.List;

public class InstrumentTest {
    static class Instrument {
        private boolean traded;

        public boolean isTraded() {
            return traded;
        }

        Instrument(boolean value){
            traded = value;
        }
    }

     // Список инструментов

    public static void main(String[] args) {
        List<Instrument> instruments = List.of(
                new Instrument(true),
                new Instrument(true),
                new Instrument(false),
                new Instrument(true)
        );

        Instrument d = new Instrument(true);

        if ( instruments.stream().filter(x -> !x.isTraded()).count() == 0 ) {
            System.out.println("code was working");
        } else{
            System.out.println("code wasn't working");
        }
    }
}
