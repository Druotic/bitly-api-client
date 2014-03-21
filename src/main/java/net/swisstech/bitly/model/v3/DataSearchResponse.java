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
package net.swisstech.bitly.model.v3;

import java.util.List;
import net.swisstech.bitly.model.ToStringSupport;

/**
 * <p>
 * Please see the bit.ly documentation for the <a href="dev.bitly.com/data_apis.html#v3_search">/v3/search</a> request.
 * </p>
 */
public class DataSearchResponse extends ToStringSupport {

	/** list of link results from the search */
	public List<DataSearch> results;

	/** result from the search */
	public static class DataSearch extends ToStringSupport {
		/** the web domain of the result **/
		public String domain;
		/** epoch time of creation of the page **/
		public String initial_epoch;
		/** headers extracted - usually titles of adds or related links **/
		public String [] h2;
		/** headers extracted - usually titles of ads or related links **/
		public String [] h3;
		/** website the result was extracted from **/
		public String site;
		/** most recent index time for the page **/
		public String lastindexed;
		/** relevant keywords to the result **/
		public String keywords;
		/** most recent index epoch time for the page **/
		public String last_indexed_epoch;
		/** headline of topic result */
		public String title;
		/** time of creation of the page **/
		public String initial;
		/** summary text for the result **/
		public String summaryText;
		/** full text of the result **/
		public String content;
		/** Relevance or popularity score **/
		public double score;
		/** see `title` - seems to be identical **/
		public String summaryTitle;
		/** type of api call - should always be search **/
		public String type;
		/** short description of the text **/
		public String description;
		/** geographic cities to limit the search result by **/
		public String cities;
		/** preferred language for search **/
		public String lang;
		/** url of the result **/
		public String url;
		/** list of referrers */
		public String [] referrer;
		/** bitly shortened link to the result **/
		public String aggregate_link;
		/** last time the page was viewed **/
		public String lastseen;
		/** see `url` - seems to be identical **/
		public String page;
		/** see `title` - seems to be identical **/
		public String ogtitle;
	}
}
