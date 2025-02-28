package builder_pattern.house_construction;

public class HouseVillaConcreteBuilder implements HouseBuilder {
    private House villa = new House();

    public void buildFoundation() {
        villa.setFoundation("Villa Foundation");
    }
    public void buildWalls() {
        villa.setWalls("Villa Walls");
    }

    public void buildRoof() {
        villa.setRoof("Villa Roof");
    }

    public void buildInterior() {
        villa.setInterior("Villa Interior");
    }

    public House getResult() {
        return villa;
    }
}
