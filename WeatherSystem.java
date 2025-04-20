import java.util.*;

public class WeatherSystem {
    private Random rand = new Random();

    public Event generateEvent() {
        int r = rand.nextInt(5);
        return switch (r) {
            case 0 -> new Event("☀️ Día soleado", +5, "¡Qué hermoso día!");
            case 1 -> new Event("🌧️ Lluvia intensa", -5, "Mejor quedarse en casa...");
            case 2 -> new Event("🌪️ Tormenta de viento", -10, "¡A asegurar el techo!");
            case 3 -> new Event("🌋 Erupción volcánica", -25, "¡Correeee!");
            default -> new Event("🌈 Clima mágico", +15, "¡Todo es perfecto hoy!");
        };
    }
}
