package javabeans;
import org.apache.struts.action.*;

public class MensajeForm extends ActionForm{
	private String remite;
	private String destino;
	private String texto;
	
	public MensajeForm(){} //constructor sin parámetros
	
	public MensajeForm(String remite, String destino,
	String texto){
	this.remite=remite;
	this.destino=destino;
	this.texto=texto;
	}
	
	public void setRemite(String remite){
	this.remite=remite;
	}
	
	public String getRemite(){
	return remite;
	}
	
	public void setDestino(String destino){
	this.destino=destino;
	}
	
	public String getDestino(){
		return destino;
		}
	
	public void setTexto(String texto){
		this.texto=texto;
		}
	
	public String getTexto(){
		return texto;
		}
}