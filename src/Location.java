/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location {
    /**
     * X coordinate of this location.
     **/
    public int xCoord;

    /**
     * Y coordinate of this location.
     **/
    public int yCoord;


    /**
     * Creates a new location with the specified integer coordinates.
     **/
    public Location(int x, int y) {
        xCoord = x;
        yCoord = y;
    }

    /**
     * Creates a new location with coordinates (0, 0).
     **/
    public Location() {
        this(0, 0);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj instanceof Location) {
            var lc = (Location) obj;
            return xCoord == lc.xCoord && yCoord == lc.yCoord;
        } else return false;
    }

    @Override
    public int hashCode() {
        return 31 * Integer.valueOf(xCoord).hashCode() + Integer.valueOf(yCoord).hashCode();
    }
}