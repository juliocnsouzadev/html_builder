package br.com.juliocnsouza.htmlbuilder.sample;

import br.com.juliocnsouza.htmlbuilder.components.body.Div;
import br.com.juliocnsouza.htmlbuilder.components.body.H;
import br.com.juliocnsouza.htmlbuilder.components.body.HtmlComponentBuilder;

/**
 *
 * @author julio
 */
public class FooterInfo {

    private final String footerFirsLine;
    private final String footerSecondLine;
    private final String email;

    public FooterInfo( String footerFirsLine , String footerSecondLine , String email ) {
        this.footerFirsLine = footerFirsLine;
        this.footerSecondLine = footerSecondLine;
        this.email = email;
    }

    public HtmlComponentBuilder buidFooter( HtmlComponentBuilder component ) {
        component.addComponent( getDivFooter() );
        return component;
    }

    public HtmlComponentBuilder getDivFooter() {
        return new Div()
                .setStyle(
                        "padding-top: 30px;padding-bottom: 30px;margin-bottom: 30px;color: inherit;background-color: #eee;padding-right: 60px;padding-left: 60px;border-radius: 6px;font-family:arial;text-align:center" )
                .addComponent( new H( H.Type.H4 )
                        .setComponentContent( footerFirsLine )
                )
                .addComponent( new H( H.Type.H5 )
                        .setComponentContent( footerSecondLine )
                )
                .addComponent( new H( H.Type.H5 )
                        .setComponentContent( email )
                );
    }

    public String getFooterSecondLine() {
        return footerSecondLine;
    }

    public String getFooterFirsLine() {
        return footerFirsLine;
    }

    public String getEmail() {
        return email;
    }
}
