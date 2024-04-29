package constructors;

import java.awt.geom.CubicCurve2D;

public class Cuboid {
    int width;
    int height;
    int depth;

    Cuboid(int width, int height, int depth){ // constructor
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    Cuboid(int width, int height){ // constructor
        this.width = width;
        this.height = height;
        this.depth = 10;
    }
    Cuboid(int dimension){ // constructor
        width = dimension;
        height = dimension;
        depth = dimension;
    }
    Cuboid(){ // constructor
        this.width = 10;
        this.height = 10;
        this.depth = 10;
    }

    int volume(){
        return width * height * depth;
    }

    public static void main(String[] args){
        int volume;

        Cuboid stdCuboid = new Cuboid(10, 20, 15);
        volume = stdCuboid.volume();
        System.out.println(" volume of a simple Cuboid is: " + volume);

        Cuboid cuboidWithDefaults = new Cuboid(10, 20);
        volume = cuboidWithDefaults.volume();
        System.out.println(" volume of a cuboid with default depth is: " + volume);

        Cuboid cube = new Cuboid(10);
        volume = cube.volume();
        System.out.println(" volume of a cuboid with one dimension is: " + volume);

        Cuboid cubic = new Cuboid();
        volume = cubic.volume();
        System.out.println(" volume of cuboid with every default value is: " + volume);
    }

}
