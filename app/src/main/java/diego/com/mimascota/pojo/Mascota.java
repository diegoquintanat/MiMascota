package diego.com.mimascota.pojo;

/**
 * Created by Diego on 20/01/2017.
 */

public class Mascota {

    private String nombre;
    private String raza;
    private String email;
    private int foto;
    private int like;

    public Mascota(){

    }

    public Mascota(String nombre, String raza, String email, int foto){
        this.nombre = nombre;
        this.raza = raza;
        this.email = email;
        this.foto = foto;
        this.like = 0;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getFoto() {

        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public void ganarLike(){
        like++;
    }

}
