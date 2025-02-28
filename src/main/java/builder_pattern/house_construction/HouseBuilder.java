package builder_pattern.house_construction;

public interface HouseBuilder {
    void buildFoundation();
    void buildWalls();
    void buildRoof();
    void buildInterior();
    House getResult();
}
