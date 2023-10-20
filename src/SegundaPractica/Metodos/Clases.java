package SegundaPractica.Metodos;
class Persona{
    String nombre;
    String apellido;
    Boolean genero;
    int edad;
    int dni;
    String rol;
    int telefono;
    String correo;



    public Persona(String nombre, String apellido, Boolean genero, int edad, int dni, String rol, int telefono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
        this.dni = dni;
        this.rol = rol;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Boolean getGenero() {
        return genero;
    }

    public void setGenero(Boolean genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}

class Empleado extends Persona{
    String puesto;
    int salario;
    String departamento;

    public Empleado(String nombre, String apellido, Boolean genero, int edad, int dni, String rol, int telefono, String correo, String puesto, int salario, String departamento) {
        super(nombre, apellido, genero, edad, dni, rol, telefono, correo);
        this.puesto = puesto;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}

public class Clases {
    static Persona miguel = new Persona(
            "Miguel",
            "Dominguie",
            false,
            21,
            75687870,
            "Jefe",
            23436456,
           "micorreo@gmail.com");

    public static void main (String[] args){
        boolean valor = miguel.getGenero();
        System.out.println(valor);

        Empleado juan = new Empleado(
                "Juan",
                "Perez",
                true,
                30,
                12345678,
                "Gerente",
                23456789,
                "juan.perez@gmail.com",
                "Gerente de Ventas",
                5000,
                "Ventas");
        System.out.print(juan.getNombre());
    }

}




