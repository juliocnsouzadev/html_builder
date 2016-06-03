package br.com.juliocnsouza.htmlbuilder.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author julio
 */
public class AssetReader {

    private FileReader fileReader;

    private final StringBuilder fileContentBuilder;

    private final String filePath;

    public AssetReader( String filePath , boolean localApp )
            throws FileNotFoundException {
        this.filePath = filePath;
        fileContentBuilder = new StringBuilder();
        init( localApp );

    }

    public FileReader getFileReader() {
        return fileReader;
    }

    private void init( boolean localApp )
            throws FileNotFoundException {
        String path = filePath;
        if ( !localApp ) {
            path = getClass().getResource( filePath ).getPath();
        }
        File file = new File( path );
        fileReader = new FileReader( file );
    }

    public String getFileContent()
            throws IOException {
        BufferedReader bufferedReader = new BufferedReader( fileReader );
        String linha = bufferedReader.readLine();
        while ( linha != null ) {
            fileContentBuilder.append( linha );
            linha = bufferedReader.readLine();
        }
        return fileContentBuilder.toString();
    }
}
