public class Coche{
  private String color;
  private String marca;
  private int numPuertas;
  private int año;
  private int potencia;
  private boolean automatico;
  private String chofer;
  private String copiloto;
  private String pasajero1;
  private String pasajero2;
  private Fecha fNacimientochof;
  private String apellidochof;
  private Fecha fNacimientocop;
  private String apellidocop;
  private Fecha fNacimientop1;
  private String apellidop1;
  private Fecha fNacimientop2;
  private String apellidop2;
  public Coche(){
}
  public Coche (String color, String marca, int numPuertas, int año, int potencia, boolean automatico, String chofer, String copiloto, String pasajero1, String pasajero2){
    this.color=color;
    this.marca=marca;
    this.numPuertas=numPuertas;
    this.año=año;
    this.potencia=potencia;
    this.automatico=automatico;
    this.chofer=chofer;
    this.copiloto=copiloto;
    this.pasajero1=pasajero1;
    this.pasajero2=pasajero2;
}
  public String getColor(){
    return color;
  }
  public void setColor(String color){
    this.color=color;
  }
  public String getMarca(){
    return marca;
  }
  public void setMarca(String marca){
    this.marca=marca;
  }
  public int getNumPuertas(){
  return numPuertas;
  }
  public void setNumPuertas(int numPuertas){
  this.numPuertas=numPuertas;
  }
  public int getAño(){
    return año;
  }
  public void setAño(int año){
    this.año=año;
  }
  public int getPotencia(){
    return potencia;
  }
  public void setPotencia(int potencia){
    this.potencia=potencia;
  }
  public boolean getAutomatico(){
    return automatico;
  }
  public void setAutomatico(boolean automatico){
    if(automatico){
      System.out.println("soy automatico");
    }else{
      System.out.println("no soy automatico");
    }
  this.automatico=automatico;
    }
  public String getChofer(){
    return chofer;
  }
  public void setChofer(String chofer, String apellidochof, int dia, int mes, int año){
    this.chofer=chofer;
    this.apellidochof=apellidochof;
      fNacimientochof=new Fecha(dia,mes,año);
    }
  public String getCopiloto(){
    return copiloto;
  }
  public void setCopiloto(String copiloto, String apellidocop,int dia, int mes, int año){
    this.copiloto=copiloto;
    this.apellidocop=apellidocop;
    fNacimientocop= new Fecha(dia, mes, año);
  }
  public String getPasajero1(){
    return pasajero1;
  }
  public void setPasajero1(String pasajero1, String apellidop1, int dia, int mes, int año){
    this.pasajero1=pasajero1;
    this.apellidop1=apellidop1;
    fNacimientop1=new Fecha(dia, mes,año);
  }
  public String getPasajero2(){
    return pasajero2;
  }
  public void setPasajero2(String pasajero2, String apellidop2, int dia, int mes, int año){
    this.pasajero2=pasajero2;
    this.apellidop2=apellidop2;
    fNacimientop2= new Fecha(dia,mes,año);
  }
  @Override
  public String toString(){
    return "Coche de color= "+color+", De la marca= "+marca+", con = "+numPuertas+" puertas "+", del año= "+año+", con una potencia de ="+potencia+", Automarico= "+automatico+". El chocher es= "+chofer+" de apellido= "+apellidochof+" con una fecha de nacimiento de= "+fNacimientochof+". El copiloto es= "+copiloto+" de apellido= "+apellidocop+" con una fecha de nacimiento de "+fNacimientocop+". El pasajero 1 es ="+ pasajero1+" de apellido= "+apellidop1+" con una fecha de nacimiento= "+fNacimientop1+". El pasajero 2 es = "+pasajero2+" de apellido "+apellidop2+" con una fecha de nacimeinto= "+fNacimientop2+")";
  }

}
