package com.sinfloo.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Persona p = new Persona();

    public List listar() {
        List<Persona> datos = new ArrayList<>();
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement("select * from expediente");
            rs = ps.executeQuery();
            while (rs.next()) {
                Persona p = new Persona();
                
                p.setId(rs.getInt(1));
                p.setNumExpediente(rs.getString(2));
                p.setNumJuez(rs.getString(3));
                p.setMateria(rs.getString(4));
                p.setTipoCaso(rs.getString(5));
                p.setDemandante(rs.getString(6));
                p.setDemandado(rs.getString(7));
                p.setFechaInicio(rs.getString(8));
                
                datos.add(p);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return datos;
    }
    public int agregar(Persona per) {  
        int r=0;
        String sql="insert into expediente(num_exp,num_juez,materia,tipo_caso,demandante,demandado,fecha_inicio)values(?,?,?,?,?,?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1,per.getNumExpediente());
            ps.setString(2,per.getNumJuez());
            ps.setString(3,per.getMateria());
            ps.setString(4,per.getTipoCaso());
            ps.setString(5,per.getDemandante());
            ps.setString(6,per.getDemandado());
            ps.setString(7,per.getFechaInicio());
           
            r=ps.executeUpdate();    
            if(r==1){
                return 1;
            }
            else{
                return 0;
            }
        } catch (Exception e) {
            System.out.println(e);
        }  
        return r;
    }
    public int Actualizar(Persona per) {  
        int r=0;
        String sql="update expediente set num_exp=?,num_juez=?,materia=?,tipo_caso=?,demandante=?,demandado=?,fecha_inicio=? where id=?";        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);            
            ps.setString(1,per.getNumExpediente());
            ps.setString(2,per.getNumJuez());
            ps.setString(3,per.getMateria());
            ps.setString(4,per.getTipoCaso());
            ps.setString(5,per.getDemandante());
            ps.setString(6,per.getDemandado());
            ps.setString(7,per.getFechaInicio());
            ps.setInt(8,per.getId());
            r=ps.executeUpdate();    
            if(r==1){
                return 1;
            }
            else{
                return 0;
            }
        } catch (Exception e) {
            System.out.println(e);
        }  
        return r;
    }
    public int Delete(int id){
        int r=0;
        String sql="delete from expediente where Id="+id;
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            r= ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }
}
