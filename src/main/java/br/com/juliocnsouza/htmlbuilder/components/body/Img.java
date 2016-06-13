package br.com.juliocnsouza.htmlbuilder.components.body;

/**
 *
 * @author julio
 */
public class Img extends HtmlComponentBuilder {

    private final String src;

    private final String alt;

    public Img( String src , String alt ) {
        this.src = src;
        this.alt = alt;
    }

    public String getAlt() {
        return alt != null
               ? "alt=\"" + alt + "\""
               : "";
    }

    @Override
    public String build() {
        return getBuilder()
                .append( "<img " )
                .append( getSrcAttr() )
                .append( " " )
                .append( getAltAttr() )
                .append( getAttributes() )
                .append( ">" )
                .append( getComponentContent() )
                .append( buildComponents() )
                .append( "</img>" )
                .toString();
    }

    private String getSrcAttr() {
        return src != null
               ? "src=\"" + src + "\""
               : "";
    }

    private String getAltAttr() {
        return alt != null
               ? "alt=\"" + alt + "\""
               : "";
    }

    public String getSrc() {
        return src != null
               ? "src=\"" + src + "\""
               : "";
    }

}
