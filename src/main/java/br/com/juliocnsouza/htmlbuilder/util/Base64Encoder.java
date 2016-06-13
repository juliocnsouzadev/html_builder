package br.com.juliocnsouza.htmlbuilder.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;

/**
 *
 * @author julio
 */
public class Base64Encoder {

    private final File file;

    public Base64Encoder( File file ) {
        this.file = file;
    }

    public String encode()
            throws FileNotFoundException ,
                   IOException {
        FileInputStream fileInputStreamReader = new FileInputStream( file );
        byte[] bytes = new byte[ ( int ) file.length() ];
        fileInputStreamReader.read( bytes );
        return getPrefix( file.getName() ) + ", " + Base64.getEncoder().encodeToString( bytes );
    }

    private String getPrefix( String fileName ) {
        if ( fileName == null ) {
            return "";
        }
        String[] split = fileName.split( "\\." );
        if ( split == null || split.length != 2 ) {
            return "";
        }
        String sufix = split[1].toLowerCase();
        switch ( sufix ) {
            case "jpg":
                return "data:image/" + sufix + ";base64";
            case "png":
                return "data:image/" + sufix + ";base64";
            case "gif":
                return "data:image/" + sufix + ";base64";
            case "tif":
                return "data:image/" + sufix + ";base64";
            default:
                return "data:application/" + sufix + ";base64";
        }
    }

}
