package br.com.juliocnsouza.htmlbuilder.util;

import java.io.File;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author julio
 */
public class Base64EncoderTest {

    public Base64EncoderTest() {
    }

    @Test
    public void testEncode()
            throws Exception {
        System.out.println( "encode" );
        Base64Encoder encoder = new Base64Encoder( new File( "grandpa.jpg" ) );
        String result = encoder.encode();
        System.out.println( result );
        Assert.assertTrue( result != null );
        Assert.assertTrue( result.startsWith( "data:image/jpg" ) );
    }

}
