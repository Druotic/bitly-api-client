/*
 * Copyright (c) Patrick Huber (gmail: stackmagic)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.swisstech.bitly.builder.v3;

import java.lang.reflect.Type;
import java.util.Collection;

import net.swisstech.bitly.builder.Request;
import net.swisstech.bitly.model.Response;
import net.swisstech.bitly.model.v3.DataSearchResponse;

import com.google.gson.reflect.TypeToken;

/**
 * <p>
 * Please see the bit.ly documentation for the <a href="dev.bitly.com/data_apis.html#v3_search">/v3/search</a> request.
 * </p>
 */
public class DataSearchRequest extends Request<DataSearchResponse> {

	/**
	 * Create a new request builder
	 * @param accessToken the access token to access the bitly api
	 */
	public DataSearchRequest(String accessToken) {
		super(accessToken);
	}

	@Override
	public String getEndpoint() {
		return "https://api-ssl.bitly.com/v3/search";
	}

	@Override
	protected Type getTypeForGson() {
		return new TypeToken<Response<DataSearchResponse>>() {
		}.getType();
	}

	/**
	 * optional: set the limit - default is 10
	 * @param limit the max number of results to return
	 * @return this builder
	 */
	public DataSearchRequest setLimit(String limit) {
		addQueryParameter("limit", limit);
		return this;
	}

	/**
	 * optional: set the offset - default is 0
	 * @param offset the result to start with
	 * @return
	 */
	public DataSearchRequest setOffset(String offset) {
		addQueryParameter("offset", offset);
		return this;
	}

	/**
	 * optional: set the query string
	 * @param query the string to search for
	 * @return this builder
	 */
	public DataSearchRequest setQuery(String query) {
		addQueryParameter("query", query);
		return this;
	}

	/**
	 * optional: set favored language
	 * @param lang the language to be favored when finding results (two letter ISO code)
	 * @return this builder
	 */
	public DataSearchRequest setLanguage(String lang) {
		addQueryParameter("lang", lang);
		return this;
	}

	/**
	 * optional: set the cities
	 * @param cities the cities by which links are limited (ordered like country-state-city, e.g. us-il-chicago).
	 * @return this builder
	 */
	public DataSearchRequest setCity(String city) {
		addQueryParameter("cities", city);
		return this;
	}

	/**
	 * optional: set the cities
	 * @param cities the cities by which links are limited (ordered like country-state-city, e.g. us-il-chicago).
	 * @return this builder
	 */
	public DataSearchRequest setCities(String... cities) {
		for(String city: cities)
			setCity(city);
		return this;
	}
	/**
	 * optional: set the cities
	 * @param cities the cities by which links are limited (ordered like country-state-city, e.g. us-il-chicago).
	 * @return this builder
	 */
	public DataSearchRequest setCities(Collection<String> cities) {
		for(String city: cities)
			setCity(city);
		return this;
	}

	/**
	 * optional: set the domain
	 * @param domain the web domain to limit results by (like bitly.com)
	 * @return this builder
	 */
	public DataSearchRequest setDomain(String domain) {
		addQueryParameter("domain", domain);
		return this;
	}

	/**
	 * optional: set the full domain
	 * @param fullDomain the full web domain to limit results by (like blog.bitly.com)
	 * @return this builder
	 */
	public DataSearchRequest setFullDomain(String fullDomain) {
		addQueryParameter("full_domain", fullDomain);
		return this;
	}

	/**
	 * optional: set the return fields
	 * @param fields the fields/values to be returned in the result (see 
	 * 	http://dev.bitly.com/data_apis.html#v3_search for list of supported fields, all returned by default)
	 * @return this builder
	 */
	public DataSearchRequest setField(String field) {
		addQueryParameter("fields", field);
		return this;
	}

	/**
	 * optional: set the return fields
	 * @param fields the fields/values to be returned in the result (see 
	 * 	http://dev.bitly.com/data_apis.html#v3_search for list of supported fields, all returned by default)
	 * @return this builder
	 */
	public DataSearchRequest setFields(String... fields) {
		for(String field : fields)
			setField(field);
		return this;
	}

	/**
	 * optional: set the return fields
	 * @param fields the fields/values to be returned in the result (see 
	 * 	http://dev.bitly.com/data_apis.html#v3_search for list of supported fields, all returned by default)
	 * @return this builder
	 */
	public DataSearchRequest setFields(Collection<String> fields) {
		for(String field : fields)
			setField(field);
		return this;
	}
}
