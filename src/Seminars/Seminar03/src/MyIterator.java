package Seminars.Seminar03.src;

public class MyIterator implements java.util.Iterator<Integer>{

        private int current;
        private int end;

        public MyIterator(int current, int end) {
            this.current = current;
            this.end = end;
        }

        @Override
        public boolean hasNext() {
            return current <= end;
        }

        @Override
        public Integer next() {
            return current++;
        }
}
