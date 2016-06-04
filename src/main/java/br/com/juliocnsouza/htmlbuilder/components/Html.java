package br.com.juliocnsouza.htmlbuilder.components;

import br.com.juliocnsouza.htmlbuilder.components.body.HtmlComponentBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julio
 */
public class Html extends AbstractBuilder {

    private final Head head;
    private final List<HtmlComponentBuilder> components;
    private final List<String> scripts;
    private final List<String> links;

    public Html() {
        head = new Head();
        components = new ArrayList<>();
        scripts = new ArrayList<>();
        links = new ArrayList<>();
    }

    public Head getHead() {
        return head;
    }

    public Html addComponent( HtmlComponentBuilder component ) {
        if ( component == null ) {
            return this;
        }
        components.add( component );
        return this;
    }

    public Html addScript( String script ) {
        if ( script == null ) {
            return this;
        }
        scripts.add( "<script>" + script + "</script>" );
        return this;
    }

    public Html addLinkJS( String src ) {
        if ( src == null ) {
            return this;
        }
        links.add( "<script type=\"text/javascript\" src=\"" + src + "\"></script>" );
        return this;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append( "<!DOCTYPE html><html>" );
        builder.append( head.build() );
        builder.append( "<body>" );
        builder.append( buildComponents() );
        builder.append( buildScripts() );
        builder.append( buildJSLInks() );
        builder.append( "</body>" );
        builder.append( "</html>" );
        return builder.toString();
    }

    private String buildComponents() {
        StringBuilder componentsBuilder = new StringBuilder( "" );
        if ( !components.isEmpty() ) {
            components.stream()
                    .filter( component -> component != null )
                    .forEach( ( component ) -> {
                        componentsBuilder.append( component.build() );
                    } );
        }
        return componentsBuilder.toString();
    }

    private String buildScripts() {
        StringBuilder scriptBuildersBuilder = new StringBuilder( "" );
        if ( !scripts.isEmpty() ) {
            scripts.stream()
                    .filter( script -> script != null )
                    .forEach( ( script ) -> {
                        scriptBuildersBuilder.append( script );
                    } );
        }
        return scriptBuildersBuilder.toString();
    }

    private String buildJSLInks() {
        StringBuilder scriptBuildersBuilder = new StringBuilder( "" );
        if ( !links.isEmpty() ) {
            links.stream()
                    .filter( script -> script != null )
                    .forEach( ( script ) -> {
                        scriptBuildersBuilder.append( script );
                    } );
        }
        return scriptBuildersBuilder.toString();
    }

}
