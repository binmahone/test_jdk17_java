package org.example

private[example] object RelationalGroupedDataset {

  /**
   * The Grouping Type
   */
  private[example] trait GroupType {
    override def toString: String = getClass.getSimpleName.stripSuffix("$").stripSuffix("Type")
  }

  /**
   * To indicate it's the GroupBy
   */
  private[example] object GroupByType extends GroupType

  /**
   * To indicate it's the CUBE
   */
  private[example] object CubeType extends GroupType

  /**
   * To indicate it's the ROLLUP
   */
  private[example] object RollupType extends GroupType

  /**
   * To indicate it's the PIVOT
   */
}
