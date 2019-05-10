package com.bolsadeideas.springboot.backend.apirest.commons;

import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;

public class Utils {
    public static Boolean grabarFichero(MultipartFile archivo,String nombreArchivo){
        FileOutputStream os = null;
        try{
            os = new FileOutputStream(Constantes.PATH + archivo.getOriginalFilename());
            os.write(archivo.getBytes());
            return true;

        }catch (Exception ex){
            return false;
        }
    }
}
