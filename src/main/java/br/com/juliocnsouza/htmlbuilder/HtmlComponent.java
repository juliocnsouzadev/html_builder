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

    public void addComponent( HtmlComponent component ) {
        if ( component == null ) {
            return;
        }
        components.add( component );
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

    public void setAccesskey( String accesskey ) {
        if ( accesskey == null ) {
            return;
        }
        this.accesskey = "accesskey=\"" + accesskey + "\"";
    }

    public void setAlign( String align ) {
        if ( align == null ) {
            return;
        }
        this.align = "align=\"" + align + "\"";
    }

    public void setBackground( String background ) {
        if ( background == null ) {
            return;
        }
        this.background = "background=\"" + background + "\"";
    }

    public void setBgcolor( String bgcolor ) {
        if ( bgcolor == null ) {
            return;
        }
        this.bgcolor = "bgcolor=\"" + bgcolor + "\"";
    }

    public void setClass( String _class ) {
        if ( _class == null ) {
            return;
        }
        this._class = "class=\"" + _class + "\"";
    }

    public void setBootstrapClasses( Classes... classes ) {
        if ( classes == null ) {
            return;
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
    }

    public void setContenteditable( String contenteditable ) {
        if ( contenteditable == null ) {
            return;
        }
        this.contenteditable = "contenteditable=\"" + contenteditable + "\"";
    }

    public void setContextmenu( String contextmenu ) {
        if ( contextmenu == null ) {
            return;
        }
        this.contextmenu = "contextmenu=\"" + contextmenu + "\"";
    }

    public void setDraggable( String draggable ) {
        if ( draggable == null ) {
            return;
        }
        this.draggable = "draggable=\"" + draggable + "\"";
    }

    public void setHeight( String height ) {
        if ( height == null ) {
            return;
        }
        this.height = "height=\"" + height + "\"";
    }

    public void setHidden( String hidden ) {
        if ( hidden == null ) {
            return;
        }
        this.hidden = "hidden=\"" + hidden + "\"";
    }

    public void setId( String id ) {
        if ( id == null ) {
            return;
        }
        this.id = "hidden=\"" + id + "\"";
    }

    public void setItem( String item ) {
        if ( item == null ) {
            return;
        }
        this.item = "item=\"" + item + "\"";
    }

    public void setItemprop( String itemprop ) {
        if ( itemprop == null ) {
            return;
        }
        this.itemprop = "itemprop=\"" + itemprop + "\"";
    }

    public void setSpellcheck( String spellcheck ) {
        if ( spellcheck == null ) {
            return;
        }
        this.spellcheck = "spellcheck=\"" + spellcheck + "\"";
    }

    public void setStyle( String style ) {
        if ( style == null ) {
            return;
        }
        this.style = "style=\"" + style + "\"";
    }

    public void setSubject( String subject ) {
        if ( subject == null ) {
            return;
        }
        this.subject = "subject=\"" + subject + "\"";
    }

    public void setTabindex( String tabindex ) {
        if ( tabindex == null ) {
            return;
        }
        this.tabindex = "tabindex=\"" + tabindex + "\"";
    }

    public void setTitle( String title ) {
        if ( title == null ) {
            return;
        }
        this.title = "title=\"" + tabindex + "\"";
    }

    public void setValign( String valign ) {
        if ( valign == null ) {
            return;
        }
        this.valign = "valign=\"" + valign + "\"";
    }

    public void setWidth( String width ) {
        if ( width == null ) {
            return;
        }
        this.width = "width=\"" + valign + "\"";
    }

    public String getComponentContent() {
        return componentContent == null
               ? ""
               : componentContent;
    }

    public void setComponentContent( String componentContent ) {
        if ( componentContent == null ) {
            return;
        }
        this.componentContent = componentContent;
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
