package negocio;
import java.sql.*;
import javabeans.*;
import java.util.*;
public class Operaciones {
	
	private String driver, cadenacon;
	
	public Operaciones(String driver, String cadenacon) {
		this.driver=driver;
		this.cadenacon=cadenacon;
		}
	public Connection obtenerconexion(){
		Connection cn=null;
		try{
			Class.forName(driver);
			cn=DriverManager.getConnection(cadenacon,"developer","developer");
		}
		catch(Exception e){e.printStackTrace();}
		return cn;
	}
	
	public ArrayList<MensajeForm> getMensajes(String destino){
		Connection cn=null;
		ArrayList<MensajeForm> lista=null;
		Statement st;
		ResultSet rs;
		try{
			cn=obtenerconexion();
			st=cn.createStatement();
			String tsql;
			tsql="select * from mensajes where destino='"+ destino+"'";
			rs=st.executeQuery(tsql);
			lista=new ArrayList<MensajeForm>();
			while(rs.next()){
				MensajeForm m=new MensajeForm(rs.getString("remitente"),
										      rs.getString("destino"),
											  rs.getString("texto"));
				
				lista.add(m);
			}
			cn.close();
			}
			catch(Exception e){e.printStackTrace();}
			return(lista);
		}
	
	public void registro(MensajeForm m){
		Connection cn;
		Statement st;
		ResultSet rs;
		try{
			cn=obtenerconexion();
			st=cn.createStatement();
			String tsql;
			tsql="insert into mensajes values('";
			tsql+=m.getDestino()+"','" + m.getRemite()+"','"+ m.getTexto()+"')";
			st.execute(tsql);
			cn.close();
			
		}
		catch(Exception e){e.printStackTrace();}
		}
	}