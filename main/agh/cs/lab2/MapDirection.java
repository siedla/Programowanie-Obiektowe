package agh.cs.lab2;

public enum MapDirection {
    NORTH,
    SOUTH,
    WEST,
    EAST;

    public String toString() {
        return switch (this) {
            case NORTH -> "Północ";
            case SOUTH -> "Południe";
            case WEST -> "Zachód";
            case EAST -> "Wschód";
        };

    }

    public MapDirection next() {
        return switch (this) {
            case NORTH -> EAST;
            case SOUTH -> WEST;
            case WEST -> NORTH;
            case EAST -> SOUTH;

        };
    }
    public MapDirection previous() {
        return switch (this) {
            case NORTH -> WEST;
            case SOUTH -> EAST;
            case WEST -> SOUTH;
            case EAST -> NORTH;

        };
    }
    public Vector2d toUnitVector(){
        Vector2d vector = new Vector2d(0, 0);
        switch (this) {
            case NORTH -> vector.y = 1;
            case SOUTH -> vector.y = -1;
            case WEST -> vector.x = -1;
            case EAST -> vector.x = 1;
        }
        return vector;
    }

}