
package org.jbibtex.policies.keyconflict;

import java.io.Serializable;
import org.jbibtex.BibTeXEntry;
import org.jbibtex.KeyMap;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 * @see "https://github.com/ratelware/jbibtex/commit/55ef56df0ed8432ca9758d9133579719e0d65b63#diff-b9106310fb7903e1039d83d8b4ae7d76"
 */
public interface BibTeXEntryKeyConflictResolutionPolicy extends Serializable {
    BibTeXEntry entryToPut(BibTeXEntry entryCandidate, KeyMap<BibTeXEntry> currentEntries);
}
