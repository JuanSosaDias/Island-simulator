public class Event {
    private String description;
    private int moraleImpact;
    private String reaction;

    public Event(String description, int moraleImpact, String reaction) {
        this.description = description;
        this.moraleImpact = moraleImpact;
        this.reaction = reaction;
    }

    public String getDescription() {
        return description;
    }

    public int getMoraleImpact() {
        return moraleImpact;
    }

    public String getReaction() {
        return reaction;
    }
}
