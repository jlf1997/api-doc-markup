package com.github.jlf1997.api_doc_markup;



/**
 * Hello world!
 *
 */
public class AppMain 
{
    public static void main( String[] args ) throws Exception
    {
    	MarkdownDocs.generateAsciiDocs();
    	MarkdownDocs.generateMarkdownDocs();
    	MarkdownDocs.generateConfluenceDocs();
        System.out.println( "生成完成！!" );
        
    }
}
