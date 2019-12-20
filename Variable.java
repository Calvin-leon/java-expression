package expression;

import java.util.*;
import java.lang.*;
import java.io.*;


public class Variable extends ExpressionB{
  String name;


  public Variable(String name){
      super.name = name;
  }


  public double evaluate(double value){
    return value;
  }

  public int evaluate(int value){
    return value;
  }


  
  public String toString(){
    return super.name;
  }

  public String toMiniString(){
    return super.name;
  }

  public boolean equals(Object ex){
    if(!(ex instanceof Variable))
        return false;

    ExpressionB expression = (ExpressionB)ex;

    if(!expression.name.equals(super.name))
        return false;

    return true;
  }
}
