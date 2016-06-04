package br.com.juliocnsouza.htmlbuilder;

import br.com.juliocnsouza.htmlbuilder.classes.Classes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author julio
 */
public abstract class HtmlComponent extends AbstractBuilder {

    private String accesskey;
    private String align;
    private String background;
    private String bgcolor;
    private String _class;
    private String contenteditable;
    private String contextmenu;
    private String draggable;
    private String height;
    private String hidden;
    private String id;
    private String item;
    private String itemprop;
    private String spellcheck;
    private String style;
    private String subject;
    private String tabindex;
    private String title;
    private String valign;
    private String width;
    private String componentContent;
    private final List<HtmlComponent> components;

    public HtmlComponent() {
        components = new ArrayList<>();
    }

    public HtmlComponent addComponent( HtmlComponent component ) {
        if ( component != null ) {
            components.add( component );
        }
        return this;
    }

    protected String buildComponents() {
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

    public String getAccesskey() {
        return accesskey;
    }

    public String getAlign() {
        return align;
    }

    public String getBackground() {
        return background;
    }

    public String getBgcolor() {
        return bgcolor;
    }

    public String getClass_() {
        return _class;
    }

    public String getContenteditable() {
        return contenteditable;
    }

    public String getContextmenu() {
        return contextmenu;
    }

    public String getDraggable() {
        return draggable;
    }

    public String getHeight() {
        return height;
    }

    public String getHidden() {
        return hidden;
    }

    public String getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    public String getItemprop() {
        return itemprop;
    }

    public String getSpellcheck() {
        return spellcheck;
    }

    public String getStyle() {
        return style;
    }

    public String getSubject() {
        return subject;
    }

    public String getTabindex() {
        return tabindex;
    }

    public String getTitle() {
        return title;
    }

    public String getValign() {
        return valign;
    }

    public String getWidth() {
        return width;
    }

    public HtmlComponent setAccesskey( String accesskey ) {
        if ( accesskey != null ) {
            this.accesskey = "accesskey=\"" + accesskey + "\"";
        }
        return this;
    }

    public HtmlComponent setAlign( String align ) {
        if ( align != null ) {
            this.align = "align=\"" + align + "\"";
        }
        return this;
    }

    public HtmlComponent setBackground( String background ) {
        if ( background == null ) {
            return this;
        }
        this.background = "background=\"" + background + "\"";
        return this;
    }

    public HtmlComponent setBgcolor( String bgcolor ) {
        if ( bgcolor == null ) {
            return this;
        }
        this.bgcolor = "bgcolor=\"" + bgcolor + "\"";
        return this;
    }

    public HtmlComponent setClass( String _class ) {
        if ( _class == null ) {
            return this;
        }
        this._class = "class=\"" + _class + "\"";
        return this;
    }

    public HtmlComponent setBootstrapClasses( Classes... classes ) {
        if ( classes == null ) {
            return this;
        }
        StringBuilder builder = new StringBuilder( "class=\"" );
        for ( Classes bootClazz : classes ) {
            if ( bootClazz == null ) {
                continue;
            }
            builder.append( bootClazz.getValue() ).append( " " );
        }
        builder.append( "\"" );
        this._class = builder.toString();
        return this;
    }

    public HtmlComponent setContenteditable( String contenteditable ) {
        if ( contenteditable == null ) {
            return this;
        }
        this.contenteditable = "contenteditable=\"" + contenteditable + "\"";
        return this;
    }

    public HtmlComponent setContextmenu( String contextmenu ) {
        if ( contextmenu == null ) {
            return this;
        }
        this.contextmenu = "contextmenu=\"" + contextmenu + "\"";
        return this;
    }

    public HtmlComponent setDraggable( String draggable ) {
        if ( draggable == null ) {
            return this;
        }
        this.draggable = "draggable=\"" + draggable + "\"";
        return this;
    }

    public HtmlComponent setHeight( String height ) {
        if ( height == null ) {
            return this;
        }
        this.height = "height=\"" + height + "\"";
        return this;
    }

    public HtmlComponent setHidden( String hidden ) {
        if ( hidden == null ) {
            return this;
        }
        this.hidden = "hidden=\"" + hidden + "\"";
        return this;
    }

    public HtmlComponent setId( String id ) {
        if ( id == null ) {
            return this;
        }
        this.id = "hidden=\"" + id + "\"";
        return this;
    }

    public HtmlComponent setItem( String item ) {
        if ( item == null ) {
            return this;
        }
        this.item = "item=\"" + item + "\"";
        return this;
    }

    public HtmlComponent setItemprop( String itemprop ) {
        if ( itemprop == null ) {
            return this;
        }
        this.itemprop = "itemprop=\"" + itemprop + "\"";
        return this;
    }

    public HtmlComponent setSpellcheck( String spellcheck ) {
        if ( spellcheck == null ) {
            return this;
        }
        this.spellcheck = "spellcheck=\"" + spellcheck + "\"";
        return this;
    }

    public HtmlComponent setStyle( String style ) {
        if ( style == null ) {
            return this;
        }
        this.style = "style=\"" + style + "\"";
        return this;
    }

    public HtmlComponent setSubject( String subject ) {
        if ( subject == null ) {
            return this;
        }
        this.subject = "subject=\"" + subject + "\"";
        return this;
    }

    public HtmlComponent setTabindex( String tabindex ) {
        if ( tabindex == null ) {
            return this;
        }
        this.tabindex = "tabindex=\"" + tabindex + "\"";
        return this;
    }

    public HtmlComponent setTitle( String title ) {
        if ( title == null ) {
            return this;
        }
        this.title = "title=\"" + tabindex + "\"";
        return this;
    }

    public HtmlComponent setValign( String valign ) {
        if ( valign == null ) {
            return this;
        }
        this.valign = "valign=\"" + valign + "\"";
        return this;
    }

    public HtmlComponent setWidth( String width ) {
        if ( width == null ) {
            return this;
        }
        this.width = "width=\"" + valign + "\"";
        return this;
    }

    public String getComponentContent() {
        return componentContent == null
               ? ""
               : componentContent;
    }

    public HtmlComponent setComponentContent( String componentContent ) {
        if ( componentContent == null ) {
            return this;
        }
        this.componentContent = componentContent;
        return this;
    }

    public String getAttributes() {
        List<String> attributes = Arrays.asList( accesskey ,
                                                 align ,
                                                 background ,
                                                 bgcolor ,
                                                 _class ,
                                                 contenteditable ,
                                                 contextmenu ,
                                                 draggable ,
                                                 height ,
                                                 hidden ,
                                                 id ,
                                                 item ,
                                                 itemprop ,
                                                 spellcheck ,
                                                 style ,
                                                 subject ,
                                                 tabindex ,
                                                 title ,
                                                 valign , width );
        StringBuilder sb = new StringBuilder();
        attributes.stream().filter( a -> a != null ).forEach( a -> sb.append( a ) );
        return sb.toString();
    }

}
