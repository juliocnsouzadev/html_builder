package br.com.juliocnsouza.htmlbuilder.bootstrap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author julio
 */
public class InlineStyleConverter {

    private final Map<String , String> map;

    public InlineStyleConverter() {
        map = new HashMap<>();
        initValues();
    }

    public Map<String , String> getMap() {
        return map;
    }

    private void initValues() {
        map.put( "navbar" , "-webkit-box-sizing: inherit;box-sizing: inherit;display: none;position: relative;padding: .5rem 1rem;" );
        map.put( "caret" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "label" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;border: 1px solid #000;display: none;padding: .25em .4em;font-size: 75%;font-weight: 700;line-height: 1;color: #fff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25rem;" );
        map.put( "table" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;width: 100%;max-width: 100%;margin-bottom: 1rem;border-collapse: collapse!important;" );
        map.put( "img-responsive" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "img-rounded" , "-webkit-box-sizing: inherit;box-sizing: inherit;border-radius: .3rem;" );
        map.put( "img-thumbnail" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;display: inline-block;max-width: 100%;height: auto;padding: .25rem;line-height: 1.5;background-color: #fff;border: 1px solid #ddd;border-radius: .25rem;-webkit-transition: all .2s ease-in-out;-o-transition: all .2s ease-in-out;transition: all .2s ease-in-out;" );
        map.put( "img-circle" , "-webkit-box-sizing: inherit;box-sizing: inherit;border-radius: 50%;" );
        map.put( "sr-only" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: absolute;width: 1px;height: 1px;padding: 0;margin: -1px;overflow: hidden;clip: rect(0,0,0,0);border: 0;" );
        map.put( "lead" , "-webkit-box-sizing: inherit;box-sizing: inherit;font-size: 1.25rem;font-weight: 300;" );
        map.put( "text-muted" , "-webkit-box-sizing: inherit;box-sizing: inherit;color: #818a91;" );
        map.put( "text-primary" , "-webkit-box-sizing: inherit;box-sizing: inherit;color: #0275d8!important;" );
        map.put( "text-warning" , "-webkit-box-sizing: inherit;box-sizing: inherit;color: #f0ad4e!important;" );
        map.put( "text-danger" , "-webkit-box-sizing: inherit;box-sizing: inherit;color: #d9534f!important;" );
        map.put( "text-success" , "-webkit-box-sizing: inherit;box-sizing: inherit;color: #5cb85c!important;" );
        map.put( "text-info" , "-webkit-box-sizing: inherit;box-sizing: inherit;color: #5bc0de!important;" );
        map.put( "text-left" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "text-right" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "text-center" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "h6" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;margin-bottom: .5rem;font-family: inherit;font-weight: 500;line-height: 1.1;color: inherit;font-size: 1rem;" );
        map.put( "h1" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;margin-bottom: .5rem;font-family: inherit;font-weight: 500;line-height: 1.1;color: inherit;font-size: 2.5rem;" );
        map.put( "h2" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;margin-bottom: .5rem;font-family: inherit;font-weight: 500;line-height: 1.1;color: inherit;font-size: 2rem;" );
        map.put( "h3" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;margin-bottom: .5rem;font-family: inherit;font-weight: 500;line-height: 1.1;color: inherit;font-size: 1.75rem;" );
        map.put( "h4" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;margin-bottom: .5rem;font-family: inherit;font-weight: 500;line-height: 1.1;color: inherit;font-size: 1.5rem;" );
        map.put( "h5" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;margin-bottom: .5rem;font-family: inherit;font-weight: 500;line-height: 1.1;color: inherit;font-size: 1.25rem;" );
        map.put( "page-header" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "list-unstyled" , "-webkit-box-sizing: inherit;box-sizing: inherit;padding-left: 0;list-style: none;" );
        map.put( "list-inline" , "-webkit-box-sizing: inherit;box-sizing: inherit;padding-left: 0;list-style: none;" );
        map.put( "initialism" , "-webkit-box-sizing: inherit;box-sizing: inherit;font-size: 90%;text-transform: uppercase;" );
        map.put( "pull-right" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "prettyprint" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "pre-scrollable" , "-webkit-box-sizing: inherit;box-sizing: inherit;max-height: 340px;overflow-y: scroll;" );
        map.put( "container" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;padding-right: .9375rem;padding-left: .9375rem;margin-right: auto;margin-left: auto;" );
        map.put( "row" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-right: -.9375rem;margin-left: -.9375rem;" );
        map.put( "col-lg-12" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 100%;" );
        map.put( "col-xs-11" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;float: left;width: 91.666667%;" );
        map.put( "col-xs-1" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;float: left;width: 8.333333%;" );
        map.put( "col-xs-2" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;float: left;width: 16.666667%;" );
        map.put( "col-xs-3" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;float: left;width: 25%;" );
        map.put( "col-xs-4" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;float: left;width: 33.333333%;" );
        map.put( "col-xs-5" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;float: left;width: 41.666667%;" );
        map.put( "col-xs-6" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;float: left;width: 50%;" );
        map.put( "col-xs-7" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;float: left;width: 58.333333%;" );
        map.put( "col-xs-8" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;float: left;width: 66.666667%;" );
        map.put( "col-xs-9" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;float: left;width: 75%;" );
        map.put( "col-xs-10" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;float: left;width: 83.333333%;" );
        map.put( "col-xs-12" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;float: left;width: 100%;" );
        map.put( "col-sm-11" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 91.666667%;" );
        map.put( "col-sm-1" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 8.333333%;" );
        map.put( "col-sm-2" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 16.666667%;" );
        map.put( "col-sm-3" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 25%;" );
        map.put( "col-sm-4" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 33.333333%;" );
        map.put( "col-sm-5" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 41.666667%;" );
        map.put( "col-sm-6" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 50%;" );
        map.put( "col-sm-7" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 58.333333%;" );
        map.put( "col-sm-8" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 66.666667%;" );
        map.put( "col-sm-9" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 75%;" );
        map.put( "col-sm-10" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 83.333333%;" );
        map.put( "col-sm-12" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 100%;" );
        map.put( "col-sm-push-1" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 8.333333%;" );
        map.put( "col-sm-push-2" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 16.666667%;" );
        map.put( "col-sm-push-3" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 25%;" );
        map.put( "col-sm-push-4" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 33.333333%;" );
        map.put( "col-sm-push-5" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 41.666667%;" );
        map.put( "col-sm-push-6" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 50%;" );
        map.put( "col-sm-push-7" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 58.333333%;" );
        map.put( "col-sm-push-8" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 66.666667%;" );
        map.put( "col-sm-push-9" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 75%;" );
        map.put( "col-sm-push-10" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 83.333333%;" );
        map.put( "col-sm-push-11" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 91.666667%;" );
        map.put( "col-sm-pull-1" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 8.333333%;" );
        map.put( "col-sm-pull-2" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 16.666667%;" );
        map.put( "col-sm-pull-3" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 25%;" );
        map.put( "col-sm-pull-4" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 33.333333%;" );
        map.put( "col-sm-pull-5" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 41.666667%;" );
        map.put( "col-sm-pull-6" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 50%;" );
        map.put( "col-sm-pull-7" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 58.333333%;" );
        map.put( "col-sm-pull-8" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 66.666667%;" );
        map.put( "col-sm-pull-9" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 75%;" );
        map.put( "col-sm-pull-10" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 83.333333%;" );
        map.put( "col-sm-pull-11" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 91.666667%;" );
        map.put( "col-sm-offset-1" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 8.333333%;" );
        map.put( "col-sm-offset-2" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 16.666667%;" );
        map.put( "col-sm-offset-3" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 25%;" );
        map.put( "col-sm-offset-4" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 33.333333%;" );
        map.put( "col-sm-offset-5" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 41.666667%;" );
        map.put( "col-sm-offset-6" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 50%;" );
        map.put( "col-sm-offset-7" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 58.333333%;" );
        map.put( "col-sm-offset-8" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 66.666667%;" );
        map.put( "col-sm-offset-9" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 75%;" );
        map.put( "col-sm-offset-10" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 83.333333%;" );
        map.put( "col-sm-offset-11" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 91.666667%;" );
        map.put( "col-md-11" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 91.666667%;" );
        map.put( "col-md-1" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 8.333333%;" );
        map.put( "col-md-2" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 16.666667%;" );
        map.put( "col-md-3" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 25%;" );
        map.put( "col-md-4" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 33.333333%;" );
        map.put( "col-md-5" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 41.666667%;" );
        map.put( "col-md-6" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 50%;" );
        map.put( "col-md-7" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 58.333333%;" );
        map.put( "col-md-8" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 66.666667%;" );
        map.put( "col-md-9" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 75%;" );
        map.put( "col-md-10" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 83.333333%;" );
        map.put( "col-md-12" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 100%;" );
        map.put( "col-md-push-0" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: auto;" );
        map.put( "col-md-push-1" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 8.333333%;" );
        map.put( "col-md-push-2" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 16.666667%;" );
        map.put( "col-md-push-3" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 25%;" );
        map.put( "col-md-push-4" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 33.333333%;" );
        map.put( "col-md-push-5" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 41.666667%;" );
        map.put( "col-md-push-6" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 50%;" );
        map.put( "col-md-push-7" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 58.333333%;" );
        map.put( "col-md-push-8" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 66.666667%;" );
        map.put( "col-md-push-9" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 75%;" );
        map.put( "col-md-push-10" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 83.333333%;" );
        map.put( "col-md-push-11" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 91.666667%;" );
        map.put( "col-md-pull-0" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: auto;" );
        map.put( "col-md-pull-1" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 8.333333%;" );
        map.put( "col-md-pull-2" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 16.666667%;" );
        map.put( "col-md-pull-3" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 25%;" );
        map.put( "col-md-pull-4" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 33.333333%;" );
        map.put( "col-md-pull-5" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 41.666667%;" );
        map.put( "col-md-pull-6" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 50%;" );
        map.put( "col-md-pull-7" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 58.333333%;" );
        map.put( "col-md-pull-8" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 66.666667%;" );
        map.put( "col-md-pull-9" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 75%;" );
        map.put( "col-md-pull-10" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 83.333333%;" );
        map.put( "col-md-pull-11" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 91.666667%;" );
        map.put( "col-md-offset-0" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 0;" );
        map.put( "col-md-offset-1" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 8.333333%;" );
        map.put( "col-md-offset-2" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 16.666667%;" );
        map.put( "col-md-offset-3" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 25%;" );
        map.put( "col-md-offset-4" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 33.333333%;" );
        map.put( "col-md-offset-5" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 41.666667%;" );
        map.put( "col-md-offset-6" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 50%;" );
        map.put( "col-md-offset-7" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 58.333333%;" );
        map.put( "col-md-offset-8" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 66.666667%;" );
        map.put( "col-md-offset-9" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 75%;" );
        map.put( "col-md-offset-10" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 83.333333%;" );
        map.put( "col-md-offset-11" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 91.666667%;" );
        map.put( "col-lg-11" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 91.666667%;" );
        map.put( "col-lg-1" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 8.333333%;" );
        map.put( "col-lg-2" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 16.666667%;" );
        map.put( "col-lg-3" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 25%;" );
        map.put( "col-lg-4" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 33.333333%;" );
        map.put( "col-lg-5" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 41.666667%;" );
        map.put( "col-lg-6" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 50%;" );
        map.put( "col-lg-7" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 58.333333%;" );
        map.put( "col-lg-8" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 66.666667%;" );
        map.put( "col-lg-9" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 75%;" );
        map.put( "col-lg-10" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;min-height: 1px;padding-right: .9375rem;padding-left: .9375rem;width: 83.333333%;" );
        map.put( "col-lg-push-0" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: auto;" );
        map.put( "col-lg-push-1" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 8.333333%;" );
        map.put( "col-lg-push-2" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 16.666667%;" );
        map.put( "col-lg-push-3" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 25%;" );
        map.put( "col-lg-push-4" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 33.333333%;" );
        map.put( "col-lg-push-5" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 41.666667%;" );
        map.put( "col-lg-push-6" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 50%;" );
        map.put( "col-lg-push-7" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 58.333333%;" );
        map.put( "col-lg-push-8" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 66.666667%;" );
        map.put( "col-lg-push-9" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 75%;" );
        map.put( "col-lg-push-10" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 83.333333%;" );
        map.put( "col-lg-push-11" , "-webkit-box-sizing: inherit;box-sizing: inherit;left: 91.666667%;" );
        map.put( "col-lg-pull-0" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: auto;" );
        map.put( "col-lg-pull-1" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 8.333333%;" );
        map.put( "col-lg-pull-2" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 16.666667%;" );
        map.put( "col-lg-pull-3" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 25%;" );
        map.put( "col-lg-pull-4" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 33.333333%;" );
        map.put( "col-lg-pull-5" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 41.666667%;" );
        map.put( "col-lg-pull-6" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 50%;" );
        map.put( "col-lg-pull-7" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 58.333333%;" );
        map.put( "col-lg-pull-8" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 66.666667%;" );
        map.put( "col-lg-pull-9" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 75%;" );
        map.put( "col-lg-pull-10" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 83.333333%;" );
        map.put( "col-lg-pull-11" , "-webkit-box-sizing: inherit;box-sizing: inherit;right: 91.666667%;" );
        map.put( "col-lg-offset-0" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 0;" );
        map.put( "col-lg-offset-1" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 8.333333%;" );
        map.put( "col-lg-offset-2" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 16.666667%;" );
        map.put( "col-lg-offset-3" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 25%;" );
        map.put( "col-lg-offset-4" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 33.333333%;" );
        map.put( "col-lg-offset-5" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 41.666667%;" );
        map.put( "col-lg-offset-6" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 50%;" );
        map.put( "col-lg-offset-7" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 58.333333%;" );
        map.put( "col-lg-offset-8" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 66.666667%;" );
        map.put( "col-lg-offset-9" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 75%;" );
        map.put( "col-lg-offset-10" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 83.333333%;" );
        map.put( "col-lg-offset-11" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-left: 91.666667%;" );
        map.put( "table-bordered" , "-webkit-box-sizing: inherit;box-sizing: inherit;border: 1px solid #eceeef;" );
        map.put( "table-responsive" , "-webkit-box-sizing: inherit;box-sizing: inherit;display: block;width: 100%;min-height: .01%;overflow-x: auto;" );
        map.put( "form-control" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;display: block;width: 100%;padding: .375rem .75rem;font-size: 1rem;line-height: 1.5;color: #55595c;background-color: #fff;background-image: none;border: 1px solid #ccc;border-radius: .25rem;" );
        map.put( "form-group" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-bottom: 1rem;" );
        map.put( "checkbox" , "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;display: block;margin-bottom: .75rem;" );
        map.put( "checkbox-inline" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;display: inline-block;padding-left: 1.25rem;margin-bottom: 0;font-weight: 400;vertical-align: middle;cursor: pointer;" );
        map.put( "input-sm" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "input-lg" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "control-label" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "input-group-addon" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;display: table-cell;width: 1%;white-space: nowrap;vertical-align: middle;padding: .375rem .75rem;font-size: 1rem;font-weight: 400;line-height: 1;color: #55595c;text-align: center;background-color: #eceeef;border: 1px solid #ccc;border-radius: 0;" );
        map.put( "form-control-static" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;min-height: 2.25rem;padding-top: .375rem;padding-bottom: .375rem;margin-bottom: 0;" );
        map.put( "help-block" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "btn" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;display: inline-block;padding: .375rem 1rem;font-size: 1rem;font-weight: 400;line-height: 1.5;text-align: center;white-space: nowrap;vertical-align: middle;cursor: pointer;-webkit-user-select: none;-moz-user-select: none;-ms-user-select: none;user-select: none;border: 1px solid transparent;border-radius: .25rem;" );
        map.put( "active" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "btn-default" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "btn-primary" , "-webkit-box-sizing: inherit;box-sizing: inherit;color: #fff;background-color: #0275d8;border-color: #0275d8;" );
        map.put( "btn-warning" , "-webkit-box-sizing: inherit;box-sizing: inherit;color: #fff;background-color: #f0ad4e;border-color: #f0ad4e;" );
        map.put( "btn-danger" , "-webkit-box-sizing: inherit;box-sizing: inherit;color: #fff;background-color: #d9534f;border-color: #d9534f;" );
        map.put( "btn-success" , "-webkit-box-sizing: inherit;box-sizing: inherit;color: #fff;background-color: #5cb85c;border-color: #5cb85c;" );
        map.put( "btn-info" , "-webkit-box-sizing: inherit;box-sizing: inherit;color: #fff;background-color: #5bc0de;border-color: #5bc0de;" );
        map.put( "btn-link" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;font-weight: 400;color: #0275d8;border-radius: 0;background-color: transparent;border-color: transparent;" );
        map.put( "btn-lg" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;padding: .75rem 1.25rem;font-size: 1.25rem;line-height: 1.333333;border-radius: .3rem;" );
        map.put( "btn-xs" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "btn-block" , "-webkit-box-sizing: inherit;box-sizing: inherit;display: block;width: 100%;" );
        map.put( "fade" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;opacity: 0;-webkit-transition: opacity .15s linear;-o-transition: opacity .15s linear;transition: opacity .15s linear;" );
        map.put( "in" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "collapse" , "-webkit-box-sizing: inherit;box-sizing: inherit;display: none;" );
        map.put( "collapsing" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;height: 0;overflow: hidden;-webkit-transition-timing-function: ease;-o-transition-timing-function: ease;transition-timing-function: ease;-webkit-transition-duration: .35s;-o-transition-duration: .35s;transition-duration: .35s;-webkit-transition-property: height;-o-transition-property: height;transition-property: height;" );
        map.put( "glyphicon" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "dropdown" , "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;" );
        map.put( "dropdown-menu" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: absolute;top: 100%;left: 0;z-index: 1000;display: none;float: left;min-width: 160px;padding: 5px 0;margin: 2px 0 0;font-size: 1rem;color: #373a3c;text-align: left;list-style: none;background-color: #fff;-webkit-background-clip: padding-box;background-clip: padding-box;border: 1px solid rgba(0,0,0,.15);border-radius: .25rem;" );
        map.put( "divider" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "dropdown-header" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;display: block;padding: 3px 20px;font-size: .875rem;line-height: 1.5;color: #818a91;white-space: nowrap;" );
        map.put( "dropdown-backdrop" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: fixed;top: 0;right: 0;bottom: 0;left: 0;z-index: 990;" );
        map.put( "btn-group-vertical" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;display: inline-block;vertical-align: middle;" );
        map.put( "btn-group" , "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;display: inline-block;vertical-align: middle;" );
        map.put( "dropdown-toggle" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "btn-group-justified" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "input-group" , "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;display: table;border-collapse: separate;" );
        map.put( "col" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "input-group-btn" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;display: table-cell;width: 1%;white-space: nowrap;vertical-align: middle;position: relative;font-size: 0;border-radius: 0;" );
        map.put( "nav" , "-webkit-box-sizing: inherit;box-sizing: inherit;padding-left: 0;margin-bottom: 0;list-style: none;" );
        map.put( "nav-divider" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "nav-tabs" , "-webkit-box-sizing: inherit;box-sizing: inherit;border-bottom: 1px solid #ddd;" );
        map.put( "nav-justified" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "nav-tabs-justified" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "pill-pane" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "navbar-header" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "navbar-collapse" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "navbar-static-top" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "navbar-fixed-bottom" , "-webkit-box-sizing: inherit;box-sizing: inherit;position: fixed;right: 0;left: 0;z-index: 1030;bottom: 0;" );
        map.put( "navbar-fixed-top" , "-webkit-box-sizing: inherit;box-sizing: inherit;position: fixed;right: 0;left: 0;z-index: 1030;top: 0;" );
        map.put( "navbar-brand" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;float: left;padding-top: .25rem;padding-bottom: .25rem;margin-right: 1rem;font-size: 1.25rem;" );
        map.put( "navbar-toggle" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "icon-bar" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "navbar-nav" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "navbar-left" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "navbar-right" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "navbar-form" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "navbar-btn" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "navbar-text" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "navbar-default" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "navbar-link" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "navbar-inverse" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "breadcrumb" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;padding: .75rem 1rem;margin-bottom: 1rem;list-style: none;background-color: #eceeef;border-radius: .25rem;" );
        map.put( "pagination" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;display: inline-block;padding-left: 0;margin-top: 1rem;margin-bottom: 1rem;border-radius: .25rem;" );
        map.put( "pager" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;padding-left: 0;margin-top: 1rem;margin-bottom: 1rem;text-align: center;list-style: none;" );
        map.put( "label-default" , "-webkit-box-sizing: inherit;box-sizing: inherit;background-color: #818a91;" );
        map.put( "label-primary" , "-webkit-box-sizing: inherit;box-sizing: inherit;background-color: #0275d8;" );
        map.put( "label-success" , "-webkit-box-sizing: inherit;box-sizing: inherit;background-color: #5cb85c;" );
        map.put( "label-info" , "-webkit-box-sizing: inherit;box-sizing: inherit;background-color: #5bc0de;" );
        map.put( "label-warning" , "-webkit-box-sizing: inherit;box-sizing: inherit;background-color: #f0ad4e;" );
        map.put( "label-danger" , "-webkit-box-sizing: inherit;box-sizing: inherit;background-color: #d9534f;" );
        map.put( "badge" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "jumbotron" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;padding: 2rem 1rem;margin-bottom: 2rem;background-color: #eceeef;border-radius: .3rem;" );
        map.put( "thumbnail" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "caption" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "alert" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;padding: 15px;margin-bottom: 1rem;border: 1px solid transparent;border-radius: .25rem;" );
        map.put( "alert-link" , "-webkit-box-sizing: inherit;box-sizing: inherit;font-weight: 700;" );
        map.put( "alert-dismissable" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "close" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;float: right;font-size: 1.5rem;font-weight: 700;line-height: 1;color: #000;text-shadow: 0 1px 0 #fff;opacity: .2;" );
        map.put( "alert-success" , "-webkit-box-sizing: inherit;box-sizing: inherit;color: #3c763d;background-color: #dff0d8;border-color: #d0e9c6;" );
        map.put( "alert-info" , "-webkit-box-sizing: inherit;box-sizing: inherit;color: #31708f;background-color: #d9edf7;border-color: #bcdff1;" );
        map.put( "alert-warning" , "-webkit-box-sizing: inherit;box-sizing: inherit;color: #8a6d3b;background-color: #fcf8e3;border-color: #faf2cc;" );
        map.put( "alert-danger" , "-webkit-box-sizing: inherit;box-sizing: inherit;color: #a94442;background-color: #f2dede;border-color: #ebcccc;" );
        map.put( "progress" , "-webkit-box-sizing: inherit;box-sizing: inherit;display: block;width: 100%;height: 1rem;margin-bottom: 1rem;" );
        map.put( "progress-bar" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;display: inline-block;height: 1rem;text-indent: -999rem;background-color: #0074d9;border-top-left-radius: .25rem;border-bottom-left-radius: .25rem;" );
        map.put( "progress-bar-success" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "progress-bar-info" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "progress-bar-warning" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "progress-bar-danger" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "media-body" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;overflow: hidden;zoom: 1;width: 10000px;display: table-cell;vertical-align: top;" );
        map.put( "media" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-top: 15px;overflow: hidden;zoom: 1;" );
        map.put( "media-object" , "-webkit-box-sizing: inherit;box-sizing: inherit;display: block;" );
        map.put( "media-heading" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-top: 0;margin-bottom: 5px;" );
        map.put( "pull-left" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "media-list" , "-webkit-box-sizing: inherit;box-sizing: inherit;padding-left: 0;list-style: none;" );
        map.put( "list-group" , "-webkit-box-sizing: inherit;box-sizing: inherit;padding-left: 0;margin-bottom: 0;" );
        map.put( "list-group-item" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;display: block;padding: .75rem 1.25rem;margin-bottom: -1px;background-color: #fff;border: 1px solid #ddd;" );
        map.put( "list-group-item-heading" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-top: 0;margin-bottom: 5px;" );
        map.put( "list-group-item-text" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin-bottom: 0;line-height: 1.3;" );
        map.put( "panel" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "panel-body" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "panel-heading" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "panel-title" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "panel-footer" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "panel-default" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "panel-primary" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "panel-success" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "panel-warning" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "panel-danger" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "panel-info" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "well" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "well-lg" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "well-sm" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "modal-open" , "-webkit-box-sizing: inherit;box-sizing: inherit;overflow: hidden;" );
        map.put( "modal" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: fixed;top: 0;right: 0;bottom: 0;left: 0;z-index: 1050;display: none;overflow: hidden;-webkit-overflow-scrolling: touch;outline: 0;" );
        map.put( "modal-dialog" , "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;width: auto;margin: 10px;" );
        map.put( "modal-content" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;background-color: #fff;-webkit-background-clip: padding-box;background-clip: padding-box;border: 1px solid rgba(0,0,0,.2);border-radius: .3rem;outline: 0;" );
        map.put( "modal-backdrop" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: fixed;top: 0;right: 0;bottom: 0;left: 0;z-index: 1040;background-color: #000;" );
        map.put( "modal-header" , "-webkit-box-sizing: inherit;box-sizing: inherit;padding: 15px;border-bottom: 1px solid #e5e5e5;" );
        map.put( "modal-title" , "-webkit-box-sizing: inherit;box-sizing: inherit;margin: 0;line-height: 1.5;" );
        map.put( "modal-body" , "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;padding: 15px;" );
        map.put( "modal-footer" , "-webkit-box-sizing: inherit;box-sizing: inherit;padding: 15px;text-align: right;border-top: 1px solid #e5e5e5;" );
        map.put( "tooltip" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: absolute;z-index: 1070;display: block;font-family: &quot;Helvetica Neue&quot;,Helvetica,Arial,sans-serif;font-size: .875rem;font-style: normal;font-weight: 400;line-height: 1.5;text-align: start;text-decoration: none;text-shadow: none;text-transform: none;letter-spacing: normal;word-break: normal;word-spacing: normal;word-wrap: normal;white-space: normal;opacity: 0;line-break: auto;" );
        map.put( "top" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "right" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "bottom" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "left" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "tooltip-inner" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;max-width: 200px;padding: 3px 8px;color: #fff;text-align: center;background-color: #000;border-radius: .25rem;" );
        map.put( "tooltip-arrow" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: absolute;width: 0;height: 0;border-color: transparent;border-style: solid;" );
        map.put( "popover" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: absolute;top: 0;left: 0;z-index: 1060;display: block;max-width: 276px;padding: 1px;font-family: &quot;Helvetica Neue&quot;,Helvetica,Arial,sans-serif;font-size: .875rem;font-style: normal;font-weight: 400;line-height: 1.5;text-align: start;text-decoration: none;text-shadow: none;text-transform: none;letter-spacing: normal;word-break: normal;word-spacing: normal;word-wrap: normal;white-space: normal;background-color: #fff;-webkit-background-clip: padding-box;background-clip: padding-box;border: 1px solid rgba(0,0,0,.2);border-radius: .3rem;line-break: auto;" );
        map.put( "popover-title" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;padding: 8px 14px;margin: 0;font-size: 1rem;background-color: #f7f7f7;border-bottom: 1px solid #ebebeb;border-radius: -.7rem -.7rem 0 0;" );
        map.put( "popover-content" , "-webkit-box-sizing: inherit;box-sizing: inherit;padding: 9px 14px;" );
        map.put( "arrow" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "carousel" , "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;" );
        map.put( "carousel-inner" , "-webkit-box-sizing: inherit;box-sizing: inherit;position: relative;width: 100%;overflow: hidden;" );
        map.put( "item" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "prev" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "next" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "carousel-control" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: absolute;top: 0;bottom: 0;left: 0;width: 15%;font-size: 20px;color: #fff;text-align: center;text-shadow: 0 1px 2px rgba(0,0,0,.6);opacity: .5;" );
        map.put( "glyphicon-chevron-right" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "icon-next" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "carousel-indicators" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: absolute;bottom: 20px;left: 50%;z-index: 15;width: 60%;padding-left: 0;margin-left: -30%;text-align: center;list-style: none;" );
        map.put( "carousel-caption" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;position: absolute;right: 20%;bottom: 20px;left: 20%;z-index: 10;padding-top: 20px;padding-bottom: 30px;color: #fff;text-align: center;text-shadow: 0 1px 2px rgba(0,0,0,.6);" );
        map.put( "hide" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "show" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "invisible" , "-webkit-box-sizing: inherit;box-sizing: inherit;visibility: hidden!important;" );
        map.put( "text-hide" ,
                 "-webkit-box-sizing: inherit;box-sizing: inherit;font: &quot;0/0&quot; a;color: transparent;text-shadow: none;background-color: transparent;border: 0;" );
        map.put( "affix" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "hidden" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "visible-xs" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "visible-sm" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "visible-md" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "visible-lg" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "hidden-xs" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "hidden-sm" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "hidden-md" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "hidden-lg" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "visible-print" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
        map.put( "hidden-print" , "-webkit-box-sizing: inherit;box-sizing: inherit;" );
    }

}
