package ru.ncedu.java.tasks;


import java.util.Arrays;

/**
 * Created by user on 06.07.2015.
 */
public class ArrayVectorImpl implements ArrayVector {
    public double[] coords;
    public ArrayVectorImpl(){
        coords=new double[]{0};
    }

    @Override
    public void set(double... elements) {
        coords=elements;
    }

    @Override
    public double[] get() {
        return coords;
    }

    @Override
    public ArrayVector clone() {
        ArrayVectorImpl arr=new ArrayVectorImpl();
        arr.set(coords.clone());
        return arr;
    }

    @Override
    public int getSize() {
        return coords.length;
    }

    @Override
    public void set(int index, double value) {
        if (index<0) return;
        if (index<coords.length) coords[index]=value;
        else {
            double[] tmp=new double[index+1];
            System.arraycopy(coords,0,tmp,0,coords.length);
            tmp[index]=value;
            coords=tmp;
        }
    }

    @Override
    public double get(int index) throws ArrayIndexOutOfBoundsException {
        return coords[index];
    }

    @Override
    public double getMax() {
        int len=coords.length;
        double max=coords[0];
        for(int i=1;i<len;++i){
            if(coords[i]>max) max=coords[i];
        }

        return max;

    }

    @Override
    public double getMin() {
        int len=coords.length;
        double min=coords[0];
        for(int i=1;i<len;++i){
            if(coords[i]<min) min=coords[i];
        }

        return min;
    }

    @Override
    public void sortAscending() {
        Arrays.sort(coords);
    }

    @Override
    public void mult(double factor) {
        int len=coords.length;
        for(int i=0;i<len;++i){
            coords[i]*=factor;
        }
    }

    @Override
    public ArrayVectorImpl sum(ArrayVector anotherVector) {
        //ArrayVectorImpl anotherVector2=(ArrayVectorImpl)anotherVector;
        double[] coords2=anotherVector.get();
        int len=Math.min(coords.length,coords2.length);
        for(int i=0;i<len;++i){
            coords[i]+=coords2[i];
        }
        return this;
    }

    @Override
    public double scalarMult(ArrayVector anotherVector) {
        double[] coords2=anotherVector.get();
        int len=Math.min(coords.length,coords2.length);
        double sum=0;
        for(int i=0;i<len;++i){
            sum+=coords[i]*coords2[i];
        }
        return sum;
    }

    @Override
    public double getNorm() {
        return Math.sqrt(scalarMult(this));
    }

}
