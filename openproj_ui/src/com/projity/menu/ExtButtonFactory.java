/*
The contents of this file are subject to the Common Public Attribution License 
Version 1.0 (the "License"); you may not use this file except in compliance with 
the License. You may obtain a copy of the License at 
http://www.projity.com/license . The License is based on the Mozilla Public 
License Version 1.1 but Sections 14 and 15 have been added to cover use of 
software over a computer network and provide for limited attribution for the 
Original Developer. In addition, Exhibit A has been modified to be consistent 
with Exhibit B.

Software distributed under the License is distributed on an "AS IS" basis, 
WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for the 
specific language governing rights and limitations under the License. The 
Original Code is OpenProj. The Original Developer is the Initial Developer and 
is Projity, Inc. All portions of the code written by Projity are Copyright (c) 
2006, 2007. All Rights Reserved. Contributors Projity, Inc.

Alternatively, the contents of this file may be used under the terms of the 
Projity End-User License Agreeement (the Projity License), in which case the 
provisions of the Projity License are applicable instead of those above. If you 
wish to allow use of your version of this file only under the terms of the 
Projity License and not to allow others to use your version of this file under 
the CPAL, indicate your decision by deleting the provisions above and replace 
them with the notice and other provisions required by the Projity  License. If 
you do not delete the provisions above, a recipient may use your version of this 
file under either the CPAL or the Projity License.

[NOTE: The text of this license may differ slightly from the text of the notices 
in Exhibits A and B of the license at http://www.projity.com/license. You should 
use the latest text at http://www.projity.com/license for your modifications.
You may not remove this license text from the source files.]

Attribution Information: Attribution Copyright Notice: Copyright � 2006, 2007 
Projity, Inc. Attribution Phrase (not exceeding 10 words): Powered by OpenProj, 
an open source solution from Projity. Attribution URL: http://www.projity.com 
Graphic Image as provided in the Covered Code as file:  openproj_logo.png with 
alternatives listed on http://www.projity.com/logo

Display of Attribution Information is required in Larger Works which are defined 
in the CPAL as a work which combines Covered Code or portions thereof with code 
not governed by the terms of the CPAL. However, in addition to the other notice 
obligations, all copies of the Covered Code in Executable and Source Code form 
distributed must, as a form of attribution of the original author, include on 
each user interface screen the "OpenProj" logo visible to all users.  The 
OpenProj logo should be located horizontally aligned with the menu bar and left 
justified on the top left of the screen adjacent to the File menu.  The logo 
must be at least 100 x 25 pixels.  When users click on the "OpenProj" logo it 
must direct them back to http://www.projity.com.  
*/
package com.projity.menu;

import java.awt.Color;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.swing.AbstractButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JToggleButton;

import org.apache.batik.util.gui.resource.ActionMap;
import org.apache.batik.util.gui.resource.ButtonFactory;
import org.apache.batik.util.gui.resource.MissingListenerException;
import org.apache.batik.util.gui.resource.ResourceFormatException;

import com.projity.help.HelpUtil;

/**
 * 
 */
public class ExtButtonFactory extends ButtonFactory {
	public final static String TYPE_SUFFIX = ".type";
	private final static String SELECTED_SUFFIX = ".selected";
	public final static String VISIBLE_SUFFIX = ".visible";
	public final static String DOC_SUFFIX = ".doc";
	public static Color BACKGROUND_COLOR = null;
	public AbstractButton createJToolbarButton(String name) throws MissingResourceException, ResourceFormatException, MissingListenerException {
		// TODO Auto-generated method stub
		String type = null;
		AbstractButton result = null;
		try {
			type = getString(name + TYPE_SUFFIX);
		} catch (MissingResourceException e) {
		}
		if (type != null && type.equals("TOGGLE")) {
			result = new JToggleButton();
			if (BACKGROUND_COLOR == null)
				BACKGROUND_COLOR = result.getBackground();
			initializeButton(result, name);

			// is the button selected?
			try {
				result.setSelected(getBoolean(name + SELECTED_SUFFIX));
			} catch (MissingResourceException e) {
			}


		}
		if (result == null)
			result = super.createJToolbarButton(name);
		String help = getStringOrNull(name + DOC_SUFFIX);
		if (help != null)
			HelpUtil.addDocHelp(result,help);
		return result;
		
	}

	/**
	 * @param rb
	 * @param am
	 */
	public ExtButtonFactory(ResourceBundle rb, ActionMap am) {
		super(rb, am);
		// TODO Auto-generated constructor stub
	}

	public JComponent createJComboBox(String name)
			throws MissingResourceException, ResourceFormatException,
			MissingListenerException {
		JComboBox result = new JComboBox();
		return result;
	}

}