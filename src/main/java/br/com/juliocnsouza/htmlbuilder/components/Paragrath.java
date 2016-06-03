package br.com.juliocnsouza.htmlbuilder.components;

import br.com.juliocnsouza.htmlbuilder.HtmlComponent;

/**
 *
 * @author julio
 */
public class Paragrath extends HtmlComponent {

    @Override
    public String build() {
        return getBuilder()
                .append( "<p " )
                .append( getAttributes() )
                .append( ">" )
                .append( getComponentContent() )
                .append( buildComponents() )
                .append( "</p>" )
                .toString();
    }

}
