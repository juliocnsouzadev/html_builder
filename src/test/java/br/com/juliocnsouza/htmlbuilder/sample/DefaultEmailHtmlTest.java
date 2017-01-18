package br.com.juliocnsouza.htmlbuilder.sample;

import br.com.juliocnsouza.htmlbuilder.components.body.Div;
import br.com.juliocnsouza.htmlbuilder.components.body.H;
import br.com.juliocnsouza.htmlbuilder.components.body.HtmlComponentBuilder;
import br.com.juliocnsouza.htmlbuilder.components.body.P;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author julio
 */
public class DefaultEmailHtmlTest {

    public DefaultEmailHtmlTest() {
    }

    @Test
    public void mustBuildEmail() {
        String imgLink = "http://sm.ign.com/ign_br/screenshot/default/star-wars-darth-vader-sixth-scale-feature-1000763_e72v.jpg";

        String email = new DefaultEmailHtml(
                new FooterInfo( "Darth Team - The best in software" , "Every day - 24 hours" , "darth.vader@darthteam.com" )
        ).addActionLink( "http://www.google.com" , "Google it!" )
                .addBodyComponet( getBody() )
                .addImg( imgLink , "lord vader" )
                .addSentence( "Luke I am your father." )
                .addTitle( "Come to the Dark Side!" )
                .build().build();

        System.out.println( "Email:\n" );
        System.out.println( email );

        Assert.assertTrue( email != null );

    }

    private HtmlComponentBuilder getBody() {
        return new Div()
                .addComponent(
                        new H( H.Type.H1 )
                        .setComponentContent( "Title H1" )
                ).addComponent(
                        new P().setComponentContent( "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum "
                                + "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum "
                                + "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum "
                                + "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum " )
                );
    }

}
