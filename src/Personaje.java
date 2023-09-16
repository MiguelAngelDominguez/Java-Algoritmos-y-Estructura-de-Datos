public class Personaje {
    int id;
    String name;
    String habilidad;
    double vida;
    String descripcion;
    String color;
    double tamaño;
    String rol;
    String sexo;
    public Personaje (int id,String name,String habilidad, double vida,String descripcion, String color, double tamaño, String rol,String sexo){
        this.id = id;
        this.name = name;
        this.habilidad = habilidad;
        this.vida = vida;
        this.descripcion = descripcion;
        this.color = color;
        this.tamaño = tamaño;
        this.rol = rol;
        this.sexo = sexo;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getVida() {
        return vida;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", habilidad='" + habilidad + '\'' +
                ", vida=" + vida +
                ", descripcion='" + descripcion + '\'' +
                ", color='" + color + '\'' +
                ", tamaño=" + tamaño +
                ", rol='" + rol + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}