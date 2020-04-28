package negocio;
import java.util.*;

public class MensajeTable {
	
	public class Mensaje{
			String remitente;
			String destino;
			String txtMensaje;
		
	}
	
	
	private List<Mensaje> mensajesTable;
	
	public MensajeTable() {
		mensajesTable = new ArrayList<Mensaje>();
		
	}
	public void  insert(Mensaje newMensaje) {
		this.mensajesTable.add(newMensaje);
		
	}
	public void  select(Mensaje newMensaje) {
		this.mensajesTable.add(newMensaje);
		
	}

}
