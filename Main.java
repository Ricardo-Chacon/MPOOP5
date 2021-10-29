/**
* @author Ricardo Chacon
*/
class Main {
  public static void main(String[] args) {
  Circulo cir= new Circulo();
  System.out.println(cir);
  cir.setRadio(5.6f);//primer solucion
  System.out.println(cir);
  cir.setRadio((float)7.33);
  System.out.println(cir);
  float var= -8.66f;
  cir.setRadio(var);
  System.out.println(cir);
  
  System.out.println("########## Composicion ###########");
  Persona persona1=new Persona();
  System.out.println(persona1);
  persona1.setNombre("Susana");
  persona1.setApellido("Perez");
  Fecha fecha= new Fecha(2,1,2021);
  persona1.setFNacimiento(fecha);
  System.out.println(persona1);
  System.out.println(persona1.getFNacimiento().getAño());

  
  System.out.println("########## Composicion 2 ###########");
  Persona persona2= new Persona("Rafael","Zavala",8,4,1998);
  System.out.println(persona2);
  
 System.out.println("######### actividad extra ###########");
  Coche coche1 = new Coche ();
  coche1.setColor("blanco");
  coche1.setMarca("nisaan");
  coche1.setNumPuertas(4);
  coche1.setAño(1997);
  coche1.setPotencia(200);
  coche1.setAutomatico(true);
  coche1.setChofer("Arturo ","Lopez ",4,7,1998);
  coche1.setCopiloto("Jesus "," Espinoza ",8,9,2007);
  coche1.setPasajero1("Karla"," Gomez",22,12,1815);
  coche1.setPasajero2("Antonio "," Morales ",13,8,2000);
  System.out.println(coche1);

  }
}