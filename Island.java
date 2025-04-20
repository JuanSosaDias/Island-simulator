import java.util.*;

public class Island {
    private String name;
    private List<Inhabitant> inhabitants = new ArrayList<>();
    private WeatherSystem weatherSystem = new WeatherSystem();
    private Random rand = new Random();

    public Island(String name, int population) {
        this.name = name;
        for (int i = 1; i <= population; i++) {
            inhabitants.add(new Inhabitant("Habitante " + i));
        }
    }

    public void simulateDay() {
        System.out.println("🌅 Nuevo día en " + name + "!");

        Event event = weatherSystem.generateEvent();
        System.out.println("Evento climático: " + event.getDescription());

        for (Inhabitant person : inhabitants) {
            person.reactToEvent(event);
        }

        System.out.println("🌇 Fin del día.\n");
    }
}
