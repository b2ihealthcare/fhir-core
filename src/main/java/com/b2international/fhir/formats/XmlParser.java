/*
 * Copyright 2024 B2i Healthcare, https://b2ihealthcare.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.b2international.fhir.formats;

import java.io.IOException;
import java.io.InputStream;

import org.hl7.fhir.exceptions.FHIRFormatError;
import org.xmlpull.mxp1.MXParser;
import org.xmlpull.v1.XmlPullParserFactory;

/**
 * Simple XML parser facade over all supported XML parsers (R4, R4B, R5). This
 * should be used in OSGi context to properly initialize the pull parser
 * infrastructure to the xpp3 implementation.
 * 
 * @since 0.1
 */
public class XmlParser {

	static {
		// Configure MXParser as default and only available pull parser in this module/bundle
		System.setProperty(XmlPullParserFactory.PROPERTY_NAME, MXParser.class.getName());
	}
	
	public static final org.hl7.fhir.r4.model.Resource parseR4(InputStream in) throws FHIRFormatError, IOException {
		return new org.hl7.fhir.r4.formats.XmlParser().parse(in);
	}
	
	public static final org.hl7.fhir.r4b.model.Resource parseR4B(InputStream in) throws FHIRFormatError, IOException {
		return new org.hl7.fhir.r4b.formats.XmlParser().parse(in);
	}
	
	public static final org.hl7.fhir.r5.model.Resource parseR5(InputStream in) throws FHIRFormatError, IOException {
		return new org.hl7.fhir.r5.formats.XmlParser().parse(in);
	}
	
}
