package test_conexion_db;
import java.awt.List;
import java.sql.*;
import java.util.ArrayList;

public class Conexion {
	
	private static final  String driver = "com.mysql.jdbc.Driver", cadenacon = "jdbc:mysql:// localhost:3306/dev0 ?useSSL=false";
	
	static ArrayList<Mensaje> mensajes = new ArrayList<Mensaje>();
	
	public static void main(String args[]) {
		
		iniciar();
		
		
    }
	static void  iniciar()
	{
		mensajes = getMensajes("PABLO");
		for (Mensaje mensaje: mensajes)
		{
			System.out.println("Registro");
			System.out.print(mensaje.destino);
			System.out.print(mensaje.remitente);
			System.out.print(mensaje.texto);
			
		}
	}
	
	static Connection obtenerconexion(){
		Connection cn=null;
		try{
			Class.forName(driver);
			cn=DriverManager.getConnection(cadenacon,"developer","developer");
		}
		catch(Exception e){e.printStackTrace();}
		return cn;
	}
	static ArrayList<Mensaje> getMensajes(String destino){
		
		ArrayList<Mensaje> lista = new ArrayList<Mensaje>();
		Connection cn=null;
		Statement st;
		ResultSet rs;
		try{
			cn=obtenerconexion();
			st=cn.createStatement();
			String tsql;
			tsql="select * from mensajes where destino='"+
			destino+"'";
			rs=st.executeQuery(tsql);
			lista=new ArrayList<Mensaje>();
			Mensaje mensaje = new Mensaje();
			while(rs.next()){
				mensaje.remitente=  rs.getString("remitente");
				mensaje.texto=  rs.getString("texto");
				mensaje.destino=  rs.getString("destino");
				lista.add(mensaje);
			}
			cn.close();
			//
			}
		
			catch(Exception e){e.printStackTrace();}
			return(lista);
		}
}