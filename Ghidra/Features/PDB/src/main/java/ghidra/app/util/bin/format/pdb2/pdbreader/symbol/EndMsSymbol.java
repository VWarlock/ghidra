/* ###
 * IP: GHIDRA
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
package ghidra.app.util.bin.format.pdb2.pdbreader.symbol;

import ghidra.app.util.bin.format.pdb2.pdbreader.AbstractPdb;
import ghidra.app.util.bin.format.pdb2.pdbreader.PdbByteReader;

/**
 * This class represents the Edn symbol.
 * <P>
 * Note: we do not necessarily understand each of these symbol type classes.  Refer to the
 *  base class for more information.
 */
public class EndMsSymbol extends AbstractMsSymbol {

	public static final int PDB_ID = 0x0006;

	/**
	 * Constructor for this symbol.
	 * @param pdb {@link AbstractPdb} to which this symbol belongs.
	 * @param reader {@link PdbByteReader} from which this symbol is deserialized.
	 */
	public EndMsSymbol(AbstractPdb pdb, PdbByteReader reader) {
		super(pdb, reader);
	}

	@Override
	public int getPdbId() {
		return PDB_ID;
	}

	@Override
	public void emit(StringBuilder builder) {
		builder.append(getSymbolTypeName());
	}

	@Override
	protected String getSymbolTypeName() {
		return "END";
	}

}
