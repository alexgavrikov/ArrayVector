package ru.ncedu.java.tasks;

import org.apache.commons.lang3.builder.Diff;
import org.apache.commons.lang3.builder.DiffBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 06.07.2015.
 */
public class Main {
    public static void main(String[] args) {
        ArrayVectorImpl arr=new ArrayVectorImpl();
        ArrayVectorImpl arr2=new ArrayVectorImpl();
        ArrayVector arr3=arr;
        arr2=(ArrayVectorImpl)arr3;
        arr.set(3,4,5.5);
        arr.clone();
        arr.set(5, 3);
        //arr.sortAscending();
        //System.out.println(Arrays.toString(arr.clone().coords));
        System.out.println(arr.clone());
        System.out.println(arr.get(2));
        System.out.println(arr.scalarMult(arr2));
        arr= (ArrayVectorImpl) arr.sum(arr2);
        StringBuffer s= new StringBuffer("qwefr");
        System.out.println(s.substring(2,4));
        System.out.println(s.capacity());
        char[] qwr=new char[4];
        s.getChars(0,3,qwr,0);
        System.out.println(Arrays.toString(qwr));
        System.out.println();
        String wer="23";
        Object rt="wefw";
        String fg=rt.toString();
        System.out.println(rt);
        Integer.parseInt(wer);
        String str="^([\\+\\-]?[^\\+\\-i]+)(?:([\\+\\-][^i]*)i)?$";
        String st="^([\\+\\-]?[^i]*)i$";
        Pattern p=Pattern.compile(str);
        Matcher m = p.matcher("5i");
        System.out.println(m.matches());
        //System.out.println(Double.parseDouble(m.group(1)));
        //System.out.println(m.group(2));
        ArrayVectorImpl[] sd=new ArrayVectorImpl[4];
        DiffBuilder dfgh=new DiffBuilder(new Object(),new Object(),new ToStringStyle());
        System.out.println();






    }
}
