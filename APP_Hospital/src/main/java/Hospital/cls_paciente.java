
package Hospital;


public class cls_paciente {
    private String str_nombres_completos;
    private int int_edad;
    private String str_id;
    private String str_sintomas;
    private String str_fecha;
    private String str_hora;
    private String str_causa;

    public cls_paciente(String nombres, int edad, String id, String sintomas, String fecha, String hora, String causa) {
        this.str_nombres_completos = nombres;
        this.int_edad = edad;
        this.str_id = id;
        this.str_sintomas = sintomas;
        this.str_fecha = fecha;
        this.str_hora = hora;
        this.str_causa = causa;
    }

    public void setStr_nombres_completos(String str_nombres_completos) {
        this.str_nombres_completos = str_nombres_completos;
    }

    public void setInt_edad(int int_edad) {
        this.int_edad = int_edad;
    }

    public void setStr_sintomas(String str_sintomas) {
        this.str_sintomas = str_sintomas;
    }

    public void setStr_causa(String str_causa) {
        this.str_causa = str_causa;
    }

    public String getStr_nombres_completos() {
        return str_nombres_completos;
    }

    public int getInt_edad() {
        return int_edad;
    }

    public String getStr_id() {
        return str_id;
    }

    public String getStr_sintomas() {
        return str_sintomas;
    }

    public String getStr_fecha() {
        return str_fecha;
    }

    public String getStr_hora() {
        return str_hora;
    }

    public String getStr_causa() {
        return str_causa;
    }
    
    
    
            
}
