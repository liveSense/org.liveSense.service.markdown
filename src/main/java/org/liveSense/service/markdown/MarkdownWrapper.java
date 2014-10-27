package org.liveSense.service.markdown;

import org.liveSense.misc.jcrWrapper.JcrPropertyWrapper;
import org.liveSense.misc.jcrWrapper.JcrValueWrapper;

import java.util.HashMap;


/**
 * Service wrapper for JSTL
 * 
 * @author robson
 *
 */
public class MarkdownWrapper extends HashMap<String, String> {

	MarkdownService service;
	
	public MarkdownWrapper(MarkdownService service) {
		this.service = service;
	}
	
	@Override
	public String get(Object markdown) {
		String str = "";
		if (markdown instanceof JcrPropertyWrapper) {
			str = ((JcrPropertyWrapper)markdown).toString();
		} else if (markdown instanceof JcrValueWrapper) {
			str = ((JcrValueWrapper)markdown).toString();
		} else if (markdown instanceof String) {
			str = (String)markdown;
		} else
			str = markdown.toString();
		
		return service.markdownToHtml(str);
	}
}
