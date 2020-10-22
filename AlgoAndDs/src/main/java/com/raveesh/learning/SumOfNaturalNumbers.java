package com.raveesh.learning;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Assert;

public class SumOfNaturalNumbers {


  public static int sumOfNNaturalNumbers( int n){
    int sum =0;
    for (int i =1;i<=n;i++){
      sum = sum +i;
    }
    return sum;
  }


  public static int sumOfNNaturalNumbersWithFormula( int n){
    return (n * (n + 1)) / 2;
  }

  public static int sumOfNNaturalNumbersWithTwoLoops( int n){
    int sum =0;
    //FOr each iteration it will look like
    //1+ (1+1)+(1+1+1)
    for(int i=1;i<=n;i++) {
      for (int j = 1; j <= i; j++) {
        sum += 1;
      }
    }
    return sum;
  }


  public static void main(String[] args) {
    assertThat(sumOfNNaturalNumbers(3)).isEqualTo(6);
    assertThat(sumOfNNaturalNumbersWithFormula(3)).isEqualTo(6);
    assertThat(sumOfNNaturalNumbersWithTwoLoops(3)).isEqualTo(6);


    assertThat(sumOfNNaturalNumbers(5)).isEqualTo(15);
    assertThat(sumOfNNaturalNumbersWithFormula(5)).isEqualTo(15);
    assertThat(sumOfNNaturalNumbersWithTwoLoops(5)).isEqualTo(15);

  }
}
