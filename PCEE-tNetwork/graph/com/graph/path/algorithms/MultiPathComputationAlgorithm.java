/**
 *  This file is part of Path Computation Element Emulator (PCEE).
 *
 *  PCEE is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  PCEE is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with PCEE.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.graph.path.algorithms;

import java.util.ArrayList;

import com.graph.graphcontroller.Gcontroller;
import com.graph.path.PathElement;
import com.graph.path.algorithms.constraints.MultiPathConstraint;

public interface MultiPathComputationAlgorithm {

	public ArrayList<PathElement> computePath(Gcontroller controller, MultiPathConstraint constraints);
	
}
