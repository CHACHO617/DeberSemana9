package conversorunidades;

/**
 * Este paquete contiene clases para la conversion de unidades
 * 
 * <p>
 * Las clases incluyen metodos para convertir entre metros, centimetros,
 * milimetros y otras unidades de medida.
 * </p>
 */

public final class ConversorUnidades {
  
  private ConversorUnidades(){
      //Prevent instantiation
  }

  private static final double CM_PER_METER = 100;
  private static final double MM_PER_CM = 10;
  private static final double MM_PER_METER = 1000;

  /**
   * Converts meters to centimeters.
   * @param metros the value in meters to convert
   * @return the equivalent value in centimeters
   */
  public static Double metrosACm(final double metros) {
    return metros * CM_PER_METER; 
  }

  /**
   * Converts meters to milimiters.
   * @param metros the value in meters to convert
   * @return the equivalent value in milimeters
   */
  public static Double metrosAm(final double metros) {
    return metros * MM_PER_METER;
  }

  /**
   * Converts centimeters to milimeters.
   * @param centimetros the value in meters to convert
   * @return the equivalent value in milimeters
   */
  public static Double centimetrosAMilimetros(final double centimetros) {
    return centimetros * MM_PER_CM;
  }

  /**
   * Milimeters to meters.
   * @param milimetros the value in meters to convert
   * @return the equivalent value in meters
   */
  public static Double milimetrosAMetros(final double milimetros) {
    return milimetros / MM_PER_METER;
  }
}
