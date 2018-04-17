package algorytmy.algorytmDijkstry;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Graf {
    private Map<Integer,Wierzcholek> wierzcholki = new HashMap<>();
    private PriorityQueue<Wierzcholek> kolejka;

    public Graf() {
        kolejka = new PriorityQueue<>((o1, o2) -> {
            if(o1.getDistance() > o2.getDistance()){
                return -1;
            }else if (o1.getDistance() < o2.getDistance()){
                return 1;
            }
            return 0;
        });
    }

    public void dodajWierzcholek(Wierzcholek w){
        wierzcholki.put(w.getIdentyfikator(),w);
    }

    public void dijkstra(int start, int stop){
        Wierzcholek wierzcholekStart = wierzcholki.get(start);
        wierzcholekStart.setDistance(0.0);
        wierzcholekStart.setTrasa(wierzcholekStart.getName());

        kolejka.add(wierzcholekStart);

        while(!kolejka.isEmpty()){
            Wierzcholek wierzcholek = kolejka.poll();

            if(wierzcholek.getIdentyfikator() == stop){
                break;
            }

            for(int i = 0; i < wierzcholek.getSasiedzi().size(); i++){
                int id = wierzcholek.getSasiedzi().get(i);
                Krawedz krawedz = wierzcholek.getKrawedzie().get(i);
                double dystandDoSasiada = wierzcholek.getDistance() + krawedz.getWaga();
                Wierzcholek sasiad = wierzcholki.get(id);

                if(dystandDoSasiada < sasiad.getDistance()){
                    sasiad.setTrasa(wierzcholek.getTrasa() + " -> " + sasiad.getName());
                    sasiad.setDistance(dystandDoSasiada);
                    kolejka.add(sasiad);
                }
            }
        }

        Wierzcholek koncowy = wierzcholki.get(stop);

        System.out.println("Dystans do koncowego wierzcholka " + koncowy.getDistance());
        System.out.println("Trasa " + koncowy.getTrasa());
    }
}
