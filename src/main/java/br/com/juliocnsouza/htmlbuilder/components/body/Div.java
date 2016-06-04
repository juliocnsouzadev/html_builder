package br.com.juliocnsouza.htmlbuilder.components.body;

/**
 *
 * @author julio
 */
public class Div extends HtmlComponentBuilder {

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
