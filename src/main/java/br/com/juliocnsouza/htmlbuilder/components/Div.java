package br.com.juliocnsouza.htmlbuilder.components;

import br.com.juliocnsouza.htmlbuilder.HtmlComponent;

/**
 *
 * @author julio
 */
public class Div extends HtmlComponent {

    @Override
    public String build() {
        return getBuilder()
                .append( "<div " )
                .append( getAttributes() )
                .append( ">" )
                .append( getComponentContent() )
                .append( buildComponents() )
                .append( "</div>" )
                .toString();
    }

}
