// "Replace !LongStream.anyMatch(...) with noneMatch(...)" "true"

import java.util.stream.*;

class Test {
  public boolean testAnyMatch(long[] data) {
    if(LongStream.of(data).noneMatch(i -> i > 0))
      return true;
  }
}