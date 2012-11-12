package org.liveSense.service.markdown;

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
		return service.markdownToHtml((String)markdown);
	}
}
