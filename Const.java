package expression;

import java.util.*;
import java.lang.*;
import java.io.*;


public class Const extends ExpressionB{
  public Const(int value){
      super.value = value;
      super.valueD = (double)(value);
  }

  public Const(double value){
    super.valueD = value;
  }


  public double evaluate(double value){
    return super.valueD;
  }

  public int evaluate(int value){
    return super.value;
  }

  
  public String toString(){
    if(super.value != null)
      return super.value.toString();

    return super.valueD.toString();
  }

  public String toMiniString(){
    if(super.value != null)
      return super.value.toString();

    return super.valueD.toString();
  }


  public boolean equals(Object ex){
    if(!(ex instanceof Const))
        return false;

    ExpressionB expression = (ExpressionB)ex;

    if(expression.value != null && !expression.value.equals(this.value))
      return false;

    if(!expression.valueD.equals(this.valueD))
      return false;


    return true;
  }
}
