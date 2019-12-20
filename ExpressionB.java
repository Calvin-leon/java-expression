package expression;

import java.util.*;
import java.lang.*;
import java.io.*;


public class ExpressionB implements DoubleExpression, Expression{
    ExpressionB a;
    ExpressionB b;
    Integer value = null;
    Double valueD = null;
    String name = null;


    public double evaluate(final double value){
        return 0;
    }

    public int evaluate(final int value){
        return 0;
    }


    public String toString(){
        return null;
    }



    public int hashCode(){
        return this.toString().hashCode();
    }

    // public boolean equals(Object expression){
    //     return false;
    // }
}
