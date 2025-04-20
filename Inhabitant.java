public class Inhabitant {
    private String name;
    private int morale = 100;

    public Inhabitant(String name) {
        this.name = name;
    }

    public void reactToEvent(Event event) {
        morale += event.getMoraleImpact();
        morale = Math.max(0, Math.min(100, morale));

        System.out.println(name + " reacciona: " + event.getReaction());
        System.out.println(" → Moral actual: " + morale);
    }
}
