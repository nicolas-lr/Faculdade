package Atv4;
public class Registro{

private String id;
private String Cliente;
private String Nacionalidade;

Registro (String id, String Cliente, String Nacionalidade){
    this.id = id;
    this.Cliente = Cliente;
    this.Nacionalidade = Nacionalidade;
}

void setId(String id) {
    this.id = id;
}
String getId() {
    return id;
}

void setCliente(String Cliente) {
    this.Cliente = Cliente;
}
String getCliente() {
    return Cliente;
}

void setNacionalidade(String Nacionalidade) {
    this.Nacionalidade = Nacionalidade;
}
String getNacionalidade() {
    return Nacionalidade;
}
}