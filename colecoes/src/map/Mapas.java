package map;

import java.util.HashMap;

public class Mapas {

    public static void main(String[] args) {

        java.util.Map<Integer, String> mapa = new HashMap<>();
        mapa.put(33, "zé");
        mapa.put(22, "fatec");

        System.out.println(mapa.get(33));
    }
}
