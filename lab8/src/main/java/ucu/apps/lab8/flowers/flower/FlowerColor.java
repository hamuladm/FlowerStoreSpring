package ucu.apps.lab8.flowers.flower;

public enum FlowerColor {
    RED("Red"), BLUE("Blue");
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
