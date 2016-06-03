package br.com.juliocnsouza.htmlbuilder.components;

import br.com.juliocnsouza.htmlbuilder.HtmlComponent;

/**
 *
 * @author julio
 */
public class H extends HtmlComponent {

    private final Type type;

    public enum Type {
        H1( "h1" ),
        H2( "h2" ),
        H3( "h3" ),
        H4( "h4" ),
        H5( "h5" ),
        H6( "h6" );

        private final String value;

        Type( String value ) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }

    public H( Type type ) {
        this.type = type != null
                    ? type
                    : Type.H1;
    }

    @Override
    public String build() {
        return getBuilder().append( "<" )
                .append( type.value )
                .append( getAttributes() )
                .append( ">" )
                .append( getComponentContent() )
                .append( buildComponents() )
                .append( "</" )
                .append( type.value )
                .append( ">" )
                .toString();
    }

}
