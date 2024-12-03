import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ConvertidorUnidadesTest {

  @Test
  public void metrosACm() {
    // Obtener el valor en metros
    double metros;
    metros = 1.26;

    double metros1;
    metros1 = 14.54;

    // Convertir el valor a Cm
    ConversorUnidades convertirdor = new ConversorUnidades();

    // Evaluar el resultado con un assert
    assertEquals(126, convertirdor.metrosACm(metros), "El resultado debe ser 126cm");
    assertEquals(1454, convertirdor.metrosACm(metros1), "El resultado debe ser 126cm");

  }

  @Test
  public void metrosAm() {
    // Obtener el valor en metros
    double metros;
    metros = 1.26;

    double metros2;
    metros2 = 15.60;

    // Convertir el valor a Cm
    ConversorUnidades convertirdor = new ConversorUnidades();

    // Evaluar el resultado con un assert
    assertEquals(1260, convertirdor.metrosAm(metros), "El resultado debe ser 1260m");

    assertEquals(15600, convertirdor.metrosAm(metros2), "El resultado debe ser 15600m");

  }

  @Test
  public void centimetrosAml(){
    ConversorUnidades conversor = new ConversorUnidades();
    double resultado = conversor.centimetrosAMilimetros(2.25);


    assertEquals(22.5, resultado, "El resultado debe ser 12.6 ml");

    assertEquals(22.5, resultado, "El resultado debe ser 12.6 ml");
  
}

  @Test
  public void milimetrosAMetros() {
    ConversorUnidades conversor = new ConversorUnidades();

    double resultado = conversor.milimetrosAMetros(1000.0);

    assertEquals(1, resultado, "El resultado debe ser 1 metro");
  }
}