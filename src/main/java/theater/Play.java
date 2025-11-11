package theater;

/**
 * Represents a theatrical play with a name and a genre type.
 */
public class Play {

    private final String name;
    private final String type;

    public Play(final String name, final String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}

