/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBEngine;

import ClassSource.DoanhNghiep;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DBEngine {
    public Object docFile(String file) {
        FileInputStream f = null;
        ObjectInputStream input = null;
        Object o = null;
        try{
            f = new FileInputStream(file);
           input = new ObjectInputStream(f);
           o = input.readObject();
           f.close();
           input.close();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        return o;
    }
    public void luuFile(String file,Object o){
        FileOutputStream f = null;
        ObjectOutputStream output = null;
        
        try{
            f = new FileOutputStream(file);
            output = new ObjectOutputStream(f);
            output.writeObject(o);
            f.close();
            output.close();
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
