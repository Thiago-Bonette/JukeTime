/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.GeneroDTO;
import VIEW.DashBoard;
import DTO.MusicaDTO;
import DTO.RecomendacaoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RecomendacaoDAO {
    
Connection con;
PreparedStatement pstm;
//PreparedStatement pstm2;
ArrayList<RecomendacaoDTO> lista = new ArrayList<>();   
//ArrayList<RecomendacaoDTO> lista2 = new ArrayList<>();
//ArrayList<RecomendacaoDTO> lista3 = new ArrayList<>();
    

      public ArrayList<RecomendacaoDTO> PostoMusicas(int id){
          
       String sql = "SELECT AVG(`avaliacao`) AS avaliacao, `musica`, `nome_Musica`, `genderId`, `usuario` FROM `avaliacao` INNER JOIN `musicas` ON `avaliacao`.`musica` = `musicas`.`musicId` AND `musicas`.`musicId` = `avaliacao`.`musica` WHERE `usuario` != ? GROUP BY (`musica`) ORDER BY AVG(`avaliacao`)DESC";
       con = new ConexaoDAO().conectaBD();
       
        try {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
           
            while(rs.next()){
               RecomendacaoDTO objrecomendacaoDTO = new RecomendacaoDTO();
               objrecomendacaoDTO.setNome_musica(rs.getString("nome_Musica"));
               objrecomendacaoDTO.setAvaliacao(rs.getDouble("avaliacao"));
               lista.add(objrecomendacaoDTO);
            }
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao listar Recomendadas: "+erro);
        }
       
       return lista;
      }
      
}   

    