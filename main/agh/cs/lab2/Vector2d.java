package agh.cs.lab2;

public class Vector2d {
    public int x;
    public int y;
    Vector2d(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        String a = "("+ String.valueOf(this.x)+","+ String.valueOf(this.y)+")";
        return a;
    }
    public boolean precedes(Vector2d other){
        return this.x <= other.x && this.y <= other.y;
    }
    public boolean follows(Vector2d other){
        return other.x <= this.x && other.y <= this.y;
    }
    public Vector2d upperRight(Vector2d other){
        Vector2d tmp = new Vector2d(0,0);
        if (this.x > other.x){
            tmp.x = this.x;
        }
        else tmp.x = other.x;
        if (this.y > other.y){
            tmp.y = this.y;
        }
        else tmp.y = other.y;

        return tmp;
    }
    public Vector2d lowerLeft(Vector2d other){
        Vector2d tmp = new Vector2d(0,0);
        if (this.x < other.x){
            tmp.x = this.x;
        }
        else tmp.x = other.x;
        if (this.y < other.y){
            tmp.y = this.y;
        }
        else tmp.y = other.y;

        return tmp;
    }
    public Vector2d add(Vector2d other){
        Vector2d tmp = new Vector2d(0,0);
        tmp.x = this.x + other.x;
        tmp.y = this.y + other.y;
        return tmp;
    }
    public Vector2d subtract(Vector2d other){
        Vector2d tmp = new Vector2d(0,0);
        tmp.x = this.x - other.x;
        tmp.y = this.y - other.y;
        return tmp;
    }
    public boolean equals(Object other){
        Vector2d that = (Vector2d) other;
        return this.x == that.x && this.y == that.y;
    }
    public Vector2d opposite(){
        Vector2d opposite = new Vector2d(0, 0);
        opposite.x = -this.x;
        opposite.y = -this.y;
        return opposite;
    }
}
