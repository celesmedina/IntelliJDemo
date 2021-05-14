package models;

public class Profesor {

    public  String variablePublica="variablePublica";
    private String variablePrivada="variablePrivada"; //Es accedida solo mediante la clase que lo contiene
    protected String variableProtected="variableProtected"; //la variable es acceddida por la clase que la contiene y las que esten en el mismo paquete
    static String miInstitucion="MIT"; //Para todas las instancastiene el mismo valor
    String curso="";

    public static void main(String[] args) {
        Profesor prof1=new Profesor();
        Profesor prof2=new Profesor();
        Profesor prof3=new Profesor();
        Profesor prof4=new Profesor();
        Profesor prof5=new Profesor();

        prof1.curso="Matematica";
        prof2.curso="Curso 02";
        prof3.curso="Curso 03";


        System.out.println(prof1.miInstitucion);
        System.out.println(prof2.miInstitucion);
        System.out.println(prof3.miInstitucion);
        System.out.println(prof4.miInstitucion);
        System.out.println(prof5.miInstitucion);

    }
}
