import java.util.Comparator;
import java.util.PriorityQueue;

class StudentPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getGrade() - t1.getGrade();
            }
        });
        queue.offer(new Student("Shahil",'D'));
        queue.offer(new Student("Ayan",'B'));
        queue.offer(new Student("Zainu",'C'));
        queue.offer(new Student("AliBhai",'E'));
        queue.offer(new Student("Jannat",'A'));

        System.out.printf("Queue is: %s\n",queue);
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
    }
    private static class Student {
        private final String name;
        private final char grade;

        public Student(String name,char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name +": " + grade;
        }
    }
}
