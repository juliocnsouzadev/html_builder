package br.com.juliocnsouza.htmlbuilder;

import br.com.juliocnsouza.htmlbuilder.cdn.Bootstrap;
import br.com.juliocnsouza.htmlbuilder.classes.Classes;
import br.com.juliocnsouza.htmlbuilder.components.Div;
import br.com.juliocnsouza.htmlbuilder.components.H;
import br.com.juliocnsouza.htmlbuilder.components.Html;
import br.com.juliocnsouza.htmlbuilder.util.AssetReader;
import org.junit.Assert;
import org.junit.Test;

public class HtmlTest {

    public HtmlTest() {
    }

    @Test
    public void testBuildWithCDN() {
        System.out.println( "build cdn" );
        Html html = new Html();
        html.getHead().addTitle( "HTML Java" );
        html.getHead().addMetaTag( "pragma" , "no-cache" );
        html.getHead().addStyleSheet( Bootstrap.CSS );
        html.addLinkJS( Bootstrap.JS );

        Div container = new Div();
        container.setClass( "container" );

        Div row = new Div();
        row.setBootstrapClasses( Classes.ROW , Classes.BTN_DANGER );
        row.setStyle( "padding:50px" );

        Div col1 = new Div();
        col1.setBootstrapClasses( Classes.COL_LG_4 , Classes.BTN_INFO );
        H h1 = new H( H.Type.H1 );
        h1.setComponentContent( "colum 01" );
        col1.addComponent( h1 );

        Div col2 = new Div();
        col2.setBootstrapClasses( Classes.COL_LG_4 , Classes.BTN_SUCCESS );
        H h2 = new H( H.Type.H1 );
        h2.setComponentContent( "colum 02" );
        col2.addComponent( h2 );

        Div col3 = new Div();
        col3.setBootstrapClasses( Classes.COL_LG_4 , Classes.BTN_PRIMARY );
        H h3 = new H( H.Type.H1 );
        h3.setComponentContent( "colum 03" );
        col3.addComponent( h3 );

        row.addComponent( col1 );
        row.addComponent( col2 );
        row.addComponent( col3 );

        container.addComponent( row );

        html.addComponent( container );

        String htmlTxt = html.build();
        System.out.println( "html" );
        System.out.println( htmlTxt );
        Assert.assertTrue( htmlTxt != null );
    }

    @Test
    public void testBuildWithFile()
            throws Exception {

        AssetReader css = new AssetReader( "src\\main\\resources\\META-INF\\bootstrap\\css\\bootstrap.min.css" , true );
        AssetReader js = new AssetReader( "src\\main\\resources\\META-INF\\bootstrap\\js\\bootstrap.min.js" , true );

        System.out.println( "build with file" );
        Html html = new Html();
        html.getHead().addTitle( "HTML Java" );
        html.getHead().addMetaTag( "pragma" , "no-cache" );
        html.getHead().addStyle( css.getFileContent() );
        html.addScript( js.getFileContent() );

        Div container = new Div();
        container.setClass( "container" );

        Div div1 = new Div();
        div1.setComponentContent( "Div 1" );
        div1.setClass( "jumbotron" );
        div1.setBackground( "#F44336" );
        div1.setStyle( "width:20%" );

        Div div2 = new Div();
        div2.setComponentContent( "Div 2" );
        div2.setBackground( "#F44336" );
        div2.setClass( "btn btn-block btn-primary" );
        div2.setStyle( "width:30%" );

        container.addComponent( div1 );
        container.addComponent( div2 );

        html.addComponent( container );

        String htmlTxt = html.build();
        System.out.println( "html" );
        System.out.println( htmlTxt );
        Assert.assertTrue( htmlTxt != null );
    }

}
