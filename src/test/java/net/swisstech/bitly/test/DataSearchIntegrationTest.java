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
package net.swisstech.bitly.test;

import static net.swisstech.bitly.test.util.TestUtil.printAndVerify;
import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import net.swisstech.bitly.model.Response;
import net.swisstech.bitly.model.v3.DataSearchResponse;

import org.testng.annotations.Test;

/**
 * <p>
 * Please see the bit.ly documentation for the <a href="dev.bitly.com/data_apis.html#v3_search">/v3/search</a> request.
 * </p>
 */
public class DataSearchIntegrationTest extends AbstractBitlyClientIntegrationTest {

	@Test
	public void callDataSearch() {
		Response<DataSearchResponse> resp = getClient().dataSearch()
				.setLimit("5")
				.call();

		printAndVerify(resp, DataSearchResponse.class);

		assertEquals(resp.data.results.size(), 5);
		int foundCount = 0;
		for (DataSearchResponse.DataSearch ds : resp.data.results) {
			if (ds.aggregate_link != null) {
				foundCount++;
			}
		}
		assertEquals(foundCount, 5);
	}
}
