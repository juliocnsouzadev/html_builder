package br.com.juliocnsouza.htmlbuilder;

import br.com.juliocnsouza.htmlbuilder.bootstrap.CDN;
import br.com.juliocnsouza.htmlbuilder.components.Html;
import br.com.juliocnsouza.htmlbuilder.components.body.A;
import br.com.juliocnsouza.htmlbuilder.components.body.Div;
import br.com.juliocnsouza.htmlbuilder.components.body.H;
import br.com.juliocnsouza.htmlbuilder.components.body.HtmlComponentBuilder;
import br.com.juliocnsouza.htmlbuilder.components.body.P;
import br.com.juliocnsouza.htmlbuilder.util.AssetReader;
import br.com.juliocnsouza.htmlbuilder.util.Writer;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

import static br.com.juliocnsouza.htmlbuilder.bootstrap.Classes.*;

public class HtmlTest {

    public HtmlTest() {
    }

    @Test
    public void testBuildWithCDN()
            throws Exception {
        System.out.println( "build with cdn" );

        Html html = new Html()
                .addScript( CDN.JS )
                .addComponent( getContainer() );
        html.getHead()
                .addTitle( "HTML Java" )
                .addMetaTag( "pragma" , "no-cache" )
                .addStyle( CDN.CSS );

        String htmlTxt = html.build();
        Writer.write( "test_cdn" , "html" , Arrays.asList( htmlTxt ) );
        Assert.assertTrue( htmlTxt != null );
    }

    @Test
    public void testBuildWithReadAssets()
            throws Exception {

        AssetReader css = new AssetReader( "src\\main\\resources\\META-INF\\bootstrap\\css\\bootstrap.min.css" , true );
        AssetReader js = new AssetReader( "src\\main\\resources\\META-INF\\bootstrap\\js\\bootstrap.min.js" , true );

        System.out.println( "build with readed assets" );

        Html html = new Html()
                .addScript( js.getFileContent() )
                .addComponent( getContainer() );
        html.getHead()
                .addTitle( "HTML Java" )
                .addMetaTag( "pragma" , "no-cache" )
                .addStyle( css.getFileContent() );

        String htmlTxt = html.build();
        Writer.write( "test_assets_incorporated" , "html" , Arrays.asList( htmlTxt ) );
        Assert.assertTrue( htmlTxt != null );
    }

    private HtmlComponentBuilder getContainer() {
        return new Div()
                .setBootstrapClasses( CONTAINER )
                .addComponent( getHeader() )
                .addComponent( getBody() );
    }

    private HtmlComponentBuilder getHeader() {
        return new Div()
                .setBootstrapClasses( JUMBOTRON )
                .addComponent( getTitle() ).
                addComponent( getTitleParagrath() );
    }

    private HtmlComponentBuilder getTitle() {
        return new H( H.Type.H1 )
                .setComponentContent( "Java HTML Builder With Bootstrap" );
    }

    private HtmlComponentBuilder getTitleParagrath() {
        return new P()
                .setComponentContent( "You can buid nice html generated emails" );
    }

    private HtmlComponentBuilder getBody() {
        return new Div()
                .addComponent( new Div()
                        .setBootstrapClasses( ROW )
                        .setStyle( "padding:10px" )
                        .addComponent( new Div()
                                .setBootstrapClasses( COL_LG_4 )
                                .setStyle( "text-align:center" )
                                .addComponent( new H( H.Type.H2 )
                                        .setComponentContent( "Simple Columm col-lg-4" ) ) )
                        .addComponent( new A( "github.com" , "Click ;)" )
                                .setBootstrapClasses( COL_LG_4 , BTN , BTN_LG , BTN_PRIMARY )
                                .setStyle( "text-align:center" ) )
                        .addComponent( new Div()
                                .setBootstrapClasses( COL_LG_4 )
                                .setStyle( "padding:2px" )
                                .addComponent( new P()
                                        .setComponentContent( getLoremIpsum() ) ) ) )
                .addComponent( new Div()
                        .setBootstrapClasses( ROW )
                        .setStyle( "padding:10px" )
                        .addComponent( new A( "github.com" , "Click ;)" )
                                .setBootstrapClasses( COL_LG_4 , BTN , BTN_LG , BTN_INFO )
                                .setStyle( "text-align:center" ) )
                        .addComponent( new Div()
                                .setBootstrapClasses( COL_LG_6 )
                                .setStyle( "padding:2px" )
                                .addComponent( new P()
                                        .setComponentContent( getLoremIpsum() ) ) ) );
    }

    private static String getLoremIpsum() {
        return "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
    }

}
