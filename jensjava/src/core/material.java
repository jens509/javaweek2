package core;

public class material {
private String name;
private String type;
private int idmaterial;
//constructor
public material(String name, String type, int idmaterial) {
	super();
	this.name = name;
	this.type = type;
	this.idmaterial = idmaterial;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getIdmaterial() {
	return idmaterial;
}
public void setIdmaterial(int idmaterial) {
	this.idmaterial = idmaterial;
}
@Override
public String toString() {
	return "material [name=" + name + ", type=" + type + ", idmaterial=" + idmaterial + "]"+super.toString();
}





}
