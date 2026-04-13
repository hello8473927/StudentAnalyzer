public class StudentAnalyzer{
  private ArrayList<Student> studentList;

  public StudentAnalyzer(ArrayList<Student> list){
    studentList = list;
  }

  public int countAbove(int threshold){
    int count = 0;
    for(int i = 0; i < studentList.length; i++){
      if(studentList.get(i).getMarks() > threshold){
        count++;
      }
    }
    return count;
  }
}
