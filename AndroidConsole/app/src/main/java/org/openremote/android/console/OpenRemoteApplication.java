/* OpenRemote, the Home of the Digital Home.
* Copyright 2008-2011, OpenRemote Inc.
*
* See the contributors.txt file in the distribution for a
* full listing of individual contributors.
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU Affero General Public License as
* published by the Free Software Foundation, either version 3 of the
* License, or (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU Affero General Public License for more details.
*
* You should have received a copy of the GNU Affero General Public License
* along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

package org.openremote.android.console;

import java.util.List;

import roboguice.application.RoboApplication;
import com.google.inject.Module;

/**
 * Does RoboGuice configuration for dependency injection.
 *
 * @author Andrew D. Ball <aball@osintegrators.com>
 */
public class OpenRemoteApplication extends RoboApplication
{
  @Override
  protected void addApplicationModules(List<Module> modules)
  {
    modules.add(new OpenRemoteModule());
  }
}