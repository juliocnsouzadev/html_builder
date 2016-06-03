package br.com.juliocnsouza.htmlbuilder;

/**
 *
 * @author julio
 */
public abstract class AbstractBuilder {

    private final StringBuilder builder;

    public AbstractBuilder() {
        builder = new StringBuilder();
    }

    protected StringBuilder getBuilder() {
        return builder;
    }

    public abstract String build();

}
