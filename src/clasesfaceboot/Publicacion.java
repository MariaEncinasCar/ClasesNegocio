/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesfaceboot;

import java.util.Date;
import java.util.List;

/**
 *
 * @author María Encinas 
 */
public class Publicacion {
    private Date fechaHora;
    private String contenidoTex;
    private String contenidoImg;
    private List<String> etiquetas;
    private List<Usuario> usuariosEtiquetados;
    private Usuario usuario;

    public Publicacion(Date fechaHora, String contenidoTex, String contenidoImg,
            List<String> etiquetas, List<Usuario> usuariosEtiquetados, Usuario usuario) {
        this.fechaHora = fechaHora;
        this.contenidoTex = contenidoTex;
        this.contenidoImg = contenidoImg;
        this.etiquetas = etiquetas;
        this.usuariosEtiquetados = usuariosEtiquetados;
        this.usuario = usuario;
    }

    public Publicacion() {
    }

    public Publicacion(Date fechaHora, String contenidoTex, String contenidoImg, Usuario usuario) {
        this.fechaHora = fechaHora;
        this.contenidoTex = contenidoTex;
        this.contenidoImg = contenidoImg;
        this.usuario = usuario;
    }
    
    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getContenidoTex() {
        return contenidoTex;
    }

    public void setContenidoTex(String contenidoTex) {
        this.contenidoTex = contenidoTex;
    }

    public String getContenidoImg() {
        return contenidoImg;
    }

    public void setContenidoImg(String contenidoImg) {
        this.contenidoImg = contenidoImg;
    }

    public List<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public List<Usuario> getUsuariosEtiquetados() {
        return usuariosEtiquetados;
    }

    public void setUsuariosEtiquetados(List<Usuario> usuariosEtiquetados) {
        this.usuariosEtiquetados = usuariosEtiquetados;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
