/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.juliocnsouza.htmlbuilder.sample;

import br.com.juliocnsouza.htmlbuilder.bootstrap.Style;
import br.com.juliocnsouza.htmlbuilder.components.body.A;
import br.com.juliocnsouza.htmlbuilder.components.body.Div;
import br.com.juliocnsouza.htmlbuilder.components.body.H;
import br.com.juliocnsouza.htmlbuilder.components.body.Img;

/**
 *
 * @author julio
 */
public class Header {

    private final Div header;
    private final Div img;
    private final H title;
    private final H sentence;
    private final Div actionLink;

    public Header() {
        this.header = new Div();
        initHeaderStyle();
        this.img = new Div();
        initImgStyle();
        this.title = new H( H.Type.H1 );
        this.sentence = new H( H.Type.H3 );
        this.actionLink = new Div();
        initActionStyle();
    }

    private void initActionStyle() {
        this.actionLink.setStyle( Style.PRIMARY_BUTTON );
    }

    private void initImgStyle() {
        this.img.setStyle(
                "border: 0;vertical-align: middle;page-break-inside: avoid;display: block;max-width: 100%!important;height: auto;text-align:center" );
    }

    private void initHeaderStyle() {
        this.header.setStyle( Style.JUMBTRON );
    }

    public Header addImg( String src , String alt ) {
        img.addComponent( new Img( src , alt ).setStyle( "width:75%;" )
        );
        return this;
    }

    public Header addTitle( String title ) {
        this.title.setComponentContent( title );
        return this;
    }

    public Header addSentence( String sentence ) {
        this.sentence.setComponentContent( sentence );
        return this;
    }

    public Header addActionLink( String href , String content ) {
        actionLink.addComponent( new A( href , "" )
                .setStyle( "text-decoration:none;color:white" )
                .addComponent( new H( H.Type.H4 )
                        .setComponentContent( content )
                        .setStyle( "color:white" ) ) );
        return this;
    }

    public Div build() {
        buildComponents();
        return header;
    }

    private void buildComponents() {
        header
                .addComponent( img )
                .addComponent( title )
                .addComponent( sentence )
                .addComponent( actionLink );
    }

    public Div getHeader() {
        return header;
    }

    public Div getImg() {
        return img;
    }

    public H getTitle() {
        return title;
    }

    public H getSentence() {
        return sentence;
    }

    public Div getActionLink() {
        return actionLink;
    }

}
