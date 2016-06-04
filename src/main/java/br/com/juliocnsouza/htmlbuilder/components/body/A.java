package br.com.juliocnsouza.htmlbuilder.components.body;

/**
 *
 * @author julio
 */
public class A extends HtmlComponentBuilder {

    private final String href;

    public A( String href , String content ) {
        this.href = href != null
                    ? href
                    : "www.juliocnsouza.com.br";
        setComponentContent( content != null
                             ? content
                             : "Julio CN Souza :)" );
    }

    @Override
    public String build() {
        return getBuilder()
                .append( "<a href=\"" )
                .append( href )
                .append( "\"" )
                .append( getAttributes() )
                .append( ">" )
                .append( getComponentContent() )
                .append( buildComponents() )
                .append( "</a>" )
                .toString();
    }

}
