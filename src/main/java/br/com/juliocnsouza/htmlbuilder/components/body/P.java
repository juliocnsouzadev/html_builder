package br.com.juliocnsouza.htmlbuilder.components.body;

/**
 *
 * @author julio
 */
public class P extends HtmlComponentBuilder {

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
