package expression;

import java.util.*;
import java.lang.*;
import java.io.*;


public class Divide extends ExpressionB{
  public Divide(ExpressionB a, ExpressionB b){
      super.a = a;
      super.b = b;
  }
  


  public double evaluate(double value){
    return this.a.evaluate(value) / this.b.evaluate(value);
  }

  public int evaluate(int value){
    return this.a.evaluate(value) / this.b.evaluate(value);
  }

  
  public String toString(){
    StringBuilder sb = new StringBuilder();

    sb.append("(");
    sb.append(a.toString());
    sb.append(" / ");
    sb.append(b.toString());
    sb.append(")");

    return sb.toString();
  }

  public String toMiniString(){
    StringBuilder sb = new StringBuilder();


    if((this.a instanceof Add) || (this.a instanceof Subtract)){
      sb.append("(");
      sb.append(this.a.toMiniString());
      sb.append(")");
    }
    else{
      sb.append(a.toMiniString());
    }

    sb.append(" / ");

    if((this.b instanceof Add) || (this.b instanceof Subtract)){
      sb.append("(");
      sb.append(this.b.toMiniString());
      sb.append(")");
    }
    else{
      sb.append(this.b.toMiniString());
    }

    return sb.toString();
  }

  public boolean equals(Object ex){
    if(!(ex instanceof Divide))
        return false;

    ExpressionB expression = (ExpressionB)ex;
    
    if(!super.a.equals(expression.a) || !super.b.equals(expression.b))
        return false;
        
    return true;
  }
}
