package com.csc205.project2;

public class SquarePyramid extends Shape {

    private double height;
    private double baseEdge;

    public SquarePyramid(){
        super();
        this.height = 0.0;
        this.baseEdge = 0.0;
    }

    public SquarePyramid(double h, double bE){
        super();
        this.height = h;
        this.baseEdge = bE;
    }

    public double getHeight(){ return height;}

    public double getBaseEdge() { return baseEdge;}

    public void setHeight(double height){ this.height = height;}

    public void setBaseEdge(double baseEdge) {this.baseEdge = baseEdge;}

    public double surfaceArea(){
        double insideOfSqrt = (Math.pow(baseEdge,2)/4) + Math.pow(height,2);
        return (Math.pow(baseEdge,2) + 2* baseEdge *Math.sqrt(insideOfSqrt));}

    public double volume(){ return Math.pow(baseEdge,2)*(height/3);}

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SquarePyramid{");
        sb.append("height=").append(height);
        sb.append(", baseEdge=").append(baseEdge);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}


