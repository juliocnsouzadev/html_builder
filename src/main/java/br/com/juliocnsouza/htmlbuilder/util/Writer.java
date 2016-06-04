package br.com.juliocnsouza.htmlbuilder.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author julio
 */
public class Writer {

    public static File write( String name , String extension , List<String> lines )
            throws IOException {
        Path write = Files.write( Paths.get( name + "." + extension ) , lines );
        return write.toFile();
    }

}
