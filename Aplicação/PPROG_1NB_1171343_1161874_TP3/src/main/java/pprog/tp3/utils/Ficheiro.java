package pprog.tp3.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import pprog.tp3.model.Cliente;


/**
 *
 * @author António (1171343)
 */
public class Ficheiro {
    
    public static final String NOME_FICHEIRO = "Cliente.ltf";

    public static final String SERVICO = "Servicos";
    
    public Ficheiro(){
        
    }
    
    /*public boolean gravar(Cliente cliente) {
        return gravar (new File(NOME_FICHEIRO), cliente);
    }
    
    public boolean gravar(String ficheiro, Cliente cliente) {
        return gravar (new File(ficheiro), cliente);
    }
    */
    
    /**
     * retorna informação de um ficheiro
     */
    
    public static List<ArrayList<String>> getInfoFicheiro(String filePath) {
        List<ArrayList<String>> data = new ArrayList<>();
        File file = new File(filePath);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String[] lineData = scanner.nextLine().split(";");
                ArrayList<String> line = new ArrayList<>();
                for (String item : lineData) {
                    line.add(item);
                }
                data.add(line);
                scanner.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return data;
    }
    
    public boolean gravarObj(Cliente obj, File ficheiro ){
            try{
                ObjectOutputStream objCliente = new ObjectOutputStream(new FileOutputStream(ficheiro));
            
                try{
                  
                    objCliente.writeObject(obj);
                }finally{
                    objCliente.close();
                }
                return true;
                    
            } catch (IOException e){
                return false;
            }
    }
    
    public Cliente lerObj() {
        return lerObj(new File(NOME_FICHEIRO));
    }

    public Cliente lerObj(String nomeFicheiro) {
        return lerObj(new File(nomeFicheiro));
    }
    public Cliente lerObj (File ficheiro){
        Cliente cliente;
        try{
            ObjectInputStream lerFicheiro = new ObjectInputStream(new FileInputStream(ficheiro));
            try{
                cliente = (Cliente) lerFicheiro.readObject();
            }finally{
                lerFicheiro.close();
            }
            return cliente;
        }catch(IOException | ClassNotFoundException e){
            return new Cliente();
        }
    }
    
    
}
