public abstract class Animals {
protected abstract int getMaxRunDistance();
protected abstract double getMaxJumpDistance();
protected abstract int getMaxSwimDistance();
    //
// В idea у меня созданы два файла (Cat и Dog, соответственно), также еще один незавсимый файл, чтобы вызвать метод (через psvm)
public void run(int distance) {
    boolean canRun = distance <= getMaxRunDistance();
    System.out.println("run: " + canRun);
}
public void jump(float distance){
    boolean canJump = distance <= getMaxJumpDistance();
    System.out.println("jump: " + canJump);
}
public void swim (int distance) {
    boolean canSwim = distance <= getMaxSwimDistance();
    System.out.println("swim: " + canSwim);
}
    public class Cat extends Animals {
        public final int catMaxRun = 200;
        public final int catMaxJump = 2;

        protected int getMaxRunDistance() {
            return catMaxRun;
        }

        protected double getMaxJumpDistance() {
            return catMaxJump;
        }

        protected int getMaxSwimDistance() {
            throw new UnsupportedOperationException("cats can't swim");
        }
        }


    public class Dog extends Animals {
        public final int dogsRunMax = 500;
        public final int dogsSwimMax = 10;
        public final double dogsJumpMax = 0.5;



        protected int getMaxRunDistance() {
            return dogsRunMax;
        }

        protected double getMaxJumpDistance() {
            return dogsJumpMax;
        }

        protected int getMaxSwimDistance() {
            return dogsSwimMax;
        }
    }
}




