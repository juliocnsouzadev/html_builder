package br.com.juliocnsouza.htmlbuilder.components;

import br.com.juliocnsouza.htmlbuilder.AbstractBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julio
 */
public class Head extends AbstractBuilder {

    private final String headOpen;
    private final String headClose;
    private String title;
    private String style;
    private final List<String> metaTags;
    private final List<String> links;

    public Head() {
        headOpen = "<head><meta charset=\"UTF-8\">";
        headClose = "</head>";
        metaTags = new ArrayList<>();
        links = new ArrayList<>();
    }

    public void addMetaTag( String name , String content ) {
        if ( name != null && content != null ) {
            metaTags.add( "<meta name=\"" + name + "\" content=\"" + content + "\">" );
        }
    }

    public void addTitle( String title ) {
        if ( title != null ) {
            this.title = "<title>" + title + "</title>";
        }
    }

    public void addStyle( String style ) {
        if ( style != null ) {
            this.style = "<style>" + style + "</style>";
        }
    }

    public void addStyleSheet( String href ) {
        if ( href != null ) {
            links.add( "<link rel=\"stylesheet\" href=\"" + href + "\">" );
        }
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append( headOpen );
        if ( !metaTags.isEmpty() ) {
            metaTags.stream().forEach( m -> builder.append( m ) );
        }
        if ( !links.isEmpty() ) {
            links.stream().forEach( l -> builder.append( l ) );
        }
        if ( style != null ) {
            builder.append( style );
        }
        if ( title != null ) {
            builder.append( title );
        }
        builder.append( headClose );
        return builder.toString();
    }

}
