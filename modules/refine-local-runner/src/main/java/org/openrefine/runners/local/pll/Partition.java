
package org.openrefine.runners.local.pll;

/**
 * Represents a partition in a {@link PLL}
 * 
 * @author Antonin Delpeuch
 *
 */
public interface Partition {

    /**
     * Returns the index of this partition in the underlying PLL
     * 
     * @return
     */
    public int getIndex();

    /**
     * Returns the partition of the parent PLL this is derived from (if any - otherwise null)
     */
    public Partition getParent();
}