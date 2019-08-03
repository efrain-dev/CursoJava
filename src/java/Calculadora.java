
public class Calculadora {
    public String nombreDeClase;
private int resultadoSuma;
private int resultadoResta;
   public int sumar(int primerNumero, int segundoNumero){
       this.resultadoSuma = primerNumero + segundoNumero;
       return this.resultadoSuma;
   
   }
   
   private int restar (int primerNumero, int segundoNumero){
    this.resultadoResta = primerNumero-segundoNumero;
    return this.resultadoResta;
   
   }
}
