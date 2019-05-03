package Calculator;

public class SimpleMath implements MathematicalFormulas {


  public void SimpleMath(){
  }

  @Override
  public float add(float a, float b) {
    return a+b;
  }

  @Override
  public float sub(float a, float b) {
    return a-b;
  }

  @Override
  public float mul(float a, float b) {
    return a*b;
  }

  @Override
  public float div(float a, float b) {
    return a/b;
  }

  @Override
  public float sqr(float a) {
    return a*a;
  }

  @Override
  public double sqrt(float a) {
    return Math.sqrt(a);
  }

  @Override
  public double npwr(float a, float b) {
    return Math.pow(a, b);
  }

  @Override
  public double nroot(float a, float b) {
    return Math.pow(Math.E, Math.log(a)/b);
  }

  @Override
  public double fac(float a){
    double val = a;
    for (int i = 1; i<a; i++){
      val = val*i;
    }
    return val;
  }

  @Override
  public double inv(float a) {
    return 1/a;
  }

  @Override
  public double sine(float a) {
    return Math.sin(a);
  }

  @Override
  public double cos(float a) {
    return Math.cos(a);
  }

  @Override
  public double tan(float a) {
    return Math.tan(a);
  }

  @Override
  public double pwer10(float a) {
    return Math.pow(10, a);
  }

  @Override
  public double sinh(float a) {
    return Math.sinh(a);
  }

  @Override
  public double cosh(float a) {
    return Math.cosh(a);
  }

  @Override
  public double tanh(float a) {
    return Math.tanh(a);
  }

  @Override
  public double ee(float a, float b) {
    return a * Math.pow(10, b);
  }


}
