/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.juliocnsouza.htmlbuilder.sample;

import br.com.juliocnsouza.htmlbuilder.components.Html;
import br.com.juliocnsouza.htmlbuilder.components.body.A;
import br.com.juliocnsouza.htmlbuilder.components.body.Div;
import br.com.juliocnsouza.htmlbuilder.components.body.H;
import br.com.juliocnsouza.htmlbuilder.components.body.HtmlComponentBuilder;
import br.com.juliocnsouza.htmlbuilder.components.body.Img;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julio
 */
public class DefaultEmailHtml {

    private final Html html;

    private final Header header;

    private final FooterInfo footerInfo;

    private final List<HtmlComponentBuilder> componets;

    public DefaultEmailHtml( FooterInfo footerInfo ) {
        this.html = new Html();
        this.header = new Header();
        this.footerInfo = footerInfo;
        componets = new ArrayList<>();
    }

    public DefaultEmailHtml addBodyComponet( HtmlComponentBuilder component ) {
        if ( component != null ) {
            componets.add( component );
        }
        return this;
    }

    public DefaultEmailHtml addImg( String src , String alt ) {
        this.header.getImg().addComponent( new Img( src , alt ).setStyle( "width:75%;" )
        );
        return this;
    }

    public DefaultEmailHtml addTitle( String title ) {
        this.header.getTitle().setComponentContent( title );
        return this;
    }

    public DefaultEmailHtml addSentence( String sentence ) {
        this.header.getSentence().setComponentContent( sentence );
        return this;
    }

    public DefaultEmailHtml addActionLink( String href , String content ) {
        this.header.getActionLink().addComponent( new A( href , "" )
                .setStyle( "text-decoration:none;color:white" )
                .addComponent( new H( H.Type.H4 )
                        .setComponentContent( content )
                        .setStyle( "color:white" ) ) );
        return this;
    }

    public Html build() {
        Div container = new Div();
        container.setStyle( "width:70%;margin: 0 auto;font-family:arial;" );
        container.addComponent( header.build() );
        componets.stream().forEach( ( componet ) -> {
            container.addComponent( componet );
        } );
        container.addComponent( footerInfo.getDivFooter() );
        html.addComponent( container );
        return html;
    }

}
