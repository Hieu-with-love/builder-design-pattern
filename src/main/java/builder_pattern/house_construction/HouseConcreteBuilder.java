package builder_pattern.house_construction;

public class HouseConcreteBuilder implements HouseBuilder{
    private House house = new House();

    public void buildFoundation() {
        house.setFoundation("Concrete Foundation");
    }

    public void buildWalls() {
        house.setWalls("Concrete Walls");
    }

    public void buildRoof() {
        house.setRoof("Concrete Roof");
    }

    public void buildInterior() {
        house.setInterior("Modern Interior");
    }

    public House getResult() {
        return house;
    }
}
