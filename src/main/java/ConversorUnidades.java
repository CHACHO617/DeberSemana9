public class ConversorUnidades {

  public Double metrosACm(double metros) {
    return metros * 100; //Metros a centimetros
  }

  public Double metrosAm(double metros) {
    return metros * 1000;
  }

  public Double centimetrosAMilimetros(double centimetros) {
    return centimetros * 10;
  }

  public Double milimetrosAMetros(double milimetros) {
    return milimetros / 1000;
  }
}
