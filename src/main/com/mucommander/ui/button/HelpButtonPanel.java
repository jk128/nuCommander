/*
 * This file is part of muCommander, http://www.mucommander.com
 * Copyright (C) 2002-2010 Maxence Bernard
 *
 * muCommander is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * muCommander is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.mucommander.ui.button;

import javax.swing.*;
import java.awt.*;

/**
 * A simple panel that lays out a {@link HelpButton}, aligning to the right.
 *
 * @author Maxence Bernard
 */
public class HelpButtonPanel extends JPanel {

    public HelpButtonPanel(HelpButton helpButton) {
        super(new BorderLayout());

        add(helpButton, BorderLayout.EAST);
    }
}
