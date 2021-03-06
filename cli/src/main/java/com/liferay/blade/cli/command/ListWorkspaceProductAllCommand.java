/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.blade.cli.command;

import com.liferay.blade.cli.BladeCLI;
import com.liferay.blade.cli.util.BladeUtil;

import java.util.List;

/**
 * @author Simon Jiang
 */
public class ListWorkspaceProductAllCommand extends BaseCommand<ListWorkspaceProductAllArgs> {

	@Override
	public void execute() throws Exception {
		_printAllWorkspaceProducts();
	}

	@Override
	public Class<ListWorkspaceProductAllArgs> getArgsClass() {
		return ListWorkspaceProductAllArgs.class;
	}

	private void _printAllWorkspaceProducts() throws Exception {
		BladeCLI bladeCLI = getBladeCLI();

		List<String> workspaceProductKeys = BladeUtil.getWorkspaceProductKeys(false);

		for (String productKey : workspaceProductKeys) {
			bladeCLI.out(productKey);
		}
	}

}